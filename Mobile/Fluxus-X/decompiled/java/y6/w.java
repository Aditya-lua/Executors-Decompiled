package y6;

import android.view.View;
import av.d2;
import av.g1;
import av.p0;
import av.w0;
import av.w1;
import com.github.luben.zstd.BuildConfig;
import f7.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ly6/w;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Ly6/u;", "disposable", BuildConfig.FLAVOR, "c", "(Ly6/u;)Z", "Lav/w0;", "Ly6/k;", "job", "b", "(Lav/w0;)Ly6/u;", BuildConfig.FLAVOR, "a", "()V", "Ly6/v;", "request", "d", "(Ly6/v;)V", "v", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Ly6/u;", "currentDisposable", "Lav/d2;", "Lav/d2;", "pendingClear", "Ly6/v;", "currentRequest", "e", "Z", "isRestart", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public u currentDisposable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d2 pendingClear;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public v currentRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isRestart;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "coil3.request.ViewTargetRequestManager$dispose$1", f = "ViewTargetRequestManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37697t;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return w.this.new a(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f37697t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            w.this.d(null);
            return Unit.f21506a;
        }
    }

    public w(@NotNull View view) {
        this.view = view;
    }

    public final synchronized void a() {
        try {
            d2 d2Var = this.pendingClear;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            this.pendingClear = av.k.d(w1.f3492a, g1.c().Y(), null, new a(null), 2, null);
            this.currentDisposable = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final synchronized u b(@NotNull w0<? extends k> job) {
        u uVar = this.currentDisposable;
        if (uVar != null && i0.i() && this.isRestart) {
            this.isRestart = false;
            uVar.d(job);
            return uVar;
        }
        d2 d2Var = this.pendingClear;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.pendingClear = null;
        u uVar2 = new u(this.view, job);
        this.currentDisposable = uVar2;
        return uVar2;
    }

    public final synchronized boolean c(@NotNull u disposable) {
        return disposable != this.currentDisposable;
    }

    public final void d(@Nullable v request) {
        v vVar = this.currentRequest;
        if (vVar != null) {
            vVar.d();
        }
        this.currentRequest = request;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v8) {
        v vVar = this.currentRequest;
        if (vVar == null) {
            return;
        }
        this.isRestart = true;
        vVar.f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v8) {
        v vVar = this.currentRequest;
        if (vVar != null) {
            vVar.d();
        }
    }
}
