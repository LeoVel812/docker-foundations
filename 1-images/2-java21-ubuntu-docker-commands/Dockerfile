# apt-get update
# apt-get install curl wget
# link java 21: https://corretto.aws/downloads/latest/amazon-corretto-21-x64-linux-jdk.tar.gz
# curl -L https://corretto.aws/downloads/latest/amazon-corretto-21-x64-linux-jdk.tar.gz --output java21Corretto.tar.gz
# tar -xvzf java21Corretto.tar.gz
# rm java21Corretto.tar.gz
# export PATH=$PATH:/amazon-corretto-21.0.11.10.1-linux-x64/bin

FROM ubuntu
WORKDIR /java
ADD https://corretto.aws/downloads/latest/amazon-corretto-21-x64-linux-jdk.tar.gz java21.tar.gz
RUN tar -xvzf java21.tar.gz
RUN rm java21.tar.gz
ENV PATH="${PATH}:/java/amazon-corretto-21.0.11.10.1-linux-x64/bin"
