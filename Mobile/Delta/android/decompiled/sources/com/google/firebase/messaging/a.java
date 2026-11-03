package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sf.a f8793a = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0133a implements rf.e<fg.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0133a f8794a = new C0133a();
        public static final rf.d b = rf.d.a("projectNumber").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f8795c = rf.d.a("messageId").b(uf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final rf.d f8796d = rf.d.a("instanceId").b(uf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final rf.d f8797e = rf.d.a("messageType").b(uf.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final rf.d f8798f = rf.d.a("sdkPlatform").b(uf.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final rf.d f8799g = rf.d.a("packageName").b(uf.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final rf.d f8800h = rf.d.a("collapseKey").b(uf.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final rf.d f8801i = rf.d.a("priority").b(uf.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final rf.d f8802j = rf.d.a("ttl").b(uf.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final rf.d f8803k = rf.d.a("topic").b(uf.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final rf.d f8804l = rf.d.a("bulkId").b(uf.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final rf.d f8805m = rf.d.a("event").b(uf.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final rf.d f8806n = rf.d.a("analyticsLabel").b(uf.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final rf.d f8807o = rf.d.a("campaignId").b(uf.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final rf.d f8808p = rf.d.a("composerLabel").b(uf.a.b().c(15).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fg.a aVar, rf.f fVar) {
            fVar.add(b, aVar.l());
            fVar.add(f8795c, aVar.h());
            fVar.add(f8796d, aVar.g());
            fVar.add(f8797e, aVar.i());
            fVar.add(f8798f, aVar.m());
            fVar.add(f8799g, aVar.j());
            fVar.add(f8800h, aVar.d());
            fVar.add(f8801i, aVar.k());
            fVar.add(f8802j, aVar.o());
            fVar.add(f8803k, aVar.n());
            fVar.add(f8804l, aVar.b());
            fVar.add(f8805m, aVar.f());
            fVar.add(f8806n, aVar.a());
            fVar.add(f8807o, aVar.c());
            fVar.add(f8808p, aVar.e());
        }
    }

    public static final class b implements rf.e<fg.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8809a = new b();
        public static final rf.d b = rf.d.a("messagingClientEvent").b(uf.a.b().c(1).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fg.b bVar, rf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements rf.e<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8810a = new c();
        public static final rf.d b = rf.d.d("messagingClientEventExtension");

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(i0 i0Var, rf.f fVar) {
            fVar.add(b, i0Var.b());
        }
    }

    @Override // sf.a
    public void configure(sf.b<?> bVar) {
        bVar.registerEncoder(i0.class, c.f8810a);
        bVar.registerEncoder(fg.b.class, b.f8809a);
        bVar.registerEncoder(fg.a.class, C0133a.f8794a);
    }
}
