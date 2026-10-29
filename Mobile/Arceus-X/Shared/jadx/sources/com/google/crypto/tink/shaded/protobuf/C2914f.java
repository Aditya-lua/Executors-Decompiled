package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C2914f extends AbstractC2905c<Boolean> implements C2900a0.a, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2914f f10850d = new C2914f(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b */
    public boolean[] f10851b;

    /* JADX INFO: renamed from: c */
    public int f10852c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2914f() {
        this(new boolean[10], 0, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m13410a();
        C2900a0.m13379a(collection);
        if (!(collection instanceof C2914f)) {
            return super.addAll(collection);
        }
        C2914f c2914f = (C2914f) collection;
        int i10 = c2914f.f10852c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10852c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f10851b;
        if (i12 > zArr.length) {
            this.f10851b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2914f.f10851b, 0, this.f10851b, this.f10852c, c2914f.f10852c);
        this.f10852c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        m13482d(i10, bool.booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m13483e(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m13482d(int i10, boolean z10) {
        int i11;
        m13410a();
        if (i10 < 0 || i10 > (i11 = this.f10852c)) {
            throw new IndexOutOfBoundsException(m13487i(i10));
        }
        boolean[] zArr = this.f10851b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f10851b, i10, zArr2, i10 + 1, this.f10852c - i10);
            this.f10851b = zArr2;
        }
        this.f10851b[i10] = z10;
        this.f10852c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: e */
    public void m13483e(boolean z10) {
        m13410a();
        int i10 = this.f10852c;
        boolean[] zArr = this.f10851b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f10851b = zArr2;
        }
        boolean[] zArr3 = this.f10851b;
        int i11 = this.f10852c;
        this.f10852c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2914f)) {
            return super.equals(obj);
        }
        C2914f c2914f = (C2914f) obj;
        if (this.f10852c != c2914f.f10852c) {
            return false;
        }
        boolean[] zArr = c2914f.f10851b;
        for (int i10 = 0; i10 < this.f10852c; i10++) {
            if (this.f10851b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m13484f(int i10) {
        if (i10 < 0 || i10 >= this.f10852c) {
            throw new IndexOutOfBoundsException(m13487i(i10));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(m13486h(i10));
    }

    /* JADX INFO: renamed from: h */
    public boolean m13486h(int i10) {
        m13484f(i10);
        return this.f10851b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM13381c = 1;
        for (int i10 = 0; i10 < this.f10852c; i10++) {
            iM13381c = (iM13381c * 31) + C2900a0.m13381c(this.f10851b[i10]);
        }
        return iM13381c;
    }

    /* JADX INFO: renamed from: i */
    public final String m13487i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10852c;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10851b[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2900a0.a mo13390o(int i10) {
        if (i10 >= this.f10852c) {
            return new C2914f(Arrays.copyOf(this.f10851b, i10), this.f10852c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        m13410a();
        m13484f(i10);
        boolean[] zArr = this.f10851b;
        boolean z10 = zArr[i10];
        int i11 = this.f10852c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f10852c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(m13491p(i10, bool.booleanValue()));
    }

    /* JADX INFO: renamed from: p */
    public boolean m13491p(int i10, boolean z10) {
        m13410a();
        m13484f(i10);
        boolean[] zArr = this.f10851b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m13410a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f10851b;
        System.arraycopy(zArr, i11, zArr, i10, this.f10852c - i11);
        this.f10852c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10852c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2914f(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f10851b = zArr;
        this.f10852c = i10;
    }
}
