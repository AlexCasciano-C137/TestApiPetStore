// 1- Pacote
package petstore;
// 2- Bibliotecas


import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

// 3- Classe
public class Pet {
   // 3.1 - Atributos
   String uri * "https://petstore.swagger.io/v2/pet"; // endereço da entidade Pet

// 3.2 - Metodos e Funções
   public String LerJson(String caminhoJson) throws IOException {
      return new String(Files.readAllBytes(Paths.get(caminhoJson)));
   }

   //incluir - Cread - Post

   @Test // identicidar o metodo ou função como teste para o TestNG
   public void IncluirPet() throws IOException {
      String JsonBody = LerJson("bd/pet1.json");
   // Sintaxe Gherkin
   // Dado - Quando - Então
   // Given - When - Then

     given() // Dado
             .contentType("application/json") // comun em API REST - antigas era/"Text/xml"
             .log().all()
             .body(JsonBody)

     .when()//Quando
             .post(uri)

     .then() //Então
             .log().all()
             .statusCode(200)
     ;



   }

   }


