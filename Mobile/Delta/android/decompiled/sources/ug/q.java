package ug;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import com.roblox.client.db.RobloxDatabase;
import iu.g1;
import iu.p0;
import iu.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lug/q;", "", "<init>", "()V", "", "notificationId", "", "a", "(Ljava/lang/String;)V", "Lkh/i;", "b", "()Lkh/i;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f32919a = new q();

    @nt.f(c = "com.roblox.client.analytics.NotificationMonitoring$checkDuplicateNotificationId$1$1", f = "NotificationMonitoring.kt", l = {25, 31, 33}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends nt.m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f32920t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f32921u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f32922v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kh.i f32923w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f32924x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kh.i iVar, String str, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f32923w = iVar;
            this.f32924x = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f32923w, this.f32924x, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r9 == r0) goto L25;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = mt.c.e()
                int r1 = r8.f32922v
                java.lang.String r2 = "NotificationMonitoring"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L26
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                gt.o.b(r9)
                goto L9a
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                long r4 = r8.f32920t
                gt.o.b(r9)
                goto L83
            L26:
                long r5 = r8.f32920t
                gt.o.b(r9)
                goto L43
            L2c:
                gt.o.b(r9)
                long r6 = java.lang.System.currentTimeMillis()
                kh.i r9 = r8.f32923w
                java.lang.String r1 = r8.f32924x
                r8.f32920t = r6
                r8.f32922v = r5
                java.lang.Object r9 = r9.e(r1, r8)
                if (r9 != r0) goto L42
                goto L99
            L42:
                r5 = r6
            L43:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L6a
                java.lang.String r9 = r8.f32924x
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "Duplicate notification id: "
                r1.append(r7)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                ek.q.h(r2, r9)
                ti.g r9 = ti.g.b()
                java.lang.String r1 = "Event-Upload-Received-Duplicate-Notification-Id"
                r9.q(r1)
            L6a:
                kh.i r9 = r8.f32923w
                lh.b r1 = new lh.b
                java.lang.String r7 = r8.f32924x
                r1.<init>(r7, r5)
                lh.b[] r1 = new lh.NotificationId[]{r1}
                r8.f32920t = r5
                r8.f32922v = r4
                java.lang.Object r9 = r9.b(r1, r8)
                if (r9 != r0) goto L82
                goto L99
            L82:
                r4 = r5
            L83:
                rh.i r9 = rh.h.a()
                int r9 = r9.m1()
                kh.i r1 = r8.f32923w
                r8.f32920t = r4
                r8.f32921u = r9
                r8.f32922v = r3
                java.lang.Object r9 = r1.d(r9, r8)
                if (r9 != r0) goto L9a
            L99:
                return r0
            L9a:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r9 <= 0) goto Lbb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Deleted "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = " oldest notification ids"
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                ek.q.h(r2, r9)
            Lbb:
                kotlin.Unit r9 = kotlin.Unit.f22938a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ug.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        kh.i iVarB = f32919a.b();
        if (iVarB != null) {
            iu.k.d(q0.a(g1.b()), null, null, new a(iVarB, notificationId, null), 3, null);
        }
    }

    public final kh.i b() {
        jh.c cVar = jh.c.f21914a;
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        RobloxDatabase robloxDatabaseB = cVar.b(contextF);
        if (robloxDatabaseB != null) {
            return robloxDatabaseB.Y();
        }
        return null;
    }
}
