FROM java:8
WORKDIR /torder
COPY target/order-server-0.0.1-SNAPSHOT.jar /torder/torder.jar
EXPOSE 8180
ENTRYPOINT ["java","-Xms200m","-Xmx300m","-jar","/torder/torder.jar"]
