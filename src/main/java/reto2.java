import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String paci;
        int numPacientes = 0;

        //System.out.println("Numero de pacientes: ");
        numPacientes = Integer.parseInt( entrada.nextLine() );



        String[] ciudades = new String[numPacientes];
        Paciente[] pacientes = new Paciente[numPacientes];

        for (int i = 1; i < numPacientes; i++) {
            //System.out.println("Paciente");
            paci = entrada.nextLine();

            String[] paciSplit = paci.split("-");
            for (int j = 0; j < paciSplit.length; j++) {
                Paciente pacienteSave = new Paciente();

                pacienteSave.setNombre( paciSplit[0] );
                pacienteSave.setCedula( paciSplit[1] );
                pacienteSave.setEdad( Integer.parseInt(paciSplit[2]) );
                pacienteSave.setCiudad( paciSplit[3] );
                pacienteSave.setEPS( paciSplit[4] );
                pacienteSave.setEnfermedad( paciSplit[5] );

                pacientes[i] = pacienteSave;
            }
            ciudades[i] = paciSplit[3];

        }

        int contCiud = 0;
        int contAux = 0;
        int index = 0;
        for (int i = 0; i < ciudades.length - 1; i++) {
            for (int j = i + 1; j < ciudades.length ; j++) {
                if( ciudades[i].equalsIgnoreCase(ciudades[j]) && ( i != j ) )
                {
                    contCiud++;
                    if(contCiud > contAux)
                    {
                        index = j;
                        contAux = contCiud;
                    }
                }
            }
            contCiud = 0;
        }

        System.out.println(ciudades[index]);

        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i].getCedula() + " " + pacientes[i].clasificarEdad());
        }

    }
}
