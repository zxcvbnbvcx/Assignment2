package com.zhao;

public class test {

    public static void main(String[] args) {

        player2 two = new player2();
        two.setAngle(180);
        two.setInitLife(100);
        two.setVelocity(10000);
        two.setName("Tony");
        two.setDamage(100);
        two.Name();
        two.Angle();
        two.velocity();
        two.damage();
        two.life();
        two.damage(two.getInitLife(), two.getDamage());


        System.out.println("\n");
        player1 one = new player1();
        one.setName("Tom");
        one.setInitLife(100);
        one.setAngle(60);
        one.setDamage(30);
        one.setVelocity(2000);
        one.Name();
        one.Angle();
        one.velocity();
        one.damage();
        one.life();
        one.damage(one.getInitLife(),one.getDamage());
    }
}
