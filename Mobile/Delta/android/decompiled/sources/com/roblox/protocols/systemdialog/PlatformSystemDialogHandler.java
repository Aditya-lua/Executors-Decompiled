package com.roblox.protocols.systemdialog;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler;
import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogRequest;
import ek.q;
import gt.o;
import iu.g1;
import iu.j;
import iu.p0;
import iu.q0;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0004R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0005078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/IPlatformSystemDialogHandler;", "<init>", "()V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "observer", "", "attachObserver", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z", "detachObserver", "Landroid/app/Activity;", "activity", "", "setActivity", "(Landroid/app/Activity;)V", "activityToMatch", "unsetActivityIfMatches", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "isAvailable", "()Z", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;", "request", "callback", "", "open", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)J", "id", "dismiss", "(J)V", "dismissAll", "", "TAG", "Ljava/lang/String;", "Liu/p0;", "coroutineScope", "Liu/p0;", "Lsu/a;", "contextMutex", "Lsu/a;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentActivity", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkl/a;", "activeBlockingDialog", "Ljava/util/Queue;", "activeDialogObservers", "Ljava/util/Queue;", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlatformSystemDialogHandler extends IPlatformSystemDialogHandler implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "rbx.PlatformSystemDialogHandler";

    @NotNull
    public static final PlatformSystemDialogHandler INSTANCE = new PlatformSystemDialogHandler();

    @NotNull
    private static final p0 coroutineScope = q0.a(g1.c());

    @NotNull
    private static final su.a contextMutex = g.b(false, 1, null);

    @NotNull
    private static final AtomicReference<Activity> currentActivity = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<kl.a> activeBlockingDialog = new AtomicReference<>(null);

    @NotNull
    private static final Queue<ISystemDialogCallback> activeDialogObservers = new ConcurrentLinkedQueue();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\tR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "observer", "<init>", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;", "context", "", "onOpened", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V", "onClosed", "onOkClicked", "onCancelClicked", "a", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "getObserver", "()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ISystemDialogCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ISystemDialogCallback observer;

        public a(@Nullable ISystemDialogCallback iSystemDialogCallback) {
            this.observer = iSystemDialogCallback;
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onCancelClicked(@NotNull SystemDialogContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ISystemDialogCallback iSystemDialogCallback = this.observer;
            if (iSystemDialogCallback != null) {
                iSystemDialogCallback.onCancelClicked(context);
            }
            for (ISystemDialogCallback iSystemDialogCallback2 : PlatformSystemDialogHandler.activeDialogObservers) {
                if (iSystemDialogCallback2 != null) {
                    iSystemDialogCallback2.onCancelClicked(context);
                }
            }
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onClosed(@NotNull SystemDialogContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ISystemDialogCallback iSystemDialogCallback = this.observer;
            if (iSystemDialogCallback != null) {
                iSystemDialogCallback.onClosed(context);
            }
            for (ISystemDialogCallback iSystemDialogCallback2 : PlatformSystemDialogHandler.activeDialogObservers) {
                if (iSystemDialogCallback2 != null) {
                    iSystemDialogCallback2.onClosed(context);
                }
            }
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onOkClicked(@NotNull SystemDialogContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ISystemDialogCallback iSystemDialogCallback = this.observer;
            if (iSystemDialogCallback != null) {
                iSystemDialogCallback.onOkClicked(context);
            }
            for (ISystemDialogCallback iSystemDialogCallback2 : PlatformSystemDialogHandler.activeDialogObservers) {
                if (iSystemDialogCallback2 != null) {
                    iSystemDialogCallback2.onOkClicked(context);
                }
            }
        }

        @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
        public void onOpened(@NotNull SystemDialogContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ISystemDialogCallback iSystemDialogCallback = this.observer;
            if (iSystemDialogCallback != null) {
                iSystemDialogCallback.onOpened(context);
            }
            for (ISystemDialogCallback iSystemDialogCallback2 : PlatformSystemDialogHandler.activeDialogObservers) {
                if (iSystemDialogCallback2 != null) {
                    iSystemDialogCallback2.onOpened(context);
                }
            }
        }
    }

    @f(c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$setActivity$1", f = "PlatformSystemDialogHandler.kt", l = {146}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9797t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9798u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9799v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9800w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Activity f9801x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f9801x = activity;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f9801x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            Activity activity;
            Object objE = mt.c.e();
            int i10 = this.f9800w;
            if (i10 == 0) {
                o.b(obj);
                aVar = PlatformSystemDialogHandler.contextMutex;
                Activity activity2 = this.f9801x;
                this.f9797t = aVar;
                this.f9798u = activity2;
                this.f9799v = 0;
                this.f9800w = 1;
                if (aVar.b(null, this) == objE) {
                    return objE;
                }
                activity = activity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) this.f9798u;
                aVar = (su.a) this.f9797t;
                o.b(obj);
            }
            try {
                PlatformSystemDialogHandler.currentActivity.set(activity);
                Unit unit = Unit.f22938a;
                return Unit.f22938a;
            } finally {
                aVar.f(null);
            }
        }
    }

    @f(c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$unsetActivityIfMatches$1", f = "PlatformSystemDialogHandler.kt", l = {146}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Landroid/app/Activity;", "<anonymous>", "(Liu/p0;)Landroid/app/Activity;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Activity>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9802t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9803u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9804v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9805w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Activity f9806x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, lt.b<? super c> bVar) {
            super(2, bVar);
            this.f9806x = activity;
        }

        public static final Activity n(Activity activity, Activity activity2) {
            if (Intrinsics.c(activity, activity2)) {
                return null;
            }
            return activity2;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new c(this.f9806x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Activity> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            su.a aVar;
            final Activity activity;
            Object objE = mt.c.e();
            int i10 = this.f9805w;
            if (i10 == 0) {
                o.b(obj);
                aVar = PlatformSystemDialogHandler.contextMutex;
                Activity activity2 = this.f9806x;
                this.f9802t = aVar;
                this.f9803u = activity2;
                this.f9804v = 0;
                this.f9805w = 1;
                if (aVar.b(null, this) == objE) {
                    return objE;
                }
                activity = activity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) this.f9803u;
                aVar = (su.a) this.f9802t;
                o.b(obj);
            }
            try {
                return (Activity) PlatformSystemDialogHandler.currentActivity.getAndUpdate(new UnaryOperator() { // from class: kl.g
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return PlatformSystemDialogHandler.c.n(activity, (Activity) obj2);
                    }
                });
            } finally {
                aVar.f(null);
            }
        }
    }

    private PlatformSystemDialogHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kl.a dismiss$lambda$0(long j10, kl.a aVar) {
        if (aVar == null || aVar.getId() != j10) {
            return aVar;
        }
        aVar.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$0$0(long j10, ISystemDialogCallback iSystemDialogCallback, SystemDialogRequest systemDialogRequest, Activity activity) {
        kl.a aVar = new kl.a(j10, new a(iSystemDialogCallback));
        aVar.a(systemDialogRequest, activity);
        activeBlockingDialog.set(aVar);
    }

    public final boolean attachObserver(@NotNull ISystemDialogCallback observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return activeDialogObservers.add(observer);
    }

    public final boolean detachObserver(@NotNull ISystemDialogCallback observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return activeDialogObservers.remove(observer);
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
    public void dismiss(final long id2) {
        q.h(TAG, "Handler call to dismiss.");
        activeBlockingDialog.getAndUpdate(new UnaryOperator() { // from class: kl.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PlatformSystemDialogHandler.dismiss$lambda$0(id2, (a) obj);
            }
        });
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
    public void dismissAll() {
        q.h(TAG, "Handler call to dismissAll.");
        kl.a andSet = activeBlockingDialog.getAndSet(null);
        if (andSet != null) {
            andSet.b();
        }
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
    public boolean isAvailable() {
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        unsetActivityIfMatches(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        unsetActivityIfMatches(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
    public long open(@NotNull final SystemDialogRequest request, @NotNull final ISystemDialogCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        q.h(TAG, "Handler call to open.");
        if (activeBlockingDialog.get() != null) {
            q.e(TAG, "openBlockingDialog: Another dialog is already active. First cancel all dialogs.");
            return -1L;
        }
        final Activity activity = currentActivity.get();
        if (activity == null) {
            q.e(TAG, "openBlockingDialog: No activity is running.");
            return -1L;
        }
        final long mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        activity.runOnUiThread(new Runnable() { // from class: kl.e
            @Override // java.lang.Runnable
            public final void run() {
                PlatformSystemDialogHandler.open$lambda$0$0(mostSignificantBits, callback, request, activity);
            }
        });
        return mostSignificantBits;
    }

    public final void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j.b(null, new b(activity, null), 1, null);
    }

    public final void unsetActivityIfMatches(@NotNull Activity activityToMatch) {
        Intrinsics.checkNotNullParameter(activityToMatch, "activityToMatch");
        j.b(null, new c(activityToMatch, null), 1, null);
    }
}
