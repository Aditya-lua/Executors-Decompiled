package com.withpersona.sdk2.inquiry.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo.k f11810a;

    public g(zo.k kVar) {
        this.f11810a = kVar;
    }

    public static ft.i<f.a> a(zo.k kVar) {
        return ft.e.a(new g(kVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.f.a
    public f create(String str) {
        return this.f11810a.b(str);
    }
}
