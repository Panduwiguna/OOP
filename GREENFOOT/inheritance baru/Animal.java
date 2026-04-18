boolean is left = false;

public void move(){
    checkKeyboard();
}

public void checkkeyboard(){
    if (Greenfoot.iskeyDown("left")){
    setLocation(getX()-5, getY())}
}