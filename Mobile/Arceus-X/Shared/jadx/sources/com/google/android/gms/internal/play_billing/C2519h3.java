package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2519h3 extends AbstractC2475d3 implements RandomAccess, InterfaceC2707y4 {

    /* JADX INFO: renamed from: d */
    public static final boolean[] f9031d;

    /* JADX INFO: renamed from: b */
    public boolean[] f9032b;

    /* JADX INFO: renamed from: c */
    public int f9033c;

    static {
        boolean[] zArr = new boolean[0];
        f9031d = zArr;
        new C2519h3(zArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2519h3() {
        this(f9031d, 0, true);
    }

    /* JADX INFO: renamed from: e */
    public static int m11444e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: g */
    private final void m11445g(int i10) {
        if (i10 < 0 || i10 >= this.f9033c) {
            throw new IndexOutOfBoundsException(m11448f(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f9033c)) {
            throw new IndexOutOfBoundsException(m11448f(i10));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f9032b;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[m11444e(length)];
            System.arraycopy(this.f9032b, 0, zArr2, 0, i10);
            System.arraycopy(this.f9032b, i10, zArr2, i12, this.f9033c - i10);
            this.f9032b = zArr2;
        }
        this.f9032b[i10] = zBooleanValue;
        this.f9033c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11358a();
        collection.getClass();
        if (!(collection instanceof C2519h3)) {
            return super.addAll(collection);
        }
        C2519h3 c2519h3 = (C2519h3) collection;
        int i10 = c2519h3.f9033c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9033c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f9032b;
        if (i12 > zArr.length) {
            this.f9032b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2519h3.f9032b, 0, this.f9032b, this.f9033c, c2519h3.f9033c);
        this.f9033c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m11446c(boolean z10) {
        m11358a();
        int i10 = this.f9033c;
        int length = this.f9032b.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[m11444e(length)];
            System.arraycopy(this.f9032b, 0, zArr, 0, this.f9033c);
            this.f9032b = zArr;
        }
        boolean[] zArr2 = this.f9032b;
        int i11 = this.f9033c;
        this.f9033c = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11447d(int i10) {
        m11445g(i10);
        return this.f9032b[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2519h3)) {
            return super.equals(obj);
        }
        C2519h3 c2519h3 = (C2519h3) obj;
        if (this.f9033c != c2519h3.f9033c) {
            return false;
        }
        boolean[] zArr = c2519h3.f9032b;
        for (int i10 = 0; i10 < this.f9033c; i10++) {
            if (this.f9032b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final String m11448f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9033c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11445g(i10);
        return Boolean.valueOf(this.f9032b[i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM11857a = 1;
        for (int i10 = 0; i10 < this.f9033c; i10++) {
            iM11857a = (iM11857a * 31) + C2718z4.m11857a(this.f9032b[i10]);
        }
        return iM11857a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f9033c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f9032b[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2707y4 mo11340r(int i10) {
        if (i10 >= this.f9033c) {
            return new C2519h3(i10 == 0 ? f9031d : Arrays.copyOf(this.f9032b, i10), this.f9033c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m11358a();
        m11445g(i10);
        boolean[] zArr = this.f9032b;
        boolean z10 = zArr[i10];
        int i11 = this.f9033c;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f9033c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m11358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f9032b;
        System.arraycopy(zArr, i11, zArr, i10, this.f9033c - i11);
        this.f9033c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m11358a();
        m11445g(i10);
        boolean[] zArr = this.f9032b;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9033c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2519h3(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f9032b = zArr;
        this.f9033c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11446c(((Boolean) obj).booleanValue());
        return true;
    }
}
