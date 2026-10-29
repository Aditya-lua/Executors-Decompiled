package com.roblox.client.pushnotification;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.google.firebase.messaging.RemoteMessage;
import com.roblox.client.ossearch.OSSearchIndexSyncWorker;
import com.roblox.client.pushnotification.ossettingsreporting.NotificationPushAckWorker;
import gk.c0;
import gk.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import jj.a0;
import jj.r;
import jt.n;
import jt.o;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import oj.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.a1;
import th.h;
import x5.j;
import x5.p0;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\u0011\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/roblox/client/pushnotification/PushHandlerWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Landroidx/work/b;", "notifData", "", "e", "(Landroidx/work/b;)V", "d", "()V", "c", "a", "Landroidx/work/WorkerParameters;", "Loj/a;", "b", "Loj/a;", "getNotificationOperator", "()Loj/a;", "setNotificationOperator", "(Loj/a;)V", "getNotificationOperator$annotations", "notificationOperator", "Ljj/a0;", "Ljj/a0;", "getLegacyNotificationOperator", "()Ljj/a0;", "setLegacyNotificationOperator", "(Ljj/a0;)V", "getLegacyNotificationOperator$annotations", "legacyNotificationOperator", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PushHandlerWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkerParameters parameters;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public a notificationOperator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public a0 legacyNotificationOperator;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.PushHandlerWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/pushnotification/PushHandlerWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "a", "(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)V", "", "TAG", "Ljava/lang/String;", "KEY_PRIORITY", "KEY_ORIGINAL_PRIORITY", "PUSH_HANDLER_WORK_NAME", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context appContext, @NotNull RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            z.a aVar = new z.a(PushHandlerWorker.class);
            f0 f0Var = new f0(3);
            f0Var.a(s.a("priority", Integer.valueOf(remoteMessage.y3())));
            f0Var.a(s.a("originalPriority", Integer.valueOf(remoteMessage.x3())));
            Map<String, String> mapV3 = remoteMessage.v3();
            Intrinsics.checkNotNullExpressionValue(mapV3, "getData(...)");
            ArrayList arrayList = new ArrayList(mapV3.size());
            for (Map.Entry<String, String> entry : mapV3.entrySet()) {
                arrayList.add(s.a(entry.getKey(), entry.getValue()));
            }
            f0Var.b(arrayList.toArray(new Pair[0]));
            Pair[] pairArr = (Pair[]) f0Var.d(new Pair[f0Var.c()]);
            b.a aVar2 = new b.a();
            for (Pair pair : pairArr) {
                aVar2.b((String) pair.c(), pair.d());
            }
            z.a aVarO = aVar.o(aVar2.a());
            if (Build.VERSION.SDK_INT >= 31 && remoteMessage.y3() == 1) {
                aVarO.l(x5.f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            z zVarB = aVarO.b();
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = appContext.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("PushHandlerWorkUniqueWork", j.APPEND_OR_REPLACE, zVarB);
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushHandlerWorker(@NotNull Context appContext, @NotNull WorkerParameters parameters) {
        super(appContext, parameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
        this.notificationOperator = new a();
        this.legacyNotificationOperator = new a0();
    }

    public static final void b(@NotNull Context context, @NotNull RemoteMessage remoteMessage) {
        INSTANCE.a(context, remoteMessage);
    }

    public final void c() {
        b bVarD = this.parameters.d();
        Intrinsics.checkNotNullExpressionValue(bVarD, "getInputData(...)");
        int iD = bVarD.d("priority", 0);
        int iD2 = bVarD.d("originalPriority", 0);
        String strG = bVarD.g("notificationId");
        if (strG != null) {
            c0 c0Var = new c0();
            String strG2 = bVarD.g("ack-metadata");
            String strG3 = bVarD.g("notificationType");
            NotificationPushAckWorker.Companion companion = NotificationPushAckWorker.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            String mDeviceId = a1.f30732t;
            Intrinsics.checkNotNullExpressionValue(mDeviceId, "mDeviceId");
            companion.a(applicationContext, new NotificationPushAckWorker.b.NotificationAckInput(mDeviceId, c0Var.a(), strG, strG2, strG3, iD, iD2));
        }
    }

    public final void d() {
        c();
        if (h.a().E1()) {
            r.E(getApplicationContext());
        }
    }

    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull nt.b<? super c.a> bVar) {
        Object objB;
        c.a aVarA;
        try {
            n.Companion companion = n.INSTANCE;
            vi.b.f().l(getApplicationContext());
            com.roblox.client.startup.a.s(getApplicationContext());
            b bVarD = this.parameters.d();
            Intrinsics.checkNotNullExpressionValue(bVarD, "getInputData(...)");
            String strG = bVarD.g("version");
            p.h("MessageReceivedWorker", "NotificationVersion: " + strG);
            qi.b.f().u(getApplicationContext());
            if (h.a().h5()) {
                e(bVarD);
            }
            d();
            if (k2.n.e(getApplicationContext()).a()) {
                if (strG != null) {
                    Map<String, Object> mapE = bVarD.e();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(mapE.size()));
                    for (Object obj : mapE.entrySet()) {
                        Object key = ((Map.Entry) obj).getKey();
                        Object value = ((Map.Entry) obj).getValue();
                        linkedHashMap.put(key, value != null ? value.toString() : null);
                    }
                    this.notificationOperator.d(getApplicationContext(), linkedHashMap);
                } else {
                    String strG2 = bVarD.g("message");
                    p.h("MessageReceivedWorker", "Message: " + strG2);
                    this.legacyNotificationOperator.g(getApplicationContext(), strG2);
                }
            }
            objB = n.b(Unit.f22483a);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE == null) {
            p.h("MessageReceivedWorker", "PushHandlerWorker completed successfully.");
            aVarA = c.a.d();
        } else {
            p.f("MessageReceivedWorker", "PushHandlerWorker failed with error: " + thE.getMessage(), thE);
            aVarA = c.a.a();
        }
        Intrinsics.checkNotNullExpressionValue(aVarA, "fold(...)");
        return aVarA;
    }

    public final void e(b notifData) {
        if (Intrinsics.c(notifData.g("notificationType"), "Heartbeat")) {
            OSSearchIndexSyncWorker.Companion companion = OSSearchIndexSyncWorker.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.c(applicationContext);
        }
    }
}
