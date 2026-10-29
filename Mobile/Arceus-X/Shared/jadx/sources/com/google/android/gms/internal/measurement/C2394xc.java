package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.xc */
/* JADX INFO: loaded from: classes.dex */
public final class C2394xc extends AbstractC2319t9 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final Object[] f8832d;

    /* JADX INFO: renamed from: e */
    public static final C2394xc f8833e;

    /* JADX INFO: renamed from: b */
    public Object[] f8834b;

    /* JADX INFO: renamed from: c */
    public int f8835c;

    static {
        Object[] objArr = new Object[0];
        f8832d = objArr;
        f8833e = new C2394xc(objArr, 0, false);
    }

    public C2394xc(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f8834b = objArr;
        this.f8835c = i10;
    }

    /* JADX INFO: renamed from: b */
    public static C2394xc m10982b() {
        return f8833e;
    }

    /* JADX INFO: renamed from: d */
    private static int m10983d(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: w */
    private final void m10984w(int i10) {
        if (i10 < 0 || i10 >= this.f8835c) {
            throw new IndexOutOfBoundsException(m10986e(i10));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8835c)) {
            throw new IndexOutOfBoundsException(m10986e(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f8834b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[m10983d(length)];
            System.arraycopy(this.f8834b, 0, objArr2, 0, i10);
            System.arraycopy(this.f8834b, i10, objArr2, i12, this.f8835c - i10);
            this.f8834b = objArr2;
        }
        this.f8834b[i10] = obj;
        this.f8835c++;
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: renamed from: c */
    public final void m10985c(int i10) {
        int length = this.f8834b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8834b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m10983d(length);
        }
        this.f8834b = Arrays.copyOf(this.f8834b, length);
    }

    /* JADX INFO: renamed from: e */
    public final String m10986e(int i10) {
        return C2355v9.m10853a(this.f8835c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m10984w(i10);
        return this.f8834b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m10768a();
        m10984w(i10);
        Object[] objArr = this.f8834b;
        Object obj = objArr[i10];
        int i11 = this.f8835c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f8835c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m10768a();
        m10984w(i10);
        Object[] objArr = this.f8834b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8835c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ InterfaceC2249pb mo9891v(int i10) {
        if (i10 >= this.f8835c) {
            return new C2394xc(i10 == 0 ? f8832d : Arrays.copyOf(this.f8834b, i10), this.f8835c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10768a();
        int i10 = this.f8835c;
        int length = this.f8834b.length;
        if (i10 == length) {
            this.f8834b = Arrays.copyOf(this.f8834b, m10983d(length));
        }
        Object[] objArr = this.f8834b;
        int i11 = this.f8835c;
        this.f8835c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
