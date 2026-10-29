package vg;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import com.roblox.client.p050db.RobloxDatabase;
import kh.C7613c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mh.NotificationId;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p272lh.InterfaceC8145i;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: renamed from: vg.q */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lvg/q;", "", "<init>", "()V", "", "notificationId", "", "a", "(Ljava/lang/String;)V", "Llh/i;", "b", "()Llh/i;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12187q {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12187q f42952a = new C12187q();

    /* JADX INFO: renamed from: vg.q$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.NotificationMonitoring$checkDuplicateNotificationId$1$1", m39664f = "NotificationMonitoring.kt", m39665l = {25, 31, 33}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f42953t;

        /* JADX INFO: renamed from: u */
        public int f42954u;

        /* JADX INFO: renamed from: v */
        public int f42955v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ InterfaceC8145i f42956w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f42957x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC8145i interfaceC8145i, String str, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f42956w = interfaceC8145i;
            this.f42957x = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f42956w, this.f42957x, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
        
            if (r9 == r0) goto L25;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j10;
            long j11;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f42955v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC8145i interfaceC8145i = this.f42956w;
                String str = this.f42957x;
                this.f42953t = jCurrentTimeMillis;
                this.f42955v = 1;
                obj = interfaceC8145i.mo33389c(str, this);
                if (obj != objM38805e) {
                    j10 = jCurrentTimeMillis;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                j10 = this.f42953t;
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                j11 = this.f42953t;
                C7348o.m30470b(obj);
                int iMo43654j1 = C11659h.m43403a().mo43654j1();
                InterfaceC8145i interfaceC8145i2 = this.f42956w;
                this.f42953t = j11;
                this.f42954u = iMo43654j1;
                this.f42955v = 3;
                obj = interfaceC8145i2.mo33390d(iMo43654j1, this);
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue > 0) {
                C6124q.m27063h("NotificationMonitoring", "Deleted " + iIntValue + " oldest notification ids");
            }
            return Unit.f29331a;
            if (((Boolean) obj).booleanValue()) {
                C6124q.m27063h("NotificationMonitoring", "Duplicate notification id: " + this.f42957x);
                C12216g.m45228b().m45278q("Event-Upload-Received-Duplicate-Notification-Id");
            }
            InterfaceC8145i interfaceC8145i3 = this.f42956w;
            NotificationId[] notificationIdArr = {new NotificationId(this.f42957x, j10)};
            this.f42953t = j10;
            this.f42955v = 2;
            if (interfaceC8145i3.mo33388b(notificationIdArr, this) != objM38805e) {
                j11 = j10;
                int iMo43654j2 = C11659h.m43403a().mo43654j1();
                InterfaceC8145i interfaceC8145i4 = this.f42956w;
                this.f42953t = j11;
                this.f42954u = iMo43654j2;
                this.f42955v = 3;
                obj = interfaceC8145i4.mo33390d(iMo43654j2, this);
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m45146a(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        InterfaceC8145i interfaceC8145iM45147b = f42952a.m45147b();
        if (interfaceC8145iM45147b != null) {
            C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new a(interfaceC8145iM45147b, notificationId, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC8145i m45147b() {
        C7613c c7613c = C7613c.f29132a;
        Context contextM14834f = RobloxApplication.m14834f();
        Intrinsics.checkNotNullExpressionValue(contextM14834f, "getAppContext(...)");
        RobloxDatabase robloxDatabaseM31498b = c7613c.m31498b(contextM14834f);
        if (robloxDatabaseM31498b != null) {
            return robloxDatabaseM31498b.mo15102Y();
        }
        return null;
    }
}
