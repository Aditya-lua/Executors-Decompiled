package b8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements rf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rf.a f3988a = new a();

    /* JADX INFO: renamed from: b8.a$a, reason: collision with other inner class name */
    public static final class C0077a implements qf.e<e8.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0077a f3989a = new C0077a();
        public static final qf.d b = qf.d.a("window").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f3990c = qf.d.a("logSourceMetrics").b(tf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final qf.d f3991d = qf.d.a("globalMetrics").b(tf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final qf.d f3992e = qf.d.a("appNamespace").b(tf.a.b().c(4).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.a aVar, qf.f fVar) {
            fVar.add(b, aVar.d());
            fVar.add(f3990c, aVar.c());
            fVar.add(f3991d, aVar.b());
            fVar.add(f3992e, aVar.a());
        }
    }

    public static final class b implements qf.e<e8.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3993a = new b();
        public static final qf.d b = qf.d.a("storageMetrics").b(tf.a.b().c(1).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.b bVar, qf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements qf.e<e8.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3994a = new c();
        public static final qf.d b = qf.d.a("eventsDroppedCount").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f3995c = qf.d.a("reason").b(tf.a.b().c(3).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.c cVar, qf.f fVar) {
            fVar.add(b, cVar.a());
            fVar.add(f3995c, cVar.b());
        }
    }

    public static final class d implements qf.e<e8.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f3996a = new d();
        public static final qf.d b = qf.d.a("logSource").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f3997c = qf.d.a("logEventDropped").b(tf.a.b().c(2).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.d dVar, qf.f fVar) {
            fVar.add(b, dVar.b());
            fVar.add(f3997c, dVar.a());
        }
    }

    public static final class e implements qf.e<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f3998a = new e();
        public static final qf.d b = qf.d.d("clientMetrics");

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(l lVar, qf.f fVar) {
            fVar.add(b, lVar.b());
        }
    }

    public static final class f implements qf.e<e8.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f3999a = new f();
        public static final qf.d b = qf.d.a("currentCacheSizeBytes").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f4000c = qf.d.a("maxCacheSizeBytes").b(tf.a.b().c(2).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.e eVar, qf.f fVar) {
            fVar.add(b, eVar.a());
            fVar.add(f4000c, eVar.b());
        }
    }

    public static final class g implements qf.e<e8.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f4001a = new g();
        public static final qf.d b = qf.d.a("startMs").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f4002c = qf.d.a("endMs").b(tf.a.b().c(2).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(e8.f fVar, qf.f fVar2) {
            fVar2.add(b, fVar.b());
            fVar2.add(f4002c, fVar.a());
        }
    }

    @Override // rf.a
    public void configure(rf.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f3998a);
        bVar.registerEncoder(e8.a.class, C0077a.f3989a);
        bVar.registerEncoder(e8.f.class, g.f4001a);
        bVar.registerEncoder(e8.d.class, d.f3996a);
        bVar.registerEncoder(e8.c.class, c.f3994a);
        bVar.registerEncoder(e8.b.class, b.f3993a);
        bVar.registerEncoder(e8.e.class, f.f3999a);
    }
}
