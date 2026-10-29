package androidx.collection;

/* JADX INFO: loaded from: classes4.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        E[] eArr = this.mElements;
        int length = eArr.length;
        int i10 = this.mHead;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i12];
        System.arraycopy(eArr, i10, eArr2, 0, i11);
        System.arraycopy(this.mElements, 0, eArr2, i11, this.mHead);
        this.mElements = eArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = i12 - 1;
    }

    public CircularArray() {
        this(8);
    }

    public CircularArray(int i10) {
        int iHighestOneBit;
        if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i10 <= 1073741824) {
            if (Integer.bitCount(i10) != 1) {
                iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
            } else {
                iHighestOneBit = i10;
            }
            this.mCapacityBitmask = iHighestOneBit - 1;
            this.mElements = (E[]) new Object[iHighestOneBit];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public void addFirst(E e10) {
        int i10 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = i10;
        this.mElements[i10] = e10;
        if (i10 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(E e10) {
        E[] eArr = this.mElements;
        int i10 = this.mTail;
        eArr[i10] = e10;
        int i11 = this.mCapacityBitmask & (i10 + 1);
        this.mTail = i11;
        if (i11 == this.mHead) {
            doubleCapacity();
        }
    }

    public E popFirst() {
        int i10 = this.mHead;
        if (i10 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.mElements;
        E result = eArr[i10];
        eArr[i10] = null;
        this.mHead = (i10 + 1) & this.mCapacityBitmask;
        return result;
    }

    public E popLast() {
        int i10 = this.mHead;
        int i11 = this.mTail;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int t8 = this.mCapacityBitmask & (i11 - 1);
        E[] eArr = this.mElements;
        E result = eArr[t8];
        eArr[t8] = null;
        this.mTail = t8;
        return result;
    }

    public void clear() {
        removeFromStart(size());
    }

    public void removeFromStart(int numOfElements) {
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int end = this.mElements.length;
        int i10 = this.mHead;
        if (numOfElements < end - i10) {
            end = i10 + numOfElements;
        }
        for (int i11 = this.mHead; i11 < end; i11++) {
            this.mElements[i11] = null;
        }
        int i12 = this.mHead;
        int removed = end - i12;
        int numOfElements2 = numOfElements - removed;
        this.mHead = (i12 + removed) & this.mCapacityBitmask;
        if (numOfElements2 > 0) {
            for (int i13 = 0; i13 < numOfElements2; i13++) {
                this.mElements[i13] = null;
            }
            this.mHead = numOfElements2;
        }
    }

    public void removeFromEnd(int numOfElements) {
        int i10;
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int start = 0;
        int i11 = this.mTail;
        if (numOfElements < i11) {
            start = i11 - numOfElements;
        }
        int i12 = start;
        while (true) {
            i10 = this.mTail;
            if (i12 >= i10) {
                break;
            }
            this.mElements[i12] = null;
            i12++;
        }
        int i13 = i10 - start;
        int numOfElements2 = numOfElements - i13;
        this.mTail = i10 - i13;
        if (numOfElements2 > 0) {
            int length = this.mElements.length;
            this.mTail = length;
            int newTail = length - numOfElements2;
            for (int i14 = newTail; i14 < this.mTail; i14++) {
                this.mElements[i14] = null;
            }
            this.mTail = newTail;
        }
    }

    public E getFirst() {
        int i10 = this.mHead;
        if (i10 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[i10];
    }

    public E getLast() {
        int i10 = this.mHead;
        int i11 = this.mTail;
        if (i10 == i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(i11 - 1) & this.mCapacityBitmask];
    }

    public E get(int n10) {
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
