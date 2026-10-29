package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class d1<E> extends c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d1<Object> f8420d = new d1<>(new Object[0], 0, false);
    public E[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8421c;

    public d1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.b = eArr;
        this.f8421c = i10;
    }

    public static <E> E[] b(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> d1<E> c() {
        return (d1<E>) f8420d;
    }

    private void d(int i10) {
        if (i10 < 0 || i10 >= this.f8421c) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    private String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8421c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        a();
        int i10 = this.f8421c;
        E[] eArr = this.b;
        if (i10 == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i11 = this.f8421c;
        this.f8421c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public d1<E> o(int i10) {
        if (i10 >= this.f8421c) {
            return new d1<>(Arrays.copyOf(this.b, i10), this.f8421c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        d(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        a();
        d(i10);
        E[] eArr = this.b;
        E e10 = eArr[i10];
        int i11 = this.f8421c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f8421c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        a();
        d(i10);
        E[] eArr = this.b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8421c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f8421c)) {
            E[] eArr = this.b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.b, 0, eArr2, 0, i10);
                System.arraycopy(this.b, i10, eArr2, i10 + 1, this.f8421c - i10);
                this.b = eArr2;
            }
            this.b[i10] = e10;
            this.f8421c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i10));
    }
}
