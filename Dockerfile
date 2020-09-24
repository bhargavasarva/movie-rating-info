FROM openjdk:8
ADD target/movie-rating-info.jar movie-rating-info.jar
ENV JAEGER_SERVICE_NAME=customer\
  JAEGER_ENDPOINT=http://jaeger-collector.istio-system.svc:14268/api/traces\
  JAEGER_PROPAGATION=b3\
  JAEGER_SAMPLER_TYPE=const\
  JAEGER_SAMPLER_PARAM=1
EXPOSE 8091
ENTRYPOINT ["java","-jar","movie-rating-info.jar"]