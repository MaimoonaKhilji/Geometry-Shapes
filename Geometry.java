import java.util.Scanner ;

/*	it is default class. its methods will be overridden in other classes. 	*/

class Default
{
   
    Default ( )
    {
          //  Blank Constructor  "Constructor of other classes will print the name of a shape"
    }

    void Sides ( )
    {
//Default method
        System.out.println ( "Take inputs of sides length" ) ; 
    }

    double Area ( )
    {
//Default area method of calculating area
        System.out.println ( "calculate the area " ) ;
        return 0.0 ;
    }

    void Area ( double side )
    {
//Default method for displaying area
        System.out.println ( "Print the area" ) ;
    }

    void Shape ( )
    {
//default method for display shape
        System.out.println ( "Print the shape " ) ;
    }
}

class Triangle extends Default
{
    double height , base , area ;		//member methods
  
    Scanner input = new Scanner ( System.in ) ;

    Triangle ( )
    {
        System.out.println ( "\n\t\t\t\t Triangle" ) ;
    }

   @Override
    void Sides ( )
    {
        System.out.println ( "\n\t\t\t\t enter the Data " ) ;
        System.out.print ( "Base : " ) ;
        base = input.nextInt ( ) ;
        System.out.print ( "Height : " ) ;
        height = input.nextInt ( ) ;
    }

     @Override
    double Area ( )
    {
        area = ( height * base ) / 2.0 ;
        return area ;
    }

    @Override 
// Overloaded + overrided
    void Area ( double area )
    {
        System.out.println ( "\n\t\t\t Area of a Triangle is:   " + area + "\n\n" ) ;
    }
    
    @Override
    void Shape ( )
    {
         for ( int i = 0 ; i <= base ; i += 2 )
		{   	System.out.print ( "\t\t\t\t" ) ;
       		     for ( int k = 0 ; k <= ( 4 - i / 2 ) ; k++ )
       		     {
       		         System.out.print ( " " ) ;
       		     }
       		     for ( int j = 0 ; j <= i ; j++ )
       		     {
       		         System.out.print ( "*" ) ;
       		     }
       		     System.out.print ( "\t\t\t\t\n" ) ;
		}
	System.out.println ( "\t\t\t     Base :       " + base ) ;
    }
}

class Circle extends Default
{
    double r , area ;			//member methods

    Scanner input = new Scanner ( System.in ) ;
    Circle ( )
    {
        System.out.println ( "\n\t\t\t\t Circle" ) ;
    }

     @Override
    void Sides ( )
    {
        System.out.println ( "\n\t\t\t\t enter the Data " ) ;
        System.out.print ( "Radius : " ) ;
        this.r = input.nextDouble ( ) ;
    }

     @Override
    double Area ( )
    {
        area = Math.PI * Math.pow ( r , 2 ) ;
        return area ;
    }

    @Override 
// Overloaded + overrided

    void Area ( double area )
    {
        System.out.println ( "\n\t\t\t Area of a Circle is:   " + area + "\n\n" ) ;
    }

     @Override
    void Shape ( )
    {
       double distance ;  
       for ( int i = 0 ; i <= 2 * r ; i++ ) 
       { 
              System.out.print ( "\t\t\t\t" ) ;
              for ( int j = 0 ; j <= 2 * r ; j++ )
              { 
                     distance = Math.sqrt ( ( i - r ) * ( i - r ) + ( j - r ) * ( j - r ) ) ; 
                     if    ( distance >= r - 0.5     &&    distance <= r + 0.5 ) 
                            System.out.print ( "* " ) ;	
                     else                  
                            System.out.print ( "  " ) ; 
               }
              System.out.println ( ) ;
       } 

        System.out.println ( "\n\t\t\t\t Radius = " + r ) ;
    }
}

class Rectangle extends Default
{
    double s1 , s2 , area ;		//member methods
    
    Scanner input = new Scanner ( System.in ) ;

    Rectangle ( )
    {
        System.out.println ( "\n\t\t\t\t Rectangle" ) ;
    }

     @Override
    void Sides ( )
    {
        System.out.println ( "\n\t\t\t\t enter the Data " ) ; 
        System.out.print ( "Width : " ) ;
        s1 = input.nextInt ( ) ;
        System.out.print ( "Height : " ) ;
        s2 = input.nextInt ( ) ;
    }

     @Override
    double Area ( )
    {
        area = s1 * s2 ;
        return area ;
    }

     @Override 
// Overloaded + overrided

    void Area ( double area )
    {
        System.out.println ( "\n\t\t\t Area of a Rectangle is:   " + area + "\n\n" ) ;
    }

     @Override
    void Shape ( )
    {
           double c = s2 / 2.0 ;
	System.out.println ( "\t\t\t\t Width = " + s1 + "\n" ) ;
	System.out.print ( "\t\t\t\t*" ) ;
	for ( double i = 0.0 ; i <= s1 + 2 ; i++ )
	{
           	System.out.print ( "*" ) ;
	}
	System.out.print ( "*\n" ) ;
	for ( double i = 0 ; i <= c ; i++ )
	{
           	System.out.print ( "\t\t\t\t*" ) ;
           	for ( double j = 0.0 ; j <= s1 + 2 ; j++ )
           	{
           		System.out.print ( " " ) ;
            	}
            	System.out.print ( "*\n" ) ;
	}
	System.out.print ( " \t\t\t\t*" ) ;
	for ( double i = 0.0 ; i <= s1 + 2 ; i++ )
	{
          		System.out.print ( "*" ) ;
	}
	System.out.print ( "*" ) ;
	System.out.println ( "\t\t Heigh = " + s2 ) ;
    }
}

class Square extends Default
{
    
    double length , area ;		// member methods
    
    Scanner input = new Scanner ( System.in ) ;

    Square ( )
    {
        System.out.println ( "\n\t\t\t\t Square" ) ;
    }

     @Override
    void Sides ( )
    {
        System.out.println ( "\n\t\t\t\t enter the Data " ) ;
        System.out.print ( "Length : " ) ;
        length = input.nextInt ( ) ;
    }

     @Override
    double Area ( )
    {
        area = length * length ;
        return area ;
    }

     @Override 
// Overloaded + overrided

    void Area ( double area )
    {
        System.out.println ( "\n\t\t\t Area of a Square is:   " + area + "\n\n" ) ;
    }

     @Override
    void Shape ( )
    {
	double c = length / 2.0 ;
	System.out.print ( "\t\t\t\t*" ) ;
	for ( double i = 0.0 ; i <= length + 2 ; i++ )
	{
            		System.out.print ( "*" ) ;
    	}
	System.out.print ( "*\n" ) ;
	for ( double i = 0 ; i <=c ; i++ )
	{
  	          System.out.print ( "\t\t\t\t*" ) ;
   	         for ( double j = 0.0 ; j <= length + 2 ; j++ )
                              {
                                             System.out.print ( " " ) ;
            	         }
                     		System.out.print ( "*\n" ) ;
	}
	System.out.print ( " \t\t\t\t*" ) ;
	for ( double i = 0.0 ; i <= length + 2 ; i++ )
	{
	            System.out.print ( "*" ) ;
	}
	 System.out.print ( "*" ) ;
  	 System.out.println ( "\n\t\t\t\t Length = " + length + "\n\n" ) ;
    }
}

public class Geometry {
    public static void main ( String args [ ] )
    {
	String answer ;
        System.out.println ( "\n\t\t\t\t GEOMETRY  " ) ;
        System.out.println ( "\n\t\t List of Shapes :  " ) ;
        System.out.println ( "\t\t 1. Triangle \n\t\t 2. Circle \n\t\t 3. Rectangle \n\t\t 4. Square " ) ;

        Scanner input = new Scanner ( System.in ) ;
        do
        {        
                System.out.print ( "\nName of the Shape:  " ) ;
                String wish = input.next ( ) ;
                String c = "circle" ;
                if   ( wish.equalsIgnoreCase ( c ) )
                {
                    Default obj = new Circle ( ) ;
                    obj.Sides ( ) ;
                    double a = obj.Area ( ) ;
                    obj.Area ( a ) ;
                    obj.Shape ( ) ;
                }
                String t = "triangle" ;
                if    ( wish.equalsIgnoreCase ( t ) )
                {
                    Default obj = new Triangle ( ) ;
                    obj.Sides ( ) ;
                    double a = obj.Area ( ) ;
                    obj.Area ( a ) ;
                    obj.Shape ( ) ;
                }
                String r = "rectangle" ;
                if    ( wish.equalsIgnoreCase ( r ) )
                {
                    Default obj = new Rectangle ( ) ;
                    obj.Sides ( ) ;
                    double a = obj.Area ( ) ;
                    obj.Area ( a ) ;
                    obj.Shape ( ) ;
                }
                String s = "square" ;
                if    ( wish.equalsIgnoreCase ( s ) )
                {
                    Default obj = new Square ( ) ;
                    obj.Sides ( ) ;
                    double a = obj.Area ( ) ;
                    obj.Area ( a ) ;
                    obj.Shape ( ) ;
                }
                else if   ( ( !wish.equalsIgnoreCase ( t ) )  &&  ( !wish.equalsIgnoreCase ( c ) )  
&&   ( !wish.equalsIgnoreCase ( s ) ) 
&&   ( ! wish.equalsIgnoreCase ( r ) ) )

                {	  
System.out.println("\t\t\t INVALID INPUT " 
+ " \n\t\t\t  Shape does not exist.");	
      }

                System.out.print ( "\nDo you want to find another Shape? (Y/N):		" ) ;
                answer = input.next ( ) ;
        }  while  ( answer.equalsIgnoreCase ( "y" ) ) ;
	System.out.print ( "\n\t\t\t\t THANK YOU    \n" ) ;
    }
}

