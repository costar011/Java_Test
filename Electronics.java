// Product 클래스 작성란
abstract class Product {
    private String name;
    private int price;
    private static int productNumber = 1; // 제품 번호 관리

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String toString(); // 추상 메소드

    public int getProductNumber() {
        return productNumber++;
    }

    class Electronics extends Product {
        public Electronics(String name, int price) {
            super(name, price);
        }
    
        @Override
        public String toString() {
            return "제품 번호: " + getProductNumber() + ", 제품 이름: " + name + ", 제품 가격: " + price + "원";
        }
    }
    
    class Foods extends Product {
        public Foods(String name, int price) {
            super(name, price);
        }
    
        @Override
        public String toString() {
            return "제품 번호: " + getProductNumber() + ", 제품 이름: " + name + ", 제품 가격: " + price + "원";
        }
    }
}

// Electronics 클래스 작성란
public class Electronics extends Product {
    private String energyGrade;

    public Electronics(String name, int price, String energyGrade) {
        super(name, price);
        this.energyGrade = energyGrade;
    }

    public String getEnergyGrade() {
        return energyGrade;
    }

    @Override
    public String toString() {
        return "제품 번호: " + getProductNumber();
    }
}




// Foods 클래스 작성란


//Search 클래스 작성란

