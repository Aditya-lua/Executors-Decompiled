package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements uf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf.a f8621a = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0136a implements tf.e<hg.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0136a f8622a = new C0136a();
        public static final tf.d b = tf.d.a("projectNumber").b(wf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final tf.d f8623c = tf.d.a("messageId").b(wf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final tf.d f8624d = tf.d.a("instanceId").b(wf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final tf.d f8625e = tf.d.a("messageType").b(wf.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final tf.d f8626f = tf.d.a("sdkPlatform").b(wf.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final tf.d f8627g = tf.d.a("packageName").b(wf.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final tf.d f8628h = tf.d.a("collapseKey").b(wf.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final tf.d f8629i = tf.d.a("priority").b(wf.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final tf.d f8630j = tf.d.a("ttl").b(wf.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final tf.d f8631k = tf.d.a("topic").b(wf.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final tf.d f8632l = tf.d.a("bulkId").b(wf.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final tf.d f8633m = tf.d.a("event").b(wf.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final tf.d f8634n = tf.d.a("analyticsLabel").b(wf.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final tf.d f8635o = tf.d.a("campaignId").b(wf.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final tf.d f8636p = tf.d.a("composerLabel").b(wf.a.b().c(15).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(hg.a aVar, tf.f fVar) {
            fVar.add(b, aVar.l());
            fVar.add(f8623c, aVar.h());
            fVar.add(f8624d, aVar.g());
            fVar.add(f8625e, aVar.i());
            fVar.add(f8626f, aVar.m());
            fVar.add(f8627g, aVar.j());
            fVar.add(f8628h, aVar.d());
            fVar.add(f8629i, aVar.k());
            fVar.add(f8630j, aVar.o());
            fVar.add(f8631k, aVar.n());
            fVar.add(f8632l, aVar.b());
            fVar.add(f8633m, aVar.f());
            fVar.add(f8634n, aVar.a());
            fVar.add(f8635o, aVar.c());
            fVar.add(f8636p, aVar.e());
        }
    }

    public static final class b implements tf.e<hg.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8637a = new b();
        public static final tf.d b = tf.d.a("messagingClientEvent").b(wf.a.b().c(1).a()).a();

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(hg.b bVar, tf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements tf.e<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8638a = new c();
        public static final tf.d b = tf.d.d("messagingClientEventExtension");

        @Override // tf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(i0 i0Var, tf.f fVar) {
            fVar.add(b, i0Var.b());
        }
    }

    @Override // uf.a
    public void configure(uf.b<?> bVar) {
        bVar.registerEncoder(i0.class, c.f8638a);
        bVar.registerEncoder(hg.b.class, b.f8637a);
        bVar.registerEncoder(hg.a.class, C0136a.f8622a);
    }
}
