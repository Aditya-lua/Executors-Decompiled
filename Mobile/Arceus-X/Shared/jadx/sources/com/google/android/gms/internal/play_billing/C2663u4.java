package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2663u4 extends AbstractC2475d3 implements RandomAccess, InterfaceC2696x4 {

    /* JADX INFO: renamed from: d */
    public static final int[] f9397d;

    /* JADX INFO: renamed from: e */
    public static final C2663u4 f9398e;

    /* JADX INFO: renamed from: b */
    public int[] f9399b;

    /* JADX INFO: renamed from: c */
    public int f9400c;

    static {
        int[] iArr = new int[0];
        f9397d = iArr;
        f9398e = new C2663u4(iArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2663u4() {
        this(f9397d, 0, true);
    }

    /* JADX INFO: renamed from: d */
    public static C2663u4 m11768d() {
        return f9398e;
    }

    /* JADX INFO: renamed from: f */
    public static int m11769f(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        m11358a();
        if (i10 < 0 || i10 > (i11 = this.f9400c)) {
            throw new IndexOutOfBoundsException(m11772g(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f9399b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[m11769f(length)];
            System.arraycopy(this.f9399b, 0, iArr2, 0, i10);
            System.arraycopy(this.f9399b, i10, iArr2, i12, this.f9400c - i10);
            this.f9399b = iArr2;
        }
        this.f9399b[i10] = iIntValue;
        this.f9400c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m11358a();
        collection.getClass();
        if (!(collection instanceof C2663u4)) {
            return super.addAll(collection);
        }
        C2663u4 c2663u4 = (C2663u4) collection;
        int i10 = c2663u4.f9400c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f9400c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f9399b;
        if (i12 > iArr.length) {
            this.f9399b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2663u4.f9399b, 0, this.f9399b, this.f9400c, c2663u4.f9400c);
        this.f9400c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m11770c(int i10) {
        m11773h(i10);
        return this.f9399b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m11771e(int i10) {
        int length = this.f9399b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f9399b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11769f(length);
        }
        this.f9399b = Arrays.copyOf(this.f9399b, length);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2663u4)) {
            return super.equals(obj);
        }
        C2663u4 c2663u4 = (C2663u4) obj;
        if (this.f9400c != c2663u4.f9400c) {
            return false;
        }
        int[] iArr = c2663u4.f9399b;
        for (int i10 = 0; i10 < this.f9400c; i10++) {
            if (this.f9399b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final String m11772g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9400c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11773h(i10);
        return Integer.valueOf(this.f9399b[i10]);
    }

    /* JADX INFO: renamed from: h */
    public final void m11773h(int i10) {
        if (i10 < 0 || i10 >= this.f9400c) {
            throw new IndexOutOfBoundsException(m11772g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f9400c; i11++) {
            i10 = (i10 * 31) + this.f9399b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f9400c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f9399b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2475d3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m11358a();
        m11773h(i10);
        int[] iArr = this.f9399b;
        int i11 = iArr[i10];
        int i12 = this.f9400c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f9400c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m11358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f9399b;
        System.arraycopy(iArr, i11, iArr, i10, this.f9400c - i11);
        this.f9400c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m11358a();
        m11773h(i10);
        int[] iArr = this.f9399b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9400c;
    }

    /* JADX DEBUG: Method merged with bridge method: r(I)Lcom/google/android/gms/internal/play_billing/y4; */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC2707y4
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2696x4 mo11340r(int i10) {
        if (i10 >= this.f9400c) {
            return new C2663u4(i10 == 0 ? f9397d : Arrays.copyOf(this.f9399b, i10), this.f9400c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2696x4
    /* JADX INFO: renamed from: w */
    public final void mo11775w(int i10) {
        m11358a();
        int i11 = this.f9400c;
        int length = this.f9399b.length;
        if (i11 == length) {
            int[] iArr = new int[m11769f(length)];
            System.arraycopy(this.f9399b, 0, iArr, 0, this.f9400c);
            this.f9399b = iArr;
        }
        int[] iArr2 = this.f9399b;
        int i12 = this.f9400c;
        this.f9400c = i12 + 1;
        iArr2[i12] = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2663u4(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f9399b = iArr;
        this.f9400c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo11775w(((Integer) obj).intValue());
        return true;
    }
}
