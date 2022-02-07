import java.util.ArrayList;

/**
 * @author Brittany Sun
 */
public class UsedCarLot
{
    private ArrayList<Car> inventory;

    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * @param added
     */
    public void addCar(Car added)
    {
        inventory.add(added);
    }

    public boolean swap(int one, int two)
    {
        if (one < inventory.size() && two < inventory.size() && one > 0 && two > 0)
        {
            Car car1 = inventory.get(one);
            Car car2 = inventory.get(two);
            inventory.set(one, car2);
            inventory.set(two, car1);
            return true;
        }
        else
        {
            return false;
        }
    }

    // ADD THESE FOUR NEW METHODS TO UsedCarLot

    /* Adds a Car to the inventory list at the index specified
        by indexToAdd; this method increases the size of inventory by 1
        PRECONDITION: 0 <= indexToAdd < inventory.size()
        DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
        like you did the other addCar method; also note that this method is void
    */

    /**
     *
     * @param indexToAdd
     * @param carToAdd
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */
    /** shifts index ; removes*/
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car removed = inventory.remove(indexOfCarToSell);
        return removed;

    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */
    /** removes and replaces with null; no shift*/
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */
    /** moves car*/
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }
}