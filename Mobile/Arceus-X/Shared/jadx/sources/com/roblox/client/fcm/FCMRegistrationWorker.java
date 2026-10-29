package com.roblox.client.fcm;

import android.content.Context;
import android.os.SystemClock;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import jm.C7209a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import om.C9817r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104ei.C5125c;
import p128ff.C5590e;
import p138fv.C5840c;
import p151gk.C6124q;
import p222jj.C7193r;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p294mj.PushNotificationTokenRetrieved;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p382qh.C10581a;
import p536x5.AbstractC12719p0;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import ph.C10259h;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import vi.C12211b;
import vu.C12264b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m31665d2 = {"Lcom/roblox/client/fcm/FCMRegistrationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class FCMRegistrationWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.roblox.client.fcm.FCMRegistrationWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, m31665d2 = {"Lcom/roblox/client/fcm/FCMRegistrationWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "authorizePushForUser", "", "b", "(Landroid/content/Context;Z)V", "", "TAG", "Ljava/lang/String;", "AUTHORIZE_PUSH_NOTIFICATIONS_FOR_USER", "PUSH_NOTIFICATION_WORK_NAME", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.fcm.FCMRegistrationWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m15109c(Companion companion, Context context, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            companion.m15111b(context, z10);
        }

        /* JADX INFO: renamed from: a */
        public final void m15110a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            m15109c(this, context, false, 2, null);
        }

        /* JADX INFO: renamed from: b */
        public final void m15111b(@NotNull Context context, boolean authorizePushForUser) {
            Intrinsics.checkNotNullParameter(context, "context");
            Pair[] pairArr = {C7352s.m30477a("AuthorizePushNotificationsForUser", Boolean.valueOf(authorizePushForUser))};
            C1116b.a aVar = new C1116b.a();
            Pair pair = pairArr[0];
            aVar.m6323b((String) pair.m31673c(), pair.m31674d());
            C12738z c12738zM47409b = new C12738z.a(FCMRegistrationWorker.class).m47420o(aVar.m6322a()).m47409b();
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("PushNotificationWork", EnumC12706j.REPLACE, c12738zM47409b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.fcm.FCMRegistrationWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.fcm.FCMRegistrationWorker", m39664f = "FCMRegistrationWorker.kt", m39665l = {86}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3182b extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f11784B;

        /* JADX INFO: renamed from: t */
        public Object f11785t;

        /* JADX INFO: renamed from: u */
        public Object f11786u;

        /* JADX INFO: renamed from: v */
        public long f11787v;

        /* JADX INFO: renamed from: w */
        public long f11788w;

        /* JADX INFO: renamed from: x */
        public boolean f11789x;

        /* JADX INFO: renamed from: y */
        public int f11790y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f11791z;

        public C3182b(InterfaceC9557b<? super C3182b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11791z = obj;
            this.f11784B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FCMRegistrationWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.fcm.FCMRegistrationWorker$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljava/lang/String;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.fcm.FCMRegistrationWorker$doWork$2$1", m39664f = "FCMRegistrationWorker.kt", m39665l = {87}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3183c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super String>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11792t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ FirebaseMessaging f11793u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3183c(FirebaseMessaging firebaseMessaging, InterfaceC9557b<? super C3183c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f11793u = firebaseMessaging;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3183c(this.f11793u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f11792t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            Task<String> taskM14433q = this.f11793u.m14433q();
            Intrinsics.checkNotNullExpressionValue(taskM14433q, "getToken(...)");
            this.f11792t = 1;
            Object objM45512a = C12264b.m45512a(taskM14433q, this);
            return objM45512a == objM38805e ? objM38805e : objM45512a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super String> interfaceC9557b) {
            return ((C3183c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
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
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3182b c3182b;
        Context context;
        Throwable th2;
        long j10;
        Object objM30460b;
        AbstractC1117c.a aVarM6339a;
        if (interfaceC9557b instanceof C3182b) {
            c3182b = (C3182b) interfaceC9557b;
            int i10 = c3182b.f11784B;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3182b.f11784B = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3182b = new C3182b(interfaceC9557b);
            }
        } else {
            c3182b = new C3182b(interfaceC9557b);
        }
        Object obj = c3182b.f11791z;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3182b.f11784B;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C12211b.m45200f().m45210l(applicationContext);
            C7209a.m30129c(applicationContext);
            C5125c.m23921e(applicationContext);
            boolean zIsEmpty = C5590e.m25259k(applicationContext).isEmpty();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zIsEmpty) {
                C5590e.m25261q(applicationContext);
            }
            C10581a.m40564a("fcm_worker", zIsEmpty, SystemClock.elapsedRealtime() - jElapsedRealtime2);
            FirebaseMessaging.m14421n().m14440y(true);
            FirebaseMessaging firebaseMessagingM14421n = FirebaseMessaging.m14421n();
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                C3183c c3183c = new C3183c(firebaseMessagingM14421n, null);
                c3182b.f11785t = applicationContext;
                c3182b.f11786u = C10350l.m39676a(firebaseMessagingM14421n);
                c3182b.f11787v = jElapsedRealtime;
                c3182b.f11789x = zIsEmpty;
                c3182b.f11788w = jElapsedRealtime2;
                c3182b.f11790y = 0;
                c3182b.f11784B = 1;
                Object objM32684g = C7872i.m32684g(abstractC7888l0M32644b, c3183c, c3182b);
                if (objM32684g == objM38805e) {
                    return objM38805e;
                }
                context = applicationContext;
                obj = objM32684g;
                j10 = jElapsedRealtime;
            } catch (Throwable th3) {
                context = applicationContext;
                th2 = th3;
                j10 = jElapsedRealtime;
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = c3182b.f11787v;
            context = (Context) c3182b.f11785t;
            try {
                C7348o.m30470b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                C7347n.Companion companion3 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
        }
        objM30460b = C7347n.m30460b((String) obj);
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e == null) {
            String str = (String) objM30460b;
            C6124q.m27063h("rbx.push", "RegistrationIntentService.onHandleIntent() Token: " + str);
            boolean zM6314c = getInputData().m6314c("AuthorizePushNotificationsForUser", false);
            C10581a.m40565c(SystemClock.elapsedRealtime() - j10, zM6314c);
            C9817r.m38674i("fcm");
            C7193r c7193rM30069k = C7193r.m30069k();
            Intrinsics.checkNotNull(str);
            c7193rM30069k.m30094y(context, new PushNotificationTokenRetrieved(str, zM6314c));
            aVarM6339a = AbstractC1117c.a.m6342d();
        } else {
            C6124q.m27061f("rbx.push", "Unable to retrieve push notification token", thM30463e);
            String message = thM30463e.getMessage();
            if (message == null) {
                message = "";
            }
            C9817r.m38673h("fcm", message);
            C5840c.m26204d().m26211j(new C10259h("PushNotificationRegistrationFailed"));
            aVarM6339a = AbstractC1117c.a.m6339a();
        }
        Intrinsics.checkNotNullExpressionValue(aVarM6339a, "fold(...)");
        return aVarM6339a;
    }
}
