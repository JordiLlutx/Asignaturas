public int getNumAsignaturas(){

        int i = 0;
        try{

            InputStreamReader fr = new InputStreamReader(openFileInput("asignaturas.txt"));
            BufferedReader bf = new BufferedReader(fr);

            while (bf.readLine() != null){

                i++;
            }


        }catch (IOException e){}

        return i;
    }
    
    public String [] getArrayAsignaturas() {

        int numAsign = getNumAsignaturas();
        String asignaturas [] = new String [numAsign];

        try{

            InputStreamReader fr = new InputStreamReader(openFileInput("asignaturas.txt"));
            BufferedReader bf = new BufferedReader(fr);

            for (int i = 0; i < numAsign; i++){

                asignaturas [i] = bf.readLine();
            }

        }catch (IOException e){}

        return  asignaturas;
    }
