package up;

import java.util.Set;
import nn.b0;
import nn.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements wt.d<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Set<b0<?>>> f33829a;

    public u(wt.i<Set<b0<?>>> iVar) {
        this.f33829a = iVar;
    }

    public static u a(wt.i<Set<b0<?>>> iVar) {
        return new u(iVar);
    }

    public static d0 c(Set<b0<?>> set) {
        return (d0) wt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.p(set));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(this.f33829a.get());
    }
}
