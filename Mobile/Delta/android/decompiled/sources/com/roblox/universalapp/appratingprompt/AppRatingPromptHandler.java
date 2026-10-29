package com.roblox.universalapp.appratingprompt;

import android.util.Log;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import gk.z;
import java.lang.ref.WeakReference;
import java.util.List;
import jt.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.k;
import ku.p0;
import ku.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.d;
import pt.m;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J-\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "", "showAppRatingPrompt", "Lj/b;", "activity", "", "failureMessage", "k", "(Lj/b;Ljava/lang/String;)V", "", "isAppRatingPromptAvailable", "()Z", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "d", "(Lj/b;Lnt/b;)Ljava/lang/Object;", "j", "", "errorCode", "Ljava/lang/Exception;", "Lkotlin/Exception;", "except", "h", "(Ljava/lang/Integer;Ljava/lang/Exception;)V", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/ref/WeakReference;", "activityRef", "Lkotlin/time/a;", "c", "J", "delay", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppRatingPromptHandler implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AppRatingPromptHandler f9777a = new AppRatingPromptHandler();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile WeakReference<j.b> activityRef;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long delay;

    @pt.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler", f = "AppRatingPromptHandler.kt", l = {93}, m = "displayRatingPrompt", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9779t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9780u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9782w;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9780u = obj;
            this.f9782w |= Integer.MIN_VALUE;
            return AppRatingPromptHandler.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$showAppRatingPrompt$1$1", f = "AppRatingPromptHandler.kt", l = {56}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9784u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j.b bVar, nt.b<? super b> bVar2) {
            super(2, bVar2);
            this.f9784u = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f9784u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f9783t;
            if (i10 == 0) {
                o.b(obj);
                Log.i("AppRatingPrompt", "Lifecycle-aware coroutine started, listening for rating prompt requests");
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9777a;
                j.b bVar = this.f9784u;
                this.f9783t = 1;
                if (appRatingPromptHandler.d(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.appratingprompt.AppRatingPromptHandler$triggerRatingExperience$1", f = "AppRatingPromptHandler.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9785t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f9786u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j.b bVar, nt.b<? super c> bVar2) {
            super(2, bVar2);
            this.f9786u = bVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f9786u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f9785t;
            if (i10 == 0) {
                o.b(obj);
                AppRatingPromptHandler appRatingPromptHandler = AppRatingPromptHandler.f9777a;
                j.b bVar = this.f9786u;
                this.f9785t = 1;
                if (appRatingPromptHandler.d(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    static {
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        delay = kotlin.time.b.p(1, ju.b.SECONDS);
    }

    public static final void e(vd.b bVar, j.b bVar2, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Task<Void> taskB = bVar.b(bVar2, (ReviewInfo) task.getResult());
            Intrinsics.checkNotNullExpressionValue(taskB, "launchReviewFlow(...)");
            taskB.b(bVar2, new OnCompleteListener() { // from class: wl.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    AppRatingPromptHandler.f(task2);
                }
            });
        } else {
            Exception exception = task.getException();
            vd.a aVar = exception instanceof vd.a ? (vd.a) exception : null;
            i(f9777a, aVar != null ? Integer.valueOf(aVar.c()) : null, null, 2, null);
        }
    }

    public static final void f(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f9777a.j();
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
        if (h.a().S3()) {
            k.d(t.a(activity), g1.c(), null, new c(activity, null), 2, null);
        } else {
            if (z.c(activity)) {
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
    public final Object d(final j.b bVar, nt.b<? super Unit> bVar2) {
        a aVar;
        if (bVar2 instanceof a) {
            aVar = (a) bVar2;
            int i10 = aVar.f9782w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f9782w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar2);
            }
        } else {
            aVar = new a(bVar2);
        }
        Object obj = aVar.f9780u;
        Object objE = ot.c.e();
        int i11 = aVar.f9782w;
        try {
            if (i11 == 0) {
                o.b(obj);
                Log.i("AppRatingPrompt", "displayRatingPrompt");
                long j10 = delay;
                aVar.f9779t = bVar;
                aVar.f9782w = 1;
                if (z0.c(j10, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (j.b) aVar.f9779t;
                o.b(obj);
            }
            final vd.b bVarA = vd.c.a(bVar);
            Intrinsics.checkNotNullExpressionValue(bVarA, "create(...)");
            Task<ReviewInfo> taskA = bVarA.a();
            Intrinsics.checkNotNullExpressionValue(taskA, "requestReviewFlow(...)");
            Intrinsics.checkNotNull(taskA.b(bVar, new OnCompleteListener() { // from class: wl.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AppRatingPromptHandler.e(bVarA, bVar, task);
                }
            }));
        } catch (Exception e10) {
            i(this, null, e10, 1, null);
        }
        return Unit.f22483a;
    }

    public final void h(Integer errorCode, Exception except) {
        List listC = kotlin.collections.o.c();
        if (except != null) {
            listC.add(new Pair("errorInfo", except.toString()));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt", except);
        } else if (errorCode != null) {
            listC.add(new Pair("errorInfo", String.valueOf(errorCode.intValue())));
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt, errorCode: " + errorCode);
        } else {
            Log.e("AppRatingPrompt", "Error in displayRatingPrompt: unknown error");
        }
        LoggingProtocol.j(lm.b.a("AppRatingPromptError", kotlin.collections.o.a(listC), h.a().i5()));
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
