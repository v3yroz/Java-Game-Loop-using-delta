@Override
    public void run() {

        double drawInterval = 1000000000/FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        long drawCount = 0;

        while(gameThread != null){

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1){
                //your update/draw functions
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000){
                drawCount = 0;
                timer = 0;
            }

        }
    }
