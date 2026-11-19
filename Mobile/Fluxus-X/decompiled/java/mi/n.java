package mi;

import av.g1;
import av.p0;
import av.q0;
import av.x;
import av.z;
import com.github.luben.zstd.BuildConfig;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lmi/n;", "Lmv/r;", "systemDns", "<init>", "(Lmv/r;)V", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "e", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "a", "(Ljava/lang/String;)Ljava/util/List;", "f", "()V", "c", "Lmv/r;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lav/x;", "d", "Ljava/util/concurrent/ConcurrentHashMap;", "prewarmingFutures", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements mv.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final n f23271f = new n(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.r systemDns;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ConcurrentHashMap<String, x<List<InetAddress>>> prewarmingFutures;

    /* JADX INFO: renamed from: mi.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lmi/n$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmi/n;", "Instance", "Lmi/n;", "a", "()Lmi/n;", "getInstance$annotations", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final n a() {
            return n.f23271f;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "Ljava/net/InetAddress;", "<anonymous>", "(Lav/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1", f = "PrewarmableDnsResolver.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super List<? extends InetAddress>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23274t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ x<List<InetAddress>> f23275u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n f23276v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f23277w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f23278t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ x<List<InetAddress>> f23279u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ n f23280v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f23281w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x<List<InetAddress>> xVar, n nVar, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f23279u = xVar;
                this.f23280v = nVar;
                this.f23281w = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f23279u, this.f23280v, this.f23281w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f23278t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                try {
                    this.f23279u.s(this.f23280v.systemDns.a(this.f23281w));
                } catch (UnknownHostException unused) {
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x<List<InetAddress>> xVar, n nVar, String str, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f23275u = xVar;
            this.f23276v = nVar;
            this.f23277w = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f23275u, this.f23276v, this.f23277w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super List<? extends InetAddress>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23274t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return obj;
            }
            zt.o.b(obj);
            av.k.d(q0.a(g1.b()), null, null, new a(this.f23275u, this.f23276v, this.f23277w, null), 3, null);
            x<List<InetAddress>> xVar = this.f23275u;
            this.f23274t = 1;
            Object objY = xVar.y(this);
            return objY == objE ? objE : objY;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.http.PrewarmableDnsResolver$prewarmIOThread$1", f = "PrewarmableDnsResolver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23282t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f23282t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return Unit.f21506a;
        }
    }

    public n(@NotNull mv.r systemDns) {
        Intrinsics.checkNotNullParameter(systemDns, "systemDns");
        this.systemDns = systemDns;
        this.prewarmingFutures = new ConcurrentHashMap<>();
    }

    @NotNull
    public static final n d() {
        return INSTANCE.a();
    }

    @Override // mv.r
    @NotNull
    public List<InetAddress> a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> xVar = this.prewarmingFutures.get(hostname);
        if (xVar == null) {
            return this.systemDns.a(hostname);
        }
        try {
            return xVar.d() ? xVar.f() : (List) av.j.b(null, new b(xVar, this, hostname, null), 1, null);
        } catch (UnknownHostException unused) {
            return this.systemDns.a(hostname);
        }
    }

    public final void e(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        x<List<InetAddress>> xVarC = z.c(null, 1, null);
        if (this.prewarmingFutures.putIfAbsent(hostname, xVarC) == null) {
            try {
                f();
                xVarC.s(this.systemDns.a(hostname));
            } catch (UnknownHostException e10) {
                if (xVarC.r(e10)) {
                    this.prewarmingFutures.remove(hostname, xVarC);
                }
            }
        }
    }

    public final void f() {
        av.k.d(q0.a(g1.b()), null, null, new c(null), 3, null);
    }

    public /* synthetic */ n(mv.r rVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? mv.r.b : rVar);
    }
}
