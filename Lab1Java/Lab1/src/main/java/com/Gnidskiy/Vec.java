package com.Gnidskiy;

public class Vec<T> {
    private T[] _array;

    private int _size;


    private T[] alloc(int size) {
        return (T[]) new Object[size];
    }


    private void realloc() {
        T[] place = _array;
        _array = alloc(_array.length * 2);

        for (int i = 0; i < place.length; ++i)
            _array[i] = place[i];
    }


    private boolean inBounds(int idx) {
        return idx >= 0 && idx < _size;
    }


    public Vec() {
        _size = 0;
        _array = alloc(1);
    }


    public Vec(int size) {
        _size = size;
        _array = alloc(_size);
    }

    public Vec(T... vars) {
        _size = vars.length;
        _array = vars.clone();
    }


    public T at(int idx) {
        if (!inBounds(idx))
            throw new ArrayIndexOutOfBoundsException(idx + " was out of bounds of array");
        else
            return _array[idx];
    }


    public void push(T item) {
        insert(_size, item);
    }


    public void insert(int idx, T item) {
        if (_size + 1 >= _array.length)
            realloc();

        for (int i = _size; i > idx; --i)
            _array[i] = _array[i - 1];

        _array[idx] = item;

        ++_size;
    }


    public void remove(int idx) {
        if (!inBounds(idx))
            throw new ArrayIndexOutOfBoundsException(idx + " was out of bounds of array");
        else {
            for (int i = idx; i < _size - 1; ++i)
                _array[i] = _array[i + 1];

            --_size;
        }
    }


    public int length() {
        return _size;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < _size - 1; ++i)
            builder.append(_array[i]).append(" ");
        builder.append(_array[_size - 1]);

        return builder.toString();
    }
}
