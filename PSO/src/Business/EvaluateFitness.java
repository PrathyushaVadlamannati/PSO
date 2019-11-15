package Business;

import java.util.Random;

/**
 *
 * @author prathyusha
 */
public class EvaluateFitness {

    ParticleFlyingRobot particleFlyingRobot;

    ParticleFlyingRobot targetParticle;

    public EvaluateFitness(ParticleFlyingRobot targetParticle) {
        this.targetParticle = targetParticle;

    }

    public double fitnessCalculation(ParticleFlyingRobot p) {
        double fitnessValue;
        double abs_diff_x;
        double abs_diff_y;

        abs_diff_x = Math.abs(p.getParticlePosition().getParticlePosition()[0] - targetParticle.getParticlePosition().getParticlePosition()[0]);
        abs_diff_y = Math.abs(p.getParticlePosition().getParticlePosition()[1] - targetParticle.getParticlePosition().getParticlePosition()[1]);

        fitnessValue = Math.sqrt((Math.pow(abs_diff_x, 2)) + (Math.pow(abs_diff_y, 2)));

        return fitnessValue;
    }
}
