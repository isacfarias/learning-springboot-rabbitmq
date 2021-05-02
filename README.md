## learning-springboot-rabbitmq

https://medium.com/totvsdevelopers/spring-boot-rabbitmq-porque-considerar-o-uso-de-mensageria-no-seu-projeto-3aed6637c4b4 </br>
https://emmanuelneri.com.br/2018/03/07/rabbitmq-no-spring-boot/ </br>
https://www.rabbitmq.com/tutorials/tutorial-one-python.html </br>
https://www.rabbitmq.com/tutorials/tutorial-two-python.html </br>
https://www.rabbitmq.com/tutorials/tutorial-three-spring-amqp.html</br>

## Docker Image de RabbitMQ

- User and Passwor default "guest"

docker run -d -p 5672:5672 -p 15672:15672 --name=rabbitmq rabbitmq:3.8.3-management

- Endereço para gerenciar e visualizar os eventos "http://localhost:15672"

## Para a execução dos projeto segue as combinações

- tutorialOne and tutorialTwo: funciona como producer e consomer, estes englobam os tutorias de one e two da pagina do rabbitMQ sobre tutoriais para spring 
- tutorialThree and tutorialFoour: funciona como producer e consomer este englobam o tutorial three de rabbitMQ para spring
