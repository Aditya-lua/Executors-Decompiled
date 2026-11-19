package up;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements wt.d<Set<hn.h.e>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f33821a = new m();
    }

    public static m a() {
        return a.f33821a;
    }

    public static Set<hn.h.e> c() {
        return (Set) wt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.h());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<hn.h.e> get() {
        return c();
    }
}
