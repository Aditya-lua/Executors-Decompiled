package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2927j0 extends AbstractC2905c<Long> implements C2900a0.h, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2927j0 f10897d = new C2927j0(new long[0], 0, false);

    /* JADX INFO: renamed from: b */
    public long[] f10898b;

    /* JADX INFO: renamed from: c */
    public int f10899c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2927j0() {
        this(new long[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m13716f(int i10) {
        if (i10 < 0 || i10 >= this.f10899c) {
            throw new IndexOutOfBoundsException(m13717i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m13717i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f10899c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m13410a();
        C2900a0.m13379a(collection);
        if (!(collection instanceof C2927j0)) {
            return super.addAll(collection);
        }
        C2927j0 c2927j0 = (C2927j0) collection;
        int i10 = c2927j0.f10899c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10899c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f10898b;
        if (i12 > jArr.length) {
            this.f10898b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c2927j0.f10898b, 0, this.f10898b, this.f10899c, c2927j0.f10899c);
        this.f10899c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        m13720d(i10, l10.longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m13721e(l10.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m13720d(int i10, long j10) {
        int i11;
        m13410a();
        if (i10 < 0 || i10 > (i11 = this.f10899c)) {
            throw new IndexOutOfBoundsException(m13717i(i10));
        }
        long[] jArr = this.f10898b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f10898b, i10, jArr2, i10 + 1, this.f10899c - i10);
            this.f10898b = jArr2;
        }
        this.f10898b[i10] = j10;
        this.f10899c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: e */
    public void m13721e(long j10) {
        m13410a();
        int i10 = this.f10899c;
        long[] jArr = this.f10898b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f10898b = jArr2;
        }
        long[] jArr3 = this.f10898b;
        int i11 = this.f10899c;
        this.f10899c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2927j0)) {
            return super.equals(obj);
        }
        C2927j0 c2927j0 = (C2927j0) obj;
        if (this.f10899c != c2927j0.f10899c) {
            return false;
        }
        long[] jArr = c2927j0.f10898b;
        for (int i10 = 0; i10 < this.f10899c; i10++) {
            if (this.f10898b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m13723h(i10));
    }

    /* JADX INFO: renamed from: h */
    public long m13723h(int i10) {
        m13716f(i10);
        return this.f10898b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iM13384f = 1;
        for (int i10 = 0; i10 < this.f10899c; i10++) {
            iM13384f = (iM13384f * 31) + C2900a0.m13384f(this.f10898b[i10]);
        }
        return iM13384f;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f10898b[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2900a0.h mo13390o(int i10) {
        if (i10 >= this.f10899c) {
            return new C2927j0(Arrays.copyOf(this.f10898b, i10), this.f10899c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m13410a();
        m13716f(i10);
        long[] jArr = this.f10898b;
        long j10 = jArr[i10];
        int i11 = this.f10899c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f10899c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m13727p(i10, l10.longValue()));
    }

    /* JADX INFO: renamed from: p */
    public long m13727p(int i10, long j10) {
        m13410a();
        m13716f(i10);
        long[] jArr = this.f10898b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m13410a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f10898b;
        System.arraycopy(jArr, i11, jArr, i10, this.f10899c - i11);
        this.f10899c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f10899c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2927j0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f10898b = jArr;
        this.f10899c = i10;
    }
}
