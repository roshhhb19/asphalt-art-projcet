import org.code.neighborhood.*;

public class NeighborhoodRunner {
public static void main(String[] args) {
BackgroundPainter background = new BackgroundPainter();
background.setPaint(300);
background.paintBackground("pink");

SimileyFacePainter SimileyFace = new SimileyFacePainter();
SimileyFace.setPaint(300);
SimileyFace.paintSimileyFace("HotPink");

FramePainter frame = new FramePainter();
frame.setPaint(300);
frame.paintFrame("black");
 }
}