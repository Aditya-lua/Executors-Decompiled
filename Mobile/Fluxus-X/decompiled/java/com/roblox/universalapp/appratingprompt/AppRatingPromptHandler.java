package com.roblox.universalapp.appratingprompt;

import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import av.g1;
import av.k;
import av.p0;
import av.z0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import gu.d;
import gu.m;
import java.lang.ref.WeakReference;
import java.util.List;
import ok.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J-\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", BuildConfig.FLAVOR, "showAppRatingPrompt", "Lj/b;", "activity", BuildConfig.FLAVOR, "failureMessage", "k", "(Lj/b;Ljava/lang/String;)V", BuildConfig.FLAVOR, "isAppRatingPromptAvailable", "()Z", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "d", "(Lj/b;Leu/b;)Ljava/lang/Object;", "j", BuildConfig.FLAVOR, "errorCode", "Ljava/lang/Exception;", "Lkotlin/Exception;", "except", "h", "(Ljava/lang/Integer;Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityRef", "Lkotlin/time/a;", "c", "J", "delay", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppRatingPromptHandler implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AppRatingPromptHandler f9795a = new AppRatingPromptHandler();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile WeakReference<j.b> activityRef;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long delay;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler", f = "AppRatingPromptHandler.kt", l = {93}, m = "displayRatingPrompt", v = 1)
    public static final class a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9797t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9798u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9800w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9798u = obj;
            this.f9800w |= Integer.MIN_VALUE;
            return AppRatingPromptHandler.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$showAppRatingPrompt$1$1", f = "AppRatingPromptHandler.kt", l = {56}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9801t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9802u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.b bVar, eu.b<? super b> bVar2) {
            super(2, bVar2);
            this.f9802u = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f9802u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9801t;
            if (i10 == 0) {
                o.b(obj);
                Log.i("AppRatingPrompt", "Lifecycle-aware coroutine started, listening for rating prompt requests");
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9795a;
                j.b bVar = this.f9802u;
                this.f9801t = 1;
                if (appRatingPromptHandler.d(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$triggerRatingExperience$1", f = "AppRatingPromptHandler.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9803t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9804u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j.b bVar, eu.b<? super c> bVar2) {
            super(2, bVar2);
            this.f9804u = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f9804u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f9803t;
            if (i10 == 0) {
                o.b(obj);
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9795a;
                j.b bVar = this.f9804u;
                this.f9803t = 1;
                if (appRatingPromptHandler.d(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    static {
        p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
        delay = p001kotlin.time.b.p(1, zu.b.SECONDS);
    }

    public static final void e(yd.c cVar, j.b bVar, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Task<Void> taskB = cVar.b(bVar, (yd.b) task.getResult());
            Intrinsics.checkNotNullExpressionValue(taskB, "launchReviewFlow(...)");
            taskB.b(bVar, new OnCompleteListener() { // from class: km.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    AppRatingPromptHandler.f(task2);
                }
            });
        } else {
            Exception exception = task.getException();
            yd.a aVar = exception instanceof yd.a ? (yd.a) exception : null;
            i(f9795a, aVar != null ? Integer.valueOf(aVar.c()) : null, null, 2, null);
        }
    }

    public static final void f(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f9795a.j();
    }

    public static /* synthetic */ void i(AppRatingPromptHandler appRatingPromptHandler, Integer num, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            exc = null;
        }
        appRatingPromptHandler.h(num, exc);
    }

    @Keep
    public static final boolean isAppRatingPromptAvailable() {
        return true;
    }

    public static final void k(@NotNull j.b activity, @NotNull String failureMessage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
        if (h.a().g4()) {
            k.d(t.a(activity), g1.c(), null, new c(activity, null), 2, null);
        } else {
            if (a0.c(activity)) {
                return;
            }
            Toast.makeText(activity, failureMessage, 0).show();
        }
    }

    @Keep
    public static final void showAppRatingPrompt() {
        j.b bVar;
        Log.i("AppRatingPrompt", "requestRatingPrompt called");
        WeakReference<j.b> weakReference = activityRef;
        if (weakReference == null || (bVar = weakReference.get()) == null) {
            return;
        }
        k.d(t.a(bVar), g1.c(), null, new b(bVar, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(final j.b bVar, eu.b<? super Unit> bVar2) {
        a aVar;
        if (bVar2 instanceof a) {
            aVar = (a) bVar2;
            int i10 = aVar.f9800w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f9800w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar2);
            }
        } else {
            aVar = new a(bVar2);
        }
        Object obj = aVar.f9798u;
        Object objE = fu.c.e();
        int i11 = aVar.f9800w;
        try {
            if (i11 == 0) {
                o.b(obj);
                Log.i("AppRatingPrompt", "displayRatingPrompt");
                long j10 = delay;
                aVar.f9797t = bVar;
                aVar.f9800w = 1;
                if (z0.c(j10, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (j.b) aVar.f9797t;
                o.b(obj);
            }
            final yd.c cVarA = yd.d.a(bVar);
            Intrinsics.checkNotNullExpressionValue(cVarA, "create(...)");
            Task<yd.b> taskA = cVarA.a();
            Intrinsics.checkNotNullExpressionValue(taskA, "requestReviewFlow(...)");
            Intrinsics.checkNotNull(taskA.b(bVar, new OnCompleteListener() { // from class: km.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AppRatingPromptHandler.e(cVarA, bVar, task);
                }
            }));
        } catch (Exception e10) {
            i(this, null, e10, 1, null);
        }
        return Unit.f21506a;
    }

    public final void h(Integer errorCode, Exception except) {
        List listC = p001kotlin.collections.o.c();
        if (except != null) {
            listC.add(new Pair("errorInfo", except.toString()));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt", except);
        } else if (errorCode != null) {
            listC.add(new Pair("errorInfo", String.valueOf(errorCode.intValue())));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt, errorCode: " + errorCode);
        } else {
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt: unknown error");
        }
        LoggingProtocol.j(zm.b.a("AppRatingPromptError", p001kotlin.collections.o.a(listC), h.a().s5()));
    }

    public final void j() {
        Log.i("AppRatingPrompt", "onPromptFlowComplete");
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Log.i("AppRatingPrompt", "onCreate");
        activityRef = new WeakReference<>(owner instanceof j.b ? (j.b) owner : null);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WeakReference<j.b> weakReference = activityRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        activityRef = null;
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull s sVar) {
        super.onStop(sVar);
    }
}
