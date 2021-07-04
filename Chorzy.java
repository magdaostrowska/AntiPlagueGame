public class Chorzy implements Runnable{

    int liczbaChorych;
    PoziomTrudności poziomTrudności;
    StronaGlowna stronaGlowna;

    public Chorzy(){
        liczbaChorych = 300;
    }


    @Override
    public void run() {
        if (poziomTrudności.jestŁatwy) {
            try {
                while (true) {
                    Thread.sleep(10000);
                    liczbaChorych++;

                    if (liczbaChorych % 200 == 0) {
                        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 10;
                        if (stronaGlowna.liczbaPunktów <= 0) {
                            throw new BrakPunktówException();
                        }
                    }
                }

            } catch (Exception e ) {
            }

        }else if(poziomTrudności.jestŚredni){
            try {
                while (true) {
                    Thread.sleep(10000);
                    liczbaChorych += 5;
                    if (liczbaChorych % 200 == 0) {
                        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 10;
                        if (stronaGlowna.liczbaPunktów <= 0) {
                            throw new BrakPunktówException();
                        }
                    }
                }

            } catch (Exception e) {
            }

        }else {
            try {
                while (true) {
                    Thread.sleep(10000);
                    liczbaChorych += 10;

                    if (liczbaChorych % 200 == 0) {
                        stronaGlowna.liczbaPunktów = stronaGlowna.liczbaPunktów - 10;
                        if (stronaGlowna.liczbaPunktów <= 0) {
                            throw new BrakPunktówException();
                        }
                    }
                }
            } catch (Exception e) {
            }

        }

    }
}
