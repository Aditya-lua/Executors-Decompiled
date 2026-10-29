package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391x9 extends AbstractC2319t9 implements RandomAccess, InterfaceC2124ib, InterfaceC2358vc {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f8773d;

    /* JADX INFO: renamed from: b */
    public boolean[] f8774b;

    /* JADX INFO: renamed from: c */
    public int f8775c;

    static {
        boolean[] zArr = new boolean[0];
        f8773d = zArr;
        new C2391x9(zArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2391x9() {
        this(f8773d, 0, true);
    }

    /* JADX INFO: renamed from: e */
    public static int m10973e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: f */
    private final void m10974f(int i10) {
        if (i10 < 0 || i10 >= this.f8775c) {
            throw new IndexOutOfBoundsException(m10978g(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8775c)) {
            throw new IndexOutOfBoundsException(m10978g(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f8774b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[m10973e(length)];
            System.arraycopy(this.f8774b, 0, zArr2, 0, i10);
            System.arraycopy(this.f8774b, i10, zArr2, i12, this.f8775c - i10);
            this.f8774b = zArr2;
        }
        this.f8774b[i10] = zBooleanValue;
        this.f8775c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10768a();
        Charset charset = C2267qb.f8595a;
        collection.getClass();
        if (!(collection instanceof C2391x9)) {
            return super.addAll(collection);
        }
        C2391x9 c2391x9 = (C2391x9) collection;
        int i10 = c2391x9.f8775c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8775c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f8774b;
        if (i12 > zArr.length) {
            this.f8774b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2391x9.f8774b, 0, this.f8774b, this.f8775c, c2391x9.f8775c);
        this.f8775c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: v(I)Lcom/google/android/gms/internal/measurement/pb; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2124ib mo9891v(int i10) {
        if (i10 >= this.f8775c) {
            return new C2391x9(i10 == 0 ? f8773d : Arrays.copyOf(this.f8774b, i10), this.f8775c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10976c(int i10) {
        m10974f(i10);
        return this.f8774b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m10977d(boolean z10) {
        m10768a();
        int i10 = this.f8775c;
        int length = this.f8774b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[m10973e(length)];
            System.arraycopy(this.f8774b, 0, zArr, 0, this.f8775c);
            this.f8774b = zArr;
        }
        boolean[] zArr2 = this.f8774b;
        int i11 = this.f8775c;
        this.f8775c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2391x9)) {
            return super.equals(obj);
        }
        C2391x9 c2391x9 = (C2391x9) obj;
        if (this.f8775c != c2391x9.f8775c) {
            return false;
        }
        boolean[] zArr = c2391x9.f8774b;
        for (int i10 = 0; i10 < this.f8775c; i10++) {
            if (this.f8774b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m10978g(int i10) {
        return C2355v9.m10853a(this.f8775c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m10974f(i10);
        return Boolean.valueOf(this.f8774b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM10577b = 1;
        for (int i10 = 0; i10 < this.f8775c; i10++) {
            iM10577b = (iM10577b * 31) + C2267qb.m10577b(this.f8774b[i10]);
        }
        return iM10577b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f8775c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8774b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m10768a();
        m10974f(i10);
        boolean[] zArr = this.f8774b;
        boolean z10 = zArr[i10];
        int i11 = this.f8775c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f8775c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m10768a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f8774b;
        System.arraycopy(zArr, i11, zArr, i10, this.f8775c - i11);
        this.f8775c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m10768a();
        m10974f(i10);
        boolean[] zArr = this.f8774b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8775c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2391x9(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f8774b = zArr;
        this.f8775c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m10977d(((Boolean) obj).booleanValue());
        return true;
    }
}
