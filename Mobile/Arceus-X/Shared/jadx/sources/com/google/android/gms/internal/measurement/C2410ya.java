package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ya */
/* JADX INFO: loaded from: classes.dex */
public final class C2410ya extends AbstractC2319t9 implements RandomAccess, InterfaceC2195mb, InterfaceC2358vc {

    /* JADX INFO: renamed from: d */
    public static final float[] f8865d;

    /* JADX INFO: renamed from: b */
    public float[] f8866b;

    /* JADX INFO: renamed from: c */
    public int f8867c;

    static {
        float[] fArr = new float[0];
        f8865d = fArr;
        new C2410ya(fArr, 0, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2410ya() {
        this(f8865d, 0, true);
    }

    /* JADX INFO: renamed from: e */
    private static int m11018e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    /* JADX INFO: renamed from: f */
    private final void m11019f(int i10) {
        if (i10 < 0 || i10 >= this.f8867c) {
            throw new IndexOutOfBoundsException(m11020g(i10));
        }
    }

    /* JADX INFO: renamed from: g */
    private final String m11020g(int i10) {
        return C2355v9.m10853a(this.f8867c, i10, (byte) 13, "Index:", ", Size:");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        m10768a();
        if (i10 < 0 || i10 > (i11 = this.f8867c)) {
            throw new IndexOutOfBoundsException(m11020g(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f8866b;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[m11018e(length)];
            System.arraycopy(this.f8866b, 0, fArr2, 0, i10);
            System.arraycopy(this.f8866b, i10, fArr2, i12, this.f8867c - i10);
            this.f8866b = fArr2;
        }
        this.f8866b[i10] = fFloatValue;
        this.f8867c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m10768a();
        Charset charset = C2267qb.f8595a;
        collection.getClass();
        if (!(collection instanceof C2410ya)) {
            return super.addAll(collection);
        }
        C2410ya c2410ya = (C2410ya) collection;
        int i10 = c2410ya.f8867c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8867c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f8866b;
        if (i12 > fArr.length) {
            this.f8866b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2410ya.f8866b, 0, this.f8866b, this.f8867c, c2410ya.f8867c);
        this.f8867c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: v(I)Lcom/google/android/gms/internal/measurement/pb; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2249pb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2195mb mo9891v(int i10) {
        if (i10 >= this.f8867c) {
            return new C2410ya(i10 == 0 ? f8865d : Arrays.copyOf(this.f8866b, i10), this.f8867c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public final float m11022c(int i10) {
        m11019f(i10);
        return this.f8866b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m11023d(float f10) {
        m10768a();
        int i10 = this.f8867c;
        int length = this.f8866b.length;
        if (i10 == length) {
            float[] fArr = new float[m11018e(length)];
            System.arraycopy(this.f8866b, 0, fArr, 0, this.f8867c);
            this.f8866b = fArr;
        }
        float[] fArr2 = this.f8866b;
        int i11 = this.f8867c;
        this.f8867c = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2410ya)) {
            return super.equals(obj);
        }
        C2410ya c2410ya = (C2410ya) obj;
        if (this.f8867c != c2410ya.f8867c) {
            return false;
        }
        float[] fArr = c2410ya.f8866b;
        for (int i10 = 0; i10 < this.f8867c; i10++) {
            if (Float.floatToIntBits(this.f8866b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        m11019f(i10);
        return Float.valueOf(this.f8866b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f8867c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f8866b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f8867c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f8866b[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2319t9, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        m10768a();
        m11019f(i10);
        float[] fArr = this.f8866b;
        float f10 = fArr[i10];
        int i11 = this.f8867c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8867c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        m10768a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f8866b;
        System.arraycopy(fArr, i11, fArr, i10, this.f8867c - i11);
        this.f8867c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m10768a();
        m11019f(i10);
        float[] fArr = this.f8866b;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8867c;
    }

    /* JADX INFO: renamed from: w */
    public final void m11024w(int i10) {
        int length = this.f8866b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f8866b = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = m11018e(length);
        }
        this.f8866b = Arrays.copyOf(this.f8866b, length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2410ya(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f8866b = fArr;
        this.f8867c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m11023d(((Float) obj).floatValue());
        return true;
    }
}
