package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C2963w extends AbstractC2905c<Float> implements C2900a0.f, RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C2963w f11124d = new C2963w(new float[0], 0, false);

    /* JADX INFO: renamed from: b */
    public float[] f11125b;

    /* JADX INFO: renamed from: c */
    public int f11126c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2963w() {
        this(new float[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m14288f(int i10) {
        if (i10 < 0 || i10 >= this.f11126c) {
            throw new IndexOutOfBoundsException(m14289i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m14289i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11126c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m13410a();
        C2900a0.m13379a(collection);
        if (!(collection instanceof C2963w)) {
            return super.addAll(collection);
        }
        C2963w c2963w = (C2963w) collection;
        int i10 = c2963w.f11126c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11126c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f11125b;
        if (i12 > fArr.length) {
            this.f11125b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c2963w.f11125b, 0, this.f11125b, this.f11126c, c2963w.f11126c);
        this.f11126c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        m14293e(i10, f10.floatValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        m14292d(f10.floatValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public void m14292d(float f10) {
        m13410a();
        int i10 = this.f11126c;
        float[] fArr = this.f11125b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f11125b = fArr2;
        }
        float[] fArr3 = this.f11125b;
        int i11 = this.f11126c;
        this.f11126c = i11 + 1;
        fArr3[i11] = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m14293e(int i10, float f10) {
        int i11;
        m13410a();
        if (i10 < 0 || i10 > (i11 = this.f11126c)) {
            throw new IndexOutOfBoundsException(m14289i(i10));
        }
        float[] fArr = this.f11125b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f11125b, i10, fArr2, i10 + 1, this.f11126c - i10);
            this.f11125b = fArr2;
        }
        this.f11125b[i10] = f10;
        this.f11126c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2963w)) {
            return super.equals(obj);
        }
        C2963w c2963w = (C2963w) obj;
        if (this.f11126c != c2963w.f11126c) {
            return false;
        }
        float[] fArr = c2963w.f11125b;
        for (int i10 = 0; i10 < this.f11126c; i10++) {
            if (Float.floatToIntBits(this.f11125b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(m14295h(i10));
    }

    /* JADX INFO: renamed from: h */
    public float m14295h(int i10) {
        m14288f(i10);
        return this.f11125b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f11126c; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f11125b[i10]);
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
            if (this.f11125b[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Lcom/google/crypto/tink/shaded/protobuf/a0$i; */
    @Override // com.google.crypto.tink.shaded.protobuf.C2900a0.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C2900a0.f mo13390o(int i10) {
        if (i10 >= this.f11126c) {
            return new C2963w(Arrays.copyOf(this.f11125b, i10), this.f11126c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2905c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        m13410a();
        m14288f(i10);
        float[] fArr = this.f11125b;
        float f10 = fArr[i10];
        int i11 = this.f11126c;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f11126c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m14299p(i10, f10.floatValue()));
    }

    /* JADX INFO: renamed from: p */
    public float m14299p(int i10, float f10) {
        m13410a();
        m14288f(i10);
        float[] fArr = this.f11125b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m13410a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f11125b;
        System.arraycopy(fArr, i11, fArr, i10, this.f11126c - i11);
        this.f11126c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11126c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2963w(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f11125b = fArr;
        this.f11126c = i10;
    }
}
