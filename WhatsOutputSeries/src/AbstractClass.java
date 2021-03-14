
public abstract class AbstractClass {
   int  custId;
 
AbstractClass(){
	custId=1;
}
abstract public void setId();
abstract  public void getId();
}


//what is abstract class?
//a class that consist of set of methods as blueprints
//it can either have a functionality within it or be abstract which can be implemented by any base class

//abstract classes have specific access modifiers that can be used inside them 
//methods in abstract can be protected/public
//The class AbstractClass can be either abstract or final, not both
