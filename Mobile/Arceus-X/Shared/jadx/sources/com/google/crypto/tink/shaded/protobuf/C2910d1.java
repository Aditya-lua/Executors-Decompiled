package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2910d1<E> extends AbstractC2905c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2910d1<Object> f10832d = new C2910d1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public E[] f10833b;

    /* JADX INFO: renamed from: c */
    public int f10834c;

    public C2910d1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f10833b = eArr;
        this.f10834c = i10;
    }

    /* JADX INFO: renamed from: b */
    public static <E> E[] m13422b(int i10) {
        return (E[]) new Object[i10];
    }

    /* JADX INFO: renamed from: c */
    public static <E> C2910d1<E> m13423c() {
        return (C2910d1<E>) f10832d;
    }

    /* JADX INFO: renamed from: d */
    private void m13424d(int i10) {
        if (i10 < 0 || i10 >= this.f10834c) {
            throw new IndexOutOfBoundsException(m13425e(i10));
        }
    }

    /* JADX INFO: renamed from: e */
    private String m13425e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10834c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m13410a();
        int i10 = this.f10834c;
        E[] eArr = this.f10833b;
        if (i10 == eArr.length) {
            this.f10833b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f10833b;
        int i11 = this.f10834c;
        this.f10834c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2910d1<E> mo13390o(int i10) {
        if (i10 >= this.f10834c) {
            return new C2910d1<>(Arrays.copyOf(this.f10833b, i10), this.f10834c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m13424d(i10);
        return this.f10833b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m13410a();
        m13424d(i10);
        E[] eArr = this.f10833b;
        E e10 = eArr[i10];
        int i11 = this.f10834c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f10834c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m13410a();
        m13424d(i10);
        E[] eArr = this.f10833b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10834c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m13410a();
        if (i10 >= 0 && i10 <= (i11 = this.f10834c)) {
            E[] eArr = this.f10833b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) m13422b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f10833b, 0, eArr2, 0, i10);
                System.arraycopy(this.f10833b, i10, eArr2, i10 + 1, this.f10834c - i10);
                this.f10833b = eArr2;
            }
            this.f10833b[i10] = e10;
            this.f10834c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m13425e(i10));
    }
}
