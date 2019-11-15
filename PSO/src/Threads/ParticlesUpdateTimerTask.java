package Threads;

import Business.ParticleSwarmOptimizationImpl;
import Business.ParticleFlyingRobot;
import java.io.IOException;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author prathyusha
 */
public class ParticlesUpdateTimerTask extends TimerTask {

    private int particleNumber;
    private ParticleFlyingRobot particle;
    private ParticleSwarmOptimizationImpl pso;

    public ParticlesUpdateTimerTask(int i, ParticleFlyingRobot p, ParticleSwarmOptimizationImpl pso) {
        this.particleNumber = i;
        this.particle = p;
        this.pso = pso;

    }

    @Override
    public void run() {
        try {

            pso.updateSwarmParticles(particleNumber, particle);

        } catch (IOException ex) {
            Logger.getLogger(ParticlesUpdateTimerTask.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
