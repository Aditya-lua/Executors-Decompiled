package gp;

import an.a0;
import an.c0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements ft.d<c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Set<a0<?>>> f18360a;

    public u(ft.i<Set<a0<?>>> iVar) {
        this.f18360a = iVar;
    }

    public static u a(ft.i<Set<a0<?>>> iVar) {
        return new u(iVar);
    }

    public static c0 c(Set<a0<?>> set) {
        return (c0) ft.h.e(com.withpersona.sdk2.inquiry.internal.network.f.p(set));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c0 get() {
        return c(this.f18360a.get());
    }
}
