public class Sensor
{
	Sensor()
	{
		//Constructor code goes here
	}

	public interface compass
	{
		private double absoluteZero;

		private double heading;

		//Returns a value between -pi and pi
		public void getHeadingRadians();

		public void normalizeAngle();

		public void getHeadingRelativeTo(double direction);

		public void setAbsoluteZero(double direction);
	}

	public interface gyroscope
	{
		private double angularVelocity;

		public void getAngularVelocity();
	}
}

