package problem2;

public class IntegerList
{
    int numberOfInt;
    int currentSize;
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = size;
        numberOfInt = 0;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
        numberOfInt = list.length;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        int newSize = (currentSize == 0) ? 10 : currentSize * 2;
        int[] newList = new int[newSize];
        for (int i = 0; i < numberOfInt; i++) {
            newList[i] = list[i];
        }

        list = newList;
        currentSize = newSize;
    }

    public void addElement(int newVal) {
        if (numberOfInt == currentSize) {
            increaseSize();
        }

        list[numberOfInt] = newVal;
        numberOfInt++;
    }

    public void removeFirst(int value) {
        for (int i = 0; i < currentSize; i++) {
            if (list[i] == value) {
                for (int j = i + 1; j < currentSize; j++) {
                    list[j-1] = list[j];

                }
                numberOfInt--;
                break;
            }
        }
    }

    public void removeAll(int value) {
        for (int i = 0; i < currentSize; i++) {
            if (list[i] == value) {
                for (int j = i + 1; j < currentSize; j++) {
                    list[j-1] = list[j];

                }
                numberOfInt--;
                i--;
            }
        }
    }
}