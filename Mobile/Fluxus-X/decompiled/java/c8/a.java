package c8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf.a f4871a = new a();

    /* JADX INFO: renamed from: c8.a$a, reason: collision with other inner class name */
    public static final class C0098a implements tf.e<f8.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0098a f4872a = new C0098a();
        public static final tf.d b = tf.d.a("window").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f4873c = tf.d.a("logSourceMetrics").b(wf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tf.d f4874d = tf.d.a("globalMetrics").b(wf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final tf.d f4875e = tf.d.a("appNamespace").b(wf.a.b().c(4).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.a aVar, tf.f fVar) {
            fVar.add(b, aVar.d());
            fVar.add(f4873c, aVar.c());
            fVar.add(f4874d, aVar.b());
            fVar.add(f4875e, aVar.a());
        }
    }

    public static final class b implements tf.e<f8.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4876a = new b();
        public static final tf.d b = tf.d.a("storageMetrics").b(wf.a.b().c(1).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.b bVar, tf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements tf.e<f8.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f4877a = new c();
        public static final tf.d b = tf.d.a("eventsDroppedCount").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f4878c = tf.d.a("reason").b(wf.a.b().c(3).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.c cVar, tf.f fVar) {
            fVar.add(b, cVar.a());
            fVar.add(f4878c, cVar.b());
        }
    }

    public static final class d implements tf.e<f8.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4879a = new d();
        public static final tf.d b = tf.d.a("logSource").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f4880c = tf.d.a("logEventDropped").b(wf.a.b().c(2).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.d dVar, tf.f fVar) {
            fVar.add(b, dVar.b());
            fVar.add(f4880c, dVar.a());
        }
    }

    public static final class e implements tf.e<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f4881a = new e();
        public static final tf.d b = tf.d.d("clientMetrics");

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(l lVar, tf.f fVar) {
            fVar.add(b, lVar.b());
        }
    }

    public static final class f implements tf.e<f8.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f4882a = new f();
        public static final tf.d b = tf.d.a("currentCacheSizeBytes").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f4883c = tf.d.a("maxCacheSizeBytes").b(wf.a.b().c(2).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.e eVar, tf.f fVar) {
            fVar.add(b, eVar.a());
            fVar.add(f4883c, eVar.b());
        }
    }

    public static final class g implements tf.e<f8.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f4884a = new g();
        public static final tf.d b = tf.d.a("startMs").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f4885c = tf.d.a("endMs").b(wf.a.b().c(2).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f8.f fVar, tf.f fVar2) {
            fVar2.add(b, fVar.b());
            fVar2.add(f4885c, fVar.a());
        }
    }

    @Override // uf.a
    public void configure(uf.b<?> bVar) {
        bVar.registerEncoder(l.class, e.f4881a);
        bVar.registerEncoder(f8.a.class, C0098a.f4872a);
        bVar.registerEncoder(f8.f.class, g.f4884a);
        bVar.registerEncoder(f8.d.class, d.f4879a);
        bVar.registerEncoder(f8.c.class, c.f4877a);
        bVar.registerEncoder(f8.b.class, b.f4876a);
        bVar.registerEncoder(f8.e.class, f.f4882a);
    }
}
