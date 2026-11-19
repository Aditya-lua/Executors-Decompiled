package mp;

import android.content.Context;
import androidx.p000lifecycle.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationEventData;
import com.withpersona.sdk2.inquiry.tracking.model.IntegrationState;
import dv.c0;
import java.util.List;
import lp.BrowserSelection;
import lp.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u000256BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J5\u0010)\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001a0'0%0$2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lmp/j;", "Lls/d;", "Llp/v$b;", "Llp/v$e;", "Llp/v$c;", "Llp/m;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lir/b;", "navigationStateManager", "Llp/c$a;", "integrationBrowserWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lav/p0;", "coroutineScope", "<init>", "(Llp/v$b;Landroidx/lifecycle/l0;Landroid/content/Context;Lir/b;Llp/c$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lav/p0;)V", "props", "p", "(Llp/v$b;)Llp/v$e;", "renderProps", "renderState", BuildConfig.FLAVOR, "s", "(Llp/v$b;Llp/v$e;)V", "Lmp/j$b;", "event", "v", "(Lmp/j$b;)V", "Llp/v$e$a;", "q", "(Llp/v$b;Llp/v$e$a;)V", BuildConfig.FLAVOR, "Lkotlin/Pair;", BuildConfig.FLAVOR, "Lkotlin/Function1;", "Lqr/x5;", "n", "(Llp/v$b;)Ljava/util/List;", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lir/b;", "h", "Llp/c$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "c", "b", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends ls.d<v.Input, v.e, v.c, lp.m> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lp.c.a integrationBrowserWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepStateManager$2", f = "IntegrationStepStateManager.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23469t;

        /* JADX INFO: renamed from: mp.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0459a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f23471a;

            public C0459a(j jVar) {
                this.f23471a = jVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(v.Input bVar, eu.b<? super Unit> bVar2) {
                j jVar = this.f23471a;
                v.e eVar = (v.e) jVar.d().i();
                if (eVar == null) {
                    return Unit.f21506a;
                }
                jVar.s(bVar, eVar);
                return Unit.f21506a;
            }
        }

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return j.this.new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23469t;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<v.Input> c0VarB = j.this.b();
                C0459a c0459a = new C0459a(j.this);
                this.f23469t = 1;
                if (c0VarB.collect(c0459a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmp/j$b;", BuildConfig.FLAVOR, "a", "b", "c", "Lmp/j$b$a;", "Lmp/j$b$b;", "Lmp/j$b$c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmp/j$b$a;", "Lmp/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f23472a = new a();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1679929975;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: mp.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmp/j$b$b;", "Lmp/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0460b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0460b f23473a = new C0460b();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0460b);
            }

            public int hashCode() {
                return 523949724;
            }

            @NotNull
            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmp/j$b$c;", "Lmp/j$b;", "<init>", "()V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f23474a = new c();

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -323947876;
            }

            @NotNull
            public String toString() {
                return "OpenBrowser";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmp/j$c;", BuildConfig.FLAVOR, "Llp/v$b;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lmp/j;", "a", "(Llp/v$b;Landroidx/lifecycle/l0;)Lmp/j;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @NotNull
        j a(@NotNull v.Input initialProps, @NotNull l0 savedStateHandle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull v.Input initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull ir.b navigationStateManager, @NotNull lp.c.a integrationBrowserWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(integrationBrowserWorkerFactory, "integrationBrowserWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.navigationStateManager = navigationStateManager;
        this.integrationBrowserWorkerFactory = integrationBrowserWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (d().i() == null) {
            d().p(p(b().getValue()));
        }
        d().o(new Function1() { // from class: mp.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.l(this.f23458a, (v.e) obj);
            }
        });
        av.k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    public static final Unit l(j jVar, v.e eVar) {
        if (eVar == null) {
            return Unit.f21506a;
        }
        jVar.s(jVar.b().getValue(), eVar);
        return Unit.f21506a;
    }

    public static final Unit o(j jVar, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        jVar.v(b.c.f23474a);
        return Unit.f21506a;
    }

    public static final Unit r(j jVar, v.Input bVar, BrowserSelection browserSelection, lp.c.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof lp.c.b.a)) {
            throw new zt.l();
        }
        ls.h hVarI = jVar.d().i();
        v.e.Starting aVar = hVarI instanceof v.e.Starting ? (v.e.Starting) hVarI : null;
        if (aVar == null) {
            return Unit.f21506a;
        }
        TrackingEventsLogger.logIntegrationEvent$default(jVar.trackingEventsLogger, new IntegrationEventData(IntegrationState.Complete, bVar.getFlowUrl(), Boolean.valueOf(browserSelection.getSupportsAuthTab()), null, 8, null), false, 2, null);
        jVar.d().p(aVar.u(null));
        jVar.e(v.c.d.f22450a);
        return Unit.f21506a;
    }

    public static final Unit t(j jVar) {
        jVar.v(b.a.f23472a);
        return Unit.f21506a;
    }

    public static final Unit u(j jVar) {
        jVar.v(b.C0460b.f23473a);
        return Unit.f21506a;
    }

    public final List<Pair<String, Function1<x5, Unit>>> n(v.Input props) {
        lp.g gVarK = props.getStartPage();
        return gVarK == null ? p.k() : new or.c.a().a(gVarK.getOpenBrowserButton(), new Function1() { // from class: mp.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.o(this.f23461a, (x5) obj);
            }
        }).b();
    }

    public final v.e p(v.Input props) {
        return new v.e.Starting(v.d.a.f22451a);
    }

    public final void q(final v.Input renderProps, v.e.Starting renderState) {
        v.d dVarV = renderState.getPendingAction();
        if (!(dVarV instanceof v.d.a)) {
            if (dVarV != null) {
                throw new zt.l();
            }
        } else {
            final BrowserSelection browserSelectionC = lp.h.f22404a.c(this.applicationContext);
            TrackingEventsLogger.logIntegrationEvent$default(this.trackingEventsLogger, new IntegrationEventData(IntegrationState.ShowingIntegration, renderProps.getFlowUrl(), Boolean.valueOf(browserSelectionC.getSupportsAuthTab()), null, 8, null), false, 2, null);
            d().n(this.integrationBrowserWorkerFactory.a(renderProps.getFlowUrl(), renderProps.getRedirectPath(), browserSelectionC, renderProps.getIntegrationStepBrowserType()), new Function1() { // from class: mp.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j.r(this.f23462a, renderProps, browserSelectionC, (lp.c.b) obj);
                }
            });
        }
    }

    public final void s(v.Input renderProps, v.e renderState) {
        if (!(renderState instanceof v.e.Starting)) {
            throw new zt.l();
        }
        v.e.Starting aVar = (v.e.Starting) renderState;
        q(renderProps, aVar);
        ir.b.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), aVar.getPendingAction() == null && !renderProps.getIsSubmitting(), false, 8, null);
        lp.g gVarK = renderProps.getStartPage();
        Intrinsics.checkNotNull(gVarK);
        c().setValue(new lp.m(or.d.a(gVarK), this.navigationStateManager.b(), new Function0() { // from class: mp.f
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.t(this.f23459a);
            }
        }, new Function0() { // from class: mp.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.u(this.f23460a);
            }
        }, n(renderProps), aVar.getPendingAction() != null || renderProps.getIsSubmitting()));
    }

    public final void v(b event) {
        if (event instanceof b.a) {
            e(v.c.a.f22447a);
            return;
        }
        if (event instanceof b.C0460b) {
            e(v.c.b.f22448a);
            return;
        }
        if (!(event instanceof b.c)) {
            throw new zt.l();
        }
        ls.h hVarI = d().i();
        v.e.Starting aVar = hVarI instanceof v.e.Starting ? (v.e.Starting) hVarI : null;
        if (aVar == null) {
            return;
        }
        d().p(aVar.u(v.d.a.f22451a));
    }
}
