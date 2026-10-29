package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int initialCapacity) {
        this.mGarbage = false;
        if (initialCapacity == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int initialCapacity2 = ContainerHelpers.idealIntArraySize(initialCapacity);
            this.mKeys = new int[initialCapacity2];
            this.mValues = new Object[initialCapacity2];
        }
        this.mSize = 0;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m50734clone() {
        try {
            SparseArrayCompat<E> clone = (SparseArrayCompat) super.clone();
            clone.mKeys = (int[]) this.mKeys.clone();
            clone.mValues = (Object[]) this.mValues.clone();
            return clone;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Nullable
    public E get(int key) {
        return get(key, null);
    }

    public E get(int i10, E e10) {
        int iBinarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i10);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            if (objArr[iBinarySearch] != DELETED) {
                return (E) objArr[iBinarySearch];
            }
        }
        return e10;
    }

    public void delete(int key) {
        int i10 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, key);
        if (i10 >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[i10];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[i10] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public void remove(int key) {
        delete(key);
    }

    public void removeAt(int index) {
        Object[] objArr = this.mValues;
        Object obj = objArr[index];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[index] = obj2;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int index, int size) {
        int end = Math.min(this.mSize, index + size);
        for (int i10 = index; i10 < end; i10++) {
            removeAt(i10);
        }
    }

    /* JADX INFO: renamed from: gc */
    private void m2438gc() {
        int n10 = this.mSize;
        int o8 = 0;
        int[] keys = this.mKeys;
        Object[] values = this.mValues;
        for (int i10 = 0; i10 < n10; i10++) {
            Object val = values[i10];
            if (val != DELETED) {
                if (i10 != o8) {
                    keys[o8] = keys[i10];
                    values[o8] = val;
                    values[i10] = null;
                }
                o8++;
            }
        }
        this.mGarbage = false;
        this.mSize = o8;
    }

    public void put(int key, E value) {
        int i10 = ContainerHelpers.binarySearch(this.mKeys, this.mSize, key);
        if (i10 >= 0) {
            this.mValues[i10] = value;
            return;
        }
        int i11 = ~i10;
        int i12 = this.mSize;
        if (i11 < i12) {
            Object[] objArr = this.mValues;
            if (objArr[i11] == DELETED) {
                this.mKeys[i11] = key;
                objArr[i11] = value;
                return;
            }
        }
        if (this.mGarbage && i12 >= this.mKeys.length) {
            m2438gc();
            i11 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, key);
        }
        int i13 = this.mSize;
        if (i13 >= this.mKeys.length) {
            int n10 = ContainerHelpers.idealIntArraySize(i13 + 1);
            int[] nkeys = new int[n10];
            Object[] nvalues = new Object[n10];
            int[] iArr = this.mKeys;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.mKeys = nkeys;
            this.mValues = nvalues;
        }
        int n11 = this.mSize;
        if (n11 - i11 != 0) {
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, i11, iArr2, i11 + 1, n11 - i11);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, i11, objArr3, i11 + 1, this.mSize - i11);
        }
        this.mKeys[i11] = key;
        this.mValues[i11] = value;
        this.mSize++;
    }

    public void putAll(@NonNull SparseArrayCompat<? extends E> other) {
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            put(other.keyAt(i10), other.valueAt(i10));
        }
    }

    public int size() {
        if (this.mGarbage) {
            m2438gc();
        }
        return this.mSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int index) {
        if (this.mGarbage) {
            m2438gc();
        }
        return this.mKeys[index];
    }

    public E valueAt(int i10) {
        if (this.mGarbage) {
            m2438gc();
        }
        return (E) this.mValues[i10];
    }

    public void setValueAt(int index, E value) {
        if (this.mGarbage) {
            m2438gc();
        }
        this.mValues[index] = value;
    }

    public int indexOfKey(int key) {
        if (this.mGarbage) {
            m2438gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, key);
    }

    public int indexOfValue(E value) {
        if (this.mGarbage) {
            m2438gc();
        }
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (this.mValues[i10] == value) {
                return i10;
            }
        }
        return -1;
    }

    public boolean containsKey(int key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(E value) {
        return indexOfValue(value) >= 0;
    }

    public void clear() {
        int n10 = this.mSize;
        Object[] values = this.mValues;
        for (int i10 = 0; i10 < n10; i10++) {
            values[i10] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void append(int key, E value) {
        int i10 = this.mSize;
        if (i10 != 0 && key <= this.mKeys[i10 - 1]) {
            put(key, value);
            return;
        }
        if (this.mGarbage && i10 >= this.mKeys.length) {
            m2438gc();
        }
        int pos = this.mSize;
        if (pos >= this.mKeys.length) {
            int n10 = ContainerHelpers.idealIntArraySize(pos + 1);
            int[] nkeys = new int[n10];
            Object[] nvalues = new Object[n10];
            int[] iArr = this.mKeys;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr = this.mValues;
            System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
            this.mKeys = nkeys;
            this.mValues = nvalues;
        }
        this.mKeys[pos] = key;
        this.mValues[pos] = value;
        this.mSize = pos + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.mSize * 28);
        buffer.append('{');
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (i10 > 0) {
                buffer.append(", ");
            }
            int key = keyAt(i10);
            buffer.append(key);
            buffer.append('=');
            Object value = valueAt(i10);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
