package com.roblox.client.fcm;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import bn.r;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import gu.d;
import gu.f;
import gu.l;
import gu.m;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import uj.PushNotificationTokenRetrieved;
import y5.j;
import y5.p0;
import y5.z;
import yh.h;
import zt.n;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/roblox/client/fcm/FCMRegistrationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FCMRegistrationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.fcm.FCMRegistrationWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/fcm/FCMRegistrationWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "authorizePushForUser", BuildConfig.FLAVOR, "b", "(Landroid/content/Context;Z)V", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "AUTHORIZE_PUSH_NOTIFICATIONS_FOR_USER", "PUSH_NOTIFICATION_WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(Companion companion, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            companion.b(context, z10);
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            c(this, context, false, 2, null);
        }

        public final void b(@NotNull Context context, boolean authorizePushForUser) {
            Intrinsics.checkNotNullParameter(context, "context");
            Pair[] pairArr = {s.a("AuthorizePushNotificationsForUser", Boolean.valueOf(authorizePushForUser))};
            androidx.work.b.a aVar = new androidx.work.b.a();
            Pair pair = pairArr[0];
            aVar.b((String) pair.c(), pair.d());
            z zVarB = new z.a(FCMRegistrationWorker.class).o(aVar.a()).b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("PushNotificationWork", j.REPLACE, zVarB);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.fcm.FCMRegistrationWorker", f = "FCMRegistrationWorker.kt", l = {68}, m = "doWork", v = 1)
    public static final class b extends d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f8914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f8915u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8916v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f8917w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f8919y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f8917w = obj;
            this.f8919y |= Integer.MIN_VALUE;
            return FCMRegistrationWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "<anonymous>", "(Lav/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.fcm.FCMRegistrationWorker$doWork$2$1", f = "FCMRegistrationWorker.kt", l = {69}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<av.p0, eu.b<? super String>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f8920t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ FirebaseMessaging f8921u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FirebaseMessaging firebaseMessaging, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f8921u = firebaseMessaging;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f8921u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super String> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f8920t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            Task<String> taskQ = this.f8921u.q();
            Intrinsics.checkNotNullExpressionValue(taskQ, "getToken(...)");
            this.f8920t = 1;
            Object objA = lv.b.a(taskQ, this);
            return objA == objE ? objE : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FCMRegistrationWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        Context context;
        Throwable th2;
        Object objB;
        androidx.work.c.a aVarA;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f8919y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f8919y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f8917w;
        Object objE = fu.c.e();
        int i11 = bVar2.f8919y;
        if (i11 == 0) {
            o.b(obj);
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            dj.b.f().k(applicationContext);
            xm.a.c(applicationContext);
            mi.c.e(applicationContext);
            FirebaseMessaging firebaseMessagingN = FirebaseMessaging.n();
            try {
                n.Companion companion = n.INSTANCE;
                l0 l0VarB = g1.b();
                c cVar = new c(firebaseMessagingN, null);
                bVar2.f8914t = applicationContext;
                bVar2.f8915u = l.a(firebaseMessagingN);
                bVar2.f8916v = 0;
                bVar2.f8919y = 1;
                Object objG = i.g(l0VarB, cVar, bVar2);
                if (objG == objE) {
                    return objE;
                }
                context = applicationContext;
                obj = objG;
            } catch (Throwable th3) {
                context = applicationContext;
                th2 = th3;
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) bVar2.f8914t;
            try {
                o.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                n.Companion companion3 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
        }
        objB = n.b((String) obj);
        Throwable thE = n.e(objB);
        if (thE == null) {
            String str = (String) objB;
            q.h("rbx.push", "RegistrationIntentService.onHandleIntent() Token: " + str);
            boolean zC = getInputData().c("AuthorizePushNotificationsForUser", false);
            r.g("fcm");
            rj.r rVarK = rj.r.k();
            Intrinsics.checkNotNull(str);
            rVarK.y(context, new PushNotificationTokenRetrieved(str, zC));
            aVarA = androidx.work.c.a.d();
        } else {
            q.f("rbx.push", "Unable to retrieve push notification token", thE);
            String message = thE.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            r.f("fcm", message);
            mw.c.d().j(new h("PushNotificationRegistrationFailed"));
            aVarA = androidx.work.c.a.a();
        }
        Intrinsics.checkNotNullExpressionValue(aVarA, "fold(...)");
        return aVarA;
    }
}
