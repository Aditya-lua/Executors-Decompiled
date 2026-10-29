package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0833d1<E> extends AbstractC0828c<E> implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public static final C0833d1<Object> f2847d = new C0833d1<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: b */
    public E[] f2848b;

    /* JADX INFO: renamed from: c */
    public int f2849c;

    public C0833d1(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f2848b = eArr;
        this.f2849c = i10;
    }

    /* JADX INFO: renamed from: b */
    public static <E> E[] m3376b(int i10) {
        return (E[]) new Object[i10];
    }

    /* JADX INFO: renamed from: c */
    public static <E> C0833d1<E> m3377c() {
        return (C0833d1<E>) f2847d;
    }

    /* JADX INFO: renamed from: d */
    private void m3378d(int i10) {
        if (i10 < 0 || i10 >= this.f2849c) {
            throw new IndexOutOfBoundsException(m3379e(i10));
        }
    }

    /* JADX INFO: renamed from: e */
    private String m3379e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2849c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m3358a();
        int i10 = this.f2849c;
        E[] eArr = this.f2848b;
        if (i10 == eArr.length) {
            this.f2848b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2848b;
        int i11 = this.f2849c;
        this.f2849c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: o(I)Landroidx/datastore/preferences/protobuf/z$f; */
    @Override // androidx.datastore.preferences.protobuf.C0892z.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0833d1<E> mo3381o(int i10) {
        if (i10 >= this.f2849c) {
            return new C0833d1<>(Arrays.copyOf(this.f2848b, i10), this.f2849c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m3378d(i10);
        return this.f2848b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0828c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m3358a();
        m3378d(i10);
        E[] eArr = this.f2848b;
        E e10 = eArr[i10];
        int i11 = this.f2849c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f2849c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m3358a();
        m3378d(i10);
        E[] eArr = this.f2848b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2849c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m3358a();
        if (i10 >= 0 && i10 <= (i11 = this.f2849c)) {
            E[] eArr = this.f2848b;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) m3376b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f2848b, 0, eArr2, 0, i10);
                System.arraycopy(this.f2848b, i10, eArr2, i10 + 1, this.f2849c - i10);
                this.f2848b = eArr2;
            }
            this.f2848b[i10] = e10;
            this.f2849c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m3379e(i10));
    }
}
