class Libreria{
    String nombre;
    String codigo;
	int cant;
    boolean disp;
    Libros[] baselibros;

    Libreria (){
    }

    Libreria( String nombre,
                String codigo,int cant,
                boolean disp,
                Libros[] baselibros){
        nombre = nombre;
        codigo = codigo;
        cant = cant;
		disp = disp;
        baselibros = baselibros;
    }

    void imprimirHistoria(){
        System.out.println("Registro de libros");
        
        for(int i=0; i<baselibros.length; i++){
            Libros temporal = baselibros[i];
            System.out.println(temporal.nombre + temporal.codigo + temporal.cant + temporal.disp);
        }
    }

    public static void main(String[] args){
        Libros[] temas = new Libros[4];
        temas[0] = new Libros("El perfume ", " 52  ", 2 , true);
        temas[1] = new Libros("El hombre mediocre  ", " 53 ", 2 , true);
        temas[2] = new Libros("Tus zonas erróneas  ", " 54 ", 2 , true);
        temas[3] = new Libros("Las mil y una noches  ", " 55 ", 2 , true);
       
	

        ejemplar.imprimirHistoria();
      
    }
}
  

