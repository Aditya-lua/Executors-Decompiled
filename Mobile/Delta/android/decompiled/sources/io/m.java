package io;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ft.d<Set<an.a0<?>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<ko.z> f20685a;

    public m(ft.i<ko.z> iVar) {
        this.f20685a = iVar;
    }

    public static m a(ft.i<ko.z> iVar) {
        return new m(iVar);
    }

    public static Set<an.a0<?>> c(ko.z zVar) {
        return (Set) ft.h.e(com.withpersona.sdk2.inquiry.governmentid.k.b(zVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<an.a0<?>> get() {
        return c(this.f20685a.get());
    }
}
