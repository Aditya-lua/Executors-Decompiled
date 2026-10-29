package he;

/* JADX INFO: loaded from: classes2.dex */
public final class u0<E> extends w<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient E f19297c;

    public u0(E e10) {
        this.f19297c = (E) ge.n.l(e10);
    }

    @Override // he.w, he.r
    public t<E> a() {
        return t.A(this.f19297c);
    }

    @Override // he.r
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f19297c;
        return i10 + 1;
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f19297c.equals(obj);
    }

    @Override // he.r
    public boolean f() {
        return false;
    }

    @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return b0.e(this.f19297c);
    }

    @Override // he.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19297c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f19297c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
