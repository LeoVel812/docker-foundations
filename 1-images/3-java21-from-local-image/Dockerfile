FROM java21
WORKDIR lv/table
COPY Table.java Table.java
# RUN is executed during the build docker process
RUN javac Table.java 
# CMD is executed when the container is run
CMD ["java", "Table"]