package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final int[] INT = new int[0];
    private static final Object[] OBJECT = new Object[0];
    private static final String TAG = "ArraySet";

    @Nullable
    private static Object[] sBaseCache;
    private static int sBaseCacheSize;

    @Nullable
    private static Object[] sTwiceBaseCache;
    private static int sTwiceBaseCacheSize;
    Object[] mArray;
    private MapCollections<E, E> mCollections;
    private int[] mHashes;
    int mSize;

    private int indexOf(Object key, int hash) {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = ContainerHelpers.binarySearch(this.mHashes, N, hash);
        if (index < 0 || key.equals(this.mArray[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == hash) {
            if (key.equals(this.mArray[end])) {
                return end;
            }
            end++;
        }
        for (int i10 = index - 1; i10 >= 0 && this.mHashes[i10] == hash; i10--) {
            if (key.equals(this.mArray[i10])) {
                return i10;
            }
        }
        int i11 = ~end;
        return i11;
    }

    private int indexOfNull() {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = ContainerHelpers.binarySearch(this.mHashes, N, 0);
        if (index < 0 || this.mArray[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == 0) {
            if (this.mArray[end] == null) {
                return end;
            }
            end++;
        }
        for (int i10 = index - 1; i10 >= 0 && this.mHashes[i10] == 0; i10--) {
            if (this.mArray[i10] == null) {
                return i10;
            }
        }
        int i11 = ~end;
        return i11;
    }

    private void allocArrays(int size) {
        if (size == 8) {
            synchronized (ArraySet.class) {
                Object[] array = sTwiceBaseCache;
                if (array != null) {
                    this.mArray = array;
                    sTwiceBaseCache = (Object[]) array[0];
                    this.mHashes = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    sTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (ArraySet.class) {
                Object[] array2 = sBaseCache;
                if (array2 != null) {
                    this.mArray = array2;
                    sBaseCache = (Object[]) array2[0];
                    this.mHashes = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    sBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[size];
        this.mArray = new Object[size];
    }

    private static void freeArrays(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (ArraySet.class) {
                if (sTwiceBaseCacheSize < 10) {
                    array[0] = sTwiceBaseCache;
                    array[1] = hashes;
                    for (int i10 = size - 1; i10 >= 2; i10--) {
                        array[i10] = null;
                    }
                    sTwiceBaseCache = array;
                    sTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (hashes.length == 4) {
            synchronized (ArraySet.class) {
                if (sBaseCacheSize < 10) {
                    array[0] = sBaseCache;
                    array[1] = hashes;
                    for (int i11 = size - 1; i11 >= 2; i11--) {
                        array[i11] = null;
                    }
                    sBaseCache = array;
                    sBaseCacheSize++;
                }
            }
        }
    }

    public ArraySet() {
        this(0);
    }

    public ArraySet(int capacity) {
        if (capacity == 0) {
            this.mHashes = INT;
            this.mArray = OBJECT;
        } else {
            allocArrays(capacity);
        }
        this.mSize = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.collection.ArraySet<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable ArraySet<E> arraySet) {
        this();
        if (arraySet != 0) {
            addAll((ArraySet) arraySet);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<E> */
    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@Nullable Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.mSize;
        if (i10 != 0) {
            freeArrays(this.mHashes, this.mArray, i10);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        }
    }

    public void ensureCapacity(int minimumCapacity) {
        if (this.mHashes.length < minimumCapacity) {
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            allocArrays(minimumCapacity);
            int i10 = this.mSize;
            if (i10 > 0) {
                System.arraycopy(ohashes, 0, this.mHashes, 0, i10);
                System.arraycopy(oarray, 0, this.mArray, 0, this.mSize);
            }
            freeArrays(ohashes, oarray, this.mSize);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object key) {
        return indexOf(key) >= 0;
    }

    public int indexOf(@Nullable Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    @Nullable
    public E valueAt(int i10) {
        return (E) this.mArray[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E value) {
        int hash;
        int index;
        if (value == null) {
            hash = 0;
            index = indexOfNull();
        } else {
            hash = value.hashCode();
            index = indexOf(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        int i10 = this.mSize;
        if (i10 >= this.mHashes.length) {
            int i11 = 4;
            if (i10 >= 8) {
                i11 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i11 = 8;
            }
            int n10 = i11;
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            allocArrays(n10);
            int[] iArr = this.mHashes;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.mArray, 0, oarray.length);
            }
            freeArrays(ohashes, oarray, this.mSize);
        }
        int i12 = this.mSize;
        if (index2 < i12) {
            int[] iArr2 = this.mHashes;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i12 - index2);
            Object[] objArr = this.mArray;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.mSize - index2);
        }
        this.mHashes[index2] = hash;
        this.mArray[index2] = value;
        this.mSize++;
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void append(E value) {
        int index = this.mSize;
        int hash = value == null ? 0 : value.hashCode();
        int[] iArr = this.mHashes;
        if (index >= iArr.length) {
            throw new IllegalStateException("Array is full");
        }
        if (index > 0 && iArr[index - 1] > hash) {
            add(value);
            return;
        }
        this.mSize = index + 1;
        iArr[index] = hash;
        this.mArray[index] = value;
    }

    public void addAll(@NonNull ArraySet<? extends E> array) {
        int N = array.mSize;
        ensureCapacity(this.mSize + N);
        if (this.mSize == 0) {
            if (N > 0) {
                System.arraycopy(array.mHashes, 0, this.mHashes, 0, N);
                System.arraycopy(array.mArray, 0, this.mArray, 0, N);
                this.mSize = N;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < N; i10++) {
            add(array.valueAt(i10));
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object object) {
        int index = indexOf(object);
        if (index >= 0) {
            removeAt(index);
            return true;
        }
        return false;
    }

    public E removeAt(int i10) {
        Object[] objArr = this.mArray;
        E e10 = (E) objArr[i10];
        int i11 = this.mSize;
        if (i11 <= 1) {
            freeArrays(this.mHashes, objArr, i11);
            this.mHashes = INT;
            this.mArray = OBJECT;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                int i12 = i11 > 8 ? i11 + (i11 >> 1) : 8;
                int[] iArr2 = this.mHashes;
                Object[] objArr2 = this.mArray;
                allocArrays(i12);
                this.mSize--;
                if (i10 > 0) {
                    System.arraycopy(iArr2, 0, this.mHashes, 0, i10);
                    System.arraycopy(objArr2, 0, this.mArray, 0, i10);
                }
                int i13 = this.mSize;
                if (i10 < i13) {
                    System.arraycopy(iArr2, i10 + 1, this.mHashes, i10, i13 - i10);
                    System.arraycopy(objArr2, i10 + 1, this.mArray, i10, this.mSize - i10);
                }
            } else {
                int i14 = i11 - 1;
                this.mSize = i14;
                if (i10 < i14) {
                    System.arraycopy(iArr, i10 + 1, iArr, i10, i14 - i10);
                    Object[] objArr3 = this.mArray;
                    System.arraycopy(objArr3, i10 + 1, objArr3, i10, this.mSize - i10);
                }
                this.mArray[this.mSize] = null;
            }
        }
        return e10;
    }

    public boolean removeAll(@NonNull ArraySet<? extends E> array) {
        int N = array.mSize;
        int originalSize = this.mSize;
        for (int i10 = 0; i10 < N; i10++) {
            remove(array.valueAt(i10));
        }
        int i11 = this.mSize;
        return originalSize != i11;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.mSize;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i10 = this.mSize;
        Object[] result = new Object[i10];
        System.arraycopy(this.mArray, 0, result, 0, i10);
        return result;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.mSize) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.mSize));
        }
        System.arraycopy(this.mArray, 0, tArr, 0, this.mSize);
        int length = tArr.length;
        int i10 = this.mSize;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.mSize; i10++) {
            try {
                E mine = valueAt(i10);
                if (!set.contains(mine)) {
                    return false;
                }
            } catch (ClassCastException e10) {
                return false;
            } catch (NullPointerException e11) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = this.mHashes;
        int result = 0;
        int s8 = this.mSize;
        for (int i10 = 0; i10 < s8; i10++) {
            result += hashes[i10];
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.mSize * 14);
        buffer.append('{');
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (i10 > 0) {
                buffer.append(", ");
            }
            Object value = valueAt(i10);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    private MapCollections<E, E> getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new MapCollections<E, E>() { // from class: androidx.collection.ArraySet.1
                @Override // androidx.collection.MapCollections
                protected int colGetSize() {
                    return ArraySet.this.mSize;
                }

                @Override // androidx.collection.MapCollections
                protected Object colGetEntry(int index, int offset) {
                    return ArraySet.this.mArray[index];
                }

                @Override // androidx.collection.MapCollections
                protected int colIndexOfKey(Object key) {
                    return ArraySet.this.indexOf(key);
                }

                @Override // androidx.collection.MapCollections
                protected int colIndexOfValue(Object value) {
                    return ArraySet.this.indexOf(value);
                }

                @Override // androidx.collection.MapCollections
                protected Map<E, E> colGetMap() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // androidx.collection.MapCollections
                protected void colPut(E key, E value) {
                    ArraySet.this.add(key);
                }

                @Override // androidx.collection.MapCollections
                protected E colSetValue(int index, E value) {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // androidx.collection.MapCollections
                protected void colRemoveAt(int index) {
                    ArraySet.this.removeAt(index);
                }

                @Override // androidx.collection.MapCollections
                protected void colClear() {
                    ArraySet.this.clear();
                }
            };
        }
        return this.mCollections;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return getCollection().getKeySet().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        ensureCapacity(this.mSize + collection.size());
        boolean added = false;
        for (E value : collection) {
            added |= add(value);
        }
        return added;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        boolean removed = false;
        for (Object value : collection) {
            removed |= remove(value);
        }
        return removed;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean removed = false;
        for (int i10 = this.mSize - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.mArray[i10])) {
                removeAt(i10);
                removed = true;
            }
        }
        return removed;
    }
}
