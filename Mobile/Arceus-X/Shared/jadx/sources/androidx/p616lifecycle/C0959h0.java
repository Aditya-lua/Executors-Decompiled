package androidx.p616lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\u0013\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010)\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010(¨\u0006*"}, m31665d2 = {"Landroidx/lifecycle/h0;", "Landroidx/lifecycle/s;", "<init>", "()V", "", "g", "f", "e", "h", "k", "l", "Landroid/content/Context;", "context", "i", "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", "c", "Z", "pauseSent", "d", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/u;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/k0$a;", "Landroidx/lifecycle/k0$a;", "initializationListener", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "lifecycle", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0959h0 implements InterfaceC0980s {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final C0959h0 f3639j = new C0959h0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int startedCounter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int resumedCounter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Handler handler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean pauseSent = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean stopSent = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C0984u registry = new C0984u(this);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.g0
        @Override // java.lang.Runnable
        public final void run() {
            C0959h0.m4907j(this.f3637a);
        }
    };

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final FragmentC0965k0.a initializationListener = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.h0$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Landroidx/lifecycle/h0$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f3648a = new a();

        /* JADX INFO: renamed from: a */
        public static final void m4916a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Landroidx/lifecycle/h0$b;", "", "<init>", "()V", "Landroidx/lifecycle/s;", "a", "()Landroidx/lifecycle/s;", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)V", "Landroidx/lifecycle/h0;", "newInstance", "Landroidx/lifecycle/h0;", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.lifecycle.h0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC0980s m4917a() {
            return C0959h0.f3639j;
        }

        /* JADX INFO: renamed from: b */
        public final void m4918b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C0959h0.f3639j.m4913i(context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h0$c */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"androidx/lifecycle/h0$c", "Landroidx/lifecycle/h;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class c extends C0958h {

        /* JADX INFO: renamed from: androidx.lifecycle.h0$c$a */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"androidx/lifecycle/h0$c$a", "Landroidx/lifecycle/h;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class a extends C0958h {
            final /* synthetic */ C0959h0 this$0;

            public a(C0959h0 c0959h0) {
                this.this$0 = c0959h0;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.m4910f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.m4911g();
            }
        }

        public c() {
        }

        @Override // androidx.p616lifecycle.C0958h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0965k0.INSTANCE.m4932b(activity).m4930e(C0959h0.this.initializationListener);
            }
        }

        @Override // androidx.p616lifecycle.C0958h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0959h0.this.m4909e();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.m4916a(activity, new a(C0959h0.this));
        }

        @Override // androidx.p616lifecycle.C0958h, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C0959h0.this.m4912h();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.h0$d */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31665d2 = {"androidx/lifecycle/h0$d", "Landroidx/lifecycle/k0$a;", "", "onCreate", "()V", "onStart", "onResume", "lifecycle-process"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d implements FragmentC0965k0.a {
        public d() {
        }

        @Override // androidx.p616lifecycle.FragmentC0965k0.a
        public void onCreate() {
        }

        @Override // androidx.p616lifecycle.FragmentC0965k0.a
        public void onResume() {
            C0959h0.this.m4910f();
        }

        @Override // androidx.p616lifecycle.FragmentC0965k0.a
        public void onStart() {
            C0959h0.this.m4911g();
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4907j(C0959h0 c0959h0) {
        c0959h0.m4914k();
        c0959h0.m4915l();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final InterfaceC0980s m4908m() {
        return INSTANCE.m4917a();
    }

    @Override // androidx.p616lifecycle.InterfaceC0980s
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC0966l mo4656a() {
        return this.registry;
    }

    /* JADX INFO: renamed from: e */
    public final void m4909e() {
        int i10 = this.resumedCounter - 1;
        this.resumedCounter = i10;
        if (i10 == 0) {
            Handler handler = this.handler;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4910f() {
        int i10 = this.resumedCounter + 1;
        this.resumedCounter = i10;
        if (i10 == 1) {
            if (this.pauseSent) {
                this.registry.m4986j(AbstractC0966l.a.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4911g() {
        int i10 = this.startedCounter + 1;
        this.startedCounter = i10;
        if (i10 == 1 && this.stopSent) {
            this.registry.m4986j(AbstractC0966l.a.ON_START);
            this.stopSent = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m4912h() {
        this.startedCounter--;
        m4915l();
    }

    /* JADX INFO: renamed from: i */
    public final void m4913i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.m4986j(AbstractC0966l.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.m31981d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: k */
    public final void m4914k() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.m4986j(AbstractC0966l.a.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4915l() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.m4986j(AbstractC0966l.a.ON_STOP);
            this.stopSent = true;
        }
    }
}
