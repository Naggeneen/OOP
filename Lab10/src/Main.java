public class Main {
    public static void main(String[] args) {
        ToshibaBattery toshibaBattery1 = new ToshibaBattery(1.5, 2, 2500, 500);
        ToshibaBattery toshibaBattery2 = new ToshibaBattery(1.5, 2.5, 2500, 100);
        ToshibaBattery toshibaBattery3 = new ToshibaBattery(1.5, 3, 2500, 200);
        ToshibaBattery toshibaBattery4 = new ToshibaBattery(1.5, 3.5, 2500, 300);
        ToshibaBattery toshibaBattery5 = new ToshibaBattery(1.5, 4, 2500, 400);

        DuracellBattery duracellBattery1 = new DuracellBattery(1.5, 2, 3000, 1);
        DuracellBattery duracellBattery2 = new DuracellBattery(1.5, 2.5, 2500, 1.5);
        DuracellBattery duracellBattery3 = new DuracellBattery(1.5, 3, 2600, 1.4);
        DuracellBattery duracellBattery4 = new DuracellBattery(1.5, 3.5, 2700, 1.3);
        DuracellBattery duracellBattery5 = new DuracellBattery(1.5, 4, 2800, 1.2);

        FlashLight flashlight1 = new FlashLight(new Battery[]{toshibaBattery1, duracellBattery1});
        FlashLight flashlight2 = new FlashLight(new Battery[]{toshibaBattery2, duracellBattery2});
        FlashLight flashlight3 = new FlashLight(new Battery[]{toshibaBattery3, duracellBattery3});
        FlashLight flashlight4 = new FlashLight(new Battery[]{toshibaBattery4, duracellBattery4});
        FlashLight flashlight5 = new FlashLight(new Battery[]{toshibaBattery5, duracellBattery5});

        System.out.println("Flashlight1 Lifetime: " + flashlight1.getTotalLifeTime());
        System.out.println("Flashlight2 Lifetime: " + flashlight2.getTotalLifeTime());
        System.out.println("Flashlight3 Lifetime: " + flashlight3.getTotalLifeTime());
        System.out.println("Flashlight4 Lifetime: " + flashlight4.getTotalLifeTime());
        System.out.println("Flashlight5 Lifetime: " + flashlight5.getTotalLifeTime());

        FlashLight flashlights[] = {flashlight1, flashlight2, flashlight3, flashlight4, flashlight5};
        FlashLight maxLifeTimeFlashlight = flashlights[0];
        for(int i =0; i<flashlights.length; i++){
            if (flashlights[i].getTotalLifeTime() > maxLifeTimeFlashlight.getTotalLifeTime()) {
                maxLifeTimeFlashlight = flashlights[i];
            }
        }
        System.out.println("Flashlight with maximum lifetime: " + maxLifeTimeFlashlight.getTotalLifeTime());
    }
}