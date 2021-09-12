package com.zhao;

public class player2 extends common{

    private String name;
    private int velocity;
    private int angle;
    private int InitLife;
    private int damage;
    private int score;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getInitLife() {
        return InitLife;
    }

    public void setInitLife(int initLife) {
        InitLife = initLife;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }


    public int getAngle() {
        return angle;
    }


    public void setAngle(int angle) {
        this.angle = angle;
    }



    public void Name(){

        name = this.name;
        System.out.println("player2:"+ name);
    }

    @Override
    public void velocity(){

        velocity = this.velocity;
        System.out.println("Velocity: " + velocity);
    }

    @Override
    public void Angle(){

        angle = this.angle;
        System.out.println("Angle: " + angle);
    }

    @Override
    public void life(){


        System.out.println("the InitLife is: " + InitLife);

    }

    public void damage(){

        damage = this.damage;
        System.out.println("damage: " + damage);
    }

    public void damage(int life, int damage){

        int realLife = life - damage;
        System.out.println("my life is : " + realLife);
        if (realLife > 0){
            System.out.println("Live");
        }
        else {
            System.out.println("Dead");
        }
    }



}
