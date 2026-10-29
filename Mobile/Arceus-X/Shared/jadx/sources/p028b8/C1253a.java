package p028b8;

import p097e8.C4881a;
import p097e8.C4882b;
import p097e8.C4883c;
import p097e8.C4884d;
import p097e8.C4885e;
import p097e8.C4886f;
import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p433sf.InterfaceC11291a;
import p433sf.InterfaceC11292b;
import p466uf.C11845a;

/* JADX INFO: renamed from: b8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1253a implements InterfaceC11291a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC11291a f5213a = new C1253a();

    /* JADX INFO: renamed from: b8.a$a */
    public static final class a implements InterfaceC10869e<C4881a> {

        /* JADX INFO: renamed from: a */
        public static final a f5214a = new a();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5215b = C10868d.m41320a("window").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f5216c = C10868d.m41320a("logSourceMetrics").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

        /* JADX INFO: renamed from: d */
        public static final C10868d f5217d = C10868d.m41320a("globalMetrics").m41325b(C11845a.m44244b().m44246c(3).m44245a()).m41324a();

        /* JADX INFO: renamed from: e */
        public static final C10868d f5218e = C10868d.m41320a("appNamespace").m41325b(C11845a.m44244b().m44246c(4).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4881a c4881a, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5215b, c4881a.m23508d());
            interfaceC10870f.add(f5216c, c4881a.m23507c());
            interfaceC10870f.add(f5217d, c4881a.m23506b());
            interfaceC10870f.add(f5218e, c4881a.m23505a());
        }
    }

    /* JADX INFO: renamed from: b8.a$b */
    public static final class b implements InterfaceC10869e<C4882b> {

        /* JADX INFO: renamed from: a */
        public static final b f5219a = new b();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5220b = C10868d.m41320a("storageMetrics").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4882b c4882b, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5220b, c4882b.m23516a());
        }
    }

    /* JADX INFO: renamed from: b8.a$c */
    public static final class c implements InterfaceC10869e<C4883c> {

        /* JADX INFO: renamed from: a */
        public static final c f5221a = new c();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5222b = C10868d.m41320a("eventsDroppedCount").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f5223c = C10868d.m41320a("reason").m41325b(C11845a.m44244b().m44246c(3).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4883c c4883c, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5222b, c4883c.m23520a());
            interfaceC10870f.add(f5223c, c4883c.m23521b());
        }
    }

    /* JADX INFO: renamed from: b8.a$d */
    public static final class d implements InterfaceC10869e<C4884d> {

        /* JADX INFO: renamed from: a */
        public static final d f5224a = new d();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5225b = C10868d.m41320a("logSource").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f5226c = C10868d.m41320a("logEventDropped").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4884d c4884d, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5225b, c4884d.m23527b());
            interfaceC10870f.add(f5226c, c4884d.m23526a());
        }
    }

    /* JADX INFO: renamed from: b8.a$e */
    public static final class e implements InterfaceC10869e<AbstractC1264l> {

        /* JADX INFO: renamed from: a */
        public static final e f5227a = new e();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5228b = C10868d.m41321d("clientMetrics");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC1264l abstractC1264l, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5228b, abstractC1264l.m7037b());
        }
    }

    /* JADX INFO: renamed from: b8.a$f */
    public static final class f implements InterfaceC10869e<C4885e> {

        /* JADX INFO: renamed from: a */
        public static final f f5229a = new f();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5230b = C10868d.m41320a("currentCacheSizeBytes").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f5231c = C10868d.m41320a("maxCacheSizeBytes").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4885e c4885e, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5230b, c4885e.m23532a());
            interfaceC10870f.add(f5231c, c4885e.m23533b());
        }
    }

    /* JADX INFO: renamed from: b8.a$g */
    public static final class g implements InterfaceC10869e<C4886f> {

        /* JADX INFO: renamed from: a */
        public static final g f5232a = new g();

        /* JADX INFO: renamed from: b */
        public static final C10868d f5233b = C10868d.m41320a("startMs").m41325b(C11845a.m44244b().m44246c(1).m44245a()).m41324a();

        /* JADX INFO: renamed from: c */
        public static final C10868d f5234c = C10868d.m41320a("endMs").m41325b(C11845a.m44244b().m44246c(2).m44245a()).m41324a();

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(C4886f c4886f, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f5233b, c4886f.m23539b());
            interfaceC10870f.add(f5234c, c4886f.m23538a());
        }
    }

    @Override // p433sf.InterfaceC11291a
    public void configure(InterfaceC11292b<?> interfaceC11292b) {
        interfaceC11292b.registerEncoder(AbstractC1264l.class, e.f5227a);
        interfaceC11292b.registerEncoder(C4881a.class, a.f5214a);
        interfaceC11292b.registerEncoder(C4886f.class, g.f5232a);
        interfaceC11292b.registerEncoder(C4884d.class, d.f5224a);
        interfaceC11292b.registerEncoder(C4883c.class, c.f5221a);
        interfaceC11292b.registerEncoder(C4882b.class, b.f5219a);
        interfaceC11292b.registerEncoder(C4885e.class, f.f5229a);
    }
}
