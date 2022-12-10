import java.io.*;              

class DriverSmartphone {              
  // Program utama
  public static void main(String arg[]) {        
    // Ciptakan objek
    smartphone smt = new smartphone();

    // Penciptaan objek untuk pembacaan data dari keyboard
    InputStreamReader istream = new InputStreamReader(System.in);
    BufferedReader bufRead = new BufferedReader(istream);

    int smartphone = 0;
    try {
      // Baca Merk Smartphone
      System.out.println();
      System.out.print("Indeks Katalog (1-5) : ");
      String cString = bufRead.readLine();
      smartphone = Integer.parseInt(cString);

      // Manipulasi objek
      smt.setCatalog("ON");  // hidupkan catalog
      smt.setHandphone(smartphone); // pilih channel

      System.out.println();
      System.out.println("Status Katalog    : "+smt.getCatalog());
      System.out.println("Nomor Indeks      : "+smt.getHandphone());
      System.out.println("Merk Smartphone   : "+smt.getNamaSmartphone());
      System.out.println("Jenis             : "+smt.getNamaVersi());
      System.out.println("Tipe Processor    : "+smt.getNamaProcessor());
      System.out.println("Kapasitas Baterai : "+smt.getBatteryType());
      System.out.println("Kamera Belakang   : "+smt.getBackCameraType());
      System.out.println("Kamera Depan      : "+smt.getFrontCameraType());
    }
    catch (IOException err) {
      System.out.println("Proses pembacaan gagal!");
    }
    catch (NumberFormatException err) {
      System.out.println("Nilai input tidak valid!");
    }
  }
}