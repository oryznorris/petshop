candidato: Lucas Alexandre Garcia de Araujo

mysql:
	connection name: spring-boot-test
	hostname: 127.0.0.1 : 3306
	Username: root
	Default Schema: petshop-schema

mysql arquivo
	petshop/mysql_import



feito utilizando SpringToolSuite4 (Eclipse)

File > Import > Maven > Existing Maven Projects


Executar:
	Run As > Maven build...
	Goals > spring-boot:run

	Aba Envoironment
	Add
	Name: spring.datasource.username
	Value: root

	Add
	Name: spring.datasource.password
	Value: (a senha padrão)


https://localhost:8080