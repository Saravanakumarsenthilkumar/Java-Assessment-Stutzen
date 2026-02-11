import java.util.Scanner;


public class Billingapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = {
            new Item(1, "Pen", 10),
            new Item(2, "Book", 50),
            new Item(3, "Pencil", 5)
        };

        System.out.print("Enter no of items purchased: ");
        int n = sc.nextInt();

        int[] ids = new int[n];
        int[] qty = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Item ID: ");
            ids[i] = sc.nextInt();
            System.out.print("Enter Quantity: ");
            qty[i] = sc.nextInt();
        }

        Bill bill = new Bill(items, ids, qty);
        System.out.println("Total Bill Amount = " + bill.calculateTotal());
    }
}
class Item {
    int id;
    String name;
    double unitPrice;

    Item(int id, String name, double unitPrice) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }
}

class Bill {
    int[] itemIds;
    int[] qty;
    Item[] items;

    Bill(Item[] items, int[] itemIds, int[] qty) {
        this.items = items;
        this.itemIds = itemIds;
        this.qty = qty;
    }

    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemIds.length; i++) {
            for (Item item : items) {
                if (item.id == itemIds[i]) {
                    total += item.unitPrice * qty[i];
                }
            }
        }
        return total;
    }
}

