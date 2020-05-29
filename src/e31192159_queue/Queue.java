package e31192159_queue;

/**
 *
 * @author Nezarra Selvia R 
 * Golongan : D
 */
public class Queue {

    private int head; //deklarasi head untuk data awal antrian
    private int tail; //deklarasi tail untuk data akhir antrian
    private int size; //deklarasi size untuk kapasitas array
    private String data[]; //deklarasi array

    public Queue(int kapasitas) { //konstruktor
        head = -1;
        tail = -1;
        size = kapasitas;
        data = new String[size];
    }

    public boolean isEmpty() { //mengecek queue kosong atau tidak
        return tail == -1; //indikator jika tail = -1 maka queue kosong
    }

    public boolean isFull() { //mengecek queue penuh atau tidak
        return tail >= size - 1; //indikator jika tail lebih dari kapasitas maka queue penuh
    }

    public void add(String input) { //memasukkan data ke dalam queue
        if (isEmpty()) { //kondisi jika queue masih kosong
            data[++head] = input; //data pertama yang masuk berada di head
            tail++; //data selanjutnya berada pada tail
            System.out.println("Antrian " + input + " telah dimasukkan ke Queue");
        } else {
            if (isFull()) { //kondisi jika queue sudah penuh
                System.out.println("");
                System.out.println("QUEUE PENUH"); //output yang muncul
            } else { //jika ruang queue masih tersedia
                data[++tail] = input; //data yang dimasukkan berada pada tail
                System.out.println("Antrian " + input + " telah dimasukkan ke Queue");
            }
        }
    }

    public void remove() { //mengeluarkan data dari queue
        if (isEmpty()) { //kondisi jika queue kosong
            System.out.println("");

            System.out.println("QUEUE KOSONG");//output yang muncul

            System.out.println("");

        } else { //jika queue tidak kosong
            String temp = data[head];  //mengeluarkan data pada head
            for (int i = 0; i < tail; i++) { //perulangan untuk memindah data pada tail ke index sebelum tail
                data[i] = data[i + 1]; //data pada index setelah head (i+1) berpindah pada head(i)
            }
            tail--; //index tail berkurang
            System.out.println("Antrian " + temp + " telah dihapus dari Queue"); //output untuk remove
        }
    }

    public void infoQueue() { //menampilkan informasi data yang ada pada queue
        System.out.println("");
        System.out.println("DATA DALAM QUEUE :");

        for (int i = 0; i <= tail; i++) { //perulangan untuk data queue
            System.out.println("Data " + i + " = " + data[i]); //output untuk info Queue
        }
        System.out.println("");
    }

    public static void main(String[] args) { //method main
        Queue q = new Queue(5); //kapasitas array 5
        q.add("1");
        q.add("2");
        q.add("3");
        q.add("4");
        q.infoQueue();
        q.remove(); //remove antrian 1
        q.remove(); //remove antrian 2
        q.infoQueue();
        q.remove(); //remove antrian 3
        q.remove(); //remove antrian 4
        q.remove();
        q.add("5");
        q.add("6");
        q.add("7");
        q.add("8");
        q.add("9");
        q.add("10");
    }
}
