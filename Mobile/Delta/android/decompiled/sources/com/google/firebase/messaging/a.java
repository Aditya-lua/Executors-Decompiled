package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements rf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rf.a f8719a = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static final class C0129a implements qf.e<eg.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0129a f8720a = new C0129a();
        public static final qf.d b = qf.d.a("projectNumber").b(tf.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final qf.d f8721c = qf.d.a("messageId").b(tf.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final qf.d f8722d = qf.d.a("instanceId").b(tf.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final qf.d f8723e = qf.d.a("messageType").b(tf.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final qf.d f8724f = qf.d.a("sdkPlatform").b(tf.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final qf.d f8725g = qf.d.a("packageName").b(tf.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final qf.d f8726h = qf.d.a("collapseKey").b(tf.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final qf.d f8727i = qf.d.a("priority").b(tf.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final qf.d f8728j = qf.d.a("ttl").b(tf.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final qf.d f8729k = qf.d.a("topic").b(tf.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final qf.d f8730l = qf.d.a("bulkId").b(tf.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final qf.d f8731m = qf.d.a("event").b(tf.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final qf.d f8732n = qf.d.a("analyticsLabel").b(tf.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final qf.d f8733o = qf.d.a("campaignId").b(tf.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final qf.d f8734p = qf.d.a("composerLabel").b(tf.a.b().c(15).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(eg.a aVar, qf.f fVar) {
            fVar.add(b, aVar.l());
            fVar.add(f8721c, aVar.h());
            fVar.add(f8722d, aVar.g());
            fVar.add(f8723e, aVar.i());
            fVar.add(f8724f, aVar.m());
            fVar.add(f8725g, aVar.j());
            fVar.add(f8726h, aVar.d());
            fVar.add(f8727i, aVar.k());
            fVar.add(f8728j, aVar.o());
            fVar.add(f8729k, aVar.n());
            fVar.add(f8730l, aVar.b());
            fVar.add(f8731m, aVar.f());
            fVar.add(f8732n, aVar.a());
            fVar.add(f8733o, aVar.c());
            fVar.add(f8734p, aVar.e());
        }
    }

    public static final class b implements qf.e<eg.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f8735a = new b();
        public static final qf.d b = qf.d.a("messagingClientEvent").b(tf.a.b().c(1).a()).a();

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(eg.b bVar, qf.f fVar) {
            fVar.add(b, bVar.a());
        }
    }

    public static final class c implements qf.e<i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f8736a = new c();
        public static final qf.d b = qf.d.d("messagingClientEventExtension");

        @Override // qf.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(i0 i0Var, qf.f fVar) {
            fVar.add(b, i0Var.b());
        }
    }

    @Override // rf.a
    public void configure(rf.b<?> bVar) {
        bVar.registerEncoder(i0.class, c.f8736a);
        bVar.registerEncoder(eg.b.class, b.f8735a);
        bVar.registerEncoder(eg.a.class, C0129a.f8720a);
    }
}
