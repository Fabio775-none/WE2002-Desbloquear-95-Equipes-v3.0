/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desbloquear;
//import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Fabio FJA
 */
public class Valor {
       private static String pathBin = null;

    public String getPathBin() {
        return pathBin;
    }

    public static void setPathBin(String caminho) {
        Valor.pathBin = caminho;
    }
    // Salvando 
    public void masterModif(int offset1, int valor1, int offset2, int valor2,int offset3, int valor3 ){
           
        try {
            try (RandomAccessFile vmaster = new RandomAccessFile(Valor.pathBin,"rw")) {
                vmaster.seek(offset1);//Desbloquear e tornar possivel a master liga com muitas equipes
                vmaster.writeByte((byte)valor1);
                
                vmaster.seek(offset2);
                vmaster.writeByte((byte)valor2);
                
                vmaster.seek(offset3);
                vmaster.writeByte((byte)valor3);
            
            } //Desbloquear e tornar possivel a master liga com muitas equipes
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                    // Salvando 
    public void ligaecopaModif(int offset1, int valor1, int offset2, int valor2,int offset3, int valor3, 
                          int offset4, int valor4, int offset5, int valor5,int offset6, int valor6,
                          int offset7, int valor7, int offset8, int valor8,int offset9, int valor9,
                          int offset10, int valor10, int offset11, int valor11){
            
        try {
         
                 try (RandomAccessFile vcopa = new RandomAccessFile(Valor.pathBin,"rw")) {
                vcopa.seek (offset1);
                vcopa.writeByte((byte)valor1);
                vcopa.seek (offset2);
                vcopa.writeByte((byte)valor2);
                vcopa.seek  (offset3);
                vcopa.writeByte((byte)valor3);//
                vcopa.seek  (offset4);
                vcopa.writeByte((byte)valor4);
                vcopa.seek  (offset5);
                vcopa.writeByte((byte)valor5);
                vcopa.seek  (offset6);
                vcopa.writeByte((byte)valor6);
                vcopa.seek  (offset7);
                vcopa.writeByte((byte)valor7);
                vcopa.seek  (offset8);
                vcopa.writeByte((byte)valor8);
                vcopa.seek  (offset9);
                vcopa.writeByte((byte)valor9);
                vcopa.seek  (offset10);
                vcopa.writeByte((byte)valor10);
                vcopa.seek  (offset11);
                vcopa.writeByte((byte)valor11);
              
                   //    vcopa.seek (2476696);
            //  vcopa.writeByte(0x1C);
            //  vcopa.seek (2476697);
            //  vcopa.writeByte(0x10);
            //  vcopa.seek (2476700);
            //  vcopa.writeByte(0x1C);
            //   vcopa.seek  (2476701);
            //   vcopa.writeByte(0x10);
            //     vcopa.seek  (2476704);
            //     vcopa.writeByte(0x1C);
            //      vcopa.seek (2476705);
            //      vcopa.writeByte(0x10);
           
                //    vcopa.seek (2476696);
                //  vcopa.writeByte(0x1C);
                
                //  vcopa.seek (2476697);
                //  vcopa.writeByte(0x10);
                
                //  vcopa.seek (2476700);
                //  vcopa.writeByte(0x1C);
                
                //   vcopa.seek  (2476701);
                //   vcopa.writeByte(0x10);
                
                //     vcopa.seek  (2476704);
                //     vcopa.writeByte(0x1C);
                
                //      vcopa.seek (2476705);
                //      vcopa.writeByte(0x10);
// Desbloquear equipes all star liga ,copas e master liga !
// Desbloquear seleçoes
// Desbloquear o cursor para selecionar equipes em liga , copas e master liga
// com isso e possivel encontrar uma equipe oculta equipe da Jamaica .
            }
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
      public void allstarModif(int offset1, int valor1, int offset2, int valor2,int offset3, int valor3, 
                  int offset4, int valor4, int offset5, int valor5){

        try {
            RandomAccessFile vstar = new RandomAccessFile(Valor.pathBin,"rw");
            
         
            vstar.seek (offset1);
            vstar.writeByte((byte)valor1);

            vstar.seek (offset2);
            vstar.writeByte((byte)valor2);
            
            vstar.seek (offset3);
            vstar.writeByte((byte)valor3);
            
            vstar.seek (offset4);
            vstar.writeByte((byte)valor4);
            
            vstar.seek (offset5);
            vstar.writeByte((byte)valor5);
            
            vstar.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
     
    public void equipesModif(){
                
            int tamanho = 320;
            int offset1 = 2675888;
            int equipes_inicio = 0;
        try {
            try (InputStream arquivo2 = Valor.class.getResourceAsStream("/Arquivos/equipesModif.bin");
                    
              RandomAccessFile reset2 = new RandomAccessFile(Valor.pathBin,"rw")) {
              
                arquivo2.skip(equipes_inicio);//Mover equipes para baixo
                byte[] buffer = new byte[tamanho];
                arquivo2.read(buffer);
                
                reset2.seek(offset1);
                reset2.write(buffer);
                

            } 
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
          
  public void torneiosOrigin(){
                
           // byte[] buffer = null;
            int tamanho = 6303;
            int offset1 = 2492328;
            int torneio_inicio = 0;
            
           
System.out.println(
    Valor.class.getResource("/Arquivos/torneiosOrigin.bin")
);
            
        try {
            try (InputStream arquivo = Valor.class.getResourceAsStream("/Arquivos/torneiosOrigin.bin");
                    
              RandomAccessFile reset1 = new RandomAccessFile(Valor.pathBin,"rw")) {
              
                arquivo.skip(torneio_inicio);//voltar ao original copas ligas e master liga
                byte[] buffer = new byte[tamanho];
                arquivo.read(buffer);
                
                reset1.seek(offset1);
                reset1.write(buffer);
                
   
            } 
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public void equipesOrigin(){
                
      
            int tamanho = 320;
            int offset1 = 2675888;
            int equipes_inicio = 0;
        try {
            try (InputStream arquivo2 = Valor.class.getResourceAsStream("/Arquivos/bandeirasMasterOrigin.bin");
                    
              RandomAccessFile reset2 = new RandomAccessFile(Valor.pathBin,"rw")) {
              
                arquivo2.skip(equipes_inicio);//voltar equipes a posição original
                byte[] buffer = new byte[tamanho];
                arquivo2.read(buffer);
                
                reset2.seek(offset1);
                reset2.write(buffer);
                
           
            } 
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
   public void iconsMenuOrigin(){
                
            int tamanho = 54;
            int offset1 = 2691100;
            int equipes_inicio = 0;
        try {
            try (InputStream arquivo2 = Valor.class.getResourceAsStream("/Arquivos/iconsMenuOrigin.bin");
                    
              RandomAccessFile reset2 = new RandomAccessFile(Valor.pathBin,"rw")) {
              
                arquivo2.skip(equipes_inicio);//voltar ao inicio do arquivo
                byte[] buffer = new byte[tamanho];
                arquivo2.read(buffer);
                
                reset2.seek(offset1);
                reset2.write(buffer);
                
           
            } 
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iconsMenuModif(){
                
            int tamanho = 54;
            int offset1 = 2691100;
            int equipes_inicio = 0;
        try {
            try (InputStream arquivo2 = Valor.class.getResourceAsStream("/Arquivos/iconsMenuModif.bin");
                    
              RandomAccessFile reset2 = new RandomAccessFile(Valor.pathBin,"rw")) {
              
                arquivo2.skip(equipes_inicio);//voltar ao inicio do arquivo
                byte[] buffer = new byte[tamanho];
                arquivo2.read(buffer);
                
                reset2.seek(offset1);
                reset2.write(buffer);
                
            } 
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Valor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    /*
   public void teste(){
       
    try {
        
        RandomAccessFile inserir = new RandomAccessFile(Valor.pathBin, "rw");

        int[] buffer = {
            50,0x01,
            52,0x02,
            54,0x03,
            56,0x04,
            58,0x05
        };

        for (int i = 0; i < buffer.length; i += 2) {

            inserir.seek(buffer[i]);
            inserir.writeByte(buffer[i + 1]);
        }

        inserir.close();

    } catch (IOException ex) {
        Logger.getLogger(Valor.class.getName())
              .log(Level.SEVERE, null, ex);
    }
  
}
    */       //mover equipes para baixo
    /*
        2675894,0xD8,2675896,0x48,2675897,0x00,2675904,0xF0,2675906,0x48,2675907,0x00,2675914,0x08,
        2675915,0x01,2675916,0x48,2675917,0x00,2675924,0x202675925,0x01,2675926,0x48,2675927,0x00,
        2675934,0x38,2675935,0x01,2675936,0x48,2675937,0x00,2675944,0x00,2675946,0x5E,2675947,0x00,
        2675954,0x18,2675956,0x5E,2675957,0x00,2675964,0x30,2675966,0x5E,2675967,0x00,2675974,0x48,
        2675976,0x5E,2675977,0x00,2675984,0x60,2675986,0x5E,2675987,0x00,2675994,0x78,2675996,0x5E,
        2675997,0x00,2676004,0x90,2676006,0x5E,2676007,0x00,2676014,0xA8,2676016,0x5E,2676017,0x00,
        2676024,0xC0,2676026,0x5E,2676027,0x00,2676034,0xD8,2676036,0x5E,2676037,0x00,2676044,0xF0,
        2676046,0x5E,2676047,0x00,2676054,0x08,2676055,0x01,2676056,0x5E,2676057,0x00,2676064,0x20,
        2676065,0x01,2676066,0x5E,2676067,0x00,2676074,0x38,2676075,0x01,2676076,0x5E,2676077,0x00,
        2676084,0x00,2676086,0x74,2676087,0x00,2676094,0x18,2676096,0x74,2676097,0x00,2676104,0x30,
        2676106,0x74,2676107,0x00,2676114,0x48,2676116,0x74,2676117,0x00,2676124,0x60,2676126,0x74,
        2676127,0x00,2676134,0x78,2676136,0x74,2676137,0x00,2676144,0x90,2676146,0x74,2676147,0x00,
        2676154,0xA8,2676156,0x74,2676157,0x00,2676164,0xC0,2676166,0x74,2676167,0x00,2676174,0xD8,
        2676176,0x74,2676177,0x00,2676184,0xF0,2676186,0x74,2676187,0x00,2676194,0x08,2676195,0x01,
        2676196,0x74,2676197,0x00,2676204,0x20,2676205,0x01,2676206,0x74,2676207,0x00,2677188,0x38,
        2677189,0x01,2677190,0x74,2677191,0x00,2691100,0x00,2691101,0x01,2691102,0x00,2691103,0x00,
        2691110,0x00,2691111,0x01,2691112,0x00,2691113,0x00,2691120,0x00,2691121,0x01,2691122,0x00,
        2691123,0x00,2691130,0x00,2691131,0x01,2691132,0x00,2691133,0x00,2691140,0x00,2691141,0x01,
        2691142,0x00,2691143,0x00,2691150,0x00,2691151,0x01,2691152,0x00,2691153,0x00,2498129,0x98,
        2498130,0x09,2498168,0x0A,2498452,0x0A

            vequipe.seek (2675894);
            vequipe.writeByte(0xD8);
            
            vequipe.seek (2675896);
            vequipe.writeByte(0x48);
             
            vequipe.seek (2675897);
            vequipe.writeByte(0x00);//1
            
            vequipe.seek (2675904);
            vequipe.writeByte(0xF0);
             
            vequipe.seek (2675906);
            vequipe.writeByte(0x48);
              
            vequipe.seek (2675907);
            vequipe.writeByte(0x00);//2
             
            vequipe.seek (2675914);
            vequipe.writeByte(0x08);
              
            vequipe.seek (2675915);
            vequipe.writeByte(0x01);
             
            vequipe.seek (2675916);
            vequipe.writeByte(0x48);
               
            vequipe.seek (2675917);
            vequipe.writeByte(0x00);//3
             
            vequipe.seek (2675924);
            vequipe.writeByte(0x20);
              
            vequipe.seek (2675925);
            vequipe.writeByte(0x01);
             
            vequipe.seek (2675926);
            vequipe.writeByte(0x48);
                 
            vequipe.seek (2675927);
            vequipe.writeByte(0x00);//4
             
            vequipe.seek (2675934);
            vequipe.writeByte(0x38);
              
            vequipe.seek (2675935);
            vequipe.writeByte(0x01);
             
            vequipe.seek (2675936);
            vequipe.writeByte(0x48);
               
            vequipe.seek (2675937);
            vequipe.writeByte(0x00);//5
             
            vequipe.seek (2675944);
            vequipe.writeByte(0x00);
              
            vequipe.seek (2675946);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2675947);
            vequipe.writeByte(0x00);//6
             
            vequipe.seek (2675954);
            vequipe.writeByte(0x18);
             
            vequipe.seek (2675956);
            vequipe.writeByte(0x5E);
              
            vequipe.seek (2675957);
            vequipe.writeByte(0x00);//7
             
            vequipe.seek (2675964);
            vequipe.writeByte(0x30);
             
            vequipe.seek (2675966);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2675967);
            vequipe.writeByte(0x00);//8
              
            vequipe.seek (2675974);
            vequipe.writeByte(0x48);
             
            vequipe.seek (2675976);
            vequipe.writeByte(0x5E);
               
            vequipe.seek (2675977);
            vequipe.writeByte(0x00);//9
             
            vequipe.seek (2675984);
            vequipe.writeByte(0x60);
              
            vequipe.seek (2675986);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2675987);
            vequipe.writeByte(0x00);//10
            
            vequipe.seek (2675994);
            vequipe.writeByte(0x78);
             
            vequipe.seek (2675996);
            vequipe.writeByte(0x5E);
              
            vequipe.seek (2675997);
            vequipe.writeByte(0x00);//11
             
            vequipe.seek (2676004);
            vequipe.writeByte(0x90);
              
            vequipe.seek (2676006);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2676007);
            vequipe.writeByte(0x00);//12
              
            vequipe.seek (2676014);
            vequipe.writeByte(0xA8);
             
            vequipe.seek (2676016);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2676017);
            vequipe.writeByte(0x00);//13
             
            vequipe.seek (2676024);
            vequipe.writeByte(0xC0);
              
            vequipe.seek (2676026);
            vequipe.writeByte(0x5E);
             
            vequipe.seek (2676027);
            vequipe.writeByte(0x00);//14
             
            vequipe.seek (2676034);
            vequipe.writeByte(0xD8);
             
            vequipe.seek (2676036);
            vequipe.writeByte(0x5E);
              
            vequipe.seek (2676037);
            vequipe.writeByte(0x00);//15
             
            vequipe.seek (2676044);
            vequipe.writeByte(0xF0);
             
            vequipe.seek (2676046);
            vequipe.writeByte(0x5E);
             
             vequipe.seek (2676047);
             vequipe.writeByte(0x00);//16
              
             vequipe.seek (2676054);
             vequipe.writeByte(0x08);
             
             vequipe.seek (2676055);
             vequipe.writeByte(0x01);
               
             vequipe.seek (2676056);
             vequipe.writeByte(0x5E);
             
             vequipe.seek (2676057);
             vequipe.writeByte(0x00);//17
              
             vequipe.seek (2676064);
             vequipe.writeByte(0x20);
             
             vequipe.seek (2676065);
             vequipe.writeByte(0x01);
              
             vequipe.seek (2676066);
             vequipe.writeByte(0x5E);
             
             vequipe.seek (2676067);
             vequipe.writeByte(0x00);//18
              
             vequipe.seek (2676074);
             vequipe.writeByte(0x38);
             
             vequipe.seek (2676075);
             vequipe.writeByte(0x01);
               
             vequipe.seek (2676076);
             vequipe.writeByte(0x5E);
             
             vequipe.seek (2676077);
             vequipe.writeByte(0x00);//19
              
             vequipe.seek (2676084);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2676086);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676087);
             vequipe.writeByte(0x00);//20
             
             vequipe.seek (2676094);
             vequipe.writeByte(0x18);
              
             vequipe.seek (2676096);
             vequipe.writeByte(0x74);
             
             vequipe.seek (2676097);
             vequipe.writeByte(0x00);//21
             
             vequipe.seek (2676104);
             vequipe.writeByte(0x30);
             
             vequipe.seek (2676106);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676107);
             vequipe.writeByte(0x00);//22
             
             vequipe.seek (2676114);
             vequipe.writeByte(0x48);
             
             vequipe.seek (2676116);
             vequipe.writeByte(0x74);
             
             vequipe.seek (2676117);
             vequipe.writeByte(0x00);//23
              
             vequipe.seek (2676124);
             vequipe.writeByte(0x60);
             
             vequipe.seek (2676126);
             vequipe.writeByte(0x74);
            
             vequipe.seek (2676127);
             vequipe.writeByte(0x00);//24
             
             vequipe.seek (2676134);
             vequipe.writeByte(0x78);
              
             vequipe.seek (2676136);
             vequipe.writeByte(0x74);
             
             vequipe.seek (2676137);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2676144);
             vequipe.writeByte(0x90);
             
             vequipe.seek (2676146);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676147);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2676154);
             vequipe.writeByte(0xA8);
            
             vequipe.seek (2676156);
             vequipe.writeByte(0x74);
             
             vequipe.seek (2676157);
             vequipe.writeByte(0x00);//27
              
             vequipe.seek (2676164);
             vequipe.writeByte(0xC0);
             
             vequipe.seek (2676166);
             vequipe.writeByte(0x74);
                
             vequipe.seek (2676167);
             vequipe.writeByte(0x00);//28
             
             vequipe.seek (2676174);
             vequipe.writeByte(0xD8);
              
             vequipe.seek (2676176);
             vequipe.writeByte(0x74);
             
             vequipe.seek (2676177);
             vequipe.writeByte(0x00);
               
             vequipe.seek (2676184);
             vequipe.writeByte(0xF0);
             
             vequipe.seek (2676186);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676187);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2676194);
             vequipe.writeByte(0x08);
            
             vequipe.seek (2676195);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2676196);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676197);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2676204);
             vequipe.writeByte(0x20);
               
             vequipe.seek (2676205);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2676206);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2676207);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2677188);
             vequipe.writeByte(0x38);
            
             vequipe.seek (2677189);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2677190);
             vequipe.writeByte(0x74);
              
             vequipe.seek (2677191);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691100);
             vequipe.writeByte(0x00);
               
             vequipe.seek (2691101);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691102);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691103);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691110);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691111);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691112);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691113);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691120);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691121);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691122);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691123);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691130);
             vequipe.writeByte(0x00);
               
             vequipe.seek (2691131);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691132);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691133);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691140);
             vequipe.writeByte(0x00);
               
             vequipe.seek (2691141);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691142);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691143);
             vequipe.writeByte(0x00);
             
             vequipe.seek (2691150);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691151);
             vequipe.writeByte(0x01);
             
             vequipe.seek (2691152);
             vequipe.writeByte(0x00);
              
             vequipe.seek (2691153);
             vequipe.writeByte(0x00);
             
             //Mover equipes no modo amistoso de forma linear 
             vequipe.seek (2498129);
             vequipe.writeByte(0x98);
             
             vequipe.seek (2498130);
             vequipe.writeByte(0x09);
             
             vequipe.seek (2498168);
             vequipe.writeByte(0x0A);
             
             vequipe.seek (2498452);
             vequipe.writeByte(0x0A);
           
            
*/