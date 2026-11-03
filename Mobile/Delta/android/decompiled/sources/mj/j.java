package mj;

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
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.pushnotification.actions.NotificationActionBroadcastReceiver;
import com.roblox.client.pushnotification.v2.CallActionReceiver;
import com.roblox.client.pushnotification.v2.SendrChatMessageReplyHandler;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.richpushnotifications.Options;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ek.q;
import hj.b0;
import hj.r;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import k2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.j0;
import rg.l0;
import rg.q0;
import rg.t0;
import yj.e0;
import yj.k0;

/* JADX INFO: loaded from: classes2.dex */
public class j implements c {

    public class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f24860a;
        public final /* synthetic */ k2.k.f b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nj.f f24861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0 f24862d;

        public a(Context context, k2.k.f fVar, nj.f fVar2, k0 k0Var) {
            this.f24860a = context;
            this.b = fVar;
            this.f24861c = fVar2;
            this.f24862d = k0Var;
        }

        @Override // yj.e0
        public void a() {
            j.this.q(this.f24860a, this.b, this.f24861c);
            this.f24862d.R(this);
        }

        @Override // yj.e0
        public void b() {
            this.f24862d.R(this);
        }
    }

    public class b implements vl.g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f24864a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f24865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f24866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Notification f24867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f24868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ nj.f f24869g;

        public b(String str, Context context, String str2, int i10, Notification notification, boolean z10, nj.f fVar) {
            this.f24864a = str;
            this.b = context;
            this.f24865c = str2;
            this.f24866d = i10;
            this.f24867e = notification;
            this.f24868f = z10;
            this.f24869g = fVar;
        }

        @Override // vl.g.a
        public void B(String str, boolean z10) {
            if (this.f24864a.equals(str) && z10) {
                k2.n.f(this.b).m(this.f24865c, this.f24866d, this.f24867e);
            }
        }

        @Override // vl.g.a
        public void U(String str) {
            if (this.f24864a.equals(str)) {
                k2.n.f(this.b).b(this.f24865c, this.f24866d);
                vl.g.x().w(this);
            }
        }

        @Override // vl.g.a
        public void m0(String str) {
            if (this.f24864a.equals(str)) {
                k2.n.f(this.b).b(this.f24865c, this.f24866d);
                vl.g.x().w(this);
            }
        }

        @Override // vl.g.a
        public void o(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // vl.g.a
        public void p(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // vl.g.a
        public void u(String str, String str2) {
            String str3;
            if (this.f24864a.equals(str)) {
                k2.n nVarF = k2.n.f(this.b);
                nVarF.b(this.f24865c, this.f24866d);
                if ("Miss".equals(str2)) {
                    str3 = "missed";
                } else {
                    str3 = (!"Suppress".equals(str2) || this.f24868f) ? null : "voice not enabled";
                }
                nj.f fVar = this.f24869g.y().get(str3);
                if (fVar != null && nVarF.a()) {
                    nVarF.m(fVar.a(), fVar.d(), j.this.k(this.b, fVar).c());
                }
                vl.g.x().w(this);
            }
        }
    }

    public static /* synthetic */ Unit b(nj.f fVar, Throwable th2) {
        t0.o(fVar, rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f22938a;
    }

    public static /* synthetic */ Unit c(nj.f fVar, Throwable th2) {
        t0.p(fVar, rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f22938a;
    }

    public static /* synthetic */ Unit e(k2.k.c cVar, nj.f fVar, Bitmap bitmap) {
        cVar.i(bitmap);
        t0.p(fVar, rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")}));
        return Unit.f22938a;
    }

    public static /* synthetic */ Unit f(RichPushNotificationMedia richPushNotificationMedia, k2.k.c cVar, k2.k.f fVar, nj.f fVar2, Bitmap bitmap) {
        Options options = richPushNotificationMedia.getOptions();
        if (options != null && options.getHidePrimaryImageInExpandedView()) {
            cVar.h(null);
        }
        fVar.s(bitmap);
        t0.o(fVar2, rg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")}));
        return Unit.f22938a;
    }

    @NonNull
    public static Intent m(Context context, nj.f fVar, NotificationAction notificationAction) {
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
    public static Intent n(Context context, nj.f fVar, NotificationAction notificationAction) {
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

    @Override // mj.c
    public void a(final Context context, final nj.f fVar) {
        if (context == null || fVar == null) {
            return;
        }
        if (rh.h.a().T4() && "Heartbeat".equals(fVar.c())) {
            return;
        }
        if (!rh.h.a().t0() || u(context, fVar)) {
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
            if (rh.h.a().P5() && richPushNotificationMediaV != null) {
                oj.b.f27927a.c(context, richPushNotificationMediaV.getPrimaryImage(), richPushNotificationMediaV.getSecondaryImage(), 5000L, new Function1() { // from class: mj.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f24847a.r(richPushNotificationMediaV, fVarK, fVar, context, (oj.a) obj);
                    }
                });
                return;
            }
            Consumer<Bitmap> consumer = new Consumer() { // from class: mj.e
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f24851a.s(fVarK, context, fVar, (Bitmap) obj);
                }
            };
            if (fVar.q() == nj.e.user) {
                b0.f19488a.c(context, fVar.C(), consumer);
            } else {
                b0.f19488a.b(context, fVar.B(), consumer);
            }
        }
    }

    public final void j(Context context, nj.f fVar, k2.k.f fVar2) {
        for (NotificationAction notificationAction : fVar.u()) {
            int iHash = Objects.hash(Integer.valueOf(fVar.d()), notificationAction.getId());
            boolean zIsEmpty = TextUtils.isEmpty(notificationAction.getDeeplink());
            boolean z10 = !zIsEmpty;
            k2.k.a.C0389a c0389a = new k2.k.a.C0389a(0, notificationAction.getLabel(), !zIsEmpty ? PendingIntent.getActivity(context, iHash, n(context, fVar, notificationAction), 201326592) : PendingIntent.getBroadcast(context, iHash, m(context, fVar, notificationAction), 201326592));
            c0389a.e(notificationAction.getRequireUnlock());
            c0389a.f(z10);
            fVar2.b(c0389a.b());
        }
    }

    public final k2.k.f k(Context context, nj.f fVar) {
        k2.k.f fVar2 = new k2.k.f(context, o(context, fVar));
        fVar2.j(fVar.g(context));
        fVar2.n(fVar.n(context));
        fVar2.x(fVar.t());
        fVar2.F(fVar.getVisibility());
        fVar2.z(fVar.i(context));
        fVar2.l(fVar.getTitle());
        fVar2.k(fVar.getBody());
        fVar2.f(true);
        fVar2.v(fVar.f());
        fVar2.A(fVar.x(context));
        fVar2.w(fVar.e());
        if (rh.h.a().K0()) {
            j(context, fVar, fVar2);
        }
        if (rh.h.a().c4()) {
            fVar2.q(fVar.getGroupId());
        }
        if (fVar.j()) {
            String string = context.getString(q0.E0);
            fVar2.b(new k2.k.a.C0389a(l0.b, string, p(context, fVar)).a(new t.d("key_reply_message").b(string).a()).d(true).b());
        }
        fVar2.B(new k2.k.d().h(fVar.getBody()));
        return fVar2;
    }

    public final Intent l(Context context, nj.f fVar, long j10, String str, String str2, String str3) {
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

    public final String o(Context context, nj.f fVar) {
        if (rh.h.a().S0() || rh.h.a().Q4()) {
            return (rh.h.a().t0() && fVar.w()) ? nj.b.f27274x.getId() : r.k().C(context, fVar);
        }
        return fVar.m();
    }

    public final PendingIntent p(Context context, nj.f fVar) {
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        if (rh.h.a().y2()) {
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

    public final void q(Context context, k2.k.f fVar, nj.f fVar2) {
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
        if (!rh.h.a().f4()) {
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
            fVar.B(k2.k.g.h(new k2.r.c().e(string4).a(), broadcast2, pendingIntent).o(context3.getResources().getColor(j0.f30377c)).p(context3.getResources().getColor(j0.f30378d)));
            fVar.j(activity);
            fVar.p(activity, true);
            fVar.E(hj.n.b);
            Notification notificationC = fVar.c();
            if (fVar2.e()) {
                notificationC.flags |= 36;
            }
            vl.g.x().g(new b(str3, context, str3, i10, notificationC, z10, fVar2));
            vl.g.x().u(str4, j11, string4, j12, string5, j10, str, str2, j14, z10, fVar2.getId());
        } catch (JSONException e10) {
            q.f("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e10);
        }
    }

    public final /* synthetic */ Unit r(final RichPushNotificationMedia richPushNotificationMedia, final k2.k.f fVar, final nj.f fVar2, Context context, oj.a aVar) {
        final k2.k.c cVar = new k2.k.c();
        aVar.b(new Function1() { // from class: mj.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.f(richPushNotificationMedia, cVar, fVar, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: mj.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.b(fVar2, (Throwable) obj);
            }
        });
        aVar.a(new Function1() { // from class: mj.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e(cVar, fVar2, (Bitmap) obj);
            }
        }, new Function1() { // from class: mj.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.c(fVar2, (Throwable) obj);
            }
        });
        fVar.B(cVar);
        k2.n.f(context).m(fVar2.a(), fVar2.d(), fVar.c());
        if (rh.h.a().c4()) {
            t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
        }
        return Unit.f22938a;
    }

    public final /* synthetic */ void s(k2.k.f fVar, Context context, nj.f fVar2, Bitmap bitmap) {
        if (bitmap != null) {
            fVar.s(bitmap);
        }
        k2.n.f(context).m(fVar2.a(), fVar2.d(), fVar.c());
        if (rh.h.a().c4()) {
            t(context, fVar2.getGroupId(), o(context, fVar2), fVar2);
        }
    }

    public final void t(Context context, String str, String str2, nj.f fVar) {
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
                hVar.h(charSequence != null ? charSequence.toString() : "");
            }
        }
        k2.n nVarF = k2.n.f(context);
        String str3 = "summary_" + str;
        if (i10 < 1) {
            nVarF.b(str3, 0);
            return;
        }
        String string = context.getString(q0.M0, String.valueOf(i10));
        String string2 = context.getString(q0.L0, String.valueOf(i10));
        hVar.i(string);
        nVarF.m(str3, 0, new k2.k.f(context, str2).z(fVar.i(context)).l(string).k(string2).q(str).r(true).B(hVar).c());
    }

    public final boolean u(Context context, nj.f fVar) {
        if (!fVar.w()) {
            return true;
        }
        NotificationChannel notificationChannelH = k2.n.f(context).h(r.k().C(context, fVar));
        return notificationChannelH == null || notificationChannelH.getImportance() > 0;
    }
}
