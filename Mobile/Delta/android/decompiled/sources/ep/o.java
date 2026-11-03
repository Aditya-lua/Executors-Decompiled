package ep;

import java.util.Set;
import ym.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements dt.d<Set<a0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f16252a = new o();
    }

    public static o a() {
        return a.f16252a;
    }

    public static Set<a0<?>> c() {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.j());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a0<?>> get() {
        return c();
    }
}
