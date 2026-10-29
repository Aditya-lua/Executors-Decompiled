package com.roblox.client.pushnotification.actions;

import android.content.Context;
import android.net.Uri;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p248kj.C7621a;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p493vk.C12225g;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12738z;
import p536x5.EnumC12688a;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sg.C11295a1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "a", "Landroidx/work/WorkerParameters;", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NotificationActionEndpointWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters params;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m31665d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "actionId", "notificationId", "actionUrl", "actionBody", "", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "HTTPS_PROTOCOL", "Ljava/lang/String;", "DATA_ACTION_URL", "DATA_ACTION_BODY", "WORK_NAME_PREFIX", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15403a(@NotNull Context context, @NotNull String actionId, @NotNull String notificationId, @NotNull String actionUrl, @NotNull String actionBody) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(notificationId, "notificationId");
            Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
            Intrinsics.checkNotNullParameter(actionBody, "actionBody");
            Pair[] pairArr = {C7352s.m30477a("action-url", actionUrl), C7352s.m30477a("action-body", actionBody)};
            C1116b.a aVar = new C1116b.a();
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                aVar.m6323b((String) pair.m31673c(), pair.m31674d());
            }
            C1116b c1116bM6322a = aVar.m6322a();
            AbstractC12719p0 abstractC12719p0M47401a = AbstractC12719p0.INSTANCE.m47401a(context);
            String str = "notification-action-" + actionId + "-" + notificationId;
            EnumC12706j enumC12706j = EnumC12706j.KEEP;
            C12738z.a aVarM47416k = new C12738z.a(NotificationActionEndpointWorker.class).m47420o(c1116bM6322a).m47416k(new C12694d(EnumC12734x.CONNECTED, false, false, false, 14, null));
            EnumC12688a enumC12688a = EnumC12688a.EXPONENTIAL;
            Duration durationOfSeconds = Duration.ofSeconds(5L);
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            abstractC12719p0M47401a.m47400g(str, enumC12706j, aVarM47416k.m47415j(enumC12688a, durationOfSeconds).m47409b());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker", m39664f = "NotificationActionEndpointWorker.kt", m39665l = {39}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3222b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f12035t;

        /* JADX INFO: renamed from: v */
        public int f12037v;

        public C3222b(InterfaceC9557b<? super C3222b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12035t = obj;
            this.f12037v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return NotificationActionEndpointWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$doWork$2", m39664f = "NotificationActionEndpointWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3223c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12038t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12039u;

        public C3223c(InterfaceC9557b<? super C3223c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3223c c3223c = NotificationActionEndpointWorker.this.new C3223c(interfaceC9557b);
            c3223c.f12039u = obj;
            return c3223c;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            AbstractC1117c.a aVarM6339a;
            C10047c.m38805e();
            if (this.f12038t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            NotificationActionEndpointWorker notificationActionEndpointWorker = NotificationActionEndpointWorker.this;
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                C1116b c1116bM6258d = notificationActionEndpointWorker.params.m6258d();
                String strM6318g = c1116bM6258d.m6318g("action-url");
                if (strM6318g == null) {
                    return AbstractC1117c.a.m6339a();
                }
                String strM6318g2 = c1116bM6258d.m6318g("action-body");
                if (strM6318g2 == null) {
                    strM6318g2 = "";
                }
                Uri uri = Uri.parse(strM6318g);
                String strM42410O = C11295a1.m42410O();
                Intrinsics.checkNotNull(strM42410O);
                if (!C7621a.m31500a(uri, strM42410O)) {
                    C6124q.m27059d("NotificationActionEndpointWorker: URL rejected by domain check. host=" + uri.getHost() + " appDomain=" + strM42410O);
                    return AbstractC1117c.a.m6339a();
                }
                C6124q.m27056a("NotificationActionEndpointWorker: calling " + strM6318g);
                Response responseExecute = C12225g.m45324b().newCall(new Request.Builder().url(strM6318g).post(RequestBody.INSTANCE.create(strM6318g2, MediaType.INSTANCE.get("application/json"))).build()).execute();
                try {
                    C6124q.m27056a("NotificationActionEndpointWorker: response " + responseExecute.code() + " for " + strM6318g);
                    int iCode = responseExecute.code();
                    if (200 > iCode || iCode >= 300) {
                        aVarM6339a = (500 > iCode || iCode >= 600) ? AbstractC1117c.a.m6339a() : AbstractC1117c.a.m6341c();
                    } else {
                        aVarM6339a = AbstractC1117c.a.m6342d();
                    }
                    C11958c.m44629a(responseExecute, null);
                    objM30460b = C7347n.m30460b(aVarM6339a);
                    return C7347n.m30463e(objM30460b) == null ? (AbstractC1117c.a) objM30460b : AbstractC1117c.a.m6341c();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(responseExecute, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th4));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C3223c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationActionEndpointWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3222b c3222b;
        if (interfaceC9557b instanceof C3222b) {
            c3222b = (C3222b) interfaceC9557b;
            int i10 = c3222b.f12037v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3222b.f12037v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3222b = new C3222b(interfaceC9557b);
            }
        } else {
            c3222b = new C3222b(interfaceC9557b);
        }
        Object objM32684g = c3222b.f12035t;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3222b.f12037v;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            C3223c c3223c = new C3223c(null);
            c3222b.f12037v = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, c3223c, c3222b);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        Intrinsics.checkNotNullExpressionValue(objM32684g, "withContext(...)");
        return objM32684g;
    }
}
