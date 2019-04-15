package com.enomar.fec;

public class KnowingMyVariables2 {

    public static void main(String[] args) {
        // Call all of our methods from here.
        knowingMyVairibles2Test();
    }

        // Write all of our methods out here.
    public static void knowingMyVairibles2Test(){
        MyFavorite ramone = new MyFavorite();

        ramone.setMyName("Ramone Hamlett");
        ramone.setFavColor("steel blue");
        ramone.setFavFood("Pizza");

        System.out.println(ramone.getFavColor());
        System.out.println(ramone.getFavFood());
        System.out.println(ramone.getMyName());

        ramone.playFavSong("Uptown Funk - Bruno Mars ");
    }
}
