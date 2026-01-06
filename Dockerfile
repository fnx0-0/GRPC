FROM ubuntu:22.04

ENV http_proxy=
ENV https_proxy=
ENV HTTP_PROXY=
ENV HTTPS_PROXY=

RUN apt-get update && apt-get install -y \
    ca-certificates \
    cmake \
    build-essential \
    git \
 && update-ca-certificates

WORKDIR /dev

RUN git clone -b v1.62.0 \
    --filter=blob:none \
    https://github.com/grpc/grpc.git

RUN cd grpc && git submodule update --init --recursive --depth 1

RUN mkdir -p grpc/build && cd grpc/build && \
    cmake -DgRPC_INSTALL=ON \
          -DgRPC_BUILD_TESTS=OFF \
          .. && \
    make -j$(nproc) install
