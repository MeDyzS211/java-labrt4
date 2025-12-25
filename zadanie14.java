package zadanie14;

class Instrument {
    public void play() {
        System.out.println("Играю на инструменте");
    }
}

class Guitar extends Instrument {
    public void play() {
        System.out.println("Брынь");
    }
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Тынь-тынь");
    }
}

class Drums extends Instrument {
    public void play() {
        System.out.println("Бум-бум");
    }
}

class Orchestra {
    private Instrument[] instruments;
    private int count;

    public Orchestra(int size) {
        instruments = new Instrument[size];
    }

    public void add(Instrument i) {
        instruments[count++] = i;
    }

    public void playAll() {
        for (int i = 0; i < count; i++) {
            instruments[i].play();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Orchestra o = new Orchestra(3);
        o.add(new Guitar());
        o.add(new Piano());
        o.add(new Drums());
        o.playAll();
    }
}
