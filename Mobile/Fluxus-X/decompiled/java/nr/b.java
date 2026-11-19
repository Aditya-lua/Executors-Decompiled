package nr;

import android.content.Context;
import av.g1;
import av.g3;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.h;
import dv.i;
import gu.l;
import gu.m;
import ln.o;
import ls.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\fB\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnr/b;", "Lln/o;", "Lnr/d$b;", "Lls/j;", "Lnr/d;", "snaClient", BuildConfig.FLAVOR, "timeoutSeconds", "<init>", "(Lnr/d;I)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lnr/d;", "c", "I", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o<d.b>, j<d.b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final d snaClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int timeoutSeconds;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnr/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lnr/a;", "config", BuildConfig.FLAVOR, "timeoutSeconds", "Lnr/b;", "a", "(Landroid/content/Context;Lnr/a;I)Lnr/b;", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        @NotNull
        public final b a(@NotNull Context applicationContext, @NotNull SilentNetworkAuthConfig config, int timeoutSeconds) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(config, "config");
            return new b(f.f26614a.a(applicationContext, config), timeoutSeconds);
        }
    }

    /* JADX INFO: renamed from: nr.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lnr/d$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1", f = "SilentNetworkAuthWorker.kt", l = {24, 33, 39}, m = "invokeSuspend")
    public static final class C0531b extends m implements Function2<i<? super d.b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26597t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26598u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26599v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f26600w;

        /* JADX INFO: renamed from: nr.b$b$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lnr/d$b;", "<anonymous>", "(Lav/p0;)Lnr/d$b;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthWorker$run$1$response$1", f = "SilentNetworkAuthWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, eu.b<? super d.b>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26602t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ d f26603u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f26603u = dVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f26603u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super d.b> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f26602t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return this.f26603u.a();
            }
        }

        public C0531b(eu.b<? super C0531b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            C0531b c0531b = b.this.new C0531b(bVar);
            c0531b.f26600w = obj;
            return c0531b;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0091  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d0, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L27;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:24:0x0091, please report this as an issue */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object error;
            i iVar = (i) this.f26600w;
            Object objE = fu.c.e();
            int i10 = this.f26599v;
            if (i10 != 0) {
                if (i10 == 1) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i10 == 2) {
                    dVar = (d) this.f26597t;
                    zt.o.b(obj);
                    error = (d.b) obj;
                    if (error == null) {
                        error = new d.b.Error(e.TimeoutError.getKey(), "SNA timed out after " + b.this.timeoutSeconds + "s");
                    }
                    this.f26600w = l.a(iVar);
                    this.f26597t = l.a(dVar);
                    this.f26598u = l.a(error);
                    this.f26599v = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            dVar = b.this.snaClient;
            if (dVar == null) {
                e eVar = e.IntegrationError;
                d.b.Error error2 = new d.b.Error(eVar.getKey(), eVar.getMessage());
                this.f26600w = l.a(iVar);
                this.f26597t = l.a(dVar);
                this.f26599v = 1;
            } else {
                long j10 = ((long) b.this.timeoutSeconds) * 1000;
                a aVar = new a(dVar, null);
                this.f26600w = iVar;
                this.f26597t = l.a(dVar);
                this.f26599v = 2;
                obj = g3.e(j10, aVar, this);
                if (obj != objE) {
                    error = (d.b) obj;
                    if (error == null) {
                        error = new d.b.Error(e.TimeoutError.getKey(), "SNA timed out after " + b.this.timeoutSeconds + "s");
                    }
                    this.f26600w = l.a(iVar);
                    this.f26597t = l.a(dVar);
                    this.f26598u = l.a(error);
                    this.f26599v = 3;
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super d.b> iVar, eu.b<? super Unit> bVar) {
            return ((C0531b) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public b(@Nullable d dVar, int i10) {
        this.snaClient = dVar;
        this.timeoutSeconds = i10;
    }

    @Override // ln.o
    public boolean a(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof b;
    }

    @Override // ls.j
    public boolean b(@NotNull j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull j<?> jVar) {
        return super.c(jVar);
    }

    @Override // ln.o, ls.j
    @NotNull
    public h<d.b> run() {
        return dv.j.y(dv.j.w(new C0531b(null)), g1.a());
    }
}
