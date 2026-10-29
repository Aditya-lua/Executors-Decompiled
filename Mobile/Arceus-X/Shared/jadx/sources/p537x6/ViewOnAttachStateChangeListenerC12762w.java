package p537x6;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4863i0;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7935w1;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p256ku.InterfaceC7934w0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x6.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lx6/w;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lx6/u;", "disposable", "", "c", "(Lx6/u;)Z", "Lku/w0;", "Lx6/k;", "job", "b", "(Lku/w0;)Lx6/u;", "", "a", "()V", "Lx6/v;", "request", "d", "(Lx6/v;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Lx6/u;", "currentDisposable", "Lku/d2;", "Lku/d2;", "pendingClear", "Lx6/v;", "currentRequest", "e", "Z", "isRestart", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ViewOnAttachStateChangeListenerC12762w implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public C12760u currentDisposable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 pendingClear;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public C12761v currentRequest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isRestart;

    /* JADX INFO: renamed from: x6.w$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "coil3.request.ViewTargetRequestManager$dispose$1", m39664f = "ViewTargetRequestManager.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f45499t;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return ViewOnAttachStateChangeListenerC12762w.this.new a(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f45499t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            ViewOnAttachStateChangeListenerC12762w.this.m47630d(null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public ViewOnAttachStateChangeListenerC12762w(@NotNull View view) {
        this.view = view;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m47627a() {
        try {
            InterfaceC7850d2 interfaceC7850d2 = this.pendingClear;
            if (interfaceC7850d2 != null) {
                InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
            }
            this.pendingClear = C7882k.m32780d(C7935w1.f29814a, C7864g1.m32645c().mo32847X(), null, new a(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final synchronized C12760u m47628b(@NotNull InterfaceC7934w0<? extends InterfaceC12750k> job) {
        C12760u c12760u = this.currentDisposable;
        if (c12760u != null && C4863i0.m23463i() && this.isRestart) {
            this.isRestart = false;
            c12760u.m47624d(job);
            return c12760u;
        }
        InterfaceC7850d2 interfaceC7850d2 = this.pendingClear;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.pendingClear = null;
        C12760u c12760u2 = new C12760u(this.view, job);
        this.currentDisposable = c12760u2;
        return c12760u2;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized boolean m47629c(@NotNull C12760u disposable) {
        return disposable != this.currentDisposable;
    }

    /* JADX INFO: renamed from: d */
    public final void m47630d(@Nullable C12761v request) {
        C12761v c12761v = this.currentRequest;
        if (c12761v != null) {
            c12761v.m47625d();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        C12761v c12761v = this.currentRequest;
        if (c12761v == null) {
            return;
        }
        this.isRestart = true;
        c12761v.m47626f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        C12761v c12761v = this.currentRequest;
        if (c12761v != null) {
            c12761v.m47625d();
        }
    }
}
