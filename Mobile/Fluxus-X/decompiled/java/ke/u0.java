package ke;

/* JADX INFO: loaded from: classes2.dex */
public final class u0<E> extends w<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient E f21441c;

    public u0(E e10) {
        this.f21441c = (E) je.n.l(e10);
    }

    @Override // ke.w, ke.r
    public t<E> a() {
        return t.A(this.f21441c);
    }

    @Override // ke.r
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f21441c;
        return i10 + 1;
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f21441c.equals(obj);
    }

    @Override // ke.r
    public boolean f() {
        return false;
    }

    @Override // ke.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public y0<E> iterator() {
        return b0.e(this.f21441c);
    }

    @Override // ke.w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21441c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f21441c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
