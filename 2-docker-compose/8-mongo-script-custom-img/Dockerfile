FROM mongo
COPY /mongo-data/init.js /docker-entrypoint-initdb.d/

# docker build -t mongo-populated .
# in docker-compose.yml, change the image to mongo-populated