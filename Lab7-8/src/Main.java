public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[10];

        workers[0] = new Programmer("Johny Depp", 100, 60, 0.8, 0.9);
        workers[1] = new Programmer("Will Smith", 90, 47, 0.7, 1.0);
        workers[2] = new Programmer("Robert Downey", 80, 53, 0.9, 0.8);
        workers[3] = new Programmer("Daniel Radcliffe", 70, 35, 0.6, 0.95);
        workers[4] = new Programmer("Chris Evans", 60, 33, 0.85, 0.85);
        workers[5] = new Teacher("Chris Pratt", 100, 41, 0.75, 0.05);
        workers[6] = new Teacher("Jackie Chan", 90, 55, 0.65, 0.03);
        workers[7] = new Teacher("Tom Holland", 80, 49, 0.8, 0.04);
        workers[8] = new Teacher("Mark Ruffalo", 70, 50, 0.9, 0.02);
        workers[9] = new Teacher("Brad Pitt", 60, 19, 0.7, 0.01);

        double totalWork5Hours = 0;
        double totalWork10Hours = 0;
        for (int i=0; i<workers.length; i++) {
            totalWork5Hours += workers[i].toWork(5);
            totalWork10Hours += workers[i].toWork(10);
        }
        System.out.println("The total work done by all workers in 5 hours: " + totalWork5Hours);
        System.out.println("The total work done by all workers in 10 hours: " + totalWork10Hours);

        System.out.println("Total work done by each worker in 10 hours:");
        for (int i=0; i<workers.length; i++) {
            System.out.println(workers[i].getFullName() + ": " + workers[i].toWork(10));
        }

        Worker maxPowerWorker = workers[0];
        for (int i=0; i<workers.length; i++) {
            if (workers[i].getPower() > maxPowerWorker.getPower()) {
                maxPowerWorker = workers[i];
            }
        }
        System.out.println("Worker with maximum power: " + maxPowerWorker);


        Worker maxWorkWorker = workers[0];
        double maxWorkDone = workers[0].toWork(10);
        for (int i = 1; i < workers.length; i++) {
            double workDone = workers[i].toWork(10);
            if (workDone > maxWorkDone) {
                maxWorkDone = workDone;
                maxWorkWorker = workers[i];
            }
        }
        System.out.println("Worker with maximum work done in 10 hours: " + maxWorkWorker);
    }
}