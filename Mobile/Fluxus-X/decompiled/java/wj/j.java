package wj;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import bh.a1;
import bh.j0;
import bh.l0;
import bh.q0;
import bh.t0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.pushnotification.actions.NotificationActionBroadcastReceiver;
import com.roblox.client.pushnotification.v2.CallActionReceiver;
import com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.richpushnotifications.Options;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.protocols.calling.CallingHandler;
import ik.e0;
import ik.k0;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import k2.t;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import rj.b0;
import rj.r;

/* JADX INFO: loaded from: classes2.dex */
public class j implements c {

    public class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f35866a;
        public final /* synthetic */ k2.k.f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xj.f f35867c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0 f35868d;

        public a(Context context, k2.k.f fVar, xj.f fVar2, k0 k0Var) {
            this.f35866a = context;
            this.b = fVar;
            this.f35867c = fVar2;
            this.f35868d = k0Var;
        }

        @Override // ik.e0
        public void a() {
            j.this.q(this.f35866a, this.b, this.f35867c);
            this.f35868d.R(this);
        }

        @Override // ik.e0
        public void b() {
            this.f35868d.R(this);
        }
    }

    public class b implements lm.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35870a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f35871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f35872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Notification f35873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f35874f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ xj.f f35875g;

        public b(String str, Context context, String str2, int i10, Notification notification, boolean z10, xj.f fVar) {
            this.f35870a = str;
            this.b = context;
            this.f35871c = str2;
            this.f35872d = i10;
            this.f35873e = notification;
            this.f35874f = z10;
            this.f35875g = fVar;
        }

        @Override // lm.g.a
        public void C(String str, boolean z10) {
            if (this.f35870a.equals(str) && z10) {
                k2.n.g(this.b).n(this.f35871c, this.f35872d, this.f35873e);
            }
        }

        @Override // lm.g.a
        public void U(String str) {
            if (this.f35870a.equals(str)) {
                k2.n.g(this.b).c(this.f35871c, this.f35872d);
                lm.g.x().w(this);
            }
        }

        @Override // lm.g.a
        public void m0(String str) {
            if (this.f35870a.equals(str)) {
                k2.n.g(this.b).c(this.f35871c, this.f35872d);
                lm.g.x().w(this);
            }
        }

        @Override // lm.g.a
        public void o(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // lm.g.a
        public void p(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // lm.g.a
        public void u(String str, String str2) {
            String str3;
            if (this.f35870a.equals(str)) {
                k2.n nVarG = k2.n.g(this.b);
                nVarG.c(this.f35871c, this.f35872d);
                if ("Miss".equals(str2)) {
                    str3 = "missed";
                } else {
                    str3 = (!"Suppress".equals(str2) || this.f35874f) ? null : "voice not enabled";
                }
                xj.f fVar = this.f35875g.y().get(str3);
                if (fVar != null && nVarG.a()) {
                    nVarG.n(fVar.a(), fVar.d(), j.this.k(this.b, fVar).d());
                }
                lm.g.x().w(this);
            }
        }
    }

    public static /* synthetic */ Unit b(xj.f fVar, Throwable th2) {
        t0.o(fVar, bh.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f21506a;
    }

    public static /* synthetic */ Unit c(xj.f fVar, Throwable th2) {
        t0.p(fVar, bh.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f21506a;
    }

    public static /* synthetic */ Unit e(k2.k.c cVar, xj.f fVar, Bitmap bitmap) {
        cVar.i(bitmap);
        t0.p(fVar, bh.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", BuildConfig.FLAVOR)}));
        return Unit.f21506a;
    }

    public static /* synthetic */ Unit f(RichPushNotificationMedia richPushNotificationMedia, k2.k.c cVar, k2.k.f fVar, xj.f fVar2, Bitmap bitmap) {
        Options options = richPushNotificationMedia.getOptions();
        if (options != null && options.getHidePrimaryImageInExpandedView()) {
            cVar.h(null);
        }
        fVar.u(bitmap);
        t0.o(fVar2, bh.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", BuildConfig.FLAVOR)}));
        return Unit.f21506a;
    }

    @NonNull
    public static Intent m(Context context, xj.f fVar, NotificationAction notificationAction) {
        Intent intent = new Intent(context, (Class<?>) NotificationActionBroadcastReceiver.class);
        intent.setData(Uri.parse("roblox://action/" + fVar.a() + "/" + notificationAction.getId()));
        intent.putExtra("extra-action-id", notificationAction.getId());
        intent.putExtra("extra-action-url", notificationAction.getPostUrl());
        intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        intent.putExtra("extra-notification-request-code", fVar.d());
        intent.putExtra("extra-notification-tag", fVar.a());
        intent.putExtra("extra-notification-group-id", fVar.getGroupId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return intent;
    }

    @NonNull
    public static Intent n(Context context, xj.f fVar, NotificationAction notificationAction) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(notificationAction.getDeeplink()));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", notificationAction.getDeeplink());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        intent.putExtra("extra-notification-tag", fVar.a());
        intent.putExtra("extra-notification-request-code", fVar.d());
        intent.putExtra("extra-notification-group-id", fVar.getGroupId());
        if (notificationAction.getPostUrl() != null) {
            intent.putExtra("extra-action-id", notificationAction.getId());
            intent.putExtra("extra-action-url", notificationAction.getPostUrl());
            intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        }
        return intent;
    }

    @Override // wj.c
    public void a(final Context context, final xj.f fVar) {
        if (context == null || fVar == null) {
            return;
        }
        if (bi.h.a().T4() && "Heartbeat".equals(fVar.c())) {
            return;
        }
        if (!bi.h.a().v0() || u(context, fVar)) {
            if (CallingHandler.isCallingEnabled() && "VoiceCallReceived".equals(fVar.c())) {
                if (a1.q0()) {
                    return;
                }
                CallingHandler.onIncomingCallPush(context, fVar.r(), fVar.getTitle());
                return;
            }
            final k2.k.f fVarK = k(context, fVar);
            if (!a1.q0() && "CallReceived".equals(fVar.c())) {
                if (com.roblox.client.startup.a.m()) {
                    q(context, fVarK, fVar);
                    return;
                }
                k0 k0VarS = k0.s(context.getApplicationContext());
                k0VarS.K(new a(context, fVarK, fVar, k0VarS));
                k0VarS.O();
                return;
            }
            final RichPushNotificationMedia richPushNotificationMediaV = fVar.v();
            if (richPushNotificationMediaV != null) {
                yj.b.f37901a.c(context, richPushNotificationMediaV.getPrimaryImage(), richPushNotificationMediaV.getSecondaryImage(), 5000L, new Function1() { // from class: wj.d
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f35853a.r(richPushNotificationMediaV, fVarK, fVar, context, (yj.a) obj);
                    }
                });
                return;
            }
            Consumer<Bitmap> consumer = new Consumer() { // from class: wj.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f35857a.s(fVarK, context, fVar, (Bitmap) obj);
                }
            };
            if (fVar.q() == xj.e.user) {
                b0.f30739a.c(context, fVar.C(), consumer);
            } else {
                b0.f30739a.b(context, fVar.B(), consumer);
            }
        }
    }

    public final void j(Context context, xj.f fVar, k2.k.f fVar2) {
        for (NotificationAction notificationAction : fVar.u()) {
            int iHash = Objects.hash(Integer.valueOf(fVar.d()), notificationAction.getId());
            boolean zIsEmpty = TextUtils.isEmpty(notificationAction.getDeeplink());
            boolean z10 = !zIsEmpty;
            k2.k.a.C0395a c0395a = new k2.k.a.C0395a(0, notificationAction.getLabel(), !zIsEmpty ? PendingIntent.getActivity(context, iHash, n(context, fVar, notificationAction), 201326592) : PendingIntent.getBroadcast(context, iHash, m(context, fVar, notificationAction), 201326592));
            c0395a.e(notificationAction.getRequireUnlock());
            c0395a.f(z10);
            fVar2.b(c0395a.b());
        }
    }

    public final k2.k.f k(Context context, xj.f fVar) {
        k2.k.f fVar2 = new k2.k.f(context, o(context, fVar));
        fVar2.l(fVar.g(context));
        fVar2.p(fVar.n(context));
        fVar2.A(fVar.t());
        fVar2.I(fVar.getVisibility());
        fVar2.C(fVar.i(context));
        fVar2.n(fVar.getTitle());
        fVar2.m(fVar.getBody());
        fVar2.g(true);
        fVar2.x(fVar.f());
        fVar2.D(fVar.x(context));
        fVar2.y(fVar.e());
        j(context, fVar, fVar2);
        fVar2.s(fVar.getGroupId());
        if (fVar.j()) {
            String string = context.getString(q0.O0);
            fVar2.b(new k2.k.a.C0395a(l0.b, string, p(context, fVar)).a(new t.d("key_reply_message").b(string).a()).d(true).b());
        }
        fVar2.E(new k2.k.d().h(fVar.getBody()));
        return fVar2;
    }

    public final Intent l(Context context, xj.f fVar, long j10, String str, String str2, String str3) {
        String str4;
        if (str2 != null) {
            str4 = String.format(Locale.ROOT, "roblox://placeId=%d&reservedServerAccessCode=%s&callId=%s", Long.valueOf(j10), str2, str3);
        } else {
            str4 = str != null ? String.format(Locale.ROOT, "roblox://placeId=%d&gameInstanceId=%s&callId=%s", Long.valueOf(j10), str, str3) : String.format(Locale.ROOT, "roblox://placeId=%d&callId=%s", Long.valueOf(j10), str3);
        }
        Intent intent = new Intent("push_notification_action");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(str4));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", fVar.c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", str4);
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return intent;
    }

    public final String o(Context context, xj.f fVar) {
        return (bi.h.a().v0() && fVar.w()) ? xj.b.f36743x.getId() : r.k().C(context, fVar);
    }

    public final PendingIntent p(Context context, xj.f fVar) {
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        if (bi.h.a().A2()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", fVar.z());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", fVar.p());
        }
        intent.putExtra("tag", fVar.a());
        intent.putExtra("EXTRA_MESSAGE_ID", fVar.A());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", fVar.getTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", fVar.getId());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", fVar.o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", fVar.h());
        return PendingIntent.getBroadcast(context, fVar.d(), intent, 301989888);
    }

    public final void q(Context context, k2.k.f fVar, xj.f fVar2) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        Context context2;
        String str4;
        long j10;
        Intent intentB;
        PendingIntent broadcast;
        if (!bi.h.a().i4()) {
            q.h("Sendr1PushNotificationHandler", "EnableAndroidCallPushNotification=false, dropping incoming call push.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(fVar2.r());
            String string = jSONObject.getString("CallId");
            String string2 = jSONObject.getString("InstanceId");
            String string3 = jSONObject.getString("ReservedServerAccessCode");
            long j11 = jSONObject.getLong("CallerId");
            String string4 = jSONObject.getString("CallerCombinedName");
            long j12 = jSONObject.getLong("CalleeId");
            String string5 = jSONObject.getString("CalleeCombinedName");
            long j13 = jSONObject.getLong("PlaceId");
            long j14 = jSONObject.getLong("CreatedUtc");
            boolean z10 = jSONObject.getBoolean("IsCalleeMicEnabled");
            String strA = fVar2.a();
            int iD = fVar2.d();
            Intent intentA = CallActionReceiver.a(context, string, strA, iD);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, iD, intentA, 201326592);
            if (z10) {
                str3 = strA;
                i11 = 201326592;
                i10 = iD;
                context2 = context;
                intentB = l(context2, fVar2, j13, string2, string3, string);
                str = string2;
                str2 = string3;
                str4 = string;
                j10 = j13;
                broadcast = PendingIntent.getActivity(context2, i10, intentB, 201326592);
            } else {
                str = string2;
                str2 = string3;
                str3 = strA;
                i10 = iD;
                i11 = 201326592;
                context2 = context;
                str4 = string;
                j10 = j13;
                intentB = CallActionReceiver.b(context2, str4, str3, i10);
                broadcast = PendingIntent.getBroadcast(context2, i10, intentB, 201326592);
            }
            PendingIntent pendingIntent = broadcast;
            Intent intent = intentB;
            Context context3 = context2;
            PendingIntent activity = PendingIntent.getActivity(context3, i10, IncomingCallActivity.H1(context3, intent, intentA, j11, string4, z10), i11);
            fVar.E(k2.k.g.h(new k2.r.c().f(string4).a(), broadcast2, pendingIntent).o(context3.getResources().getColor(j0.f4080c)).p(context3.getResources().getColor(j0.f4081d)));
            fVar.l(activity);
            fVar.r(activity, true);
            fVar.H(rj.n.b);
            Notification notificationD = fVar.d();
            if (fVar2.e()) {
                notificationD.flags |= 36;
            }
            lm.g.x().g(new b(str3, context, str3, i10, notificationD, z10, fVar2));
            lm.g.x().u(str4, j11, string4, j12, string5, j10, str, str2, j14, z10, fVar2.getId());
        } catch (JSONException e10) {
            q.f("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e10);
        }
    }

    public final /* synthetic */ Unit r(final RichPushNotificationMedia richPushNotificationMedia, final k2.k.f fVar, final xj.f fVar2, Context context, yj.a aVar) {
        final k2.k.c cVar = new k2.k.c();
        aVar.b(new Function1() { // from class: wj.f
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.f(richPushNotificationMedia, cVar, fVar, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: wj.g
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.b(fVar2, (Throwable) obj);
            }
        });
        aVar.a(new Function1() { // from class: wj.h
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e(cVar, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: wj.i
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.c(fVar2, (Throwable) obj);
            }
        });
        fVar.E(cVar);
        k2.n.g(context).n(fVar2.a(), fVar2.d(), fVar.d());
        t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
        return Unit.f21506a;
    }

    public final /* synthetic */ void s(k2.k.f fVar, Context context, xj.f fVar2, Bitmap bitmap) {
        if (bitmap != null) {
            fVar.u(bitmap);
        }
        k2.n.g(context).n(fVar2.a(), fVar2.d(), fVar.d());
        t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
    }

    public final void t(Context context, String str, String str2, xj.f fVar) {
        NotificationManager notificationManager;
        StatusBarNotification[] activeNotifications;
        if (TextUtils.isEmpty(str) || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) {
            return;
        }
        k2.k.h hVar = new k2.k.h();
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && str.equals(k2.k.b(notification)) && !k2.k.c(notification) && (i10 = i10 + 1) <= 2) {
                CharSequence charSequence = notification.extras.getCharSequence("android.title");
                hVar.h(charSequence != null ? charSequence.toString() : BuildConfig.FLAVOR);
            }
        }
        k2.n nVarG = k2.n.g(context);
        String str3 = "summary_" + str;
        if (i10 < 1) {
            nVarG.c(str3, 0);
            return;
        }
        String string = context.getString(q0.W0, String.valueOf(i10));
        String string2 = context.getString(q0.V0, String.valueOf(i10));
        hVar.i(string);
        nVarG.n(str3, 0, new k2.k.f(context, str2).C(fVar.i(context)).n(string).m(string2).s(str).t(true).E(hVar).d());
    }

    public final boolean u(Context context, xj.f fVar) {
        if (!fVar.w()) {
            return true;
        }
        NotificationChannel notificationChannelI = k2.n.g(context).i(r.k().C(context, fVar));
        return notificationChannelI == null || notificationChannelI.getImportance() > 0;
    }
}
