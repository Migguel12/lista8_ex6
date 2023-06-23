public class Tv {
    private int canal = 12;
    private int volume = 15;

    public void alterarCanal(int novoCanal){
        canal = novoCanal;
    }

    public int mostrarCanal(){
        return canal;
    }

    public void alterarVolume(int novoVolume){
        volume = novoVolume;
         if(volume > 30){
            volume = 30;
        }
        else if(volume < 0){
            volume = 0;
        }
    }

    public int mostrarVolume(){
        return volume;
    }
}
