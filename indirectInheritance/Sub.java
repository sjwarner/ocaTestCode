// Even though Sub is in the same package
// as Super, it cannot access the package-private
// variable declared in Super, because Middle
// loses sight of this variable.

package indirectInheritance;
import indirectInheritance.oca.Middle;

public class Sub extends Middle {

}
