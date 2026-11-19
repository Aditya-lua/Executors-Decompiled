package ge;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f17726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f17727f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f17728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f17729d;

    static {
        Object[] objArr = new Object[0];
        f17726e = objArr;
        f17727f = new v(objArr, 0, objArr, 0, 0);
    }

    public v(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f17728c = objArr;
        this.f17729d = objArr2;
    }

    @Override // ge.p
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f17728c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ge.p
    public final int b() {
        return 0;
    }

    @Override // ge.p
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f17729d.length;
        return false;
    }

    @Override // ge.p
    public final Object[] d() {
        return this.f17728c;
    }

    @Override // ge.t
    public final s f() {
        x xVar = s.b;
        return u.f17723d;
    }

    @Override // ge.t
    public final boolean h() {
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
