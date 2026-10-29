package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.i */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001IB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00028\u0000¢\u0006\u0004\b&\u0010%J\u0015\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00028\u0000¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00028\u0000¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b,\u0010%J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010%J\u0017\u0010.\u001a\u00020!2\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u0010.\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u00100J\u001d\u00101\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b1\u00102J%\u00101\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b1\u00103J\u0018\u00104\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b4\u00105J \u00106\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020!2\u0006\u0010'\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b8\u0010/J\u0017\u00109\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010<\u001a\u00020!2\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010/J\u0017\u0010=\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b=\u00105J\u001d\u0010>\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b>\u00102J\u001d\u0010?\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b?\u00102J\u000f\u0010@\u001a\u00020\tH\u0016¢\u0006\u0004\b@\u0010\u0007J)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010B\"\u0004\b\u0001\u0010A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0BH\u0016¢\u0006\u0004\bD\u0010GJ\u001f\u0010H\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\bH\u0010\u001bR\u0016\u0010K\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010LR$\u0010P\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bI\u0010O¨\u0006Q"}, m31665d2 = {"Lkotlin/collections/i;", "E", "Lkotlin/collections/f;", "", "initialCapacity", "<init>", "(I)V", "()V", "minCapacity", "", "f", "newCapacity", "d", "index", "l", "(I)I", "i", "g", "e", "internalIndex", "", "elements", "c", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "t", "(II)V", "u", "internalFromIndex", "internalToIndex", "k", "m", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "last", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "p", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "b", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "a", "I", "head", "[Ljava/lang/Object;", "elementData", "value", "()I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7685i<E> extends AbstractC7679f<E> {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Object[] f29355e = new Object[0];

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int head;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Object[] elementData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7685i(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f29355e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    /* JADX INFO: renamed from: f */
    private final void m31770f(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f29355e) {
            this.elementData = new Object[C7764d.m32078c(minCapacity, 10)];
        } else {
            m31772d(AbstractC7675d.INSTANCE.m31753e(objArr.length, minCapacity));
        }
    }

    @Override // kotlin.collections.AbstractC7679f
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m31778m();
        m31770f(size() + elements.size());
        m31771c(m31777l(this.head + size()), elements);
        return true;
    }

    public final void addFirst(E element) {
        m31778m();
        m31770f(size() + 1);
        int iM31773e = m31773e(this.head);
        this.head = iM31773e;
        this.elementData[iM31773e] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        m31778m();
        m31770f(size() + 1);
        this.elementData[m31777l(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // kotlin.collections.AbstractC7679f
    /* JADX INFO: renamed from: b */
    public E mo31761b(int index) {
        AbstractC7675d.INSTANCE.m31750b(index, size());
        if (index == C7699p.m31894m(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        m31778m();
        int iM31777l = m31777l(this.head + index);
        E e10 = (E) this.elementData[iM31777l];
        if (index < (size() >> 1)) {
            int i10 = this.head;
            if (iM31777l >= i10) {
                Object[] objArr = this.elementData;
                C7691l.m31814i(objArr, objArr, i10 + 1, i10, iM31777l);
            } else {
                Object[] objArr2 = this.elementData;
                C7691l.m31814i(objArr2, objArr2, 1, 0, iM31777l);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.head;
                C7691l.m31814i(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i12 = this.head;
            objArr4[i12] = null;
            this.head = m31774g(i12);
        } else {
            int iM31777l2 = m31777l(this.head + C7699p.m31894m(this));
            if (iM31777l <= iM31777l2) {
                Object[] objArr5 = this.elementData;
                C7691l.m31814i(objArr5, objArr5, iM31777l, iM31777l + 1, iM31777l2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                C7691l.m31814i(objArr6, objArr6, iM31777l, iM31777l + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                C7691l.m31814i(objArr7, objArr7, 0, 1, iM31777l2 + 1);
            }
            this.elementData[iM31777l2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    /* JADX INFO: renamed from: c */
    public final void m31771c(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i10 = this.head;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.elementData[i11] = it.next();
        }
        this.size = size() + elements.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            m31778m();
            m31776k(this.head, m31777l(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m31772d(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        C7691l.m31814i(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i10 = this.head;
        C7691l.m31814i(objArr3, objArr, length - i10, 0, i10);
        this.head = 0;
        this.elementData = objArr;
    }

    /* JADX INFO: renamed from: e */
    public final int m31773e(int index) {
        return index == 0 ? C7693m.m31844M(this.elementData) : index - 1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    /* JADX INFO: renamed from: g */
    public final int m31774g(int index) {
        if (index == C7693m.m31844M(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractC7675d.INSTANCE.m31750b(index, size());
        return (E) this.elementData[m31777l(this.head + index)];
    }

    /* JADX INFO: renamed from: i */
    public final int m31775i(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i10;
        int iM31777l = m31777l(this.head + size());
        int length = this.head;
        if (length < iM31777l) {
            while (length < iM31777l) {
                if (Intrinsics.m31980c(element, this.elementData[length])) {
                    i10 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM31777l) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (length < length2) {
            if (Intrinsics.m31980c(element, this.elementData[length])) {
                i10 = this.head;
            } else {
                length++;
            }
        }
        for (int i11 = 0; i11 < iM31777l; i11++) {
            if (Intrinsics.m31980c(element, this.elementData[i11])) {
                length = i11 + this.elementData.length;
                i10 = this.head;
            }
        }
        return -1;
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m31776k(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            C7691l.m31822q(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        C7691l.m31822q(objArr, null, internalFromIndex, objArr.length);
        C7691l.m31822q(this.elementData, null, 0, internalToIndex);
    }

    /* JADX INFO: renamed from: l */
    public final int m31777l(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[m31777l(this.head + C7699p.m31894m(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iM31844M;
        int i10;
        int iM31777l = m31777l(this.head + size());
        int i11 = this.head;
        if (i11 < iM31777l) {
            iM31844M = iM31777l - 1;
            if (i11 <= iM31844M) {
                while (!Intrinsics.m31980c(element, this.elementData[iM31844M])) {
                    if (iM31844M != i11) {
                        iM31844M--;
                    }
                }
                i10 = this.head;
                return iM31844M - i10;
            }
            return -1;
        }
        if (i11 > iM31777l) {
            for (int i12 = iM31777l - 1; -1 < i12; i12--) {
                if (Intrinsics.m31980c(element, this.elementData[i12])) {
                    iM31844M = i12 + this.elementData.length;
                    i10 = this.head;
                    return iM31844M - i10;
                }
            }
            iM31844M = C7693m.m31844M(this.elementData);
            int i13 = this.head;
            if (i13 <= iM31844M) {
                while (!Intrinsics.m31980c(element, this.elementData[iM31844M])) {
                    if (iM31844M != i13) {
                        iM31844M--;
                    }
                }
                i10 = this.head;
                return iM31844M - i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public final void m31778m() {
        ((AbstractList) this).modCount++;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final E m31779p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        mo31761b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        int iM31777l;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iM31777l2 = m31777l(this.head + size());
            int i10 = this.head;
            if (i10 < iM31777l2) {
                iM31777l = i10;
                while (i10 < iM31777l2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.elementData[iM31777l] = obj;
                        iM31777l++;
                    }
                    i10++;
                }
                C7691l.m31822q(this.elementData, null, iM31777l, iM31777l2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.elementData[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iM31777l = m31777l(i11);
                for (int i12 = 0; i12 < iM31777l2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.elementData[iM31777l] = obj3;
                        iM31777l = m31774g(iM31777l);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m31778m();
                this.size = m31775i(iM31777l - this.head);
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m31778m();
        Object[] objArr = this.elementData;
        int i10 = this.head;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.head = m31774g(i10);
        this.size = size() - 1;
        return e10;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m31778m();
        int iM31777l = m31777l(this.head + C7699p.m31894m(this));
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iM31777l];
        objArr[iM31777l] = null;
        this.size = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        AbstractC7675d.INSTANCE.m31752d(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            mo31761b(fromIndex);
            return;
        }
        m31778m();
        if (fromIndex < size() - toIndex) {
            m31780t(fromIndex, toIndex);
            int iM31777l = m31777l(this.head + i10);
            m31776k(this.head, iM31777l);
            this.head = iM31777l;
        } else {
            m31781u(fromIndex, toIndex);
            int iM31777l2 = m31777l(this.head + size());
            m31776k(m31775i(iM31777l2 - i10), iM31777l2);
        }
        this.size = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        int iM31777l;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iM31777l2 = m31777l(this.head + size());
            int i10 = this.head;
            if (i10 < iM31777l2) {
                iM31777l = i10;
                while (i10 < iM31777l2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        this.elementData[iM31777l] = obj;
                        iM31777l++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C7691l.m31822q(this.elementData, null, iM31777l, iM31777l2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iM31777l = m31777l(i11);
                for (int i12 = 0; i12 < iM31777l2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iM31777l] = obj3;
                        iM31777l = m31774g(iM31777l);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                m31778m();
                this.size = m31775i(iM31777l - this.head);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractC7675d.INSTANCE.m31750b(index, size());
        int iM31777l = m31777l(this.head + index);
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iM31777l];
        objArr[iM31777l] = element;
        return e10;
    }

    /* JADX INFO: renamed from: t */
    public final void m31780t(int fromIndex, int toIndex) {
        int iM31777l = m31777l(this.head + (fromIndex - 1));
        int iM31777l2 = m31777l(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i10 = iM31777l + 1;
            int iMin = Math.min(fromIndex, Math.min(i10, iM31777l2 + 1));
            Object[] objArr = this.elementData;
            int i11 = iM31777l2 - iMin;
            int i12 = iM31777l - iMin;
            C7691l.m31814i(objArr, objArr, i11 + 1, i12 + 1, i10);
            iM31777l = m31775i(i12);
            iM31777l2 = m31775i(i11);
            fromIndex -= iMin;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = (T[]) C7687j.m31784a(array, size());
        }
        T[] tArr = array;
        int iM31777l = m31777l(this.head + size());
        int i10 = this.head;
        if (i10 < iM31777l) {
            C7691l.m31817l(this.elementData, tArr, 0, i10, iM31777l, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            C7691l.m31814i(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            C7691l.m31814i(objArr2, tArr, objArr2.length - this.head, 0, iM31777l);
        }
        return (T[]) C7697o.m31879e(size(), tArr);
    }

    /* JADX INFO: renamed from: u */
    public final void m31781u(int fromIndex, int toIndex) {
        int iM31777l = m31777l(this.head + toIndex);
        int iM31777l2 = m31777l(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iM31777l, objArr.length - iM31777l2));
            Object[] objArr2 = this.elementData;
            int i10 = iM31777l + toIndex;
            C7691l.m31814i(objArr2, objArr2, iM31777l2, iM31777l, i10);
            iM31777l = m31777l(i10);
            iM31777l2 = m31777l(iM31777l2 + toIndex);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractC7675d.INSTANCE.m31751c(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        m31778m();
        m31770f(size() + 1);
        int iM31777l = m31777l(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int iM31773e = m31773e(iM31777l);
            int iM31773e2 = m31773e(this.head);
            int i10 = this.head;
            if (iM31773e >= i10) {
                Object[] objArr = this.elementData;
                objArr[iM31773e2] = objArr[i10];
                C7691l.m31814i(objArr, objArr, i10, i10 + 1, iM31773e + 1);
            } else {
                Object[] objArr2 = this.elementData;
                C7691l.m31814i(objArr2, objArr2, i10 - 1, i10, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                C7691l.m31814i(objArr3, objArr3, 0, 1, iM31773e + 1);
            }
            this.elementData[iM31773e] = element;
            this.head = iM31773e2;
        } else {
            int iM31777l2 = m31777l(this.head + size());
            if (iM31777l < iM31777l2) {
                Object[] objArr4 = this.elementData;
                C7691l.m31814i(objArr4, objArr4, iM31777l + 1, iM31777l, iM31777l2);
            } else {
                Object[] objArr5 = this.elementData;
                C7691l.m31814i(objArr5, objArr5, 1, 0, iM31777l2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                C7691l.m31814i(objArr6, objArr6, iM31777l + 1, iM31777l, objArr6.length - 1);
            }
            this.elementData[iM31777l] = element;
        }
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractC7675d.INSTANCE.m31751c(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        m31778m();
        m31770f(size() + elements.size());
        int iM31777l = m31777l(this.head + size());
        int iM31777l2 = m31777l(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i10 = this.head;
            int length = i10 - size;
            if (iM31777l2 < i10) {
                Object[] objArr = this.elementData;
                C7691l.m31814i(objArr, objArr, length, i10, objArr.length);
                if (size >= iM31777l2) {
                    Object[] objArr2 = this.elementData;
                    C7691l.m31814i(objArr2, objArr2, objArr2.length - size, 0, iM31777l2);
                } else {
                    Object[] objArr3 = this.elementData;
                    C7691l.m31814i(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    C7691l.m31814i(objArr4, objArr4, 0, size, iM31777l2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                C7691l.m31814i(objArr5, objArr5, length, i10, iM31777l2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i11 = iM31777l2 - i10;
                int length2 = objArr6.length - length;
                if (length2 >= i11) {
                    C7691l.m31814i(objArr6, objArr6, length, i10, iM31777l2);
                } else {
                    C7691l.m31814i(objArr6, objArr6, length, i10, i10 + length2);
                    Object[] objArr7 = this.elementData;
                    C7691l.m31814i(objArr7, objArr7, 0, this.head + length2, iM31777l2);
                }
            }
            this.head = length;
            m31771c(m31775i(iM31777l2 - size), elements);
        } else {
            int i12 = iM31777l2 + size;
            if (iM31777l2 < iM31777l) {
                int i13 = size + iM31777l;
                Object[] objArr8 = this.elementData;
                if (i13 <= objArr8.length) {
                    C7691l.m31814i(objArr8, objArr8, i12, iM31777l2, iM31777l);
                } else if (i12 >= objArr8.length) {
                    C7691l.m31814i(objArr8, objArr8, i12 - objArr8.length, iM31777l2, iM31777l);
                } else {
                    int length3 = iM31777l - (i13 - objArr8.length);
                    C7691l.m31814i(objArr8, objArr8, 0, length3, iM31777l);
                    Object[] objArr9 = this.elementData;
                    C7691l.m31814i(objArr9, objArr9, i12, iM31777l2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                C7691l.m31814i(objArr10, objArr10, size, 0, iM31777l);
                Object[] objArr11 = this.elementData;
                if (i12 >= objArr11.length) {
                    C7691l.m31814i(objArr11, objArr11, i12 - objArr11.length, iM31777l2, objArr11.length);
                } else {
                    C7691l.m31814i(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    C7691l.m31814i(objArr12, objArr12, i12, iM31777l2, objArr12.length - size);
                }
            }
            m31771c(iM31777l2, elements);
        }
        return true;
    }

    public C7685i() {
        this.elementData = f29355e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
