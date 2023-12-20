
class Card{
    int elixerCost;

    Card(int elixerCost){
        this.elixerCost = elixerCost;

    }
}

public class ClashRoyaleProject {
    public static void main(String[] args) {

        Card[] deck = new Card[(int)(Math.random() * 100)];
       for(int i = 0; i < deck.length; i++){
           deck[i] = new Card(i + 1);
       }
        int c = deck.length;
        int elixerSum = 0;
        for(int i = 0; i < c; i++) {
            elixerSum = deck[i].elixerCost + elixerSum;
        }
        System.out.println(elixerSum / 8.0);
        //System.out.println(sussy/8.0);

        
        //int speedyloon = deck[0].elixerCost + deck[1].elixerCost + deck[2].elixerCost + deck[3].elixerCost + deck[4].elixerCost + deck[5].elixerCost + deck[6].elixerCost + deck[7].elixerCost;
        //System.out.println(speedyloon / 8.0);

    }
}


/*Silly(int n){
    eger = n;
} */