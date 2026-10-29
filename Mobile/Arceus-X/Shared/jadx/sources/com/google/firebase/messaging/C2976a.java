package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import p129fg.C5598a;
import p129fg.C5599b;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p433sf.InterfaceC11291a;
import p433sf.InterfaceC11292b;
import p466uf.C11845a;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2976a implements InterfaceC11291a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC11291a f11209a = new C2976a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a */
    public static final class a implements InterfaceC10869e<C5598a> {

        /* JADX INFO: renamed from: a */
        public static final a f11210a = new a();

        /* JADX INFO: renamed from: b */
        public static final C10868d f11211b = C10868d.m41320a("projectNumber").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f11212c = C10868d.m41320a("messageId").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

        /* JADX INFO: renamed from: d */
        public static final C10868d f11213d = C10868d.m41320a("instanceId").m41325b(C11845a.m44244b().m44246c(3).m44245a()).m41324a();

        /* JADX INFO: renamed from: e */
        public static final C10868d f11214e = C10868d.m41320a("messageType").m41325b(C11845a.m44244b().m44246c(4).m44245a()).m41324a();

        /* JADX INFO: renamed from: f */
        public static final C10868d f11215f = C10868d.m41320a("sdkPlatform").m41325b(C11845a.m44244b().m44246c(5).m44245a()).m41324a();

        /* JADX INFO: renamed from: g */
        public static final C10868d f11216g = C10868d.m41320a("packageName").m41325b(C11845a.m44244b().m44246c(6).m44245a()).m41324a();

        /* JADX INFO: renamed from: h */
        public static final C10868d f11217h = C10868d.m41320a("collapseKey").m41325b(C11845a.m44244b().m44246c(7).m44245a()).m41324a();

        /* JADX INFO: renamed from: i */
        public static final C10868d f11218i = C10868d.m41320a("priority").m41325b(C11845a.m44244b().m44246c(8).m44245a()).m41324a();

        /* JADX INFO: renamed from: j */
        public static final C10868d f11219j = C10868d.m41320a("ttl").m41325b(C11845a.m44244b().m44246c(9).m44245a()).m41324a();

        /* JADX INFO: renamed from: k */
        public static final C10868d f11220k = C10868d.m41320a("topic").m41325b(C11845a.m44244b().m44246c(10).m44245a()).m41324a();

        /* JADX INFO: renamed from: l */
        public static final C10868d f11221l = C10868d.m41320a("bulkId").m41325b(C11845a.m44244b().m44246c(11).m44245a()).m41324a();

        /* JADX INFO: renamed from: m */
        public static final C10868d f11222m = C10868d.m41320a(NotificationCompat.CATEGORY_EVENT).m41325b(C11845a.m44244b().m44246c(12).m44245a()).m41324a();

        /* JADX INFO: renamed from: n */
        public static final C10868d f11223n = C10868d.m41320a("analyticsLabel").m41325b(C11845a.m44244b().m44246c(13).m44245a()).m41324a();

        /* JADX INFO: renamed from: o */
        public static final C10868d f11224o = C10868d.m41320a("campaignId").m41325b(C11845a.m44244b().m44246c(14).m44245a()).m41324a();

        /* JADX INFO: renamed from: p */
        public static final C10868d f11225p = C10868d.m41320a("composerLabel").m41325b(C11845a.m44244b().m44246c(15).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C5598a c5598a, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f11211b, c5598a.m25302l());
            interfaceC10870f.add(f11212c, c5598a.m25298h());
            interfaceC10870f.add(f11213d, c5598a.m25297g());
            interfaceC10870f.add(f11214e, c5598a.m25299i());
            interfaceC10870f.add(f11215f, c5598a.m25303m());
            interfaceC10870f.add(f11216g, c5598a.m25300j());
            interfaceC10870f.add(f11217h, c5598a.m25294d());
            interfaceC10870f.add(f11218i, c5598a.m25301k());
            interfaceC10870f.add(f11219j, c5598a.m25305o());
            interfaceC10870f.add(f11220k, c5598a.m25304n());
            interfaceC10870f.add(f11221l, c5598a.m25292b());
            interfaceC10870f.add(f11222m, c5598a.m25296f());
            interfaceC10870f.add(f11223n, c5598a.m25291a());
            interfaceC10870f.add(f11224o, c5598a.m25293c());
            interfaceC10870f.add(f11225p, c5598a.m25295e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    public static final class b implements InterfaceC10869e<C5599b> {

        /* JADX INFO: renamed from: a */
        public static final b f11226a = new b();

        /* JADX INFO: renamed from: b */
        public static final C10868d f11227b = C10868d.m41320a("messagingClientEvent").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C5599b c5599b, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f11227b, c5599b.m25324a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    public static final class c implements InterfaceC10869e<AbstractC3001i0> {

        /* JADX INFO: renamed from: a */
        public static final c f11228a = new c();

        /* JADX INFO: renamed from: b */
        public static final C10868d f11229b = C10868d.m41321d("messagingClientEventExtension");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC3001i0 abstractC3001i0, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f11229b, abstractC3001i0.m14601b());
        }
    }

    @Override // p433sf.InterfaceC11291a
    public void configure(InterfaceC11292b<?> interfaceC11292b) {
        interfaceC11292b.registerEncoder(AbstractC3001i0.class, c.f11228a);
        interfaceC11292b.registerEncoder(C5599b.class, b.f11226a);
        interfaceC11292b.registerEncoder(C5598a.class, a.f11210a);
    }
}
