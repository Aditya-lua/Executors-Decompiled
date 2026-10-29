package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends c<Float> implements a0.f, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f8647d = new w(new float[0], 0, false);
    public float[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8648c;

    public w() {
        this(new float[10], 0, true);
    }

    private void f(int i10) {
        if (i10 < 0 || i10 >= this.f8648c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f8648c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f8648c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f8648c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.b;
        if (i12 > fArr.length) {
            this.b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(wVar.b, 0, this.b, this.f8648c, wVar.f8648c);
        this.f8648c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        e(i10, f10.floatValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        d(f10.floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public void d(float f10) {
        a();
        int i10 = this.f8648c;
        float[] fArr = this.b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.b = fArr2;
        }
        float[] fArr3 = this.b;
        int i11 = this.f8648c;
        this.f8648c = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void e(int i10, float f10) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f8648c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        float[] fArr = this.b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.b, i10, fArr2, i10 + 1, this.f8648c - i10);
            this.b = fArr2;
        }
        this.b[i10] = f10;
        this.f8648c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f8648c != wVar.f8648c) {
            return false;
        }
        float[] fArr = wVar.b;
        for (int i10 = 0; i10 < this.f8648c; i10++) {
            if (Float.floatToIntBits(this.b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(h(i10));
    }

    public float h(int i10) {
        f(i10);
        return this.b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f8648c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.b[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0.f o(int i10) {
        if (i10 >= this.f8648c) {
            return new w(Arrays.copyOf(this.b, i10), this.f8648c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        a();
        f(i10);
        float[] fArr = this.b;
        float f10 = fArr[i10];
        int i11 = this.f8648c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f8648c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(p(i10, f10.floatValue()));
    }

    public float p(int i10, float f10) {
        a();
        f(i10);
        float[] fArr = this.b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.b;
        System.arraycopy(fArr, i11, fArr, i10, this.f8648c - i11);
        this.f8648c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f8648c;
    }

    public w(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.b = fArr;
        this.f8648c = i10;
    }
}
