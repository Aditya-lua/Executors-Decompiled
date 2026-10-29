package ei;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import ku.q0;
import ku.x;
import ku.z;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lei/n;", "Lokhttp3/Dns;", "systemDns", "<init>", "(Lokhttp3/Dns;)V", "", "hostname", "", "d", "(Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "e", "()V", "a", "Lokhttp3/Dns;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lku/x;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements Dns {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final n f15585d = new n(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Dns systemDns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<List<InetAddress>>> prewarmingFutures;

    /* JADX INFO: renamed from: ei.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lei/n$a;", "", "<init>", "()V", "Lei/n;", "Instance", "Lei/n;", "a", "()Lei/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            return n.f15585d;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "Ljava/net/InetAddress;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", f = "PrewarmableDnsResolver.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super List<? extends InetAddress>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15587t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<List<InetAddress>> f15588u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n f15589v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f15590w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f15591t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<List<InetAddress>> f15592u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ n f15593v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f15594w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x<List<InetAddress>> xVar, n nVar, String str, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f15592u = xVar;
                this.f15593v = nVar;
                this.f15594w = str;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f15592u, this.f15593v, this.f15594w, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f15591t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                try {
                    this.f15592u.s(this.f15593v.systemDns.lookup(this.f15594w));
                } catch (UnknownHostException unused) {
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<List<InetAddress>> xVar, n nVar, String str, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f15588u = xVar;
            this.f15589v = nVar;
            this.f15590w = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f15588u, this.f15589v, this.f15590w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f15587t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            ku.k.d(q0.a(g1.b()), null, null, new a(this.f15588u, this.f15589v, this.f15590w, null), 3, null);
            x<List<InetAddress>> xVar = this.f15588u;
            this.f15587t = 1;
            Object objB = xVar.B(this);
            return objB == objE ? objE : objB;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super List<? extends InetAddress>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15595t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f15595t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public n(@NotNull Dns systemDns) {
        Intrinsics.checkNotNullParameter(systemDns, "systemDns");
        this.systemDns = systemDns;
        this.prewarmingFutures = new ConcurrentHashMap<>();
    }

    @NotNull
    public static final n c() {
        return INSTANCE.a();
    }

    public final void d(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> xVarC = z.c(null, 1, null);
        if (this.prewarmingFutures.putIfAbsent(hostname, xVarC) == null) {
            try {
                e();
                xVarC.s(this.systemDns.lookup(hostname));
            } catch (UnknownHostException e10) {
                if (xVarC.r(e10)) {
                    this.prewarmingFutures.remove(hostname, xVarC);
                }
            }
        }
    }

    public final void e() {
        ku.k.d(q0.a(g1.b()), null, null, new c(null), 3, null);
    }

    @Override // okhttp3.Dns
    @NotNull
    public List<InetAddress> lookup(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> xVar = this.prewarmingFutures.get(hostname);
        if (xVar == null) {
            return this.systemDns.lookup(hostname);
        }
        try {
            return xVar.d() ? xVar.g() : (List) ku.j.b(null, new b(xVar, this, hostname, null), 1, null);
        } catch (UnknownHostException unused) {
            return this.systemDns.lookup(hostname);
        }
    }

    public /* synthetic */ n(Dns dns, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
