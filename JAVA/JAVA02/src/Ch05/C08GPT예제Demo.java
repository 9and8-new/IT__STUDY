package Ch05;

class Parent2 {
    void whoAmI() { System.out.println("I am Parent2"); }
    void doWork() { System.out.println("Parent2 working"); }
}

class Son2 extends Parent2 {
    @Override // 오버라이딩 된 자식의 doWork
    void doWork() { System.out.println("Son2 working (override)"); }

    // 자식에만 있는 '확장' 메서드
    void onlyInSon() { System.out.println("Son2 only method"); }
}

public class C08GPT예제Demo {
    public static void main(String[] args) {
        // A. 타입 일치
        Son2 s = new Son2();
        s.whoAmI();     // Parent2로부터 상속
        s.doWork();     // 오버라이딩된 Son2 버전
        s.onlyInSon();  // 자식에만 있는 확장 메서드
        System.out.println("----");

        // B. 업캐스팅: 부모 타입으로 자식 객체 참조
        Parent2 p = new Son2();
        p.whoAmI();     // Parent2 메서드
        p.doWork();     // **오버라이딩으로 Son2 버전 호출** (다형성)
        // p.onlyInSon(); // ❌ 컴파일 에러: Parent2 타입에 이런 메서드가 없음
        System.out.println("----");

        // C. 안전한 다운캐스팅: 실제 객체가 Son2인지 검사 후 캐스팅
        if (p instanceof Son2) {
            Son2 real = (Son2) p; // 안전하게 자식 타입으로 되돌림
            real.onlyInSon();     // 이제 확장 메서드 접근 가능
        }

        // D. 잘못된 다운캐스팅 예시(참고: 실제 실행하면 예외 발생)
        Parent2 justParent = new Parent2(); // 진짜 Parent2 객체
        if (justParent instanceof Son2) {
            // 이 블록은 실행되지 않음. (false)
            Son2 wrong = (Son2) justParent; // 이렇게 캐스팅하면 런타임 예외(ClassCastException)
        } else {
            System.out.println("justParent는 Son2가 아니므로 다운캐스팅 금지");
        }
    }
}
