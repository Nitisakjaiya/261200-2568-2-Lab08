public class Main {
    public static void main(String[] args) {
        Turtle.bgcolor("brown");
        Draw leafThread = new Draw(1, 0.5, 0.5, "pink");
        Draw stickThread = new Draw(2, 0.5, 0.5, "black");
        leafThread.start();
        
        try {
            // รอให้ใบวาดเสร็จก่อน
            leafThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // เมื่อวาดใบเสร็จแล้ว ค่อยเริ่มวาดก้าน
        stickThread.start();

        
    }
}