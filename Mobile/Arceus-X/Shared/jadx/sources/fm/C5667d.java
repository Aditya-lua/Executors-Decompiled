package fm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: fm.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u0019BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0016\u0010(\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0016\u0010)\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006/"}, m31665d2 = {"Lfm/d;", "", "", "operationId", "Lfm/a;", "manager", "Lku/p0;", "scope", "Lkotlin/Function1;", "", "onDismissedWithoutRedirect", "Lkotlin/Function2;", "", "onLaunchFailed", "<init>", "(JLfm/a;Lku/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "browserStartUrl", "k", "(Ljava/lang/String;)V", "i", "()V", "h", "e", "j", "g", "a", "J", "f", "()J", "b", "Lfm/a;", "c", "Lku/p0;", "d", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "", "Z", "hostResumed", "tabHidden", "sessionlessLaunch", "pausedAfterSessionlessLaunch", "Lku/d2;", "Lku/d2;", "dismissGraceJob", "closed", "l", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5667d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long operationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C5664a manager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function1<Long, Unit> onDismissedWithoutRedirect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function2<Long, String, Unit> onLaunchFailed;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean hostResumed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean tabHidden;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean sessionlessLaunch;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean pausedAfterSessionlessLaunch;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 dismissGraceJob;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: fm.d$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.externalidentity.AppleSignInSession$maybeTreatDismissAsCancel$1", m39664f = "AppleSignInSession.kt", m39665l = {67}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f21750t;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C5667d.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f21750t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f21750t = 1;
                if (C7946z0.m32938b(500L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C5667d.this.onDismissedWithoutRedirect.invoke(C10340b.m39662e(C5667d.this.getOperationId()));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: fm.d$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class c extends C7744k implements Function0<Unit> {
        public c(Object obj) {
            super(0, obj, C5667d.class, "onTabHidden", "onTabHidden()V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m25731d() {
            ((C5667d) this.receiver).m25729j();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m25731d();
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5667d(long j10, @NotNull C5664a manager, @NotNull InterfaceC7906p0 scope, @NotNull Function1<? super Long, Unit> onDismissedWithoutRedirect, @NotNull Function2<? super Long, ? super String, Unit> onLaunchFailed) {
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

    /* JADX INFO: renamed from: l */
    public static final Unit m25722l(C5667d c5667d, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c5667d.onLaunchFailed.invoke(Long.valueOf(c5667d.operationId), it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m25723m(C5667d c5667d) {
        c5667d.sessionlessLaunch = true;
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public final void m25724e() {
        this.closed = true;
        InterfaceC7850d2 interfaceC7850d2 = this.dismissGraceJob;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.dismissGraceJob = null;
        this.manager.m25716c();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getOperationId() {
        return this.operationId;
    }

    /* JADX INFO: renamed from: g */
    public final void m25726g() {
        if (!this.closed && this.tabHidden && this.hostResumed) {
            InterfaceC7850d2 interfaceC7850d2 = this.dismissGraceJob;
            if (interfaceC7850d2 == null || !interfaceC7850d2.mo32556b()) {
                this.dismissGraceJob = C7882k.m32780d(this.scope, null, null, new b(null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m25727h() {
        if (this.closed) {
            return;
        }
        this.hostResumed = false;
        if (this.sessionlessLaunch) {
            this.pausedAfterSessionlessLaunch = true;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m25728i() {
        if (this.closed) {
            return;
        }
        this.hostResumed = true;
        if (this.pausedAfterSessionlessLaunch) {
            this.tabHidden = true;
        }
        m25726g();
    }

    /* JADX INFO: renamed from: j */
    public final void m25729j() {
        if (this.closed) {
            return;
        }
        InterfaceC7850d2 interfaceC7850d2 = this.dismissGraceJob;
        if (interfaceC7850d2 == null || !interfaceC7850d2.mo32556b()) {
            this.tabHidden = true;
            m25726g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m25730k(@Nullable String browserStartUrl) {
        this.manager.m25715b(browserStartUrl, new c(this), new Function1() { // from class: fm.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5667d.m25722l(this.f21736a, (String) obj);
            }
        }, new Function0() { // from class: fm.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5667d.m25723m(this.f21737a);
            }
        });
    }
}
