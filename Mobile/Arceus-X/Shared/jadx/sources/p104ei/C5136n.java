package p104ei;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7877j;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7945z;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ei.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Lei/n;", "Lokhttp3/Dns;", "systemDns", "<init>", "(Lokhttp3/Dns;)V", "", "hostname", "", "d", "(Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "e", "()V", "a", "Lokhttp3/Dns;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lku/x;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5136n implements Dns {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C5136n f20015d = new C5136n(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Dns systemDns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, InterfaceC7937x<List<InetAddress>>> prewarmingFutures;

    /* JADX INFO: renamed from: ei.n$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lei/n$a;", "", "<init>", "()V", "Lei/n;", "Instance", "Lei/n;", "a", "()Lei/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ei.n.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C5136n m23946a() {
            return C5136n.f20015d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ei.n$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "Ljava/net/InetAddress;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", m39664f = "PrewarmableDnsResolver.kt", m39665l = {79}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super List<? extends InetAddress>>, Object> {

        /* JADX INFO: renamed from: t */
        public int f20018t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC7937x<List<InetAddress>> f20019u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C5136n f20020v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f20021w;

        /* JADX INFO: renamed from: ei.n$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", m39664f = "PrewarmableDnsResolver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f20022t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ InterfaceC7937x<List<InetAddress>> f20023u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C5136n f20024v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ String f20025w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC7937x<List<InetAddress>> interfaceC7937x, C5136n c5136n, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f20023u = interfaceC7937x;
                this.f20024v = c5136n;
                this.f20025w = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f20023u, this.f20024v, this.f20025w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f20022t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                try {
                    this.f20023u.mo32930s(this.f20024v.systemDns.lookup(this.f20025w));
                } catch (UnknownHostException unused) {
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC7937x<List<InetAddress>> interfaceC7937x, C5136n c5136n, String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f20019u = interfaceC7937x;
            this.f20020v = c5136n;
            this.f20021w = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f20019u, this.f20020v, this.f20021w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f20018t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new a(this.f20019u, this.f20020v, this.f20021w, null), 3, null);
            InterfaceC7937x<List<InetAddress>> interfaceC7937x = this.f20019u;
            this.f20018t = 1;
            Object objMo32927B = interfaceC7937x.mo32927B(this);
            return objMo32927B == objM38805e ? objM38805e : objMo32927B;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<? extends InetAddress>> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: ei.n$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", m39664f = "PrewarmableDnsResolver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f20026t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f20026t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5136n(@NotNull Dns systemDns) {
        Intrinsics.checkNotNullParameter(systemDns, "systemDns");
        this.systemDns = systemDns;
        this.prewarmingFutures = new ConcurrentHashMap<>();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C5136n m23943c() {
        return INSTANCE.m23946a();
    }

    /* JADX INFO: renamed from: d */
    public final void m23944d(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        InterfaceC7937x<List<InetAddress>> interfaceC7937xM32935c = C7945z.m32935c(null, 1, null);
        if (this.prewarmingFutures.putIfAbsent(hostname, interfaceC7937xM32935c) == null) {
            try {
                m23945e();
                interfaceC7937xM32935c.mo32930s(this.systemDns.lookup(hostname));
            } catch (UnknownHostException e10) {
                if (interfaceC7937xM32935c.mo32929r(e10)) {
                    this.prewarmingFutures.remove(hostname, interfaceC7937xM32935c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m23945e() {
        C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new c(null), 3, null);
    }

    @Override // okhttp3.Dns
    @NotNull
    public List<InetAddress> lookup(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        InterfaceC7937x<List<InetAddress>> interfaceC7937x = this.prewarmingFutures.get(hostname);
        if (interfaceC7937x == null) {
            return this.systemDns.lookup(hostname);
        }
        try {
            return interfaceC7937x.mo32598d() ? interfaceC7937x.mo32928g() : (List) C7877j.m32694b(null, new b(interfaceC7937x, this, hostname, null), 1, null);
        } catch (UnknownHostException unused) {
            return this.systemDns.lookup(hostname);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap okhttp3.Dns:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap okhttp3.Dns:0x0004: SGET  A[WRAPPED] (LINE:3) okhttp3.Dns.SYSTEM okhttp3.Dns) : (r1v0 okhttp3.Dns))
     A[MD:(okhttp3.Dns):void (m)] (LINE:3) call: ei.n.<init>(okhttp3.Dns):void type: THIS */
    public /* synthetic */ C5136n(Dns dns, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
