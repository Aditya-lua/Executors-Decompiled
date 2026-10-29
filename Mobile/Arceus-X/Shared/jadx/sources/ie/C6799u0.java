package ie;

import p169he.C6384n;

/* JADX INFO: renamed from: ie.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6799u0<E> extends AbstractC6802w<E> {

    /* JADX INFO: renamed from: c */
    public final transient E f26734c;

    public C6799u0(E e10) {
        this.f26734c = (E) C6384n.m27928l(e10);
    }

    @Override // ie.AbstractC6802w, ie.AbstractC6792r
    /* JADX INFO: renamed from: a */
    public AbstractC6796t<E> mo29064a() {
        return AbstractC6796t.m29083A(this.f26734c);
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        objArr[i10] = this.f26734c;
        return i10 + 1;
    }

    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26734c.equals(obj);
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: f */
    public boolean mo29035f() {
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: g */
    public AbstractC6807y0<E> iterator() {
        return C6761b0.m28885e(this.f26734c);
    }

    @Override // ie.AbstractC6802w, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f26734c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f26734c.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2);
        sb2.append('[');
        sb2.append(string);
        sb2.append(']');
        return sb2.toString();
    }
}
