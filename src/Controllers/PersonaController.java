package Controllers;

import Models.Persona;

public class PersonaController {
    

    public void sortByDireccionCodigo(Persona[] personas){
        int tam = personas.length;
        for (int i = 0; i < tam ; i++){
            int indexMayor = i;

            for (int j = i+1; j< tam;j++){
                if (personas[j].compareCodigoDireccion(personas[i]) ){
                    indexMayor = j;
                }
            }

            if (i != indexMayor){
                Persona aux = personas[indexMayor];
                personas[indexMayor] = personas[i];
                personas[i] = aux;


            }

        }
    }

    public Persona findByCodigo (Persona [] personas, int codigo){
        int bajo = 0;
        int alto = personas.length-1;

        while(alto >= bajo){
            int central = (alto + bajo )/2;

            if (personas[central].equalsByCodigoDireccion(codigo)){
                return personas[central];
            }

            if(personas[central].compareCodigoDireccion(codigo)){
                bajo = central +1;
            }else{
                alto = central -1;
            }
        }
        return null;


    }
}
