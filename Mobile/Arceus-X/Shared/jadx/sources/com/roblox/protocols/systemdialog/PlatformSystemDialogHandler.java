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
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ml.C8577a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7877j;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001:B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ!\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0004R\u0014\u0010*\u001a\u00020)8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000105028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0005078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, m31665d2 = {"Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/IPlatformSystemDialogHandler;", "<init>", "()V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "observer", "", "attachObserver", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)Z", "detachObserver", "Landroid/app/Activity;", "activity", "", "setActivity", "(Landroid/app/Activity;)V", "activityToMatch", "unsetActivityIfMatches", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "isAvailable", "()Z", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;", "request", "callback", "", "open", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogRequest;Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)J", "id", "dismiss", "(J)V", "dismissAll", "", "TAG", "Ljava/lang/String;", "Lku/p0;", "coroutineScope", "Lku/p0;", "Luu/a;", "contextMutex", "Luu/a;", "Ljava/util/concurrent/atomic/AtomicReference;", "currentActivity", "Ljava/util/concurrent/atomic/AtomicReference;", "Lml/a;", "activeBlockingDialog", "Ljava/util/Queue;", "activeDialogObservers", "Ljava/util/Queue;", "a", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PlatformSystemDialogHandler extends IPlatformSystemDialogHandler implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "rbx.PlatformSystemDialogHandler";

    @NotNull
    public static final PlatformSystemDialogHandler INSTANCE = new PlatformSystemDialogHandler();

    @NotNull
    private static final InterfaceC7906p0 coroutineScope = C7910q0.m32885a(C7864g1.m32645c());

    @NotNull
    private static final InterfaceC11970a contextMutex = C11976g.m44697b(false, 1, null);

    @NotNull
    private static final AtomicReference<Activity> currentActivity = new AtomicReference<>(null);

    @NotNull
    private static final AtomicReference<C8577a> activeBlockingDialog = new AtomicReference<>(null);

    @NotNull
    private static final Queue<ISystemDialogCallback> activeDialogObservers = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\tR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$a;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "observer", "<init>", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;", "context", "", "onOpened", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V", "onClosed", "onOkClicked", "onCancelClicked", "a", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "getObserver", "()Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3332a extends ISystemDialogCallback {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final ISystemDialogCallback observer;

        public C3332a(@Nullable ISystemDialogCallback iSystemDialogCallback) {
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

    /* JADX INFO: renamed from: com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$setActivity$1", m39664f = "PlatformSystemDialogHandler.kt", m39665l = {146}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3333b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12663t;

        /* JADX INFO: renamed from: u */
        public Object f12664u;

        /* JADX INFO: renamed from: v */
        public int f12665v;

        /* JADX INFO: renamed from: w */
        public int f12666w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Activity f12667x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3333b(Activity activity, InterfaceC9557b<? super C3333b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12667x = activity;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3333b(this.f12667x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            Activity activity;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12666w;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = PlatformSystemDialogHandler.contextMutex;
                Activity activity2 = this.f12667x;
                this.f12663t = interfaceC11970a;
                this.f12664u = activity2;
                this.f12665v = 0;
                this.f12666w = 1;
                if (interfaceC11970a.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                activity = activity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) this.f12664u;
                interfaceC11970a = (InterfaceC11970a) this.f12663t;
                C7348o.m30470b(obj);
            }
            try {
                PlatformSystemDialogHandler.currentActivity.set(activity);
                Unit unit = Unit.f29331a;
                return Unit.f29331a;
            } finally {
                interfaceC11970a.mo44673e(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3333b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroid/app/Activity;", "<anonymous>", "(Lku/p0;)Landroid/app/Activity;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$unsetActivityIfMatches$1", m39664f = "PlatformSystemDialogHandler.kt", m39665l = {146}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3334c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Activity>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12668t;

        /* JADX INFO: renamed from: u */
        public Object f12669u;

        /* JADX INFO: renamed from: v */
        public int f12670v;

        /* JADX INFO: renamed from: w */
        public int f12671w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Activity f12672x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3334c(Activity activity, InterfaceC9557b<? super C3334c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12672x = activity;
        }

        /* JADX INFO: renamed from: r */
        public static final Activity m15891r(Activity activity, Activity activity2) {
            if (Intrinsics.m31980c(activity, activity2)) {
                return null;
            }
            return activity2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3334c(this.f12672x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11970a interfaceC11970a;
            final Activity activity;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12671w;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                interfaceC11970a = PlatformSystemDialogHandler.contextMutex;
                Activity activity2 = this.f12672x;
                this.f12668t = interfaceC11970a;
                this.f12669u = activity2;
                this.f12670v = 0;
                this.f12671w = 1;
                if (interfaceC11970a.mo44674f(null, this) == objM38805e) {
                    return objM38805e;
                }
                activity = activity2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity = (Activity) this.f12669u;
                interfaceC11970a = (InterfaceC11970a) this.f12668t;
                C7348o.m30470b(obj);
            }
            try {
                return (Activity) PlatformSystemDialogHandler.currentActivity.getAndUpdate(new UnaryOperator() { // from class: ml.g
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return PlatformSystemDialogHandler.C3334c.m15891r(activity, (Activity) obj2);
                    }
                });
            } finally {
                interfaceC11970a.mo44673e(null);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Activity> interfaceC9557b) {
            return ((C3334c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    private PlatformSystemDialogHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8577a dismiss$lambda$0(long j10, C8577a c8577a) {
        if (c8577a == null || c8577a.getId() != j10) {
            return c8577a;
        }
        c8577a.m34600b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void open$lambda$0$0(long j10, ISystemDialogCallback iSystemDialogCallback, SystemDialogRequest systemDialogRequest, Activity activity) {
        C8577a c8577a = new C8577a(j10, new C3332a(iSystemDialogCallback));
        c8577a.m34599a(systemDialogRequest, activity);
        activeBlockingDialog.set(c8577a);
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
        C6124q.m27063h(TAG, "Handler call to dismiss.");
        activeBlockingDialog.getAndUpdate(new UnaryOperator() { // from class: ml.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PlatformSystemDialogHandler.dismiss$lambda$0(id2, (C8577a) obj);
            }
        });
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.IPlatformSystemDialogHandler
    public void dismissAll() {
        C6124q.m27063h(TAG, "Handler call to dismissAll.");
        C8577a andSet = activeBlockingDialog.getAndSet(null);
        if (andSet != null) {
            andSet.m34600b();
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
        C6124q.m27063h(TAG, "Handler call to open.");
        if (activeBlockingDialog.get() != null) {
            C6124q.m27060e(TAG, "openBlockingDialog: Another dialog is already active. First cancel all dialogs.");
            return -1L;
        }
        final Activity activity = currentActivity.get();
        if (activity == null) {
            C6124q.m27060e(TAG, "openBlockingDialog: No activity is running.");
            return -1L;
        }
        final long mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        activity.runOnUiThread(new Runnable() { // from class: ml.e
            @Override // java.lang.Runnable
            public final void run() {
                PlatformSystemDialogHandler.open$lambda$0$0(mostSignificantBits, callback, request, activity);
            }
        });
        return mostSignificantBits;
    }

    public final void setActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C7877j.m32694b(null, new C3333b(activity, null), 1, null);
    }

    public final void unsetActivityIfMatches(@NotNull Activity activityToMatch) {
        Intrinsics.checkNotNullParameter(activityToMatch, "activityToMatch");
        C7877j.m32694b(null, new C3334c(activityToMatch, null), 1, null);
    }
}
