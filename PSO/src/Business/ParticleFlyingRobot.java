package Business;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author prathyusha
 */
public class ParticleFlyingRobot {

    private ParticleVelocity particleVelocity;
    private ParticlePosition particlePosition;
    private double size;
    private double fitnessValue;
    private double particlePersonalBest;
    private ParticlePosition particlePersonalBestPosition;

    /**
     * @return the particleVelocity
     */
    public ParticleVelocity getParticleVelocity() {
        return particleVelocity;
    }

    /**
     * @param velocity the particleVelocity to set
     */
    public void setParticleVelocity(ParticleVelocity velocity) {
        this.particleVelocity = velocity;
    }

    /**
     * @return the particlePosition
     */
    public ParticlePosition getParticlePosition() {
        return particlePosition;
    }

    /**
     * @param position the particlePosition to set
     */
    public void setParticlePosition(ParticlePosition position) {
        this.particlePosition = position;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the fitnessValue
     */
    public double getFitnessValue() {
        return fitnessValue;
    }

    /**
     * @param fitnessValue the fitnessValue to set
     */
    public void setFitnessValue(double fitnessValue) {
        this.fitnessValue = fitnessValue;
    }

    /**
     * @return the particlePersonalBest
     */
    public double getParticlePersonalBest() {
        return particlePersonalBest;
    }

    /**
     * @param pBest the particlePersonalBest to set
     */
    public void setParticlePersonalBest(double pBest) {
        this.particlePersonalBest = pBest;
    }

    /**
     * @return the particlePersonalBestPosition
     */
    public ParticlePosition getParticlePersonalBestPosition() {
        return particlePersonalBestPosition;
    }

    /**
     * @param particlePersonalBestPosition the particlePersonalBestPosition to
     * set
     */
    public void setParticlePersonalBestPosition(ParticlePosition particlePersonalBestPosition) {
        this.particlePersonalBestPosition = particlePersonalBestPosition;
    }

    public void drawParticleFlyingRobot(Graphics gh, Color c, double x, double y) {

        int x_coord = (int) x * 5;
        int y_coord = (int) y * 5;
        gh.setColor(c);
        gh.drawOval(x_coord, y_coord, 20, 20);

    }

}
