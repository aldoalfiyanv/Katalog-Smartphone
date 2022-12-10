class smartphone {
  // Deklarasi atrribut
  private String catalog;
  private int handphone;
  private int version;
  private int processor;
  private int battery;
  private int backCamera;
  private int frontCamera;
  
  // Konstruktor
  public smartphone() {
    catalog = "OFF";
    handphone = 0;
    version = 0;
    processor = 0;
    battery = 0;
    backCamera = 0;
    frontCamera = 0;
  }

  // Selector
  public String getCatalog() {
    return(catalog);
  }

  public int getHandphone() {
    return(handphone);
  }

  public int getVersion() {
    return(version);
  }
  
  public int getProcessor() {
    return(processor);
  }
  
  public int getBattery() {
    return(battery);
  }
  
  public int getBackCamera() {
    return(backCamera);
  }
  
  public int getFrontCamera() {
    return(frontCamera);
  }

  public String getNamaSmartphone() {
    String smartphone[] = new String[5];
    smartphone[0] = "SAMSUNG";
    smartphone[1] = "Apple";
    smartphone[2] = "Xiaomi";
    smartphone[3] = "Vivo";
    smartphone[4] = "Oppo";

    return(smartphone[handphone-1]);
  }

  public String getNamaVersi() {
    String version[] = new String[5];
    version[0] = "S22";
    version[1] = "Iphone 14";
    version[2] = "Redmi 12";
    version[3] = "V15";
    version[4] = "A54";

    return(version[handphone-1]);
  }

  public String getNamaProcessor() {
    String processor[] = new String[5];
    processor[0] = "Qualcomm SM8450 Snapdragon 8 Gen 1";
    processor[1] = "Apple A16 Bionic";
    processor[2] = "Qualcomm SM8450 Snapdragon 8 Gen 1";
    processor[3] = "Mediatek MT6771 Helio P70";
    processor[4] = "Mediatek MT6765 Helio P35";

    return(processor[handphone-1]);
  }
  
  public String getBatteryType() {
    String battery[] = new String[5];
    battery[0] = "5000 mAh";
    battery[1] = "4323 mAh";
    battery[2] = "4500 mAh";
    battery[3] = "4000 mAh";
    battery[4] = "5000 mAh";

    return(battery[handphone-1]);
  }
  
  public String getBackCameraType() {
    String backCamera[] = new String[5];
    backCamera[0] = "108 MP";
    backCamera[1] = "48 MP";
    backCamera[2] = "50 MP";
    backCamera[3] = "24 MP";
    backCamera[4] = "13 MP";

    return(backCamera[handphone-1]);
  }
  
  public String getFrontCameraType() {
    String frontCamera[] = new String[5];
    frontCamera[0] = "40 MP";
    frontCamera[1] = "12 MP";
    frontCamera[2] = "32 MP";
    frontCamera[3] = "Motorized pop-up 32 MP";
    frontCamera[4] = "16 MP";

    return(frontCamera[handphone-1]);
  }
  
  // Mutator
  public void setCatalog(String c) {
    catalog = c;
  }

  public void setHandphone(int h) {
    handphone = h;
  }

  public void setVersion(int v) {
    version = v;
  }
  
  public void setProcessor(int p) {
    processor = p;
  }
  
  public void setBattery(int b) {
    battery = b;
  }
 
  public void setBackCamera(int bc) {
    backCamera = bc;
  }
  
    public void setFrontCamera(int fc) {
    frontCamera = fc;
  }
}