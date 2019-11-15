package Business;

/**
 *
 * @author prathyusha
 */
public class ParticleVelocity {

    private double[] particleVelocity;

    public double[] getParticleVelocity() {
        return particleVelocity;
    }

    public void setParticleVelocity(double[] particleVelocity) {
        this.particleVelocity = particleVelocity;
    }

    public ParticleVelocity(double[] velocity) {
        this.particleVelocity = velocity;
    }

}
