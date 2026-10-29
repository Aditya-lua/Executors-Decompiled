package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2969z extends AbstractC2905c<Integer> implements C2900a0.g, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2969z f11150d = new C2969z(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f11151b;

    /* JADX INFO: renamed from: c */
    public int f11152c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2969z() {
        this(new int[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m14359f(int i10) {
        if (i10 < 0 || i10 >= this.f11152c) {
            throw new IndexOutOfBoundsException(m14360i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m14360i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11152c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m13410a();
        C2900a0.m13379a(collection);
        if (!(collection instanceof C2969z)) {
            return super.addAll(collection);
        }
        C2969z c2969z = (C2969z) collection;
        int i10 = c2969z.f11152c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11152c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f11151b;
        if (i12 > iArr.length) {
            this.f11151b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2969z.f11151b, 0, this.f11151b, this.f11152c, c2969z.f11152c);
        this.f11152c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        m14364e(i10, num.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m14363d(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public void m14363d(int i10) {
        m13410a();
        int i11 = this.f11152c;
        int[] iArr = this.f11151b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11151b = iArr2;
        }
        int[] iArr3 = this.f11151b;
        int i12 = this.f11152c;
        this.f11152c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m14364e(int i10, int i11) {
        int i12;
        m13410a();
        if (i10 < 0 || i10 > (i12 = this.f11152c)) {
            throw new IndexOutOfBoundsException(m14360i(i10));
        }
        int[] iArr = this.f11151b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f11151b, i10, iArr2, i10 + 1, this.f11152c - i10);
            this.f11151b = iArr2;
        }
        this.f11151b[i10] = i11;
        this.f11152c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2969z)) {
            return super.equals(obj);
        }
        C2969z c2969z = (C2969z) obj;
        if (this.f11152c != c2969z.f11152c) {
            return false;
        }
        int[] iArr = c2969z.f11151b;
        for (int i10 = 0; i10 < this.f11152c; i10++) {
            if (this.f11151b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(m14366h(i10));
    }

    /* JADX INFO: renamed from: h */
    public int m14366h(int i10) {
        m14359f(i10);
        return this.f11151b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11152c; i11++) {
            i10 = (i10 * 31) + this.f11151b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f11151b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2900a0.g mo13390o(int i10) {
        if (i10 >= this.f11152c) {
            return new C2969z(Arrays.copyOf(this.f11151b, i10), this.f11152c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m13410a();
        m14359f(i10);
        int[] iArr = this.f11151b;
        int i11 = iArr[i10];
        int i12 = this.f11152c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f11152c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m14370p(i10, num.intValue()));
    }

    /* JADX INFO: renamed from: p */
    public int m14370p(int i10, int i11) {
        m13410a();
        m14359f(i10);
        int[] iArr = this.f11151b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m13410a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11151b;
        System.arraycopy(iArr, i11, iArr, i10, this.f11152c - i11);
        this.f11152c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11152c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2969z(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f11151b = iArr;
        this.f11152c = i10;
    }
}
