package p009a8;

import p410rf.C10868d;
import p410rf.InterfaceC10869e;
import p410rf.InterfaceC10870f;
import p433sf.InterfaceC11291a;
import p433sf.InterfaceC11292b;

/* JADX INFO: renamed from: a8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0084b implements InterfaceC11291a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC11291a f164a = new C0084b();

    /* JADX INFO: renamed from: a8.b$a */
    public static final class a implements InterfaceC10869e<AbstractC0083a> {

        /* JADX INFO: renamed from: a */
        public static final a f165a = new a();

        /* JADX INFO: renamed from: b */
        public static final C10868d f166b = C10868d.m41321d("sdkVersion");

        /* JADX INFO: renamed from: c */
        public static final C10868d f167c = C10868d.m41321d("model");

        /* JADX INFO: renamed from: d */
        public static final C10868d f168d = C10868d.m41321d("hardware");

        /* JADX INFO: renamed from: e */
        public static final C10868d f169e = C10868d.m41321d("device");

        /* JADX INFO: renamed from: f */
        public static final C10868d f170f = C10868d.m41321d("product");

        /* JADX INFO: renamed from: g */
        public static final C10868d f171g = C10868d.m41321d("osBuild");

        /* JADX INFO: renamed from: h */
        public static final C10868d f172h = C10868d.m41321d("manufacturer");

        /* JADX INFO: renamed from: i */
        public static final C10868d f173i = C10868d.m41321d("fingerprint");

        /* JADX INFO: renamed from: j */
        public static final C10868d f174j = C10868d.m41321d("locale");

        /* JADX INFO: renamed from: k */
        public static final C10868d f175k = C10868d.m41321d("country");

        /* JADX INFO: renamed from: l */
        public static final C10868d f176l = C10868d.m41321d("mccMnc");

        /* JADX INFO: renamed from: m */
        public static final C10868d f177m = C10868d.m41321d("applicationBuild");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0083a abstractC0083a, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f166b, abstractC0083a.mo219m());
            interfaceC10870f.add(f167c, abstractC0083a.mo216j());
            interfaceC10870f.add(f168d, abstractC0083a.mo212f());
            interfaceC10870f.add(f169e, abstractC0083a.mo210d());
            interfaceC10870f.add(f170f, abstractC0083a.mo218l());
            interfaceC10870f.add(f171g, abstractC0083a.mo217k());
            interfaceC10870f.add(f172h, abstractC0083a.mo214h());
            interfaceC10870f.add(f173i, abstractC0083a.mo211e());
            interfaceC10870f.add(f174j, abstractC0083a.mo213g());
            interfaceC10870f.add(f175k, abstractC0083a.mo209c());
            interfaceC10870f.add(f176l, abstractC0083a.mo215i());
            interfaceC10870f.add(f177m, abstractC0083a.mo208b());
        }
    }

    /* JADX INFO: renamed from: a8.b$b */
    public static final class b implements InterfaceC10869e<AbstractC0092j> {

        /* JADX INFO: renamed from: a */
        public static final b f178a = new b();

        /* JADX INFO: renamed from: b */
        public static final C10868d f179b = C10868d.m41321d("logRequest");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0092j abstractC0092j, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f179b, abstractC0092j.mo239c());
        }
    }

    /* JADX INFO: renamed from: a8.b$c */
    public static final class c implements InterfaceC10869e<AbstractC0093k> {

        /* JADX INFO: renamed from: a */
        public static final c f180a = new c();

        /* JADX INFO: renamed from: b */
        public static final C10868d f181b = C10868d.m41321d("clientType");

        /* JADX INFO: renamed from: c */
        public static final C10868d f182c = C10868d.m41321d("androidClientInfo");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0093k abstractC0093k, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f181b, abstractC0093k.mo241c());
            interfaceC10870f.add(f182c, abstractC0093k.mo240b());
        }
    }

    /* JADX INFO: renamed from: a8.b$d */
    public static final class d implements InterfaceC10869e<AbstractC0094l> {

        /* JADX INFO: renamed from: a */
        public static final d f183a = new d();

        /* JADX INFO: renamed from: b */
        public static final C10868d f184b = C10868d.m41321d("eventTimeMs");

        /* JADX INFO: renamed from: c */
        public static final C10868d f185c = C10868d.m41321d("eventCode");

        /* JADX INFO: renamed from: d */
        public static final C10868d f186d = C10868d.m41321d("eventUptimeMs");

        /* JADX INFO: renamed from: e */
        public static final C10868d f187e = C10868d.m41321d("sourceExtension");

        /* JADX INFO: renamed from: f */
        public static final C10868d f188f = C10868d.m41321d("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: g */
        public static final C10868d f189g = C10868d.m41321d("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: h */
        public static final C10868d f190h = C10868d.m41321d("networkConnectionInfo");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0094l abstractC0094l, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f184b, abstractC0094l.mo246c());
            interfaceC10870f.add(f185c, abstractC0094l.mo245b());
            interfaceC10870f.add(f186d, abstractC0094l.mo247d());
            interfaceC10870f.add(f187e, abstractC0094l.mo249f());
            interfaceC10870f.add(f188f, abstractC0094l.mo250g());
            interfaceC10870f.add(f189g, abstractC0094l.mo251h());
            interfaceC10870f.add(f190h, abstractC0094l.mo248e());
        }
    }

    /* JADX INFO: renamed from: a8.b$e */
    public static final class e implements InterfaceC10869e<AbstractC0095m> {

        /* JADX INFO: renamed from: a */
        public static final e f191a = new e();

        /* JADX INFO: renamed from: b */
        public static final C10868d f192b = C10868d.m41321d("requestTimeMs");

        /* JADX INFO: renamed from: c */
        public static final C10868d f193c = C10868d.m41321d("requestUptimeMs");

        /* JADX INFO: renamed from: d */
        public static final C10868d f194d = C10868d.m41321d("clientInfo");

        /* JADX INFO: renamed from: e */
        public static final C10868d f195e = C10868d.m41321d("logSource");

        /* JADX INFO: renamed from: f */
        public static final C10868d f196f = C10868d.m41321d("logSourceName");

        /* JADX INFO: renamed from: g */
        public static final C10868d f197g = C10868d.m41321d("logEvent");

        /* JADX INFO: renamed from: h */
        public static final C10868d f198h = C10868d.m41321d("qosTier");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0095m abstractC0095m, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f192b, abstractC0095m.mo265g());
            interfaceC10870f.add(f193c, abstractC0095m.mo266h());
            interfaceC10870f.add(f194d, abstractC0095m.mo260b());
            interfaceC10870f.add(f195e, abstractC0095m.mo262d());
            interfaceC10870f.add(f196f, abstractC0095m.mo263e());
            interfaceC10870f.add(f197g, abstractC0095m.mo261c());
            interfaceC10870f.add(f198h, abstractC0095m.mo264f());
        }
    }

    /* JADX INFO: renamed from: a8.b$f */
    public static final class f implements InterfaceC10869e<AbstractC0097o> {

        /* JADX INFO: renamed from: a */
        public static final f f199a = new f();

        /* JADX INFO: renamed from: b */
        public static final C10868d f200b = C10868d.m41321d("networkType");

        /* JADX INFO: renamed from: c */
        public static final C10868d f201c = C10868d.m41321d("mobileSubtype");

        /* JADX DEBUG: Method merged with bridge method: encode(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p410rf.InterfaceC10866b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(AbstractC0097o abstractC0097o, InterfaceC10870f interfaceC10870f) {
            interfaceC10870f.add(f200b, abstractC0097o.mo277c());
            interfaceC10870f.add(f201c, abstractC0097o.mo276b());
        }
    }

    @Override // p433sf.InterfaceC11291a
    public void configure(InterfaceC11292b<?> interfaceC11292b) {
        b bVar = b.f178a;
        interfaceC11292b.registerEncoder(AbstractC0092j.class, bVar);
        interfaceC11292b.registerEncoder(C0086d.class, bVar);
        e eVar = e.f191a;
        interfaceC11292b.registerEncoder(AbstractC0095m.class, eVar);
        interfaceC11292b.registerEncoder(C0089g.class, eVar);
        c cVar = c.f180a;
        interfaceC11292b.registerEncoder(AbstractC0093k.class, cVar);
        interfaceC11292b.registerEncoder(C0087e.class, cVar);
        a aVar = a.f165a;
        interfaceC11292b.registerEncoder(AbstractC0083a.class, aVar);
        interfaceC11292b.registerEncoder(C0085c.class, aVar);
        d dVar = d.f183a;
        interfaceC11292b.registerEncoder(AbstractC0094l.class, dVar);
        interfaceC11292b.registerEncoder(C0088f.class, dVar);
        f fVar = f.f199a;
        interfaceC11292b.registerEncoder(AbstractC0097o.class, fVar);
        interfaceC11292b.registerEncoder(C0091i.class, fVar);
    }
}
