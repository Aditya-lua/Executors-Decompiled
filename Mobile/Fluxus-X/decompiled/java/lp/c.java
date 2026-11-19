package lp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.p000lifecycle.h0;
import av.g1;
import av.n2;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018#BI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Llp/c;", "Lls/j;", "Llp/c$b;", "Lln/o;", "Landroid/content/Context;", "applicationContext", "Lg/d;", "Laq/b;", "customTabsLauncher", BuildConfig.FLAVOR, "url", "redirectPath", "Llp/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "<init>", "(Landroid/content/Context;Lg/d;Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)V", "Ldv/h;", "run", "()Ldv/h;", BuildConfig.FLAVOR, "k", "(Leu/b;)Ljava/lang/Object;", "b", "Landroid/content/Context;", "c", "Lg/d;", "d", "Ljava/lang/String;", "e", "f", "Llp/a;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "a", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ls.j<b>, ln.o<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.d<aq.b> customTabsLauncher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String redirectPath;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BrowserSelection browserSelection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Llp/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "url", "redirectPath", "Llp/a;", "browserSelection", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;", "integrationStepBrowserType", "Llp/c;", "a", "(Ljava/lang/String;Ljava/lang/String;Llp/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Llp/c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llp/c$b;", BuildConfig.FLAVOR, "a", "Llp/c$b$a;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llp/c$b$a;", "Llp/c$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f22386a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 456691500;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }
        }
    }

    /* JADX INFO: renamed from: lp.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Llp/c$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1", f = "IntegrationBrowserWorker.kt", l = {61, 68, 71, 90, 92}, m = "invokeSuspend")
    public static final class C0440c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22387t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f22388u;

        /* JADX INFO: renamed from: lp.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$1", f = "IntegrationBrowserWorker.kt", l = {66}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f22390t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f22391u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c f22392v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f22392v = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f22392v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f22391u;
                if (i10 == 0) {
                    zt.o.b(obj);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f22392v.url));
                    intent.addFlags(268435456);
                    this.f22392v.applicationContext.startActivity(intent);
                    c cVar = this.f22392v;
                    this.f22390t = gu.l.a(intent);
                    this.f22391u = 1;
                    if (cVar.k(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: lp.c$c$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker$run$1$2", f = "IntegrationBrowserWorker.kt", l = {}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f22393t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ c f22394u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f22394u = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f22394u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                aq.b cVar;
                fu.c.e();
                if (this.f22393t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                g.d dVar = this.f22394u.customTabsLauncher;
                if (this.f22394u.browserSelection.getSupportsAuthTab()) {
                    v.b bVarA = new v.b.C0695b().a();
                    Intrinsics.checkNotNullExpressionValue(bVarA, "build(...)");
                    cVar = new aq.a(bVarA, this.f22394u.url, h.f22404a.a(this.f22394u.url), this.f22394u.redirectPath, this.f22394u.browserSelection.getPackageName());
                } else {
                    w.d dVarA = new w.d.e().a();
                    Intrinsics.checkNotNullExpressionValue(dVarA, "build(...)");
                    cVar = new aq.c(dVarA, this.f22394u.url, this.f22394u.browserSelection.getPackageName());
                }
                dVar.b(cVar);
                return Unit.f21506a;
            }
        }

        /* JADX INFO: renamed from: lp.c$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0441c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f22395a;

            static {
                int[] iArr = new int[NextStep.Integration.IntegrationStepBrowserType.values().length];
                try {
                    iArr[NextStep.Integration.IntegrationStepBrowserType.External.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NextStep.Integration.IntegrationStepBrowserType.AuthSession.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f22395a = iArr;
            }
        }

        public C0440c(eu.b<? super C0440c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            C0440c c0440c = c.this.new C0440c(bVar);
            c0440c.f22388u = obj;
            return c0440c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (r0.emit(r10, r9) == r1) goto L34;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            dv.h hVarN;
            dv.i iVar = (dv.i) this.f22388u;
            Object objE = fu.c.e();
            int i10 = this.f22387t;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            zt.o.b(obj);
                            hVarN = dv.j.N(new aq.h(), 1);
                            this.f22388u = iVar;
                            this.f22387t = 4;
                            if (dv.n.c(hVarN, null, this, 1, null) != objE) {
                            }
                            return objE;
                        }
                        if (i10 == 4) {
                            zt.o.b(obj);
                        } else if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.a aVar = b.a.f22386a;
                        this.f22388u = gu.l.a(iVar);
                        this.f22387t = 5;
                    }
                    zt.o.b(obj);
                } else {
                    zt.o.b(obj);
                    b.a aVar2 = b.a.f22386a;
                    this.f22388u = gu.l.a(iVar);
                    this.f22387t = 2;
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            int i11 = C0441c.f22395a[c.this.integrationStepBrowserType.ordinal()];
            if (i11 == 1) {
                n2 n2VarC = g1.c();
                a aVar3 = new a(c.this, null);
                this.f22388u = iVar;
                this.f22387t = 1;
                if (av.i.g(n2VarC, aVar3, this) != objE) {
                    b.a aVar4 = b.a.f22386a;
                    this.f22388u = gu.l.a(iVar);
                    this.f22387t = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new zt.l();
                }
                n2 n2VarC2 = g1.c();
                b bVar = new b(c.this, null);
                this.f22388u = iVar;
                this.f22387t = 3;
                if (av.i.g(n2VarC2, bVar, this) != objE) {
                    hVarN = dv.j.N(new aq.h(), 1);
                    this.f22388u = iVar;
                    this.f22387t = 4;
                    if (dv.n.c(hVarN, null, this, 1, null) != objE) {
                        b.a aVar5 = b.a.f22386a;
                        this.f22388u = gu.l.a(iVar);
                        this.f22387t = 5;
                    }
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((C0440c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f22396a;

        public d(e eVar) {
            this.f22396a = eVar;
        }

        public final void a(Throwable th2) {
            h0.INSTANCE.a().a().d(this.f22396a);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"lp/c$e", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onPause", "(Landroidx/lifecycle/s;)V", "onResume", BuildConfig.FLAVOR, "a", "Z", "hasLeftApp", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements androidx.p000lifecycle.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean hasLeftApp;
        public final /* synthetic */ av.n<Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(av.n<? super Unit> nVar) {
            this.b = nVar;
        }

        @Override // androidx.p000lifecycle.f
        public void onCreate(androidx.p000lifecycle.s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onDestroy(androidx.p000lifecycle.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onPause(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.hasLeftApp = true;
        }

        @Override // androidx.p000lifecycle.f
        public void onResume(androidx.p000lifecycle.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (this.hasLeftApp) {
                h0.INSTANCE.a().a().d(this);
                if (this.b.b()) {
                    av.n<Unit> nVar = this.b;
                    zt.n.Companion companion = zt.n.INSTANCE;
                    nVar.resumeWith(zt.n.b(Unit.f21506a));
                }
            }
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(androidx.p000lifecycle.s sVar) {
            super.onStart(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(androidx.p000lifecycle.s sVar) {
            super.onStop(sVar);
        }
    }

    public c(@NotNull Context applicationContext, @NotNull g.d<aq.b> customTabsLauncher, @NotNull String url, @NotNull String redirectPath, @NotNull BrowserSelection browserSelection, @NotNull NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(customTabsLauncher, "customTabsLauncher");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectPath, "redirectPath");
        Intrinsics.checkNotNullParameter(browserSelection, "browserSelection");
        Intrinsics.checkNotNullParameter(integrationStepBrowserType, "integrationStepBrowserType");
        this.applicationContext = applicationContext;
        this.customTabsLauncher = customTabsLauncher;
        this.url = url;
        this.redirectPath = redirectPath;
        this.browserSelection = browserSelection;
        this.integrationStepBrowserType = integrationStepBrowserType;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> oVar) {
        return ln.o.b.a(this, oVar);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    public final Object k(eu.b<? super Unit> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        e eVar = new e(pVar);
        h0.INSTANCE.a().a().a(eVar);
        pVar.j(new d(eVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY == fu.c.e() ? objY : Unit.f21506a;
    }

    @Override // ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.w(new C0440c(null));
    }
}
