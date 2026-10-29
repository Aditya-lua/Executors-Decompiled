package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";

    @Nullable
    static Object[] mBaseCache;
    static int mBaseCacheSize;

    @Nullable
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    private static int binarySearchHashes(int[] hashes, int N, int hash) {
        try {
            return ContainerHelpers.binarySearch(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new ConcurrentModificationException();
        }
    }

    int indexOf(Object key, int hash) {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = binarySearchHashes(this.mHashes, N, hash);
        if (index < 0 || key.equals(this.mArray[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == hash) {
            if (key.equals(this.mArray[end << 1])) {
                return end;
            }
            end++;
        }
        for (int i10 = index - 1; i10 >= 0 && this.mHashes[i10] == hash; i10--) {
            if (key.equals(this.mArray[i10 << 1])) {
                return i10;
            }
        }
        int i11 = ~end;
        return i11;
    }

    int indexOfNull() {
        int N = this.mSize;
        if (N == 0) {
            return -1;
        }
        int index = binarySearchHashes(this.mHashes, N, 0);
        if (index < 0 || this.mArray[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.mHashes[end] == 0) {
            if (this.mArray[end << 1] == null) {
                return end;
            }
            end++;
        }
        for (int i10 = index - 1; i10 >= 0 && this.mHashes[i10] == 0; i10--) {
            if (this.mArray[i10 << 1] == null) {
                return i10;
            }
        }
        int i11 = ~end;
        return i11;
    }

    private void allocArrays(int size) {
        if (size == 8) {
            synchronized (ArrayMap.class) {
                Object[] array = mTwiceBaseCache;
                if (array != null) {
                    this.mArray = array;
                    mTwiceBaseCache = (Object[]) array[0];
                    this.mHashes = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (ArrayMap.class) {
                Object[] array2 = mBaseCache;
                if (array2 != null) {
                    this.mArray = array2;
                    mBaseCache = (Object[]) array2[0];
                    this.mHashes = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[size];
        this.mArray = new Object[size << 1];
    }

    private static void freeArrays(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (ArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    array[0] = mTwiceBaseCache;
                    array[1] = hashes;
                    for (int i10 = (size << 1) - 1; i10 >= 2; i10--) {
                        array[i10] = null;
                    }
                    mTwiceBaseCache = array;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (hashes.length == 4) {
            synchronized (ArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    array[0] = mBaseCache;
                    array[1] = hashes;
                    for (int i11 = (size << 1) - 1; i11 >= 2; i11--) {
                        array[i11] = null;
                    }
                    mBaseCache = array;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    public SimpleArrayMap(int capacity) {
        if (capacity == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(capacity);
        }
        this.mSize = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.collection.SimpleArrayMap<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }

    public void clear() {
        if (this.mSize > 0) {
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            int osize = this.mSize;
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
            freeArrays(ohashes, oarray, osize);
        }
        if (this.mSize > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int minimumCapacity) {
        int osize = this.mSize;
        if (this.mHashes.length < minimumCapacity) {
            int[] ohashes = this.mHashes;
            Object[] oarray = this.mArray;
            allocArrays(minimumCapacity);
            if (this.mSize > 0) {
                System.arraycopy(ohashes, 0, this.mHashes, 0, osize);
                System.arraycopy(oarray, 0, this.mArray, 0, osize << 1);
            }
            freeArrays(ohashes, oarray, osize);
        }
        if (this.mSize != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object key) {
        return indexOfKey(key) >= 0;
    }

    public int indexOfKey(@Nullable Object key) {
        return key == null ? indexOfNull() : indexOf(key, key.hashCode());
    }

    int indexOfValue(Object value) {
        int N = this.mSize * 2;
        Object[] array = this.mArray;
        if (value == null) {
            for (int i10 = 1; i10 < N; i10 += 2) {
                if (array[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < N; i11 += 2) {
            if (value.equals(array[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        return indexOfValue(value) >= 0;
    }

    @Nullable
    public V get(Object obj) {
        int iIndexOfKey = indexOfKey(obj);
        if (iIndexOfKey >= 0) {
            return (V) this.mArray[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public K keyAt(int i10) {
        return (K) this.mArray[i10 << 1];
    }

    public V valueAt(int i10) {
        return (V) this.mArray[(i10 << 1) + 1];
    }

    public V setValueAt(int i10, V v5) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.mArray;
        V v10 = (V) objArr[i11];
        objArr[i11] = v5;
        return v10;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    @Nullable
    public V put(K k10, V v5) {
        int iHashCode;
        int iIndexOf;
        int i10 = this.mSize;
        if (k10 == null) {
            iHashCode = 0;
            iIndexOf = indexOfNull();
        } else {
            iHashCode = k10.hashCode();
            iIndexOf = indexOf(k10, iHashCode);
        }
        if (iIndexOf >= 0) {
            int i11 = (iIndexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v10 = (V) objArr[i11];
            objArr[i11] = v5;
            return v10;
        }
        int i12 = ~iIndexOf;
        if (i10 >= this.mHashes.length) {
            int i13 = 4;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 >= 4) {
                i13 = 8;
            }
            int[] iArr = this.mHashes;
            Object[] objArr2 = this.mArray;
            allocArrays(i13);
            if (i10 != this.mSize) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, i10);
        }
        if (i12 < i10) {
            int[] iArr3 = this.mHashes;
            System.arraycopy(iArr3, i12, iArr3, i12 + 1, i10 - i12);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i12 << 1, objArr3, (i12 + 1) << 1, (this.mSize - i12) << 1);
        }
        int i14 = this.mSize;
        if (i10 == i14) {
            int[] iArr4 = this.mHashes;
            if (i12 < iArr4.length) {
                iArr4[i12] = iHashCode;
                Object[] objArr4 = this.mArray;
                objArr4[i12 << 1] = k10;
                objArr4[(i12 << 1) + 1] = v5;
                this.mSize = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@NonNull SimpleArrayMap<? extends K, ? extends V> array) {
        int N = array.mSize;
        ensureCapacity(this.mSize + N);
        if (this.mSize == 0) {
            if (N > 0) {
                System.arraycopy(array.mHashes, 0, this.mHashes, 0, N);
                System.arraycopy(array.mArray, 0, this.mArray, 0, N << 1);
                this.mSize = N;
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < N; i10++) {
            put(array.keyAt(i10), array.valueAt(i10));
        }
    }

    @Nullable
    public V remove(Object key) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return removeAt(index);
        }
        return null;
    }

    public V removeAt(int i10) {
        int i11;
        Object[] objArr = this.mArray;
        V v5 = (V) objArr[(i10 << 1) + 1];
        int i12 = this.mSize;
        if (i12 <= 1) {
            freeArrays(this.mHashes, objArr, i12);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            i11 = 0;
        } else {
            i11 = i12 - 1;
            int[] iArr = this.mHashes;
            if (iArr.length > 8 && this.mSize < iArr.length / 3) {
                int i13 = i12 > 8 ? i12 + (i12 >> 1) : 8;
                int[] iArr2 = this.mHashes;
                Object[] objArr2 = this.mArray;
                allocArrays(i13);
                if (i12 != this.mSize) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr2, 0, this.mHashes, 0, i10);
                    System.arraycopy(objArr2, 0, this.mArray, 0, i10 << 1);
                }
                if (i10 < i11) {
                    System.arraycopy(iArr2, i10 + 1, this.mHashes, i10, i11 - i10);
                    System.arraycopy(objArr2, (i10 + 1) << 1, this.mArray, i10 << 1, (i11 - i10) << 1);
                }
            } else {
                if (i10 < i11) {
                    System.arraycopy(iArr, i10 + 1, iArr, i10, i11 - i10);
                    Object[] objArr3 = this.mArray;
                    System.arraycopy(objArr3, (i10 + 1) << 1, objArr3, i10 << 1, (i11 - i10) << 1);
                }
                Object[] objArr4 = this.mArray;
                objArr4[i11 << 1] = null;
                objArr4[(i11 << 1) + 1] = null;
            }
        }
        if (i12 != this.mSize) {
            throw new ConcurrentModificationException();
        }
        this.mSize = i11;
        return v5;
    }

    public int size() {
        return this.mSize;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof SimpleArrayMap) {
            SimpleArrayMap<?, ?> map = (SimpleArrayMap) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.mSize; i10++) {
                try {
                    K key = keyAt(i10);
                    V mine = valueAt(i10);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
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
        if (!(object instanceof Map)) {
            return false;
        }
        Map<?, ?> map2 = (Map) object;
        if (size() != map2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.mSize; i11++) {
            try {
                K key2 = keyAt(i11);
                V mine2 = valueAt(i11);
                Object theirs2 = map2.get(key2);
                if (mine2 == null) {
                    if (theirs2 != null || !map2.containsKey(key2)) {
                        return false;
                    }
                } else if (!mine2.equals(theirs2)) {
                    return false;
                }
            } catch (ClassCastException e12) {
                return false;
            } catch (NullPointerException e13) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] hashes = this.mHashes;
        Object[] array = this.mArray;
        int result = 0;
        int i10 = 0;
        int v5 = 1;
        int s8 = this.mSize;
        while (i10 < s8) {
            Object value = array[v5];
            result += hashes[i10] ^ (value == null ? 0 : value.hashCode());
            i10++;
            v5 += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.mSize * 28);
        buffer.append('{');
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (i10 > 0) {
                buffer.append(", ");
            }
            Object key = keyAt(i10);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
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
