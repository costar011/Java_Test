public class Test {
    // 본 문제는 제품 검색 프로그램을 간단히 구현하는 문제이다.
    // 제품에은 전자제품(Electronics), 식품(Foods), 의류(Clothing)가 있다고 가정하였으며,
    // 다양한 필터 조건을 통해 원하는 제품을 검색할 수 있는 기능을 구현하는 것이 목적이라고 가정하였다.
    // 각 문제가 요구하는 제약 조건과 요구사항을 바탕으로 코드를 구현하라.


    // 본 문제의 총점은 100점 만점이다.
    // Test.java에서는 main() 메소드를 제외한 그 어떠한 필드와 메소드도 구현할 수 없다.
    // 문제에서 요구하는 모든 클래스는 Classes.java의 해당하는 작성란 하단에 구현한다.
    // 문제별 구분을 위한 println() 메소드는 삭제 및 수정할 수 없다.
    // 문제에서 구현하는 생성자와 메소드, 필드의 이름은 자유롭게 지정할 수 있다.
    // 문제에서 생성하는 제품 (객체)의 개수나 순서가 바뀌어도 프로그램이 정상적으로 작동할 수 있어야 한다.
    // 각 클래스에서는 주어진 필드와 메소드 이외에도 필요에 따라 새로운 필드 혹은 메소드를 구현할 수 있다.
    // 본 문제는 본인의 객체 지향 프로그래밍에서의 실력을 확인하는 것으로, 정확한 실력을 보다 정확하게 파악하기 위해
    //    ChatGPT와 같은 AI나 인터넷 검색 없이 문제를 풀어보는 것을 강력히 권장한다.
    // 문제의 제약 조건 및 요구사항에 표기되지 않은 부분은 자유롭게 해석이 가능하다.
    // 각 문제의 부분 점수는 인정되지 않는다.
    // 코드의 오류로 인한 작동 불능은 오답으로 간주한다.


    public static void main(String[] args) {
        // 문제 1. Hello World! 를 출력하시오. (1점)
        System.out.println("\n문제 1)");
        System.out.println("Hello World!");


        // 문제 2. Product 추상 클래스를 아래의 조건에 맞게 구현하시오. (4점)
        // 1) (제품 이름, 제품 가격)을 갖는 생성자를 가져야 함.
        // 2) 생성자에서 받은 String 형태의 제품 이름, int 형태의 제품 가격을 필드에 저장해야 함.
        // 3) Product 클래스를 상속받는 다른 클래스에서 구현 할 toString() 추상 메소드를 가져야 함.
        //    해당 메소드는 String 형태의 값을 반환함.
        // 4) Product 클래스를 상속받은 클래스의 객체를 생성할 때 어떤 자식 클래스의 객체를 생성하는지와 관계 없이 제품 번호를 1에서부터 저장해야 함.
        //    예) Product 클래스를 상속받는 Electronics 객체 E1 생성 >> 제품 번호 : 1
        //        Product 클래스를 상속받는 Electronics 객체 E2 생성 >> 제품 번호 : 2
        //        Product 클래스를 상속받는 Foods 객체 F1 생성 >> 제품 번호 : 3
        System.out.println("\n문제 2)");


        // 문제 3. Product 클래스를 상속받는 Electronics 클래스를 아래의 조건에 맞게 구현한 후, 객체 2개를 생성하고 println() 메소드를 통해 출력하시오. (10점)
        // 1) (제품 이름, 제품 가격, 에너지 등급)을 갖는 생성자를 가져야 함.
        // 2) 생성자에서 받은 String 형태의 에너지 등급을 필드에 저장해야 함.
        // 3) main() 메소드에서 print() 혹은 println() 메소드의 인자로 Electronics 객체를 주었을 때,
        //      제품 번호 : {제품 번호}
        //      제품 이름 : {제품 이름}
        //      제품 가격 : {제품 가격}
        //      에너지 등급 : {에너지 등급}
        //    와 같이 출력되어야 함. (단, { } 사이의 문자는 해당 객체에 저장된 값을 의미함.)
        //    예) 이름이 "TV"이고, 가격이 2000이며, 에너지 등급이 "1등급"인 객체를 println()을 통해 출력하였을 때,
        //      제품 번호 : 1
        //      제품 이름 : TV
        //      제품 가격 : 2000
        //      에너지 등급 : 1등급
        //    와 같이 출력됨.
        System.out.println("\n문제 3)");


        // 문제 4. Product 클래스를 상속받는 Foods 클래스를 아래의 조건에 맞게 구현한 후, 객체 3개를 생성하고 println() 메소드를 통해 출력하시오. (10점)
        // 1) (제품 이름, 제품 가격)을 갖는 생성자를 가져야 함.
        // 2) main() 메소드에서 print() 혹은 println() 메소드의 인자로 Foods 객체를 주었을 때,
        //      제품 번호 : {제품 번호}
        //      제품 이름 : {제품 이름}
        //      제품 가격 : {제품 가격}
        //    와 같이 출력되어야 함. (단, { } 사이의 문자는 해당 객체에 저장된 값을 의미함.)
        //    예) 이름이 "불고기"이고, 가격이 7000인 객체를 println()을 통해 출력하였을 때,
        //      제품 번호 : 1
        //      제품 이름 : 불고기
        //      제품 가격 : 7000
        //    와 같이 출력됨.
        System.out.println("\n문제 4)");

        
        // 문제 5. 제품을 검색하는 Search 클래스를 아래의 조건에 맞게 구현한 후, 모든 제품을 inBound() 메소드를 통해 모든 제품을 입고하도록 시도하시오. (15점)
        //         (단, 입고 가능한 제품 수는 4개임.)
        // 1) (입고 가능한 제품 수)를 갖는 생성자를 가져야 함.
        // 2) 입고가 완료되었을 때, "{제품 이름} 제품을 입고하였습니다." 라는 문구를 출력해야 함.
        // 3) 입고 가능한 제품 수를 넘겨 입고가 불가능 할 때, "더 이상 입고할 수 없습니다." 라는 문구를 출력해야 함.
        System.out.println("\n문제 5)");


        // 문제 6. Search 클래스에 입고된 제품을 모두 출력하는 show() 메소드를 구현한 후, 호출하시오. (단, 출력 방식은 println() 메소드를 활용한다.) (10점)
        System.out.println("\n문제 6)");


        // 문제 7. Search 클래스에 입고된 제품 중 특정 이름을 가진 제품만 반환하는 search() 메소드를 구현한 후,
        //         1회 호출하고 반환된 값을 println() 메소드를 통해 출력하시오. (20점)
        //         (단, 제품의 이름이 정확히 일치하는 것만 반환한다.)
        System.out.println("\n문제 7)");


        // 문제 8. Search 클래스에 입고된 제품 중 특정 제품군만 반환하는 search() 메소드를 오버로딩으로 구현한 후,
        //         1회 호출하고 반환된 모든 값을 println() 메소드를 통해 출력하시오. (30점)
        System.out.println("\n문제 8)");


    }

}