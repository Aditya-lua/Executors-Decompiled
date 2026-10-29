package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends d3 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f7042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f6 f7043e;
    public Object[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7044c;

    static {
        Object[] objArr = new Object[0];
        f7042d = objArr;
        f7043e = new f6(objArr, 0, false);
    }

    public f6() {
        this(f7042d, 0, true);
    }

    public static f6 c() {
        return f7043e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String f(int i10) {
        return "Index:" + i10 + ", Size:" + this.f7044c;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f7044c) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f7044c)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.b, 0, objArr2, 0, i10);
            System.arraycopy(this.b, i10, objArr2, i12, this.f7044c - i10);
            this.b = objArr2;
        }
        this.b[i10] = obj;
        this.f7044c++;
        ((AbstractList) this).modCount++;
    }

    public final void d(int i10) {
        int length = this.b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i10 = this.f7044c;
        if (i10 != list.size()) {
            return false;
        }
        if (!(obj instanceof f6)) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!this.b[i11].equals(list.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        f6 f6Var = (f6) obj;
        for (int i12 = 0; i12 < i10; i12++) {
            if (!this.b[i12].equals(f6Var.b[i12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.b[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = this.f7044c;
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + this.b[i11].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.y4
    public final /* bridge */ /* synthetic */ y4 r(int i10) {
        if (i10 >= this.f7044c) {
            return new f6(i10 == 0 ? f7042d : Arrays.copyOf(this.b, i10), this.f7044c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.d3, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.b;
        Object obj = objArr[i10];
        int i11 = this.f7044c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f7044c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7044c;
    }

    public f6(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.b = objArr;
        this.f7044c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f7044c;
        int length = this.b.length;
        if (i10 == length) {
            this.b = Arrays.copyOf(this.b, e(length));
        }
        Object[] objArr = this.b;
        int i11 = this.f7044c;
        this.f7044c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
