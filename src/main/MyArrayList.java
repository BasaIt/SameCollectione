package main;

public class MyArrayList {
    private String[] nameList = new String[10];
    private int size = 0;

    public void add(String s) {
        nameList[size] = s;
        size++;
        if (size == nameList.length) {
            String[] newArray = new String[nameList.length * 2];
            for (int i = 0; i < nameList.length; i++) {
                newArray[i] = nameList[i];
            }

            nameList = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                nameList[i] = nameList[i + 1];
            }
            size--;
        }
    }

    public void remove(String s){
        int index = - 1;
        for (int i = 0; i < size; i++) {
            if (s.equals(nameList[i]));
            index = i;
            break;
        }
        if (index != -1){
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && size > index) {
            return nameList[index];
        }else {
            return "Элимент не найден";
        }
    }
}
