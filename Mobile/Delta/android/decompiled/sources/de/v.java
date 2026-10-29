package de;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f14603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f14604f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f14605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f14606d;

    static {
        Object[] objArr = new Object[0];
        f14603e = objArr;
        f14604f = new v(objArr, 0, objArr, 0, 0);
    }

    public v(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f14605c = objArr;
        this.f14606d = objArr2;
    }

    @Override // de.p
    public final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f14605c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // de.p
    public final int b() {
        return 0;
    }

    @Override // de.p
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f14606d.length;
        return false;
    }

    @Override // de.p
    public final Object[] d() {
        return this.f14605c;
    }

    @Override // de.t
    public final s f() {
        x xVar = s.b;
        return u.f14600d;
    }

    @Override // de.t
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
