package ep;

import java.util.Set;
import ym.a0;
import ym.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements dt.d<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Set<a0<?>>> f16258a;

    public u(dt.i<Set<a0<?>>> iVar) {
        this.f16258a = iVar;
    }

    public static u a(dt.i<Set<a0<?>>> iVar) {
        return new u(iVar);
    }

    public static c0 c(Set<a0<?>> set) {
        return (c0) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.p(set));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f16258a.get());
    }
}
