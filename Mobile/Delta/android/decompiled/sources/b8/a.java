package b8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sf.a f3886a = new a();

    /* JADX INFO: renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C0076a implements rf.e<e8.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0076a f3887a = new C0076a();
        public static final rf.d b = rf.d.a("window").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f3888c = rf.d.a("logSourceMetrics").b(uf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final rf.d f3889d = rf.d.a("globalMetrics").b(uf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final rf.d f3890e = rf.d.a("appNamespace").b(uf.a.b().c(4).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.a aVar, rf.f fVar) {
            fVar.add(b, aVar.d());
            fVar.add(f3888c, aVar.c());
            fVar.add(f3889d, aVar.b());
            fVar.add(f3890e, aVar.a());
        }
    }

    public static final class b implements rf.e<e8.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3891a = new b();
        public static final rf.d b = rf.d.a("storageMetrics").b(uf.a.b().c(1).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.b bVar, rf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements rf.e<e8.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3892a = new c();
        public static final rf.d b = rf.d.a("eventsDroppedCount").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f3893c = rf.d.a("reason").b(uf.a.b().c(3).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.c cVar, rf.f fVar) {
            fVar.add(b, cVar.a());
            fVar.add(f3893c, cVar.b());
        }
    }

    public static final class d implements rf.e<e8.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3894a = new d();
        public static final rf.d b = rf.d.a("logSource").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f3895c = rf.d.a("logEventDropped").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.d dVar, rf.f fVar) {
            fVar.add(b, dVar.b());
            fVar.add(f3895c, dVar.a());
        }
    }

    public static final class e implements rf.e<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f3896a = new e();
        public static final rf.d b = rf.d.d("clientMetrics");

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(l lVar, rf.f fVar) {
            fVar.add(b, lVar.b());
        }
    }

    public static final class f implements rf.e<e8.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3897a = new f();
        public static final rf.d b = rf.d.a("currentCacheSizeBytes").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f3898c = rf.d.a("maxCacheSizeBytes").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.e eVar, rf.f fVar) {
            fVar.add(b, eVar.a());
            fVar.add(f3898c, eVar.b());
        }
    }

    public static final class g implements rf.e<e8.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f3899a = new g();
        public static final rf.d b = rf.d.a("startMs").b(uf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final rf.d f3900c = rf.d.a("endMs").b(uf.a.b().c(2).a()).a();

        @Override // rf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.f fVar, rf.f fVar2) {
            fVar2.add(b, fVar.b());
            fVar2.add(f3900c, fVar.a());
        }
    }

    @Override // sf.a
    public void configure(sf.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f3896a);
        bVar.registerEncoder(e8.a.class, C0076a.f3887a);
        bVar.registerEncoder(e8.f.class, g.f3899a);
        bVar.registerEncoder(e8.d.class, d.f3894a);
        bVar.registerEncoder(e8.c.class, c.f3892a);
        bVar.registerEncoder(e8.b.class, b.f3891a);
        bVar.registerEncoder(e8.e.class, f.f3897a);
    }
}
