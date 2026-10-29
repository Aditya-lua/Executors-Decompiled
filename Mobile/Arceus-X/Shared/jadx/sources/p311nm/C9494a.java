package p311nm;

import com.roblox.universalapp.account.JNIAccountProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7744k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: nm.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bW\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0006J\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0006R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b%\u0010\u001b\"\u0004\b&\u0010\u001dR(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR(\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR(\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR(\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b4\u0010\u001b\"\u0004\b5\u0010\u001dR(\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR(\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR(\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b=\u0010\u001b\"\u0004\b>\u0010\u001dR(\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR(\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001dR(\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0019\u001a\u0004\bF\u0010\u001b\"\u0004\bG\u0010\u001dR(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001dR(\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u0010\u001dR(\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0019\u001a\u0004\bP\u0010\u001b\"\u0004\bQ\u0010\u001dR(\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010\u0019\u001a\u0004\bT\u0010\u001b\"\u0004\bU\u0010\u001dR(\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010\u0019\u001a\u0004\bX\u0010\u001b\"\u0004\bY\u0010\u001dR(\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\u0019\u001a\u0004\b\\\u0010\u001b\"\u0004\b]\u0010\u001dR(\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010\u0019\u001a\u0004\b`\u0010\u001b\"\u0004\ba\u0010\u001dR(\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010\u0019\u001a\u0004\bd\u0010\u001b\"\u0004\be\u0010\u001dR(\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010\u0019\u001a\u0004\bh\u0010\u001b\"\u0004\bi\u0010\u001dR(\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010\u0019\u001a\u0004\bl\u0010\u001b\"\u0004\bm\u0010\u001d¨\u0006o"}, m31665d2 = {"Lnm/a;", "", "<init>", "()V", "", "o", "()Ljava/lang/String;", "k", "e", "n", "m", "f", "h", "d", "b", "l", "g", "i", "j", "a", "c", "r", "p", "q", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getGetProtocolNameDelegate", "()Lkotlin/jvm/functions/Function0;", "setGetProtocolNameDelegate", "(Lkotlin/jvm/functions/Function0;)V", "getProtocolNameDelegate", "getGetGetIntegrityTokenMethodNameDelegate", "setGetGetIntegrityTokenMethodNameDelegate", "getGetIntegrityTokenMethodNameDelegate", "getGetDeviceIntegrityAvailableMethodNameDelegate", "setGetDeviceIntegrityAvailableMethodNameDelegate", "getDeviceIntegrityAvailableMethodNameDelegate", "getGetMagicLoginMethodNameDelegate", "setGetMagicLoginMethodNameDelegate", "getMagicLoginMethodNameDelegate", "getGetMagicLoginEventMethodNameDelegate", "setGetMagicLoginEventMethodNameDelegate", "getMagicLoginEventMethodNameDelegate", "getGetStartDiscoveryValueDelegate", "setGetStartDiscoveryValueDelegate", "getStartDiscoveryValueDelegate", "getGetStopDiscoveryValueDelegate", "setGetStopDiscoveryValueDelegate", "getStopDiscoveryValueDelegate", "getGetStartAdvertisementValueDelegate", "setGetStartAdvertisementValueDelegate", "getStartAdvertisementValueDelegate", "getGetStopAdvertisementValueDelegate", "setGetStopAdvertisementValueDelegate", "getStopAdvertisementValueDelegate", "getGetRequestConnectionValueDelegate", "setGetRequestConnectionValueDelegate", "getRequestConnectionValueDelegate", "getGetEndpointFoundValueDelegate", "setGetEndpointFoundValueDelegate", "getEndpointFoundValueDelegate", "getGetEndpointLostValueDelegate", "setGetEndpointLostValueDelegate", "getEndpointLostValueDelegate", "getGetConnectionInitValueDelegate", "setGetConnectionInitValueDelegate", "getConnectionInitValueDelegate", "getGetClearDeviceListValueDelegate", "setGetClearDeviceListValueDelegate", "getClearDeviceListValueDelegate", "getGetMagicLoginActionKeyDelegate", "setGetMagicLoginActionKeyDelegate", "getMagicLoginActionKeyDelegate", "getGetEndpointIdKeyDelegate", "setGetEndpointIdKeyDelegate", "getEndpointIdKeyDelegate", "getGetEndpointNameKeyDelegate", "setGetEndpointNameKeyDelegate", "getEndpointNameKeyDelegate", "s", "getGetEndpointTypeKeyDelegate", "setGetEndpointTypeKeyDelegate", "getEndpointTypeKeyDelegate", "t", "getGetAuthenticationDigitsKeyDelegate", "setGetAuthenticationDigitsKeyDelegate", "getAuthenticationDigitsKeyDelegate", "u", "getGetCodeKeyDelegate", "setGetCodeKeyDelegate", "getCodeKeyDelegate", "v", "getGetRequestHashKeyDelegate", "setGetRequestHashKeyDelegate", "getRequestHashKeyDelegate", "w", "getGetTimeoutKeyDelegate", "setGetTimeoutKeyDelegate", "getTimeoutKeyDelegate", "x", "getGetTokenKeyDelegate", "setGetTokenKeyDelegate", "getTokenKeyDelegate", "y", "getGetResultKeyDelegate", "setGetResultKeyDelegate", "getResultKeyDelegate", "z", "getGetSupportKeyDelegate", "setGetSupportKeyDelegate", "getSupportKeyDelegate", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9494a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C9494a f34115a = new C9494a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getProtocolNameDelegate = o.f34155a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getGetIntegrityTokenMethodNameDelegate = k.f34151a;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getDeviceIntegrityAvailableMethodNameDelegate = e.f34145a;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginMethodNameDelegate = n.f34154a;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginEventMethodNameDelegate = m.f34153a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getStartDiscoveryValueDelegate = t.f34160a;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getStopDiscoveryValueDelegate = v.f34162a;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getStartAdvertisementValueDelegate = s.f34159a;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getStopAdvertisementValueDelegate = u.f34161a;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getRequestConnectionValueDelegate = p.f34156a;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointFoundValueDelegate = f.f34146a;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointLostValueDelegate = h.f34148a;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getConnectionInitValueDelegate = d.f34144a;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getClearDeviceListValueDelegate = b.f34142a;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getMagicLoginActionKeyDelegate = l.f34152a;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointIdKeyDelegate = g.f34147a;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointNameKeyDelegate = i.f34149a;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getEndpointTypeKeyDelegate = j.f34150a;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getAuthenticationDigitsKeyDelegate = a.f34141a;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getCodeKeyDelegate = c.f34143a;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getRequestHashKeyDelegate = q.f34157a;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getTimeoutKeyDelegate = x.f34164a;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getTokenKeyDelegate = y.f34165a;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getResultKeyDelegate = r.f34158a;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public static Function0<String> getSupportKeyDelegate = w.f34163a;

    /* JADX INFO: renamed from: nm.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final a f34141a = new a();

        public a() {
            super(0, JNIAccountProtocol.class, "getAuthenticationDigitsKey", "getAuthenticationDigitsKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getAuthenticationDigitsKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final b f34142a = new b();

        public b() {
            super(0, JNIAccountProtocol.class, "getClearDeviceListValue", "getClearDeviceListValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getClearDeviceListValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final c f34143a = new c();

        public c() {
            super(0, JNIAccountProtocol.class, "getCodeKey", "getCodeKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getCodeKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class d extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final d f34144a = new d();

        public d() {
            super(0, JNIAccountProtocol.class, "getConnectionInitValue", "getConnectionInitValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getConnectionInitValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class e extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final e f34145a = new e();

        public e() {
            super(0, JNIAccountProtocol.class, "getDeviceIntegrityAvailableMethodName", "getDeviceIntegrityAvailableMethodName()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getDeviceIntegrityAvailableMethodName();
        }
    }

    /* JADX INFO: renamed from: nm.a$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class f extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final f f34146a = new f();

        public f() {
            super(0, JNIAccountProtocol.class, "getEndpointFoundValue", "getEndpointFoundValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointFoundValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class g extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final g f34147a = new g();

        public g() {
            super(0, JNIAccountProtocol.class, "getEndpointIdKey", "getEndpointIdKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointIdKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class h extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final h f34148a = new h();

        public h() {
            super(0, JNIAccountProtocol.class, "getEndpointLostValue", "getEndpointLostValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointLostValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$i */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class i extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final i f34149a = new i();

        public i() {
            super(0, JNIAccountProtocol.class, "getEndpointNameKey", "getEndpointNameKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointNameKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$j */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class j extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final j f34150a = new j();

        public j() {
            super(0, JNIAccountProtocol.class, "getEndpointTypeKey", "getEndpointTypeKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getEndpointTypeKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$k */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class k extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final k f34151a = new k();

        public k() {
            super(0, JNIAccountProtocol.class, "getGetIntegrityTokenMethodName", "getGetIntegrityTokenMethodName()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getGetIntegrityTokenMethodName();
        }
    }

    /* JADX INFO: renamed from: nm.a$l */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class l extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final l f34152a = new l();

        public l() {
            super(0, JNIAccountProtocol.class, "getMagicLoginActionKey", "getMagicLoginActionKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginActionKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$m */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class m extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final m f34153a = new m();

        public m() {
            super(0, JNIAccountProtocol.class, "getMagicLoginEventMethodName", "getMagicLoginEventMethodName()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginEventMethodName();
        }
    }

    /* JADX INFO: renamed from: nm.a$n */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class n extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final n f34154a = new n();

        public n() {
            super(0, JNIAccountProtocol.class, "getMagicLoginMethodName", "getMagicLoginMethodName()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getMagicLoginMethodName();
        }
    }

    /* JADX INFO: renamed from: nm.a$o */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class o extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final o f34155a = new o();

        public o() {
            super(0, JNIAccountProtocol.class, "getProtocolName", "getProtocolName()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getProtocolName();
        }
    }

    /* JADX INFO: renamed from: nm.a$p */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class p extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final p f34156a = new p();

        public p() {
            super(0, JNIAccountProtocol.class, "getRequestConnectionValue", "getRequestConnectionValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getRequestConnectionValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$q */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class q extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final q f34157a = new q();

        public q() {
            super(0, JNIAccountProtocol.class, "getRequestHashKey", "getRequestHashKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getRequestHashKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$r */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class r extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final r f34158a = new r();

        public r() {
            super(0, JNIAccountProtocol.class, "getResultKey", "getResultKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getResultKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$s */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class s extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final s f34159a = new s();

        public s() {
            super(0, JNIAccountProtocol.class, "getStartAdvertisementValue", "getStartAdvertisementValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStartAdvertisementValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$t */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class t extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final t f34160a = new t();

        public t() {
            super(0, JNIAccountProtocol.class, "getStartDiscoveryValue", "getStartDiscoveryValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStartDiscoveryValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$u */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class u extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final u f34161a = new u();

        public u() {
            super(0, JNIAccountProtocol.class, "getStopAdvertisementValue", "getStopAdvertisementValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStopAdvertisementValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$v */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class v extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final v f34162a = new v();

        public v() {
            super(0, JNIAccountProtocol.class, "getStopDiscoveryValue", "getStopDiscoveryValue()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getStopDiscoveryValue();
        }
    }

    /* JADX INFO: renamed from: nm.a$w */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class w extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final w f34163a = new w();

        public w() {
            super(0, JNIAccountProtocol.class, "getSupportKey", "getSupportKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getSupportKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$x */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class x extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final x f34164a = new x();

        public x() {
            super(0, JNIAccountProtocol.class, "getTimeoutKey", "getTimeoutKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getTimeoutKey();
        }
    }

    /* JADX INFO: renamed from: nm.a$y */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class y extends C7744k implements Function0<String> {

        /* JADX INFO: renamed from: a */
        public static final y f34165a = new y();

        public y() {
            super(0, JNIAccountProtocol.class, "getTokenKey", "getTokenKey()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return JNIAccountProtocol.getTokenKey();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m37388a() {
        return getAuthenticationDigitsKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m37389b() {
        return getClearDeviceListValueDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m37390c() {
        return getCodeKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m37391d() {
        return getConnectionInitValueDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m37392e() {
        return getDeviceIntegrityAvailableMethodNameDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m37393f() {
        return getEndpointFoundValueDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m37394g() {
        return getEndpointIdKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m37395h() {
        return getEndpointLostValueDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m37396i() {
        return getEndpointNameKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m37397j() {
        return getEndpointTypeKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final String m37398k() {
        return getGetIntegrityTokenMethodNameDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m37399l() {
        return getMagicLoginActionKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m37400m() {
        return getMagicLoginEventMethodNameDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m37401n() {
        return getMagicLoginMethodNameDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m37402o() {
        return getProtocolNameDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public static final String m37403p() {
        return getResultKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public static final String m37404q() {
        return getSupportKeyDelegate.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public static final String m37405r() {
        return getTokenKeyDelegate.invoke();
    }
}
