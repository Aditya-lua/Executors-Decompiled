package com.roblox.universalapp.appratingprompt;

import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6104a0;
import p203j.ActivityC6992b;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p275lm.C8168b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p514wd.C12349a;
import p514wd.C12351c;
import p514wd.InterfaceC12350b;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J-\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m31665d2 = {"Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "", "showAppRatingPrompt", "Lj/b;", "activity", "", "failureMessage", "k", "(Lj/b;Ljava/lang/String;)V", "", "isAppRatingPromptAvailable", "()Z", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "d", "(Lj/b;Lnt/b;)Ljava/lang/Object;", "j", "", "errorCode", "Ljava/lang/Exception;", "Lkotlin/Exception;", "except", "h", "(Ljava/lang/Integer;Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityRef", "Lkotlin/time/a;", "c", "J", "delay", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class AppRatingPromptHandler implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final AppRatingPromptHandler f12735a = new AppRatingPromptHandler();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile WeakReference<ActivityC6992b> activityRef;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final long delay;

    /* JADX INFO: renamed from: com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$a */
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler", m39664f = "AppRatingPromptHandler.kt", m39665l = {93}, m39666m = "displayRatingPrompt", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3349a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f12738t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12739u;

        /* JADX INFO: renamed from: w */
        public int f12741w;

        public C3349a(InterfaceC9557b<? super C3349a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12739u = obj;
            this.f12741w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return AppRatingPromptHandler.this.m15980d(null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$showAppRatingPrompt$1$1", m39664f = "AppRatingPromptHandler.kt", m39665l = {56}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3350b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12742t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC6992b f12743u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3350b(ActivityC6992b activityC6992b, InterfaceC9557b<? super C3350b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12743u = activityC6992b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3350b(this.f12743u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12742t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                Log.i("AppRatingPrompt", "Lifecycle-aware coroutine started, listening for rating prompt requests");
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f12735a;
                ActivityC6992b activityC6992b = this.f12743u;
                this.f12742t = 1;
                if (appRatingPromptHandler.m15980d(activityC6992b, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3350b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$triggerRatingExperience$1", m39664f = "AppRatingPromptHandler.kt", m39665l = {65}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3351c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12744t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC6992b f12745u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3351c(ActivityC6992b activityC6992b, InterfaceC9557b<? super C3351c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12745u = activityC6992b;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3351c(this.f12745u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12744t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f12735a;
                ActivityC6992b activityC6992b = this.f12745u;
                this.f12744t = 1;
                if (appRatingPromptHandler.m15980d(activityC6992b, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3351c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    static {
        C7800a.Companion companion = C7800a.INSTANCE;
        delay = C7801b.m32371p(1, EnumC7361b.SECONDS);
    }

    /* JADX INFO: renamed from: e */
    public static final void m15976e(InterfaceC12350b interfaceC12350b, ActivityC6992b activityC6992b, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Task<Void> taskMo13351b = interfaceC12350b.mo13351b(activityC6992b, (ReviewInfo) task.getResult());
            Intrinsics.checkNotNullExpressionValue(taskMo13351b, "launchReviewFlow(...)");
            taskMo13351b.mo11888b(activityC6992b, new OnCompleteListener() { // from class: wl.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    AppRatingPromptHandler.m15977f(task2);
                }
            });
        } else {
            Exception exception = task.getException();
            C12349a c12349a = exception instanceof C12349a ? (C12349a) exception : null;
            m15978i(f12735a, c12349a != null ? Integer.valueOf(c12349a.m46216c()) : null, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m15977f(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f12735a.m15982j();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15978i(AppRatingPromptHandler appRatingPromptHandler, Integer num, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            exc = null;
        }
        appRatingPromptHandler.m15981h(num, exc);
    }

    @Keep
    public static final boolean isAppRatingPromptAvailable() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static final void m15979k(@NotNull ActivityC6992b activity, @NotNull String failureMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
        if (C11659h.m43403a().mo43567X3()) {
            C7882k.m32780d(C0982t.m4979a(activity), C7864g1.m32645c(), null, new C3351c(activity, null), 2, null);
        } else {
            if (C6104a0.m27003c(activity)) {
                return;
            }
            Toast.makeText(activity, failureMessage, 0).show();
        }
    }

    @Keep
    public static final void showAppRatingPrompt() {
        ActivityC6992b activityC6992b;
        Log.i("AppRatingPrompt", "requestRatingPrompt called");
        WeakReference<ActivityC6992b> weakReference = activityRef;
        if (weakReference == null || (activityC6992b = weakReference.get()) == null) {
            return;
        }
        C7882k.m32780d(C0982t.m4979a(activityC6992b), C7864g1.m32645c(), null, new C3350b(activityC6992b, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m15980d(final ActivityC6992b activityC6992b, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C3349a c3349a;
        if (interfaceC9557b instanceof C3349a) {
            c3349a = (C3349a) interfaceC9557b;
            int i10 = c3349a.f12741w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3349a.f12741w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3349a = new C3349a(interfaceC9557b);
            }
        } else {
            c3349a = new C3349a(interfaceC9557b);
        }
        Object obj = c3349a.f12739u;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3349a.f12741w;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                Log.i("AppRatingPrompt", "displayRatingPrompt");
                long j10 = delay;
                c3349a.f12738t = activityC6992b;
                c3349a.f12741w = 1;
                if (C7946z0.m32939c(j10, c3349a) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activityC6992b = (ActivityC6992b) c3349a.f12738t;
                C7348o.m30470b(obj);
            }
            final InterfaceC12350b interfaceC12350bM46217a = C12351c.m46217a(activityC6992b);
            Intrinsics.checkNotNullExpressionValue(interfaceC12350bM46217a, "create(...)");
            Task<ReviewInfo> taskMo13350a = interfaceC12350bM46217a.mo13350a();
            Intrinsics.checkNotNullExpressionValue(taskMo13350a, "requestReviewFlow(...)");
            Intrinsics.checkNotNull(taskMo13350a.mo11888b(activityC6992b, new OnCompleteListener() { // from class: wl.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AppRatingPromptHandler.m15976e(interfaceC12350bM46217a, activityC6992b, task);
                }
            }));
        } catch (Exception e10) {
            m15978i(this, null, e10, 1, null);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public final void m15981h(Integer errorCode, Exception except) {
        List listM31877c = C7697o.m31877c();
        if (except != null) {
            listM31877c.add(new Pair("errorInfo", except.toString()));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt", except);
        } else if (errorCode != null) {
            listM31877c.add(new Pair("errorInfo", String.valueOf(errorCode.intValue())));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt, errorCode: " + errorCode);
        } else {
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt: unknown error");
        }
        LoggingProtocol.m15997j(C8168b.m33440a("AppRatingPromptError", C7697o.m31875a(listM31877c), C11659h.m43403a().mo43693o5()));
    }

    /* JADX INFO: renamed from: j */
    public final void m15982j() {
        Log.i("AppRatingPrompt", "onPromptFlowComplete");
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Log.i("AppRatingPrompt", "onCreate");
        activityRef = new WeakReference<>(owner instanceof ActivityC6992b ? (ActivityC6992b) owner : null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WeakReference<ActivityC6992b> weakReference = activityRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityRef = null;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }
}
