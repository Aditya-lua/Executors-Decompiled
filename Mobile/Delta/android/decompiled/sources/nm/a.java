package nm;

import com.roblox.universalapp.account.JNIAccountProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bW\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0006R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR(\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR(\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR(\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR(\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR(\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010\u001dR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001dR(\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR(\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0019\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR(\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0019\u001a\u0004\bT\u0010\u001b\"\u0004\bU\u0010\u001dR(\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0019\u001a\u0004\bX\u0010\u001b\"\u0004\bY\u0010\u001dR(\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\u0019\u001a\u0004\b\\\u0010\u001b\"\u0004\b]\u0010\u001dR(\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0019\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010\u001dR(\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0019\u001a\u0004\bd\u0010\u001b\"\u0004\be\u0010\u001dR(\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0019\u001a\u0004\bh\u0010\u001b\"\u0004\bi\u0010\u001dR(\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010\u0019\u001a\u0004\bl\u0010\u001b\"\u0004\bm\u0010\u001d¨\u0006o"}, d2 = {"Lnm/a;", "", "<init>", "()V", "", "o", "()Ljava/lang/String;", "k", "e", "n", "m", "f", "h", "d", "b", "l", "g", "i", "j", "a", "c", "r", "p", "q", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getGetProtocolNameDelegate", "()Lkotlin/jvm/functions/Function0;", "setGetProtocolNameDelegate", "(Lkotlin/jvm/functions/Function0;)V", "getProtocolNameDelegate", "getGetGetIntegrityTokenMethodNameDelegate", "setGetGetIntegrityTokenMethodNameDelegate", "getGetIntegrityTokenMethodNameDelegate", "getGetDeviceIntegrityAvailableMethodNameDelegate", "setGetDeviceIntegrityAvailableMethodNameDelegate", "getDeviceIntegrityAvailableMethodNameDelegate", "getGetMagicLoginMethodNameDelegate", "setGetMagicLoginMethodNameDelegate", "getMagicLoginMethodNameDelegate", "getGetMagicLoginEventMethodNameDelegate", "setGetMagicLoginEventMethodNameDelegate", "getMagicLoginEventMethodNameDelegate", "getGetStartDiscoveryValueDelegate", "setGetStartDiscoveryValueDelegate", "getStartDiscoveryValueDelegate", "getGetStopDiscoveryValueDelegate", "setGetStopDiscoveryValueDelegate", "getStopDiscoveryValueDelegate", "getGetStartAdvertisementValueDelegate", "setGetStartAdvertisementValueDelegate", "getStartAdvertisementValueDelegate", "getGetStopAdvertisementValueDelegate", "setGetStopAdvertisementValueDelegate", "getStopAdvertisementValueDelegate", "getGetRequestConnectionValueDelegate", "setGetRequestConnectionValueDelegate", "getRequestConnectionValueDelegate", "getGetEndpointFoundValueDelegate", "setGetEndpointFoundValueDelegate", "getEndpointFoundValueDelegate", "getGetEndpointLostValueDelegate", "setGetEndpointLostValueDelegate", "getEndpointLostValueDelegate", "getGetConnectionInitValueDelegate", "setGetConnectionInitValueDelegate", "getConnectionInitValueDelegate", "getGetClearDeviceListValueDelegate", "setGetClearDeviceListValueDelegate", "getClearDeviceListValueDelegate", "getGetMagicLoginActionKeyDelegate", "setGetMagicLoginActionKeyDelegate", "getMagicLoginActionKeyDelegate", "getGetEndpointIdKeyDelegate", "setGetEndpointIdKeyDelegate", "getEndpointIdKeyDelegate", "getGetEndpointNameKeyDelegate", "setGetEndpointNameKeyDelegate", "getEndpointNameKeyDelegate", "s", "getGetEndpointTypeKeyDelegate", "setGetEndpointTypeKeyDelegate", "getEndpointTypeKeyDelegate", "t", "getGetAuthenticationDigitsKeyDelegate", "setGetAuthenticationDigitsKeyDelegate", "getAuthenticationDigitsKeyDelegate", "u", "getGetCodeKeyDelegate", "setGetCodeKeyDelegate", "getCodeKeyDelegate", "v", "getGetRequestHashKeyDelegate", "setGetRequestHashKeyDelegate", "getRequestHashKeyDelegate", "w", "getGetTimeoutKeyDelegate", "setGetTimeoutKeyDelegate", "getTimeoutKeyDelegate", "x", "getGetTokenKeyDelegate", "setGetTokenKeyDelegate", "getTokenKeyDelegate", "y", "getGetResultKeyDelegate", "setGetResultKeyDelegate", "getResultKeyDelegate", "z", "getGetSupportKeyDelegate", "setGetSupportKeyDelegate", "getSupportKeyDelegate", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f26304a = new a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getProtocolNameDelegate = o.f26343a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getGetIntegrityTokenMethodNameDelegate = k.f26339a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getDeviceIntegrityAvailableMethodNameDelegate = e.f26333a;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginMethodNameDelegate = n.f26342a;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginEventMethodNameDelegate = m.f26341a;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getStartDiscoveryValueDelegate = t.f26348a;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getStopDiscoveryValueDelegate = v.f26350a;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getStartAdvertisementValueDelegate = s.f26347a;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getStopAdvertisementValueDelegate = u.f26349a;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getRequestConnectionValueDelegate = p.f26344a;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointFoundValueDelegate = f.f26334a;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointLostValueDelegate = h.f26336a;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getConnectionInitValueDelegate = d.f26332a;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getClearDeviceListValueDelegate = b.f26330a;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginActionKeyDelegate = l.f26340a;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointIdKeyDelegate = g.f26335a;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointNameKeyDelegate = i.f26337a;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointTypeKeyDelegate = j.f26338a;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getAuthenticationDigitsKeyDelegate = C0445a.f26329a;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getCodeKeyDelegate = c.f26331a;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getRequestHashKeyDelegate = q.f26345a;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getTimeoutKeyDelegate = x.f26352a;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getTokenKeyDelegate = y.f26353a;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getResultKeyDelegate = r.f26346a;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Function0<String> getSupportKeyDelegate = w.f26351a;

    /* JADX INFO: renamed from: nm.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0445a extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0445a f26329a = new C0445a();

        public C0445a() {
            super(0, JNIAccountProtocol.class, "getAuthenticationDigitsKey", "getAuthenticationDigitsKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getAuthenticationDigitsKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26330a = new b();

        public b() {
            super(0, JNIAccountProtocol.class, "getClearDeviceListValue", "getClearDeviceListValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getClearDeviceListValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26331a = new c();

        public c() {
            super(0, JNIAccountProtocol.class, "getCodeKey", "getCodeKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getCodeKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26332a = new d();

        public d() {
            super(0, JNIAccountProtocol.class, "getConnectionInitValue", "getConnectionInitValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getConnectionInitValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26333a = new e();

        public e() {
            super(0, JNIAccountProtocol.class, "getDeviceIntegrityAvailableMethodName", "getDeviceIntegrityAvailableMethodName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getDeviceIntegrityAvailableMethodName();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f26334a = new f();

        public f() {
            super(0, JNIAccountProtocol.class, "getEndpointFoundValue", "getEndpointFoundValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointFoundValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class g extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26335a = new g();

        public g() {
            super(0, JNIAccountProtocol.class, "getEndpointIdKey", "getEndpointIdKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointIdKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f26336a = new h();

        public h() {
            super(0, JNIAccountProtocol.class, "getEndpointLostValue", "getEndpointLostValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointLostValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class i extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f26337a = new i();

        public i() {
            super(0, JNIAccountProtocol.class, "getEndpointNameKey", "getEndpointNameKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointNameKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class j extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f26338a = new j();

        public j() {
            super(0, JNIAccountProtocol.class, "getEndpointTypeKey", "getEndpointTypeKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointTypeKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class k extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f26339a = new k();

        public k() {
            super(0, JNIAccountProtocol.class, "getGetIntegrityTokenMethodName", "getGetIntegrityTokenMethodName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getGetIntegrityTokenMethodName();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class l extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f26340a = new l();

        public l() {
            super(0, JNIAccountProtocol.class, "getMagicLoginActionKey", "getMagicLoginActionKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginActionKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class m extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f26341a = new m();

        public m() {
            super(0, JNIAccountProtocol.class, "getMagicLoginEventMethodName", "getMagicLoginEventMethodName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginEventMethodName();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class n extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f26342a = new n();

        public n() {
            super(0, JNIAccountProtocol.class, "getMagicLoginMethodName", "getMagicLoginMethodName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginMethodName();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class o extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f26343a = new o();

        public o() {
            super(0, JNIAccountProtocol.class, "getProtocolName", "getProtocolName()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getProtocolName();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class p extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f26344a = new p();

        public p() {
            super(0, JNIAccountProtocol.class, "getRequestConnectionValue", "getRequestConnectionValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getRequestConnectionValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class q extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f26345a = new q();

        public q() {
            super(0, JNIAccountProtocol.class, "getRequestHashKey", "getRequestHashKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getRequestHashKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class r extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f26346a = new r();

        public r() {
            super(0, JNIAccountProtocol.class, "getResultKey", "getResultKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getResultKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class s extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f26347a = new s();

        public s() {
            super(0, JNIAccountProtocol.class, "getStartAdvertisementValue", "getStartAdvertisementValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStartAdvertisementValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class t extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f26348a = new t();

        public t() {
            super(0, JNIAccountProtocol.class, "getStartDiscoveryValue", "getStartDiscoveryValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStartDiscoveryValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class u extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f26349a = new u();

        public u() {
            super(0, JNIAccountProtocol.class, "getStopAdvertisementValue", "getStopAdvertisementValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStopAdvertisementValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class v extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f26350a = new v();

        public v() {
            super(0, JNIAccountProtocol.class, "getStopDiscoveryValue", "getStopDiscoveryValue()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStopDiscoveryValue();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class w extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f26351a = new w();

        public w() {
            super(0, JNIAccountProtocol.class, "getSupportKey", "getSupportKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getSupportKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class x extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f26352a = new x();

        public x() {
            super(0, JNIAccountProtocol.class, "getTimeoutKey", "getTimeoutKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getTimeoutKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class y extends kotlin.jvm.internal.k implements Function0<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f26353a = new y();

        public y() {
            super(0, JNIAccountProtocol.class, "getTokenKey", "getTokenKey()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getTokenKey();
        }
    }

    @NotNull
    public static final String a() {
        return getAuthenticationDigitsKeyDelegate.invoke();
    }

    @NotNull
    public static final String b() {
        return getClearDeviceListValueDelegate.invoke();
    }

    @NotNull
    public static final String c() {
        return getCodeKeyDelegate.invoke();
    }

    @NotNull
    public static final String d() {
        return getConnectionInitValueDelegate.invoke();
    }

    @NotNull
    public static final String e() {
        return getDeviceIntegrityAvailableMethodNameDelegate.invoke();
    }

    @NotNull
    public static final String f() {
        return getEndpointFoundValueDelegate.invoke();
    }

    @NotNull
    public static final String g() {
        return getEndpointIdKeyDelegate.invoke();
    }

    @NotNull
    public static final String h() {
        return getEndpointLostValueDelegate.invoke();
    }

    @NotNull
    public static final String i() {
        return getEndpointNameKeyDelegate.invoke();
    }

    @NotNull
    public static final String j() {
        return getEndpointTypeKeyDelegate.invoke();
    }

    @NotNull
    public static final String k() {
        return getGetIntegrityTokenMethodNameDelegate.invoke();
    }

    @NotNull
    public static final String l() {
        return getMagicLoginActionKeyDelegate.invoke();
    }

    @NotNull
    public static final String m() {
        return getMagicLoginEventMethodNameDelegate.invoke();
    }

    @NotNull
    public static final String n() {
        return getMagicLoginMethodNameDelegate.invoke();
    }

    @NotNull
    public static final String o() {
        return getProtocolNameDelegate.invoke();
    }

    @NotNull
    public static final String p() {
        return getResultKeyDelegate.invoke();
    }

    @NotNull
    public static final String q() {
        return getSupportKeyDelegate.invoke();
    }

    @NotNull
    public static final String r() {
        return getTokenKeyDelegate.invoke();
    }
}
