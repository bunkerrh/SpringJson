package json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

/**
 * Created by ryanh on 5/20/2018.
 */
public class Driver
{
     public static void main(String[] args)
     {
      try
      {
          //create object mapper
          ObjectMapper mapper = new ObjectMapper();
          //read JSon file and mapconvert to java pojo
          //data sample-full.json
          Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);

          System.out.println(student.getFirstName());
          System.out.println(student.getLastName());
          System.out.println(student.getId());
          System.out.println(student.isActive());

          //print the address street and city
          Address address = student.getAddress();

          System.out.println(address.getStreet());
          System.out.println(address.getCity());
          System.out.println(address.getState());
          System.out.println(address.getZip());


          for (String lang : student.getLanguages())
          {
              System.out.print(lang + " ");
          }


      }

      catch (Exception exc) {
          exc.printStackTrace();
      }
     }
}
