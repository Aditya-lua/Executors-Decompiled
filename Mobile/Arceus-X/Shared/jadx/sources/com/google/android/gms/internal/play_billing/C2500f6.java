package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2500f6 extends AbstractC2475d3 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f8970d;

    /* JADX INFO: renamed from: e */
    public static final C2500f6 f8971e;

    /* JADX INFO: renamed from: b */
    public Object[] f8972b;

    /* JADX INFO: renamed from: c */
    public int f8973c;

    static {
        Object[] objArr = new Object[0];
        f8970d = objArr;
        f8971e = new C2500f6(objArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2500f6() {
        this(f8970d, 0, true);
    }

    /* JADX INFO: renamed from: c */
    public static C2500f6 m11403c() {
        return f8971e;
    }

    /* JADX INFO: renamed from: e */
    private static int m11404e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: f */
    private final String m11405f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8973c;
    }

    /* JADX INFO: renamed from: g */
    private final void m11406g(int i10) {
        if (i10 < 0 || i10 >= this.f8973c) {
            throw new IndexOutOfBoundsException(m11405f(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f8973c)) {
            throw new IndexOutOfBoundsException(m11405f(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f8972b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[m11404e(length)];
            System.arraycopy(this.f8972b, 0, objArr2, 0, i10);
            System.arraycopy(this.f8972b, i10, objArr2, i12, this.f8973c - i10);
            this.f8972b = objArr2;
        }
        this.f8972b[i10] = obj;
        this.f8973c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: d */
    public final void m11407d(int i10) {
        int length = this.f8972b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8972b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11404e(length);
        }
        this.f8972b = Arrays.copyOf(this.f8972b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i10 = this.f8973c;
        if (i10 != list.size()) {
            return false;
        }
        if (!(obj instanceof C2500f6)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.f8972b[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        C2500f6 c2500f6 = (C2500f6) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.f8972b[i12].equals(c2500f6.f8972b[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m11406g(i10);
        return this.f8972b[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.f8973c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.f8972b[i11].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ InterfaceC2707y4 mo11340r(int i10) {
        if (i10 >= this.f8973c) {
            return new C2500f6(i10 == 0 ? f8970d : Arrays.copyOf(this.f8972b, i10), this.f8973c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m11358a();
        m11406g(i10);
        Object[] objArr = this.f8972b;
        Object obj = objArr[i10];
        int i11 = this.f8973c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f8973c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m11358a();
        m11406g(i10);
        Object[] objArr = this.f8972b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8973c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2500f6(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f8972b = objArr;
        this.f8973c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m11358a();
        int i10 = this.f8973c;
        int length = this.f8972b.length;
        if (i10 == length) {
            this.f8972b = Arrays.copyOf(this.f8972b, m11404e(length));
        }
        Object[] objArr = this.f8972b;
        int i11 = this.f8973c;
        this.f8973c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
