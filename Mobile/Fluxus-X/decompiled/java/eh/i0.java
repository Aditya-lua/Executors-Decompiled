package eh;

import android.content.Context;
import av.g1;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.db.RobloxDatabase;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import vh.NotificationId;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Leh/i0;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "notificationId", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", "Luh/i;", "b", "()Luh/i;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i0 f13538a = new i0();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.analytics.NotificationMonitoring$checkDuplicateNotificationId$1$1", f = "NotificationMonitoring.kt", l = {25, 31, 33}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f13539t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13540u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13541v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ uh.i f13542w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13543x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uh.i iVar, String str, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f13542w = iVar;
            this.f13543x = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f13542w, this.f13543x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r9 == r0) goto L25;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j10;
            long j11;
            Object objE = fu.c.e();
            int i10 = this.f13541v;
            if (i10 == 0) {
                zt.o.b(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                uh.i iVar = this.f13542w;
                String str = this.f13543x;
                this.f13539t = jCurrentTimeMillis;
                this.f13541v = 1;
                obj = iVar.c(str, this);
                if (obj != objE) {
                    j10 = jCurrentTimeMillis;
                }
                return objE;
            }
            if (i10 == 1) {
                j10 = this.f13539t;
                zt.o.b(obj);
            } else if (i10 == 2) {
                j11 = this.f13539t;
                zt.o.b(obj);
                int iM1 = bi.h.a().m1();
                uh.i iVar2 = this.f13542w;
                this.f13539t = j11;
                this.f13540u = iM1;
                this.f13541v = 3;
                obj = iVar2.a(iM1, this);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue > 0) {
                ok.q.h("NotificationMonitoring", "Deleted " + iIntValue + " oldest notification ids");
            }
            return Unit.f21506a;
            if (((Boolean) obj).booleanValue()) {
                ok.q.h("NotificationMonitoring", "Duplicate notification id: " + this.f13543x);
                dj.g.b().q("Event-Upload-Received-Duplicate-Notification-Id");
            }
            uh.i iVar3 = this.f13542w;
            NotificationId[] notificationIdArr = {new NotificationId(this.f13543x, j10)};
            this.f13539t = j10;
            this.f13541v = 2;
            if (iVar3.e(notificationIdArr, this) != objE) {
                j11 = j10;
                int iM2 = bi.h.a().m1();
                uh.i iVar4 = this.f13542w;
                this.f13539t = j11;
                this.f13540u = iM2;
                this.f13541v = 3;
                obj = iVar4.a(iM2, this);
            }
            return objE;
        }
    }

    public static final void a(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        uh.i iVarB = f13538a.b();
        if (iVarB != null) {
            av.k.d(av.q0.a(g1.b()), null, null, new a(iVarB, notificationId, null), 3, null);
        }
    }

    public final uh.i b() {
        th.c cVar = th.c.f32426a;
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextF);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.Y();
        }
        return null;
    }
}
