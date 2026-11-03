package ci;

import iu.g1;
import iu.p0;
import iu.q0;
import iu.x;
import iu.z;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lci/n;", "Lokhttp3/Dns;", "systemDns", "<init>", "(Lokhttp3/Dns;)V", "", "hostname", "", "d", "(Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "e", "()V", "a", "Lokhttp3/Dns;", "Ljava/util/concurrent/ConcurrentHashMap;", "Liu/x;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements Dns {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final n f4997d = new n(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Dns systemDns;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<List<InetAddress>>> prewarmingFutures;

    /* JADX INFO: renamed from: ci.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lci/n$a;", "", "<init>", "()V", "Lci/n;", "Instance", "Lci/n;", "a", "()Lci/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            return n.f4997d;
        }

        public Companion() {
        }
    }

    @nt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", f = "PrewarmableDnsResolver.kt", l = {79}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "", "Ljava/net/InetAddress;", "<anonymous>", "(Liu/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super List<? extends InetAddress>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f4999t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<List<InetAddress>> f5000u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n f5001v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f5002w;

        @nt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f5003t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<List<InetAddress>> f5004u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ n f5005v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f5006w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x<List<InetAddress>> xVar, n nVar, String str, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f5004u = xVar;
                this.f5005v = nVar;
                this.f5006w = str;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f5004u, this.f5005v, this.f5006w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f5003t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                try {
                    this.f5004u.v(this.f5005v.systemDns.lookup(this.f5006w));
                } catch (UnknownHostException unused) {
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<List<InetAddress>> xVar, n nVar, String str, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f5000u = xVar;
            this.f5001v = nVar;
            this.f5002w = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f5000u, this.f5001v, this.f5002w, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super List<? extends InetAddress>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f4999t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            iu.k.d(q0.a(g1.b()), null, null, new a(this.f5000u, this.f5001v, this.f5002w, null), 3, null);
            x<List<InetAddress>> xVar = this.f5000u;
            this.f4999t = 1;
            Object objN = xVar.n(this);
            return objN == objE ? objE : objN;
        }
    }

    @nt.f(c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f5007t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f5007t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            return Unit.f22938a;
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
                xVarC.v(this.systemDns.lookup(hostname));
            } catch (UnknownHostException e10) {
                if (xVarC.u(e10)) {
                    this.prewarmingFutures.remove(hostname, xVarC);
                }
            }
        }
    }

    public final void e() {
        iu.k.d(q0.a(g1.b()), null, null, new c(null), 3, null);
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
            return xVar.d() ? xVar.f() : (List) iu.j.b(null, new b(xVar, this, hostname, null), 1, null);
        } catch (UnknownHostException unused) {
            return this.systemDns.lookup(hostname);
        }
    }

    public /* synthetic */ n(Dns dns, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dns.SYSTEM : dns);
    }
}
