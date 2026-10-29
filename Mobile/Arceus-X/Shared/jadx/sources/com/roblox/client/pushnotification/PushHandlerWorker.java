package com.roblox.client.pushnotification;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.messaging.RemoteMessage;
import com.roblox.client.ossearch.OSSearchIndexSyncWorker;
import com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker;
import com.roblox.client.startup.C3272a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.jvm.internal.C7735f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6110d0;
import p151gk.C6124q;
import p222jj.C7175a0;
import p222jj.C7193r;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p235k2.C7422n;
import p315nt.InterfaceC9557b;
import p334oj.C9742a;
import p383qi.C10583b;
import p536x5.AbstractC12719p0;
import p536x5.C12738z;
import p536x5.EnumC12699f0;
import p536x5.EnumC12706j;
import sg.C11295a1;
import th.C11659h;
import vi.C12211b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\u0011\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, m31665d2 = {"Lcom/roblox/client/pushnotification/PushHandlerWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Landroidx/work/b;", "notifData", "", "e", "(Landroidx/work/b;)V", "d", "()V", "c", "a", "Landroidx/work/WorkerParameters;", "Loj/a;", "b", "Loj/a;", "getNotificationOperator", "()Loj/a;", "setNotificationOperator", "(Loj/a;)V", "getNotificationOperator$annotations", "notificationOperator", "Ljj/a0;", "Ljj/a0;", "getLegacyNotificationOperator", "()Ljj/a0;", "setLegacyNotificationOperator", "(Ljj/a0;)V", "getLegacyNotificationOperator$annotations", "legacyNotificationOperator", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PushHandlerWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkerParameters parameters;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public C9742a notificationOperator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public C7175a0 legacyNotificationOperator;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.PushHandlerWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/pushnotification/PushHandlerWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "a", "(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)V", "", "TAG", "Ljava/lang/String;", "KEY_PRIORITY", "KEY_ORIGINAL_PRIORITY", "PUSH_HANDLER_WORK_NAME", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.PushHandlerWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15401a(@NotNull Context appContext, @NotNull RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            C12738z.a aVar = new C12738z.a(PushHandlerWorker.class);
            C7735f0 c7735f0 = new C7735f0(3);
            c7735f0.m32030a(C7352s.m30477a("priority", Integer.valueOf(remoteMessage.m14451y3())));
            c7735f0.m32030a(C7352s.m30477a("originalPriority", Integer.valueOf(remoteMessage.m14450x3())));
            Map<String, String> mapM14448v3 = remoteMessage.m14448v3();
            Intrinsics.checkNotNullExpressionValue(mapM14448v3, "getData(...)");
            ArrayList arrayList = new ArrayList(mapM14448v3.size());
            for (Map.Entry<String, String> entry : mapM14448v3.entrySet()) {
                arrayList.add(C7352s.m30477a(entry.getKey(), entry.getValue()));
            }
            c7735f0.m32031b(arrayList.toArray(new Pair[0]));
            Pair[] pairArr = (Pair[]) c7735f0.m32033d(new Pair[c7735f0.m32032c()]);
            C1116b.a aVar2 = new C1116b.a();
            for (Pair pair : pairArr) {
                aVar2.m6323b((String) pair.m31673c(), pair.m31674d());
            }
            C12738z.a aVarM47420o = aVar.m47420o(aVar2.m6322a());
            if (Build.VERSION.SDK_INT >= 31 && remoteMessage.m14451y3() == 1) {
                aVarM47420o.m47417l(EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            C12738z c12738zM47409b = aVarM47420o.m47409b();
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("PushHandlerWorkUniqueWork", EnumC12706j.APPEND_OR_REPLACE, c12738zM47409b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushHandlerWorker(@NotNull Context appContext, @NotNull WorkerParameters parameters) {
        super(appContext, parameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
        this.notificationOperator = new C9742a();
        this.legacyNotificationOperator = new C7175a0();
    }

    /* JADX INFO: renamed from: b */
    public static final void m15397b(@NotNull Context context, @NotNull RemoteMessage remoteMessage) {
        INSTANCE.m15401a(context, remoteMessage);
    }

    /* JADX INFO: renamed from: c */
    public final void m15398c() {
        C1116b c1116bM6258d = this.parameters.m6258d();
        Intrinsics.checkNotNullExpressionValue(c1116bM6258d, "getInputData(...)");
        int iM6315d = c1116bM6258d.m6315d("priority", 0);
        int iM6315d2 = c1116bM6258d.m6315d("originalPriority", 0);
        String strM6318g = c1116bM6258d.m6318g("notificationId");
        if (strM6318g != null) {
            C6110d0 c6110d0 = new C6110d0();
            String strM6318g2 = c1116bM6258d.m6318g("ack-metadata");
            String strM6318g3 = c1116bM6258d.m6318g("notificationType");
            NotificationPushAckWorker.Companion companion = NotificationPushAckWorker.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String mDeviceId = C11295a1.f39656t;
            Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
            companion.m15441a(applicationContext, new NotificationPushAckWorker.AbstractC3236b.NotificationAckInput(mDeviceId, c6110d0.mo27016a(), strM6318g, strM6318g2, strM6318g3, iM6315d, iM6315d2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15399d() {
        m15398c();
        if (C11659h.m43403a().mo43476K1()) {
            C7193r.m30062E(getApplicationContext());
        }
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        Object objM30460b;
        AbstractC1117c.a aVarM6339a;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            C12211b.m45200f().m45210l(getApplicationContext());
            C3272a.m15711s(getApplicationContext());
            C1116b c1116bM6258d = this.parameters.m6258d();
            Intrinsics.checkNotNullExpressionValue(c1116bM6258d, "getInputData(...)");
            String strM6318g = c1116bM6258d.m6318g("version");
            C6124q.m27063h("MessageReceivedWorker", "NotificationVersion: " + strM6318g);
            C10583b.m40569f().m40587u(getApplicationContext());
            if (C11659h.m43403a().mo43686n5()) {
                m15400e(c1116bM6258d);
            }
            m15399d();
            if (C7422n.m30883e(getApplicationContext()).m30886a()) {
                if (strM6318g != null) {
                    Map<String, Object> mapM6316e = c1116bM6258d.m6316e();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(mapM6316e.size()));
                    for (Object obj : mapM6316e.entrySet()) {
                        Object key = ((Map.Entry) obj).getKey();
                        Object value = ((Map.Entry) obj).getValue();
                        linkedHashMap.put(key, value != null ? value.toString() : null);
                    }
                    this.notificationOperator.m38547d(getApplicationContext(), linkedHashMap);
                } else {
                    String strM6318g2 = c1116bM6258d.m6318g("message");
                    C6124q.m27063h("MessageReceivedWorker", "Message: " + strM6318g2);
                    this.legacyNotificationOperator.m29976g(getApplicationContext(), strM6318g2);
                }
            }
            objM30460b = C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e == null) {
            C6124q.m27063h("MessageReceivedWorker", "PushHandlerWorker completed successfully.");
            aVarM6339a = AbstractC1117c.a.m6342d();
        } else {
            C6124q.m27061f("MessageReceivedWorker", "PushHandlerWorker failed with error: " + thM30463e.getMessage(), thM30463e);
            aVarM6339a = AbstractC1117c.a.m6339a();
        }
        Intrinsics.checkNotNullExpressionValue(aVarM6339a, "fold(...)");
        return aVarM6339a;
    }

    /* JADX INFO: renamed from: e */
    public final void m15400e(C1116b notifData) {
        if (Intrinsics.m31980c(notifData.m6318g("notificationType"), "Heartbeat")) {
            OSSearchIndexSyncWorker.Companion companion = OSSearchIndexSyncWorker.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m15294c(applicationContext);
        }
    }
}
