package com.roblox.client.pushnotification.actions;

import android.content.Context;
import android.net.Uri;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import bh.a1;
import cl.g;
import com.github.luben.zstd.BuildConfig;
import gu.f;
import gu.m;
import java.time.Duration;
import mv.b0;
import mv.f0;
import mv.g0;
import mv.h0;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import y5.d;
import y5.j;
import y5.p0;
import y5.x;
import y5.z;
import zt.n;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "a", "Landroidx/work/WorkerParameters;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotificationActionEndpointWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters params;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/roblox/client/pushnotification/actions/NotificationActionEndpointWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "actionId", "notificationId", "actionUrl", "actionBody", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "HTTPS_PROTOCOL", "Ljava/lang/String;", "DATA_ACTION_URL", "DATA_ACTION_BODY", "WORK_NAME_PREFIX", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull String actionId, @NotNull String notificationId, @NotNull String actionUrl, @NotNull String actionBody) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(notificationId, "notificationId");
            Intrinsics.checkNotNullParameter(actionUrl, "actionUrl");
            Intrinsics.checkNotNullParameter(actionBody, "actionBody");
            Pair[] pairArr = {s.a("action-url", actionUrl), s.a("action-body", actionBody)};
            androidx.work.b.a aVar = new androidx.work.b.a();
            for (int i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                aVar.b((String) pair.c(), pair.d());
            }
            androidx.work.b bVarA = aVar.a();
            p0 p0VarA = p0.INSTANCE.a(context);
            String str = "notification-action-" + actionId + "-" + notificationId;
            j jVar = j.KEEP;
            z.a aVarK = new z.a(NotificationActionEndpointWorker.class).o(bVarA).k(new d(x.CONNECTED, false, false, false, 14, null));
            y5.a aVar2 = y5.a.EXPONENTIAL;
            Duration durationOfSeconds = Duration.ofSeconds(5L);
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
            p0VarA.g(str, jVar, aVarK.j(aVar2, durationOfSeconds).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker", f = "NotificationActionEndpointWorker.kt", l = {39}, m = "doWork", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9129t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9131v;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9129t = obj;
            this.f9131v |= Integer.MIN_VALUE;
            return NotificationActionEndpointWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lav/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.pushnotification.actions.NotificationActionEndpointWorker$doWork$2", f = "NotificationActionEndpointWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<av.p0, eu.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9132t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9133u;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = NotificationActionEndpointWorker.this.new c(bVar);
            cVar.f9133u = obj;
            return cVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            androidx.work.c.a aVarA;
            fu.c.e();
            if (this.f9132t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            NotificationActionEndpointWorker notificationActionEndpointWorker = NotificationActionEndpointWorker.this;
            try {
                n.Companion companion = n.INSTANCE;
                androidx.work.b bVarD = notificationActionEndpointWorker.params.d();
                String strG = bVarD.g("action-url");
                if (strG == null) {
                    return androidx.work.c.a.a();
                }
                String strG2 = bVarD.g("action-body");
                if (strG2 == null) {
                    strG2 = BuildConfig.FLAVOR;
                }
                Uri uri = Uri.parse(strG);
                String strO = a1.O();
                Intrinsics.checkNotNull(strO);
                if (!sj.a.a(uri, strO)) {
                    q.d("NotificationActionEndpointWorker: URL rejected by domain check. host=" + uri.getHost() + " appDomain=" + strO);
                    return androidx.work.c.a.a();
                }
                q.a("NotificationActionEndpointWorker: calling " + strG);
                h0 h0VarJ = g.b().a(new f0.a().t(strG).p(g0.INSTANCE.c(strG2, b0.INSTANCE.a("application/json"))).b()).j();
                try {
                    q.a("NotificationActionEndpointWorker: response " + h0VarJ.getCode() + " for " + strG);
                    int code = h0VarJ.getCode();
                    if (200 > code || code >= 300) {
                        aVarA = (500 > code || code >= 600) ? androidx.work.c.a.a() : androidx.work.c.a.c();
                    } else {
                        aVarA = androidx.work.c.a.d();
                    }
                    lu.c.a(h0VarJ, null);
                    objB = n.b(aVarA);
                    return n.e(objB) == null ? (androidx.work.c.a) objB : androidx.work.c.a.c();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(h0VarJ, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th4));
            }
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
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f9131v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f9131v = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f9129t;
        Object objE = fu.c.e();
        int i11 = bVar2.f9131v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0VarB = g1.b();
            c cVar = new c(null);
            bVar2.f9131v = 1;
            objG = i.g(l0VarB, cVar, bVar2);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        Intrinsics.checkNotNullExpressionValue(objG, "withContext(...)");
        return objG;
    }
}
