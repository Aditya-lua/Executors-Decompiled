package ie;

import java.util.Objects;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.p0 */
/* JADX INFO: loaded from: classes2.dex */
public class C6789p0<E> extends AbstractC6796t<E> {

    /* JADX INFO: renamed from: e */
    public static final AbstractC6796t<Object> f26679e = new C6789p0(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f26680c;

    /* JADX INFO: renamed from: d */
    public final transient int f26681d;

    public C6789p0(Object[] objArr, int i10) {
        this.f26680c = objArr;
        this.f26681d = i10;
    }

    @Override // ie.AbstractC6796t, ie.AbstractC6792r
    /* JADX INFO: renamed from: b */
    public int mo29031b(Object[] objArr, int i10) {
        System.arraycopy(this.f26680c, 0, objArr, i10, this.f26681d);
        return i10 + this.f26681d;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: c */
    public Object[] mo29032c() {
        return this.f26680c;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: d */
    public int mo29033d() {
        return this.f26681d;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: e */
    public int mo29034e() {
        return 0;
    }

    @Override // ie.AbstractC6792r
    /* JADX INFO: renamed from: f */
    public boolean mo29035f() {
        return false;
    }

    @Override // java.util.List
    public E get(int i10) {
        C6384n.m27926j(i10, this.f26681d);
        E e10 = (E) this.f26680c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26681d;
    }
}
