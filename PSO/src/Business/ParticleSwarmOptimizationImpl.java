package Business;

import Interface.GraphicsFrame;
import static Interface.GraphicsFrame.mMainJFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author prathyusha
 */
public class ParticleSwarmOptimizationImpl {

    private int swarm_size;
    private Vector<ParticleFlyingRobot> swarmCollection;

    private double constant1 = 2.0;
    private double constant2 = 2.0;
    private double particle_inertia = 1.0;
    private double r1 = Math.random();
    private double r2 = Math.random();

    private ParticleFlyingRobot targetParticle;

    private Graphics graphics;

    private GraphicsFrame mMainJFrame;
    private JPanel jPanel3;
    private HashMap hashMapMain;

    private double[] particle_best;

    private ParticlePosition particle_best_postion;
    private ParticleVelocity particle_best_velocity;

    private double global_best;

    private ParticlePosition global_best_position;
    private int main_iteration_count = 1;
    private int counter = 1;
    private EvaluateFitness fitness;

    public ParticleSwarmOptimizationImpl(int swarm_size, Vector<ParticleFlyingRobot> swarmCollection, JPanel jPanel3, HashMap hashMapMain) {
        this.swarm_size = swarm_size;
        this.swarmCollection = swarmCollection;
        this.mMainJFrame = mMainJFrame;
        this.jPanel3 = jPanel3;
        this.hashMapMain = hashMapMain;

    }

    public void updateParticlePositionsUI() throws IOException {

        String imgPath = "/Users/sriram/NetBeansProjects/Final_Project_PSO_backup_UI_image/src/Images/flyingrobots.jpg";

        BufferedImage img = ImageIO.read(new File(imgPath));

        jPanel3.getGraphics().drawImage(img, 0, 0, jPanel3.getWidth(), jPanel3.getHeight(), jPanel3);

        targetParticle.drawParticleFlyingRobot(jPanel3.getGraphics(), Color.ORANGE, targetParticle.getParticlePosition().getParticlePosition()[0], targetParticle.getParticlePosition().getParticlePosition()[1]);

        for (ParticleFlyingRobot p : swarmCollection) {

            p.drawParticleFlyingRobot(jPanel3.getGraphics(), Color.GREEN, p.getParticlePosition().getParticlePosition()[0], p.getParticlePosition().getParticlePosition()[1]);

        }
    }

    public void createSwarmParticles(double targetposxy[], double Xmin, double Xmax, double Ymin, double Ymax) throws IOException {

        double xMin = Xmin;
        double xMax = Xmax;
        double yMin = Ymin;
        double yMax = Ymax;
        double vMin = 1;
        double vMax = 2;

        targetParticle = new ParticleFlyingRobot();
        double[] targetPosition = new double[2];

        targetPosition[0] = targetposxy[0];
        targetPosition[1] = targetposxy[1];

        targetParticle.setParticlePosition(new ParticlePosition(targetPosition));

        fitness = new EvaluateFitness(targetParticle);

        particle_best = new double[swarm_size];

        for (int j = 0; j < swarm_size; j++) {

            ParticleFlyingRobot p = new ParticleFlyingRobot();

            double[] position = new double[2];

            position[0] = generateRandomData(xMin, xMax);
            position[1] = generateRandomData(yMin, yMax);

            p.setParticlePosition(new ParticlePosition(position));

            p.setParticlePersonalBestPosition(p.getParticlePosition());

            double[] vel = new double[2];

            vel[0] = generateRandomData(vMin, vMax);
            vel[1] = generateRandomData(vMin, vMax);
            p.setParticleVelocity(new ParticleVelocity(vel));

            p.setFitnessValue(fitness.fitnessCalculation(p));

            p.setParticlePersonalBest(p.getFitnessValue());

            particle_best[j] = p.getParticlePersonalBest();

            swarmCollection.add(p);
        }

        updateParticlePositionsUI();

        // initially the 1st particle's personal best is considered to be the global best
        global_best = particle_best[0];

        //particle s initial position
        global_best_position = swarmCollection.get(0).getParticlePosition();

        for (int j = 1; j < swarm_size; j++) {

            if (global_best > particle_best[j]) {
                global_best = particle_best[j];
                global_best_position = swarmCollection.get(j).getParticlePosition();
            }

        }

    }

    public void outputSwarmDetails() {

        System.out.println("============== Swarm details output start===============");
        for (int i = 0; i < swarm_size; i++) {

            ParticleFlyingRobot p = swarmCollection.get(i);
            System.out.println("Particle No: " + i);
            System.out.println("x coordinate: " + p.getParticlePosition().getParticlePosition()[0]);
            System.out.println("y coordinate: " + p.getParticlePosition().getParticlePosition()[1]);

            System.out.println("velocity x coord: " + p.getParticleVelocity().getParticleVelocity()[0]);
            System.out.println("velocity y coord: " + p.getParticleVelocity().getParticleVelocity()[1]);
            System.out.println("personalBest:" + p.getParticlePersonalBest());
            System.out.println("personalBest Position: x: " + p.getParticlePersonalBestPosition().getParticlePosition()[0]);
            System.out.println("personalBest Position: y: " + p.getParticlePersonalBestPosition().getParticlePosition()[1]);

            System.out.println("============================");
        }
        System.out.println("============================ Swarm details output end============================");
    }

    public static double generateRandomData(double min, double max) {
        Random r = new Random();

        double result = min + (max - min) * r.nextDouble();

        return result;
    }

    public double getGlobalBest() {
        return global_best;
    }

    public void setGlobalBest(double globalBest) {
        this.global_best = globalBest;
    }

    public ParticlePosition getGlobalBestPosition() {
        return global_best_position;
    }

    public void setGlobalBestPosition(ParticlePosition globalBestPosition) {
        this.global_best_position = globalBestPosition;
    }

    public void updateSwarmParticles(int particleNumber, ParticleFlyingRobot particle) throws IOException {

        if (counter > swarm_size) {

            outputSwarmDetails();

            int x = 0;

            for (int i = 1; i < swarm_size; i++) {

                if (particle_best[x] > particle_best[i]) {
                    x = i;
                }
            }

            System.out.println("Global Best Min Value:" + particle_best[x]);
            System.out.println("Previous global best value:" + global_best);
            System.out.println("Iteration Count:" + main_iteration_count);

            hashMapMain.put(main_iteration_count, particle_best[x]);

            if (global_best > particle_best[x]) {
                global_best = particle_best[x];
                global_best_position = swarmCollection.get(x).getParticlePosition();
            }

            counter = 1;
            updateParticlePositionsUI();

            main_iteration_count++;
        }

        counter++;

        // setting new position coordinates for the particle
        double[] newParticleVelocity = new double[2];

        newParticleVelocity[0] = (particle_inertia * particle.getParticleVelocity().getParticleVelocity()[0])
                + (r1 * constant1) * (particle.getParticlePersonalBestPosition().getParticlePosition()[0] - particle.getParticlePosition().getParticlePosition()[0])
                + (r2 * constant2) * (global_best_position.getParticlePosition()[0] - particle.getParticlePosition().getParticlePosition()[0]);

        newParticleVelocity[1] = (particle_inertia * particle.getParticleVelocity().getParticleVelocity()[1])
                + (r1 * constant1) * (particle.getParticlePersonalBestPosition().getParticlePosition()[1] - particle.getParticlePosition().getParticlePosition()[1])
                + (r2 * constant2) * (global_best_position.getParticlePosition()[1] - particle.getParticlePosition().getParticlePosition()[1]);

        particle.setParticleVelocity(new ParticleVelocity(newParticleVelocity));

        double[] newPos = new double[2];
        newPos[0] = particle.getParticlePosition().getParticlePosition()[0] + newParticleVelocity[0];
        newPos[1] = particle.getParticlePosition().getParticlePosition()[1] + newParticleVelocity[1];
        particle.setParticlePosition(new ParticlePosition(newPos));
        double fitnessValue;

        fitnessValue = fitness.fitnessCalculation(particle);

        if (particle.getParticlePersonalBest() > fitnessValue) {
            particle.setFitnessValue(fitnessValue);
            particle.setParticlePersonalBest(fitnessValue);
            particle.setParticlePersonalBestPosition(particle.getParticlePosition());
        }

        particle_best[particleNumber] = particle.getParticlePersonalBest();

    }
}
