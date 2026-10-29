package fm;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import ku.d2;
import ku.p0;
import ku.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u0019BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006/"}, d2 = {"Lfm/d;", "", "", "operationId", "Lfm/a;", "manager", "Lku/p0;", "scope", "Lkotlin/Function1;", "", "onDismissedWithoutRedirect", "Lkotlin/Function2;", "", "onLaunchFailed", "<init>", "(JLfm/a;Lku/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "browserStartUrl", "k", "(Ljava/lang/String;)V", "i", "()V", "h", "e", "j", "g", "a", "J", "f", "()J", "b", "Lfm/a;", "c", "Lku/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "", "Z", "hostResumed", "tabHidden", "sessionlessLaunch", "pausedAfterSessionlessLaunch", "Lku/d2;", "Lku/d2;", "dismissGraceJob", "closed", "l", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long operationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a manager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<Long, Unit> onDismissedWithoutRedirect;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<Long, String, Unit> onLaunchFailed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean hostResumed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean tabHidden;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean sessionlessLaunch;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean pausedAfterSessionlessLaunch;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 dismissGraceJob;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.externalidentity.AppleSignInSession$maybeTreatDismissAsCancel$1", f = "AppleSignInSession.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16831t;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f16831t;
            if (i10 == 0) {
                o.b(obj);
                this.f16831t = 1;
                if (z0.b(500L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            d.this.onDismissedWithoutRedirect.invoke(pt.b.e(d.this.getOperationId()));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c extends k implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, d.class, "onTabHidden", "onTabHidden()V", 0);
        }

        public final void d() {
            ((d) this.receiver).j();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            d();
            return Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(long j10, @NotNull a manager, @NotNull p0 scope, @NotNull Function1<? super Long, Unit> onDismissedWithoutRedirect, @NotNull Function2<? super Long, ? super String, Unit> onLaunchFailed) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onDismissedWithoutRedirect, "onDismissedWithoutRedirect");
        Intrinsics.checkNotNullParameter(onLaunchFailed, "onLaunchFailed");
        this.operationId = j10;
        this.manager = manager;
        this.scope = scope;
        this.onDismissedWithoutRedirect = onDismissedWithoutRedirect;
        this.onLaunchFailed = onLaunchFailed;
        this.hostResumed = true;
    }

    public static final Unit l(d dVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        dVar.onLaunchFailed.invoke(Long.valueOf(dVar.operationId), it);
        return Unit.f22483a;
    }

    public static final Unit m(d dVar) {
        dVar.sessionlessLaunch = true;
        return Unit.f22483a;
    }

    public final void e() {
        this.closed = true;
        d2 d2Var = this.dismissGraceJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.dismissGraceJob = null;
        this.manager.c();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getOperationId() {
        return this.operationId;
    }

    public final void g() {
        if (!this.closed && this.tabHidden && this.hostResumed) {
            d2 d2Var = this.dismissGraceJob;
            if (d2Var == null || !d2Var.b()) {
                this.dismissGraceJob = ku.k.d(this.scope, null, null, new b(null), 3, null);
            }
        }
    }

    public final void h() {
        if (this.closed) {
            return;
        }
        this.hostResumed = false;
        if (this.sessionlessLaunch) {
            this.pausedAfterSessionlessLaunch = true;
        }
    }

    public final void i() {
        if (this.closed) {
            return;
        }
        this.hostResumed = true;
        if (this.pausedAfterSessionlessLaunch) {
            this.tabHidden = true;
        }
        g();
    }

    public final void j() {
        if (this.closed) {
            return;
        }
        d2 d2Var = this.dismissGraceJob;
        if (d2Var == null || !d2Var.b()) {
            this.tabHidden = true;
            g();
        }
    }

    public final void k(@Nullable String browserStartUrl) {
        this.manager.b(browserStartUrl, new c(this), new Function1() { // from class: fm.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.l(this.f16818a, (String) obj);
            }
        }, new Function0() { // from class: fm.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.m(this.f16819a);
            }
        });
    }
}
