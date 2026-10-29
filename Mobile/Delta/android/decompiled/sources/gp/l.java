package gp;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ft.d<Set<Object>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f18351a = new l();
    }

    public static l a() {
        return a.f18351a;
    }

    public static Set<Object> c() {
        return (Set) ft.h.e(com.withpersona.sdk2.inquiry.internal.network.f.f());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<Object> get() {
        return c();
    }
}
