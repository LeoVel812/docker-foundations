# BUILDING[1/6]
FROM ubuntu 
# CACHED[2/6]
WORKDIR /lv/main
# CACHED[3/6]
RUN mkdir hello

# file.txt will be modified a lot, so, since this point
# as this dockerfile is, every time, this will be built again
# it is not optimal
# COPY file.txt file.txt
# RUN apt-get update
# RUN apt-get install -y curl

# Rearranging the dockerfile:
# CACHED[4/6]
RUN apt-get update
# CACHED[5/6]
RUN apt-get install -y curl
# BUILDING[6/6]
COPY file.txt file.txt