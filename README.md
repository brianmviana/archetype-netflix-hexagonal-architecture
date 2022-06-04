Primeiramente execute o comando a seguir para que o projeto seja compilado e adicionado no seu repositorio local.

```shell
mvn clean install
```

Com o comando a seguir, você pode gerar um novo projeto no modo interativo com base no archetype construido acima.

```shell
mvn archetype:generate                                  \
-DarchetypeGroupId=dev.brianmviana                \
-DarchetypeArtifactId=archetype--netflix-hexagonal-architecture         \
-DarchetypeVersion=1.0.0-SNAPSHOT
```

Caso queira construir o projeto em background execute o comando abaixo substituindo os valores das variaveis.
```shell
mvn -B archetype:generate -DarchetypeGroupId=dev.brianmviana -DarchetypeArtifactId=archetype--netflix-hexagonal-architecture -DarchetypeVersion=1.0.0-SNAPSHOT -DgroupId=substituir -DartifactId=substituir -Dversion=substituir -Downer=substituir -Dproduto=substituir -Dsubproduto=substituir -DclusterName=substituir -DecrName=substituir -DnamespaceName=substituir
``