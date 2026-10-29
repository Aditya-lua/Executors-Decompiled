package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0890y extends AbstractC0828c<Integer> implements C0892z.d, RandomAccess, InterfaceC0824a1 {

    /* JADX INFO: renamed from: d */
    public static final C0890y f3152d = new C0890y(new int[0], 0, false);

    /* JADX INFO: renamed from: b */
    public int[] f3153b;

    /* JADX INFO: renamed from: c */
    public int f3154c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0890y() {
        this(new int[10], 0, true);
    }

    /* JADX INFO: renamed from: f */
    private void m4221f(int i10) {
        if (i10 < 0 || i10 >= this.f3154c) {
            throw new IndexOutOfBoundsException(m4222i(i10));
        }
    }

    /* JADX INFO: renamed from: i */
    private String m4222i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f3154c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m3358a();
        C0892z.m4236a(collection);
        if (!(collection instanceof C0890y)) {
            return super.addAll(collection);
        }
        C0890y c0890y = (C0890y) collection;
        int i10 = c0890y.f3154c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f3154c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f3153b;
        if (i12 > iArr.length) {
            this.f3153b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c0890y.f3153b, 0, this.f3153b, this.f3154c, c0890y.f3154c);
        this.f3154c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        m4226e(i10, num.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m4225d(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public void m4225d(int i10) {
        m3358a();
        int i11 = this.f3154c;
        int[] iArr = this.f3153b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f3153b = iArr2;
        }
        int[] iArr3 = this.f3153b;
        int i12 = this.f3154c;
        this.f3154c = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: e */
    public final void m4226e(int i10, int i11) {
        int i12;
        m3358a();
        if (i10 < 0 || i10 > (i12 = this.f3154c)) {
            throw new IndexOutOfBoundsException(m4222i(i10));
        }
        int[] iArr = this.f3153b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f3153b, i10, iArr2, i10 + 1, this.f3154c - i10);
            this.f3153b = iArr2;
        }
        this.f3153b[i10] = i11;
        this.f3154c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0890y)) {
            return super.equals(obj);
        }
        C0890y c0890y = (C0890y) obj;
        if (this.f3154c != c0890y.f3154c) {
            return false;
        }
        int[] iArr = c0890y.f3153b;
        for (int i10 = 0; i10 < this.f3154c; i10++) {
            if (this.f3153b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(m4228h(i10));
    }

    /* JADX INFO: renamed from: h */
    public int m4228h(int i10) {
        m4221f(i10);
        return this.f3153b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f3154c; i11++) {
            i10 = (i10 * 31) + this.f3153b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f3153b[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Landroidx/datastore/preferences/protobuf/z$f; */
    @Override // androidx.datastore.preferences.protobuf.C0892z.f
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C0892z.d mo3381o(int i10) {
        if (i10 >= this.f3154c) {
            return new C0890y(Arrays.copyOf(this.f3153b, i10), this.f3154c, true);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m3358a();
        m4221f(i10);
        int[] iArr = this.f3153b;
        int i11 = iArr[i10];
        int i12 = this.f3154c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f3154c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m4232p(i10, num.intValue()));
    }

    /* JADX INFO: renamed from: p */
    public int m4232p(int i10, int i11) {
        m3358a();
        m4221f(i10);
        int[] iArr = this.f3153b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m3358a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f3153b;
        System.arraycopy(iArr, i11, iArr, i10, this.f3154c - i11);
        this.f3154c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3154c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0890y(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f3153b = iArr;
        this.f3154c = i10;
    }
}
