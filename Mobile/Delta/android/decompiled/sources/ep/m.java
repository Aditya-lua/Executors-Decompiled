package ep;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements dt.d<Set<sm.h.e>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f16250a = new m();
    }

    public static m a() {
        return a.f16250a;
    }

    public static Set<sm.h.e> c() {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.h());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<sm.h.e> get() {
        return c();
    }
}
