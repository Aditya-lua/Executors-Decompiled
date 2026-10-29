package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.hb */
/* JADX INFO: loaded from: classes.dex */
public final class C2105hb extends AbstractC2319t9 implements RandomAccess, InterfaceC2213nb, InterfaceC2358vc {

    /* JADX INFO: renamed from: d */
    public static final int[] f8220d;

    /* JADX INFO: renamed from: e */
    public static final C2105hb f8221e;

    /* JADX INFO: renamed from: b */
    public int[] f8222b;

    /* JADX INFO: renamed from: c */
    public int f8223c;

    static {
        int[] iArr = new int[0];
        f8220d = iArr;
        f8221e = new C2105hb(iArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2105hb() {
        this(f8220d, 0, true);
    }

    /* JADX INFO: renamed from: b */
    public static C2105hb m10188b() {
        return f8221e;
    }

    /* JADX INFO: renamed from: e */
    public static int m10189e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX DEBUG: Method merged with bridge method: v(I)Lcom/google/android/gms/internal/measurement/pb; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2213nb mo9891v(int i10) {
        if (i10 >= this.f8223c) {
            return new C2105hb(i10 == 0 ? f8220d : Arrays.copyOf(this.f8222b, i10), this.f8223c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8223c)) {
            throw new IndexOutOfBoundsException(m10194g(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f8222b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[m10189e(length)];
            System.arraycopy(this.f8222b, 0, iArr2, 0, i10);
            System.arraycopy(this.f8222b, i10, iArr2, i12, this.f8223c - i10);
            this.f8222b = iArr2;
        }
        this.f8222b[i10] = iIntValue;
        this.f8223c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10768a();
        Charset charset = C2267qb.f8595a;
        collection.getClass();
        if (!(collection instanceof C2105hb)) {
            return super.addAll(collection);
        }
        C2105hb c2105hb = (C2105hb) collection;
        int i10 = c2105hb.f8223c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8223c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f8222b;
        if (i12 > iArr.length) {
            this.f8222b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2105hb.f8222b, 0, this.f8222b, this.f8223c, c2105hb.f8223c);
        this.f8223c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m10191c(int i10) {
        m10193f(i10);
        return this.f8222b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m10192d(int i10) {
        int length = this.f8222b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8222b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m10189e(length);
        }
        this.f8222b = Arrays.copyOf(this.f8222b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2105hb)) {
            return super.equals(obj);
        }
        C2105hb c2105hb = (C2105hb) obj;
        if (this.f8223c != c2105hb.f8223c) {
            return false;
        }
        int[] iArr = c2105hb.f8222b;
        for (int i10 = 0; i10 < this.f8223c; i10++) {
            if (this.f8222b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10193f(int i10) {
        if (i10 < 0 || i10 >= this.f8223c) {
            throw new IndexOutOfBoundsException(m10194g(i10));
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m10194g(int i10) {
        return C2355v9.m10853a(this.f8223c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m10193f(i10);
        return Integer.valueOf(this.f8222b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f8223c; i11++) {
            i10 = (i10 * 31) + this.f8222b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f8223c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8222b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m10768a();
        m10193f(i10);
        int[] iArr = this.f8222b;
        int i11 = iArr[i10];
        int i12 = this.f8223c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f8223c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m10768a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f8222b;
        System.arraycopy(iArr, i11, iArr, i10, this.f8223c - i11);
        this.f8223c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m10768a();
        m10193f(i10);
        int[] iArr = this.f8222b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8223c;
    }

    /* JADX INFO: renamed from: w */
    public final void m10195w(int i10) {
        m10768a();
        int i11 = this.f8223c;
        int length = this.f8222b.length;
        if (i11 == length) {
            int[] iArr = new int[m10189e(length)];
            System.arraycopy(this.f8222b, 0, iArr, 0, this.f8223c);
            this.f8222b = iArr;
        }
        int[] iArr2 = this.f8222b;
        int i12 = this.f8223c;
        this.f8223c = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2105hb(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f8222b = iArr;
        this.f8223c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m10195w(((Integer) obj).intValue());
        return true;
    }
}
