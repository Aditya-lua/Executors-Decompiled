package up;

import java.util.Set;
import nn.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements wt.d<Set<b0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f33823a = new o();
    }

    public static o a() {
        return a.f33823a;
    }

    public static Set<b0<?>> c() {
        return (Set) wt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.j());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<b0<?>> get() {
        return c();
    }
}
