
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author soria
 */



public class campeonatoAFA {
    
    //VECTORES
           private String[] equipos = {"Boca","River","Independiente","Racing","Velez","Estudiantes","Lanus","Talleres","Belgrano","Argentinos" };
           private String[] equipos2 = new String[10];//EQUIPOS MEZCLADOS
           private int[] puntos = new int[10];
           private int[] partidosJugados = {18,18,18,18,18,18,18,18,18,18};
           private int[] partidosGanados = new int[10];
           private int[] partidosPerdidos = new int[10];
           private int[] partidosEmpatados = new int[10];
           private int[] golesFavor = new int[10];
           private int[] golesContra = new int[10];
           private int[] diferencia = new int[10];
           
           
           
            //METODO PARA MEZCLAR LOS EQUIPOS
           public void mezclar(){
                int x =0;
                System.out.println("---------- CAMPEONATO AFA ----------");
                System.out.println("");
                System.out.println("--- EQUIPOS --- ");
                System.out.println(" ");
                for(int i=0; i<10; i++){
                    System.out.println(equipos[i]);
                    
                }
                
                while (x < 100){
                    int n1 = (int) (Math.random() * 10);
                    int n2 = (int) (Math.random() * 10);
                    
                    if(n1!= n2){
                        String aux;
                        aux = equipos[n1];
                        equipos[n1] = equipos[n2];
                        equipos[n2] = aux;
      
                    }
                    if(x==99) {
               int j=0;
               //SE GUARDAN EN UN VECTOR NUEVO
               while(j <10){
                   equipos2[j] = equipos[j];
                   j++;
               }
           }
                    x++;
                }
                
                System.out.println(" ");
                System.out.println("---- Equipos mezclados ---- ");
                System.out.println("");
               for(int i=0; i<10; i++){
                    System.out.println(equipos2[i]);
                    
                }
               fechas(equipos2);
               
            }
           
           
           
           //METODO PARA GENERAR LAS FECHAS 
           
           public void fechas(String[] equipo){
               System.out.println("------------------------------------");
                System.out.println("");
                System.out.println("FECHA 1"); 
                System.out.println("Local   -   visitante");
                System.out.println("");

                    jornadas(equipo);
                    partidos(equipo);
                    
                    int f =2;
                    
               while(f <=9){
                    String aux;
                    
                      for(int j = 1; j < equipo.length-1; j++){
                        
                            aux = equipo[1];
                            for(int x =1;x<equipo.length-1;x++){
                                equipo[x] = equipo[x+1];
                            }
                            equipo[equipo.length-1] = aux;
                       
                        }
                        System.out.println("FECHA "+f);
                        jornadas(equipo);
                        partidos(equipo);
                    
                        if( f == 9){
                            rotar(equipo);
                        
                            System.out.println("FECHA 10");
                            jornadas(equipo);
                            partidos(equipo);
                        
                            int fe = 11;
                        
                            while(fe < 19){
                                String auxiliar;
                            
                                for(int a =0; a < equipo.length-2; a++){
                                    auxiliar = equipo[0];
                                    for(int b = 0; b<equipo.length-2;b++){
                                        equipo[b] = equipo[b+1];
                                    }
                                    equipo[equipo.length-2]=auxiliar;
                                }
                            
                                System.out.println("FECHA "+fe);
                                jornadas(equipo);
                                partidos(equipo);
                                fe++;
                            }
                        }
                        f++;
                }
           }
           
           
           //METODO DONDE ROTAN COMPLETAMENTE LOS VECTORES 
            public void rotar(String[] equi){
                for(int i =0; i<equi.length/2; i++){
                    String aux=equi[i];
                    equi[i] = equi[equi.length-1-i];
                    equi[equi.length-1-i]=aux;
                }
                /*System.out.println("VECTOR ROTADO");
                for(int j=0; j< equi.length; j++){
                    
                    System.out.println(equi[j]);
                }*/
           }
            
            
            // IMPRIME EL ENFRENTAMIENTO DE EQUIPOS
             public void jornadas(String[] equip){
               System.out.println("Local - Visitante");
               System.out.println("");
               System.out.println("" +equip[0]+" vs "+equip[9]);
               System.out.println("" +equip[1]+" vs "+equip[8]);
               System.out.println("" +equip[2]+" vs "+equip[7]);
               System.out.println("" +equip[3]+" vs "+equip[6]);
               System.out.println("" +equip[4]+" vs "+equip[5]);
               System.out.println("");
           }
             
             //CREA LOS RESULTADOS DE LOS PARTIDOS
           public void partidos(String[] equipos){
              
                   System.out.println("");
                   //System.out.println("FECHA "+fec);
                   System.out.println("----------- Resultados del partido -----------");
                   System.out.println(" ");
                   int x=0;
                   
                   while(x<5){
                       String equipoL = equipos[x];
                       String equipoV = equipos[9-x];
                       
                       int puntajeL =0, puntajeV =0, partGan=0, partPerd=0, partEmp=0;
                       
                            int golesL=(int)(Math.random()*5);
                            int golesV=(int)(Math.random()*5);  //goles aleatorios entre 0 y 5
                            
                            
                            if(golesL>golesV){
                                puntajeL = puntajeL +3;
                                partGan = partGan +1;
                                partPerd = partPerd + 1;
                                
                                System.out.println(equipoL+" "+ golesL+ " L "+golesV+ " "+equipoV+"");
                                 System.out.println(equipoL+" suma "+puntajeL+" puntos." );
                                
                                 resultadosLocal(equipoL, puntajeL, golesL, partGan, equipoV, golesV, partPerd);
                                
                            }else if(golesV>golesL){
                                puntajeV = puntajeV + 3;
                                partGan = partGan + 1 ;
                                partPerd = partPerd + 1;
                                
                                System.out.println(equipoL+" "+ golesL+ " V "+golesV+ " "+equipoV+"");
                                System.out.println(equipoV+" suma "+puntajeV+" puntos." );
                                 
                                resultadosVisitante(equipoV, puntajeV, golesV, partGan, equipoL, golesL, partPerd);
                                 
                            }else if(golesL==golesV){
                                puntajeL = puntajeL +1;
                                puntajeV = puntajeV + 1;
                                partEmp = partEmp + 1;
                                
                                System.out.println(equipoL+" "+ golesL+ " E "+golesV+ " "+equipoV+"");
                                 System.out.println(equipoL+" suma "+puntajeL+" punto, "+equipoV+" suma "+puntajeV+" punto." );
                                 
                                 resultadosEmpate(equipoL, equipoV, puntajeL, puntajeV, golesL, golesV, partEmp);
                            }
                             
                            
                           
                            System.out.println("");
                            
                        x++; 
                    }
                   System.out.println("--------------------------------------------");
            
             
           }
           
           
           
           //RECIBE Y GUARDA LOS RESULTADOS DONDE EL EQUIPO LOCAL ES EL GANADOR
           public void resultadosLocal(String equipoL, int puntajeL, int golesL, int partGan, String equipoV, int golesV, int partPerd){
                for(int i = 0; i < 10; i++){
                    if(equipos2[i] == equipoL){
                        puntos[i] = puntos[i] + puntajeL;
                        partidosGanados[i] = partidosGanados[i] + partGan;
                        golesFavor[i] = golesFavor[i] + golesL;
                        golesContra[i] = golesContra[i] + golesV;
                        diferencia[i] = diferencia[i] +(golesL - golesV);
                
                    }
                    if(equipos2[i] == (equipoV)){
                        partidosPerdidos[i] = partidosPerdidos[i] + partPerd;
                    }
                }
                
           }
           
           
           
           //RECIBE Y GUARDA LOS RESULTADOS DONDE EL EQUIPO VISITANTE ES EL GANADOR
           public void resultadosVisitante(String equipoV, int puntajeV, int golesV, int partGan, String equipoL, int golesL, int partPerd){
                for(int i = 0; i < 10; i++){
                    if(equipos2[i] == equipoV){
                        puntos[i] = puntos[i] + puntajeV;
                        partidosGanados[i] = partidosGanados[i] + partGan;
                        golesFavor[i] = golesFavor[i] + golesV;
                        golesContra[i] = golesContra[i] + golesL;
                        diferencia[i] = diferencia[i] +(golesV - golesL);
                
                    }
                    if(equipos2[i] == (equipoL)){
                        partidosPerdidos[i] = partidosPerdidos[i] + partPerd;
                    }
                }
           }
           
           
           
           
           //RECIBE Y GUARDA LOS RESULTADOS DEL EMPATE
           public void resultadosEmpate(String equipoL, String equipoV,  int puntajeL, int puntajeV, int golesL, int golesV,int  partEmp){
               for(int i = 0; i < 10; i++){
                    if(equipos2[i] == equipoL){
                        puntos[i] = puntos[i] + puntajeL;
                        partidosEmpatados[i] = partidosEmpatados[i] + partEmp;
                        golesFavor[i] = golesFavor[i] + golesL;
                        golesContra[i] = golesContra[i] + golesV;
                        diferencia[i] = diferencia[i] + (golesL - golesV);
                
                    }
                }
               
               
               for(int x = 0; x < 10; x++){
                    if(equipos2[x] == equipoV){
                        puntos[x] = puntos[x] + puntajeV;
                        partidosEmpatados[x] = partidosEmpatados[x] + partEmp;
                        golesFavor[x] = golesFavor[x] + golesV;
                        golesContra[x] = golesContra[x] + golesL;
                        diferencia[x] = diferencia[x] + (golesV - golesL);
                
                    }
                }
           }
           
           
           
           
           
           // ORDENAR MAYOR A MENOR LOS PUNTOS
         public void  ordenar(){
               
               
                int x=0;
		while (x<10){
			
			

			for(int i = x+1; i < puntos.length; i++){

				if(puntos[i] > puntos[x]){
					
					
					int anterior = puntos[x];
                                        int mayor = puntos[i];
					puntos[x] = mayor;
					puntos[i] = anterior;
					
                                        String anterio = equipos[x];
                                        String siguiente = equipos[i];
					equipos[x] = siguiente;
					equipos[i] = anterio;
                                        
                                        int anteri = partidosGanados[x];
                                        int siguient = partidosGanados[i];
					partidosGanados[x] = siguient;
					partidosGanados[i] = anteri;
					
                                        int anter = partidosPerdidos[x];
                                        int siguien = partidosPerdidos[i];
					partidosPerdidos[x] = siguien;
					partidosPerdidos[i] = anter;
                                        
                                        int ante = partidosEmpatados[x];
                                        int siguie = partidosEmpatados[i];
					partidosEmpatados[x] = siguie;
					partidosEmpatados[i] = ante;
                                        
                                        int ant = golesFavor[x];
                                        int sigui = golesFavor[i];
					golesFavor[x] = sigui;
					golesFavor[i] = ant;
                                        
                                        
                                        int an = golesContra[x];
                                        int sigu = golesContra[i];
					golesContra[x] = sigu;
					golesContra[i] = an;
                                        
                                        int a = diferencia[x];
                                        int sig = diferencia[i];
					diferencia[x] = sig;
					diferencia[i] = a;
                                        
				}else {
                                    // SI EMPATAN EN PUNTOS ORDENAR POR DIFERENCIA 
                                    if(puntos[i] == puntos[x]){
                                        
                                    
                                         for(int y = x+1; y < puntos.length; y++){

                                        if(diferencia[y] > diferencia[x]){
					
					
                                            int anterior = diferencia[x];
                                            int mayor = diferencia[y];
                                            diferencia[x] = mayor;
                                            diferencia[y] = anterior;

                                            String anterio = equipos[x];
                                            String siguiente = equipos[y];
                                            equipos[x] = siguiente;
                                            equipos[y] = anterio;

                                            int anteri = partidosGanados[x];
                                            int siguient = partidosGanados[y];
                                            partidosGanados[x] = siguient;
                                            partidosGanados[y] = anteri;

                                            int anter = partidosPerdidos[x];
                                            int siguien = partidosPerdidos[y];
                                            partidosPerdidos[x] = siguien;
                                            partidosPerdidos[y] = anter;

                                            int ante = partidosEmpatados[x];
                                            int siguie = partidosEmpatados[y];
                                            partidosEmpatados[x] = siguie;
                                            partidosEmpatados[y] = ante;

                                            int ant = golesFavor[x];
                                            int sigui = golesFavor[y];
                                            golesFavor[x] = sigui;
                                            golesFavor[y] = ant;


                                            int an = golesContra[x];
                                            int sigu = golesContra[y];
                                            golesContra[x] = sigu;
                                            golesContra[y] = an;

                                            int a = puntos[x];
                                            int sig = puntos[y];
                                            puntos[x] = sig;
                                            puntos[y] = a;

                                             }else {
                                            // SI EMPATAN EN DIFERENCIA, POR GOLES A FAVOR
                                                    if(diferencia[y] == diferencia[x]){
                                        
                                    
                                                    for(int j = x+1; j < golesFavor.length; j++){

                                                        if(golesFavor[j] > golesFavor[x]){
					

                                                            int anterior = golesFavor[x];
                                                            int mayor = golesFavor[j];
                                                            golesFavor[x] = mayor;
                                                            golesFavor[j] = anterior;

                                                            String anterio = equipos[x];
                                                            String siguiente = equipos[j];
                                                            equipos[x] = siguiente;
                                                            equipos[j] = anterio;

                                                            int anteri = partidosGanados[x];
                                                            int siguient = partidosGanados[j];
                                                            partidosGanados[x] = siguient;
                                                            partidosGanados[j] = anteri;

                                                            int anter = partidosPerdidos[x];
                                                            int siguien = partidosPerdidos[j];
                                                            partidosPerdidos[x] = siguien;
                                                            partidosPerdidos[j] = anter;

                                                            int ante = partidosEmpatados[x];
                                                            int siguie = partidosEmpatados[j];
                                                            partidosEmpatados[x] = siguie;
                                                            partidosEmpatados[j] = ante;

                                                            int ant = diferencia[x];
                                                            int sigui = diferencia[j];
                                                            diferencia[x] = sigui;
                                                            diferencia[j] = ant;


                                                            int an = golesContra[x];
                                                            int sigu = golesContra[j];
                                                            golesContra[x] = sigu;
                                                            golesContra[j] = an;

                                                            int a = puntos[x];
                                                            int sig = puntos[j];
                                                            puntos[x] = sig;
                                                            puntos[j] = a;
                                                            
                                                            
                                                            
                                                            }
                                                        }
                                                    }
                                                 
                                                }
                                        
                                        } 
                                         
                                    } 
                                }
                            }
                        x++;
                     }
                  
		
                //ENVIA LOS DATOS AL MÉTODO TABLA 
		tabla(puntos, equipos, partidosGanados, partidosPerdidos, partidosEmpatados, golesFavor, golesContra, diferencia);
           
         }
    
         
         // IMPRIME LA TABLA CON LAS POSICIONES FINALES
            public void tabla(int[] pts, String[] equipo, int[] pg, int[] pp, int[] pe, int[] gf, int[] gc, int[] dif){
                
               
               System.out.printf("-----------------------------------------------------------------------%n");
               System.out.printf("                      TABLA DE POSICIONES%n");
               System.out.printf("-----------------------------------------------------------------------%n");
               System.out.printf("|%5s|%15s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%5s|%n","#","EQUIPO","PTS","PJ","PG","PP","PE","GF","GC","DIF");
               System.out.printf("-----------------------------------------------------------------------%n");
               int P,n1,n2,n3,n4,n5,n6,n7,n8;
               String equi;
               for(int i=0; i<10; i++){
                   P=i+1;
                   equi=equipo[i];
                   n1=pts[i];
                   n2=partidosJugados[i];
                   n3=pg[i];
                   n4=pp[i];
                   n5=pe[i];
                   n6=gf[i];
                   n7=gc[i];
                   n8=dif[i];
                  
                   System.out.printf("|%5d|%15s|%5d|%5d|%5d|%5d|%5d|%5d|%5d|%5d|%n",P, equi,n1,n2,n3,n4,n5,n6,n7,n8);
                   System.out.printf("-----------------------------------------------------------------------%n");
               }
               
               
              
           }
            
    public static void main(String[] args) {
                
        campeonatoAFA AFA = new campeonatoAFA();
        AFA.mezclar();
        AFA.ordenar();
      
            
    } 
    
}
