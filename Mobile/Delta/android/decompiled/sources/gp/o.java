package gp;

import an.a0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ft.d<Set<a0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f18354a = new o();
    }

    public static o a() {
        return a.f18354a;
    }

    public static Set<a0<?>> c() {
        return (Set) ft.h.e(com.withpersona.sdk2.inquiry.internal.network.f.j());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a0<?>> get() {
        return c();
    }
}
