package androidx.collection;

/* JADX INFO: loaded from: classes4.dex */
public final class CircularIntArray {
    private int mCapacityBitmask;
    private int[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        int[] iArr = this.mElements;
        int n10 = iArr.length;
        int i10 = this.mHead;
        int r8 = n10 - i10;
        int newCapacity = n10 << 1;
        if (newCapacity < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] a10 = new int[newCapacity];
        System.arraycopy(iArr, i10, a10, 0, r8);
        System.arraycopy(this.mElements, 0, a10, r8, this.mHead);
        this.mElements = a10;
        this.mHead = 0;
        this.mTail = n10;
        this.mCapacityBitmask = newCapacity - 1;
    }

    public CircularIntArray() {
        this(8);
    }

    public CircularIntArray(int minCapacity) {
        int arrayCapacity;
        if (minCapacity < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (minCapacity <= 1073741824) {
            if (Integer.bitCount(minCapacity) != 1) {
                arrayCapacity = Integer.highestOneBit(minCapacity - 1) << 1;
            } else {
                arrayCapacity = minCapacity;
            }
            this.mCapacityBitmask = arrayCapacity - 1;
            this.mElements = new int[arrayCapacity];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public void addFirst(int e10) {
        int i10 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i10;
        this.mElements[i10] = e10;
        if (i10 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(int e10) {
        int[] iArr = this.mElements;
        int i10 = this.mTail;
        iArr[i10] = e10;
        int i11 = this.mCapacityBitmask & (i10 + 1);
        this.mTail = i11;
        if (i11 == this.mHead) {
            doubleCapacity();
        }
    }

    public int popFirst() {
        int i10 = this.mHead;
        if (i10 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int result = this.mElements[i10];
        this.mHead = (i10 + 1) & this.mCapacityBitmask;
        return result;
    }

    public int popLast() {
        int i10 = this.mHead;
        int i11 = this.mTail;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int t8 = this.mCapacityBitmask & (i11 - 1);
        int result = this.mElements[t8];
        this.mTail = t8;
        return result;
    }

    public void clear() {
        this.mTail = this.mHead;
    }

    public void removeFromStart(int numOfElements) {
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mHead = (this.mHead + numOfElements) & this.mCapacityBitmask;
    }

    public void removeFromEnd(int numOfElements) {
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.mTail = (this.mTail - numOfElements) & this.mCapacityBitmask;
    }

    public int getFirst() {
        int i10 = this.mHead;
        if (i10 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[i10];
    }

    public int getLast() {
        int i10 = this.mHead;
        int i11 = this.mTail;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(i11 - 1) & this.mCapacityBitmask];
    }

    public int get(int n10) {
        if (n10 < 0 || n10 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(this.mHead + n10) & this.mCapacityBitmask];
    }

    public int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }
}
