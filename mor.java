package Tharun;

		class Bank{
			int getRateOfInterest() {
				return 0;
			}
		}
			class sbi extends Bank{
				@Override
				int getRateOfInterest() {
					return 9;
				}
			}
				class hdfc extends Bank{
					@Override
					int getRateOfInterest() {
						return 8;
				}
			}
				class axis extends Bank{
					@Override
					int getRateOfInterest() {
						return 8;
				}
			}
				class mor{
					public static void main(String[] args) {
						sbi b1=new sbi();
						hdfc b2=new hdfc();
						axis b3=new axis();
						System.out.println("the rate of interest in hdfc:"+b1.getRateOfInterest());
						System.out.println("the rate of interest in hdfc:"+b2.getRateOfInterest());
						System.out.println("the rate of interest in axis:"+b3.getRateOfInterest());
				}
			}
		




