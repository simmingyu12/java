package chap07;

// 모든 스킬들의 공통적인 부분을 세팅한다. 
// NAX_POINT 모든 스킬들이 공통적으로 사용하는 변하지 않는 값을 세팅(static final)
// 스킬마다 바뀔 수 있는 부분 name, point, chapm는 필드(멤버변수)로 작성한다

class Skill {
    static final int MAX_POINT = 5;
    String name;
    int point;
    Champ champ;

    public Skill(String name, Champ champ) {
        this.name = name;
        this.champ = champ;
        this.point = 0;
    }

    public int getDamage() {
        return 0;
    }

    public int afterDamege() {
        return 0;
    }

    public void plusPoint() {
        if (this.point >= MAX_POINT) {
            this.point = MAX_POINT;
            System.out.println("포인트를 더 이상 올릴 수 없습니다.");
            return;
        }

        this.point++;
    }
}

// 부모가 필요로 하는 정보는 넘겨주고
// 내가 부모와 다르게 커스텀 할 부분을 세팅한다.
class Volly extends Skill {
    public Volly(Champ champ) {
        super("일제사격", champ);
    }

    // 부모가 가지고 있는 메서드 형태를 그대로 가져온 상태에서 내용만 바꿔서 세팅한다.
    @Override
    public int getDamage() {
        // 고정 데미지 20 / 35 / 50 / 65 / 80
        // + 캐릭터 공격력 * 1.0

        // 스킬을 찍지 않았을 때
        if (point < 1) {
            System.out.println("스킬을 사용할 수 없습니다.");
            return super.getDamage();
        }

        int damage = (int) (20 + (15 * (point - 1)) + (this.champ.ad * 1.0));

        return damage;
    }

}

class Peace extends Skill {
    public Peace(Champ champ) {
        super("필트오버 피스메이커", champ);
    }

    @Override
    public int getDamage() {
        if (point < 1) {
            System.out.println("스킬을 사용할 수 없습니다.");
            return super.getDamage();
        } else if (point == 1) {
            int damage = (int) (50 + (40 * (point - 1) + (this.champ.ad * 1.25)));
            return damage;
        } else if (point == 2) {
            int damage = (int) (90 + (40 * (point - 1) + (this.champ.ad * 1.45)));
            return damage;
        } else if (point == 3) {
            int damage = (int) (130 + (40 * (point - 1) + (this.champ.ad * 1.65)));
            return damage;
        } else if (point == 4) {
            int damage = (int) (170 + (40 * (point - 1) + (this.champ.ad * 1.85)));
            return damage;
        } else {
            int damage = (int) (210 + (40 * (point - 1) + (this.champ.ad * 2.05)));
            return damage;
        }

    }

    @Override
    public int afterDamege() {
                if (point < 1) {
            return super.getDamage();
        } else if (point == 1) {
            int damage = (int) (25 + (20 * (point - 1) + (this.champ.ad * 0.625)));
            return damage;
        } else if (point == 2) {
            int damage = (int) (45 + (20 * (point - 1) + (this.champ.ad * 0.725)));
            return damage;
        } else if (point == 3) {
            int damage = (int) (65 + (20 * (point - 1) + (this.champ.ad * 0.825)));
            return damage;
        } else if (point == 4) {
            int damage = (int) (85 + (20 * (point - 1) + (this.champ.ad * 0.925)));
            return damage;
        } else {
            int damage = (int) (105 + (20 * (point - 1) + (this.champ.ad * 1.025)));
            return damage;
        }
    }

}

// 챔피언의 공통적인 부분을 만들어 준다.
class Champ {
    // 물리 공격력
    int ad;
    Skill skill;

    public Champ(int ad, Skill skill) {
        this.ad = ad;
        this.skill = skill;
    }

}

// 팸피언의 공통적인 부분을 이어 받아 개별캐릭터의 특징을 다시 세팅해준다.
class 애쉬 extends Champ {
    public 애쉬() {
        // 1. 상속받는 객체가 생성됨
        // 2. super를 통해서 객체 안의 필드에 값을 초기화해줌
        super(90, null);
        // 3. 현재 class의 객체가 생성됨
        // 4. 현재 객체 안의 필드에 값을 넣어줌
        this.skill = new Volly(this);
    }
}

class 케이틀린 extends Champ {
    public 케이틀린() {
        super(96, null);

        this.skill = new Peace(this);
    }

    public void attack() {
        System.out.println("처음 데미지 : " + skill.getDamage());
        System.out.println("이후 데미지 : " + skill.afterDamege());
    }

    public void levelup() {
        skill.plusPoint();
    }
}

public class S04 {
    public static void main(String[] args) {

        // 참조형 변수에 주소값을 아직 모르는 상태에서
        // 초기화를 해주려고 하는 경우 null을 사용한다.
        // String str= null;
        // System.out.println(str);
        // str = "홍길동";
        // System.out.println(str);

        // 애쉬 champ1 = new 애쉬();

        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());
        // champ1.skill.plusPoint();
        // System.out.println(champ1.skill.getDamage());

        // 케이틀린 caitlyn = new 케이틀린();

        // System.out.println("케이틀린");
        // caitlyn.attack();
        // caitlyn.levelup();
        // caitlyn.attack();
        // caitlyn.levelup();
        // caitlyn.attack();

        Champ[] chamyArray = new Champ[2];

        chamyArray[0] = new 애쉬();
        chamyArray[1] = new 케이틀린();

        for (int i = 0; i < chamyArray.length; i++) {
            
            chamyArray[i].skill.plusPoint();

            System.out.println(chamyArray[i].skill.getDamage());
        }
    }
}
