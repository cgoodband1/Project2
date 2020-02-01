	/**
	 * The country class creates the country object. The public country method is 
	 * the constructor. There are get methods for every data input. The getName() 
	 * gets the name from the object. GetCode() gets the code from the object. 
	 * getCapital() gets the Capital from the object. getPopulation gets the 
	 * Population from the object. getGDP() gets the GDP from the object. 
	 * getHappinessRank() gets the happiness rank from the object. The set methods 
	 * then set the data that is received from the get methods. GetGDPPerCapita 
	 * divides the GDP by the Population for each country from the objects. The 
	 * print() method prints the country object plus the header. 
	 * 
	 * @author <Chase Goodband>
	 * @version<10/25/2019>
	 * 
	 *
	 */
	public class country {
		private String Name;
		private String Code;
		private String Capital;
		private long Population;
		private double GDP;
		private int  HappinessRank;
		
		public country next;
		public country prev;
		 
		/**
		 * The constructor creates the object of country class. 
		 * @param Name The name of the country object.
		 * @param Code the Abrriviation of the country name.
		 * @param Capital the Captial of the country.
		 * @param population The population of the country.
		 * @param GDP The GDP of the Country.
		 * @param happRank The Happiness rank of the country.
		 */
		public country(String Name, String Code, String Capital, long population, double GDP, int happRank) {     //constructor
			this.Name = Name;
			this.Code = Code;
			this.Capital = Capital;
			this.Population = population;
			this.GDP = GDP;
			this.HappinessRank = happRank;
			
			}
		
		public country(country dd) {
			// TODO Auto-generated constructor stub
		}
        /**
         * The method gets the name of the country.
         * @return returns the name of the country object.
         */
		public String getName() {      //get method
			return Name;
		}
		/**
		 * The method gets the code of the country.
		 * @return returns the abbrivaition of the country name.
		 */
		public String getCode() {       //get method
			return Code;
		}
		/**
		 * The method gets the Capital of the country.
		 * @return returns the captial of the country object.
		 */
		public String getCapital() {       //get method
			return Capital;
		}
		/**
		 * The method gets the population  of the country.
		 * @return returns the population of the country object.
		 */
		public long getPopulation() {     //get method
			return Population;
		}
		/**
		 * The method gets the GDP of the country.
		 * @return returns the GDP of the country object.
		 */
		public double getGDP() {            //get method
			return GDP;
		}
		/**
		 * The method gets the Happiness Rank of the country.
		 * @return returns the happiness rank of the country.
		 */
		public int getHappinessRank() {               //get method
			return HappinessRank;
		}
        /**
         * The method sets the name of the country received from the get method.
         * @param Name The name of the country.
         */
		public void setName(String Name) {       //set method
			this.Name = Name;
		}
		/**
		 * The method sets the abbriviation of the country received from the get method.
		 * @param Code the abbrivation of the country name,
		 */
		public void setCode(String Code) {       //set method
			this.Code = Code;
		}
		/**
		 * The method sets the Capital of the country received from the get method.
		 * @param Capital The capital of the country. 
		 */
		public void setCapital(String Capital) {             //set method
			this.Capital = Capital;
		}
		/**
		 * The method sets the population of the country received from the get method.
		 * @param Population The population of the country.
		 */
		public void setPopulation(long Population) {                 //set method
			this.Population = Population;
		}
		/**
		 * The method sets the GDP of the country received from the get method.
		 * @param GDP The GDP of the country.
		 */
		public void setGDP(double GDP) {                              //set method
			this.GDP = GDP;
		}
		/**
		 * The method sets the Happiness rank  of the country received from the get method.
		 * @param HappinessRank the Happiness rank of the country.
		 */
		public void setHappinessRank(int HappinessRank) {                  //set method
			this.HappinessRank = HappinessRank;
		}
		
		/**
		 * This method divides the GDP by the population 
		 * @return Returns the GDP per capita of each country object.
		 */
		public double getGDPPerCapita() {
			return GDP / Population;
		}
		public void compare(country c) {
			
			
		}

//		public void print() {                                              // print country method 
//			System.out.println("Name:"+                Name);
//			System.out.println("Code:"+                Code);
//			System.out.println("Capital:"+             Capital);
//			System.out.println("Population:"+          Population);
//			System.out.println("GDP:"+                 GDP);
//			System.out.println("Happiness Rank:"+      HappinessRank);
//		}
//		
		
        /**
         * The method prints the country object and the header of the object. 
         */
		public void print() { 
			
			System.out.printf("%-26s %-17s %-12s %-16s %-12s\n", getName(), getCode(), getCapital(), getPopulation(), getGDP(), getHappinessRank());
		}
			
	}

