FROM airhacks/glassfish
COPY ./target/ems-attachments.war ${DEPLOYMENT_DIR}
