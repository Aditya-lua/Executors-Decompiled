package p334oj;

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
import androidx.core.app.NotificationCompat;
import com.roblox.client.IncomingCallActivity;
import com.roblox.client.pushnotification.actions.NotificationActionBroadcastReceiver;
import com.roblox.client.pushnotification.p051v2.CallActionReceiver;
import com.roblox.client.pushnotification.p051v2.SendrChatMessageReplyHandler;
import com.roblox.client.pushnotification.p051v2.model.NotificationAction;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.Options;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.StartedForEnum;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import p015ak.C0305k0;
import p015ak.InterfaceC0281e0;
import p151gk.C6124q;
import p222jj.C7177b0;
import p222jj.C7189n;
import p222jj.C7193r;
import p235k2.C7419k;
import p235k2.C7422n;
import p235k2.C7426r;
import p235k2.C7428t;
import p360pj.EnumC10286b;
import p360pj.EnumC10289e;
import p360pj.InterfaceC10290f;
import p384qj.C10590a;
import p384qj.C10591b;
import p551xl.C12864g;
import sg.C11295a1;
import sg.C11297b;
import sg.C11326j0;
import sg.C11332l0;
import sg.C11347q0;
import sg.C11356t0;
import th.C11659h;

/* JADX INFO: renamed from: oj.i */
/* JADX INFO: loaded from: classes2.dex */
public class C9750i implements InterfaceC9743b {

    /* JADX INFO: renamed from: oj.i$a */
    public class a implements InterfaceC0281e0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f35492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C7419k.f f35493b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC10290f f35494c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0305k0 f35495d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Context context, C7419k.f fVar, InterfaceC10290f interfaceC10290f, C0305k0 c0305k0) {
            this.f35492a = context;
            this.f35493b = fVar;
            this.f35494c = interfaceC10290f;
            this.f35495d = c0305k0;
        }

        @Override // p015ak.InterfaceC0281e0
        /* JADX INFO: renamed from: a */
        public void mo1247a() {
            C9750i.this.m38564q(this.f35492a, this.f35493b, this.f35494c);
            this.f35495d.m1292R(this);
        }

        @Override // p015ak.InterfaceC0281e0
        /* JADX INFO: renamed from: b */
        public void mo1248b() {
            this.f35495d.m1292R(this);
        }
    }

    /* JADX INFO: renamed from: oj.i$b */
    public class b implements C12864g.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f35497a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f35498b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f35499c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f35500d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Notification f35501e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f35502f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC10290f f35503g;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(String str, Context context, String str2, int i10, Notification notification, boolean z10, InterfaceC10290f interfaceC10290f) {
            this.f35497a = str;
            this.f35498b = context;
            this.f35499c = str2;
            this.f35500d = i10;
            this.f35501e = notification;
            this.f35502f = z10;
            this.f35503g = interfaceC10290f;
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: C */
        public void mo14808C(String str, boolean z10) {
            if (this.f35497a.equals(str) && z10) {
                C7422n.m30883e(this.f35498b).m30892i(this.f35499c, this.f35500d, this.f35501e);
            }
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: V */
        public void mo14812V(String str) {
            if (this.f35497a.equals(str)) {
                C7422n.m30883e(this.f35498b).m30887b(this.f35499c, this.f35500d);
                C12864g.m47841x().m47858w(this);
            }
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: m0 */
        public void mo14813m0(String str) {
            if (this.f35497a.equals(str)) {
                C7422n.m30883e(this.f35498b).m30887b(this.f35499c, this.f35500d);
                C12864g.m47841x().m47858w(this);
            }
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: o */
        public void mo14814o(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: p */
        public void mo14815p(String str, String str2, String str3, String str4, String str5, String str6) {
        }

        @Override // p551xl.C12864g.a
        /* JADX INFO: renamed from: v */
        public void mo14816v(String str, String str2) {
            String str3;
            if (this.f35497a.equals(str)) {
                C7422n c7422nM30883e = C7422n.m30883e(this.f35498b);
                c7422nM30883e.m30887b(this.f35499c, this.f35500d);
                if ("Miss".equals(str2)) {
                    str3 = "missed";
                } else {
                    str3 = (!"Suppress".equals(str2) || this.f35502f) ? null : "voice not enabled";
                }
                InterfaceC10290f interfaceC10290f = this.f35503g.mo39552x().get(str3);
                if (interfaceC10290f != null && c7422nM30883e.m30886a()) {
                    c7422nM30883e.m30892i(interfaceC10290f.mo39529a(), interfaceC10290f.mo39532d(), C9750i.this.m38560k(this.f35498b, interfaceC10290f).m30780c());
                }
                C12864g.m47841x().m47858w(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m38549b(InterfaceC10290f interfaceC10290f, Throwable th2) {
        C11356t0.m42545o(interfaceC10290f, C11297b.m42490a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m38550c(InterfaceC10290f interfaceC10290f, Throwable th2) {
        C11356t0.m42546p(interfaceC10290f, C11297b.m42490a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", th2.toString())}));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Unit m38552e(C7419k.c cVar, InterfaceC10290f interfaceC10290f, Bitmap bitmap) {
        cVar.m30762i(bitmap);
        C11356t0.m42546p(interfaceC10290f, C11297b.m42490a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")}));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Unit m38553f(RichPushNotificationMedia richPushNotificationMedia, C7419k.c cVar, C7419k.f fVar, InterfaceC10290f interfaceC10290f, Bitmap bitmap) {
        Options options = richPushNotificationMedia.getOptions();
        if (options != null && options.getHidePrimaryImageInExpandedView()) {
            cVar.m30761h(null);
        }
        fVar.m30795s(bitmap);
        C11356t0.m42545o(interfaceC10290f, C11297b.m42490a(new Map.Entry[]{new AbstractMap.SimpleEntry("notificationImageAttachmentError", "")}));
        return Unit.f29331a;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static Intent m38557m(Context context, InterfaceC10290f interfaceC10290f, NotificationAction notificationAction) {
        Intent intent = new Intent(context, (Class<?>) NotificationActionBroadcastReceiver.class);
        intent.setData(Uri.parse("roblox://action/" + interfaceC10290f.mo39529a() + "/" + notificationAction.getId()));
        intent.putExtra("extra-action-id", notificationAction.getId());
        intent.putExtra("extra-action-url", notificationAction.getPostUrl());
        intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        intent.putExtra("extra-notification-request-code", interfaceC10290f.mo39532d());
        intent.putExtra("extra-notification-tag", interfaceC10290f.mo39529a());
        intent.putExtra("extra-notification-group-id", interfaceC10290f.getGroupId());
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC10290f.getId());
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", interfaceC10290f.mo39531c());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC10290f.mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", interfaceC10290f.mo39536h());
        return intent;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static Intent m38558n(Context context, InterfaceC10290f interfaceC10290f, NotificationAction notificationAction) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.setData(Uri.parse(notificationAction.getDeeplink()));
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC10290f.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", interfaceC10290f.mo39531c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", notificationAction.getDeeplink());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC10290f.mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", interfaceC10290f.mo39536h());
        intent.putExtra("extra-notification-tag", interfaceC10290f.mo39529a());
        intent.putExtra("extra-notification-request-code", interfaceC10290f.mo39532d());
        intent.putExtra("extra-notification-group-id", interfaceC10290f.getGroupId());
        if (notificationAction.getPostUrl() != null) {
            intent.putExtra("extra-action-id", notificationAction.getId());
            intent.putExtra("extra-action-url", notificationAction.getPostUrl());
            intent.putExtra("extra-action-body", notificationAction.getPostPayload());
        }
        return intent;
    }

    @Override // p334oj.InterfaceC9743b
    /* JADX INFO: renamed from: a */
    public void mo38548a(final Context context, final InterfaceC10290f interfaceC10290f) {
        if (context == null || interfaceC10290f == null) {
            return;
        }
        if (C11659h.m43403a().mo43493M4() && "Heartbeat".equals(interfaceC10290f.mo39531c())) {
            return;
        }
        if (!C11659h.m43403a().mo43716s0() || m38568u(context, interfaceC10290f)) {
            final C7419k.f fVarM38560k = m38560k(context, interfaceC10290f);
            if (!C11295a1.m42471q0() && "CallReceived".equals(interfaceC10290f.mo39531c())) {
                if (C3272a.m15705m()) {
                    m38564q(context, fVarM38560k, interfaceC10290f);
                    return;
                }
                C0305k0 c0305k0M1274s = C0305k0.m1274s(context.getApplicationContext());
                c0305k0M1274s.m1285K(new a(context, fVarM38560k, interfaceC10290f, c0305k0M1274s));
                c0305k0M1274s.m1289O();
                return;
            }
            final RichPushNotificationMedia richPushNotificationMediaMo39549u = interfaceC10290f.mo39549u();
            if (C11659h.m43403a().mo43487L5() && richPushNotificationMediaMo39549u != null) {
                C10591b.f38007a.m40617c(context, richPushNotificationMediaMo39549u.getPrimaryImage(), richPushNotificationMediaMo39549u.getSecondaryImage(), 5000L, new Function1() { // from class: oj.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return this.f35475a.m38565r(richPushNotificationMediaMo39549u, fVarM38560k, interfaceC10290f, context, (C10590a) obj);
                    }
                });
                return;
            }
            Consumer<Bitmap> consumer = new Consumer() { // from class: oj.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f35480a.m38566s(fVarM38560k, context, interfaceC10290f, (Bitmap) obj);
                }
            };
            if (interfaceC10290f.mo39544p() == EnumC10289e.user) {
                C7177b0.f27845a.m30002c(context, interfaceC10290f.mo39524B(), consumer);
            } else {
                C7177b0.f27845a.m30001b(context, interfaceC10290f.mo39523A(), consumer);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m38559j(Context context, InterfaceC10290f interfaceC10290f, C7419k.f fVar) {
        for (NotificationAction notificationAction : interfaceC10290f.mo39548t()) {
            int iHash = Objects.hash(Integer.valueOf(interfaceC10290f.mo39532d()), notificationAction.getId());
            boolean zIsEmpty = TextUtils.isEmpty(notificationAction.getDeeplink());
            boolean z10 = !zIsEmpty;
            C7419k.a.C14195a c14195a = new C7419k.a.C14195a(0, notificationAction.getLabel(), !zIsEmpty ? PendingIntent.getActivity(context, iHash, m38558n(context, interfaceC10290f, notificationAction), 201326592) : PendingIntent.getBroadcast(context, iHash, m38557m(context, interfaceC10290f, notificationAction), 201326592));
            c14195a.m30756e(notificationAction.getRequireUnlock());
            c14195a.m30757f(z10);
            fVar.m30779b(c14195a.m30753b());
        }
    }

    /* JADX INFO: renamed from: k */
    public final C7419k.f m38560k(Context context, InterfaceC10290f interfaceC10290f) {
        C7419k.f fVar = new C7419k.f(context, m38562o(context, interfaceC10290f));
        fVar.m30786j(interfaceC10290f.mo39535g(context));
        fVar.m30790n(interfaceC10290f.mo39541m(context));
        fVar.m30800x(interfaceC10290f.mo39547s());
        fVar.m30776F(interfaceC10290f.getVisibility());
        fVar.m30802z(interfaceC10290f.mo39537i(context));
        fVar.m30788l(interfaceC10290f.getTitle());
        fVar.m30787k(interfaceC10290f.getBody());
        fVar.m30782f(true);
        fVar.m30798v(interfaceC10290f.mo39534f());
        fVar.m30771A(interfaceC10290f.mo39551w(context));
        fVar.m30799w(interfaceC10290f.mo39533e());
        if (C11659h.m43403a().mo43461I0()) {
            m38559j(context, interfaceC10290f, fVar);
        }
        if (C11659h.m43403a().mo43560W3()) {
            fVar.m30793q(interfaceC10290f.getGroupId());
        }
        if (interfaceC10290f.mo39538j()) {
            String string = context.getString(C11347q0.f39909E0);
            fVar.m30779b(new C7419k.a.C14195a(C11332l0.f39742b, string, m38563p(context, interfaceC10290f)).m30752a(new C7428t.d("key_reply_message").m30948b(string).m30947a()).m30755d(true).m30753b());
        }
        fVar.m30772B(new C7419k.d().m30768h(interfaceC10290f.getBody()));
        return fVar;
    }

    /* JADX INFO: renamed from: l */
    public final Intent m38561l(Context context, InterfaceC10290f interfaceC10290f, long j10, String str, String str2, String str3) {
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
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC10290f.getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 3);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", interfaceC10290f.mo39531c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", str4);
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC10290f.mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", interfaceC10290f.mo39536h());
        return intent;
    }

    /* JADX INFO: renamed from: o */
    public final String m38562o(Context context, InterfaceC10290f interfaceC10290f) {
        if (C11659h.m43403a().mo43472J4()) {
            return (C11659h.m43403a().mo43716s0() && interfaceC10290f.mo39550v()) ? EnumC10286b.f36945x.getId() : C7193r.m30069k().m30073C(context, interfaceC10290f);
        }
        return interfaceC10290f.mo39540l();
    }

    /* JADX INFO: renamed from: p */
    public final PendingIntent m38563p(Context context, InterfaceC10290f interfaceC10290f) {
        Intent intent = new Intent(context, (Class<?>) SendrChatMessageReplyHandler.class);
        intent.setAction("chat_message_replied");
        if (C11659h.m43403a().mo43718s2()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", interfaceC10290f.mo39553y());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", interfaceC10290f.mo39543o());
        }
        intent.putExtra("tag", interfaceC10290f.mo39529a());
        intent.putExtra("EXTRA_MESSAGE_ID", interfaceC10290f.mo39554z());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", interfaceC10290f.getTitle());
        intent.putExtra("EXTRA_NOTIFICATION_ID", interfaceC10290f.getId());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", interfaceC10290f.mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", interfaceC10290f.mo39536h());
        return PendingIntent.getBroadcast(context, interfaceC10290f.mo39532d(), intent, 301989888);
    }

    /* JADX INFO: renamed from: q */
    public final void m38564q(Context context, C7419k.f fVar, InterfaceC10290f interfaceC10290f) {
        String str;
        String str2;
        String str3;
        int i10;
        int i11;
        Context context2;
        String str4;
        long j10;
        Intent intentM15447b;
        PendingIntent broadcast;
        if (!C11659h.m43403a().mo43581Z3()) {
            C6124q.m27063h("Sendr1PushNotificationHandler", "EnableAndroidCallPushNotification=false, dropping incoming call push.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(interfaceC10290f.mo39545q());
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
            String strMo39529a = interfaceC10290f.mo39529a();
            int iMo39532d = interfaceC10290f.mo39532d();
            Intent intentM15446a = CallActionReceiver.m15446a(context, string, strMo39529a, iMo39532d);
            PendingIntent broadcast2 = PendingIntent.getBroadcast(context, iMo39532d, intentM15446a, 201326592);
            if (z10) {
                str3 = strMo39529a;
                i11 = 201326592;
                i10 = iMo39532d;
                context2 = context;
                intentM15447b = m38561l(context2, interfaceC10290f, j13, string2, string3, string);
                str = string2;
                str2 = string3;
                str4 = string;
                j10 = j13;
                broadcast = PendingIntent.getActivity(context2, i10, intentM15447b, 201326592);
            } else {
                str = string2;
                str2 = string3;
                str3 = strMo39529a;
                i10 = iMo39532d;
                i11 = 201326592;
                context2 = context;
                str4 = string;
                j10 = j13;
                intentM15447b = CallActionReceiver.m15447b(context2, str4, str3, i10);
                broadcast = PendingIntent.getBroadcast(context2, i10, intentM15447b, 201326592);
            }
            PendingIntent pendingIntent = broadcast;
            Intent intent = intentM15447b;
            Context context3 = context2;
            PendingIntent activity = PendingIntent.getActivity(context3, i10, IncomingCallActivity.m14807H1(context3, intent, intentM15446a, j11, string4, z10), i11);
            fVar.m30772B(C7419k.g.m30807h(new C7426r.c().m30929e(string4).m30925a(), broadcast2, pendingIntent).m30814o(context3.getResources().getColor(C11326j0.f39712c)).m30815p(context3.getResources().getColor(C11326j0.f39713d)));
            fVar.m30786j(activity);
            fVar.m30792p(activity, true);
            fVar.m30775E(C7189n.f27872b);
            Notification notificationM30780c = fVar.m30780c();
            if (interfaceC10290f.mo39533e()) {
                notificationM30780c.flags |= 36;
            }
            C12864g.m47841x().m47842g(new b(str3, context, str3, i10, notificationM30780c, z10, interfaceC10290f));
            C12864g.m47841x().m47856u(str4, j11, string4, j12, string5, j10, str, str2, j14, z10, interfaceC10290f.getId());
        } catch (JSONException e10) {
            C6124q.m27061f("Sendr1PushNotificationHandler", "Call receive notification parse exception.", e10);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Unit m38565r(final RichPushNotificationMedia richPushNotificationMedia, final C7419k.f fVar, final InterfaceC10290f interfaceC10290f, Context context, C10590a c10590a) {
        final C7419k.c cVar = new C7419k.c();
        c10590a.m40614b(new Function1() { // from class: oj.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9750i.m38553f(richPushNotificationMedia, cVar, fVar, interfaceC10290f, (Bitmap) obj);
            }
        }, new Function1() { // from class: oj.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9750i.m38549b(interfaceC10290f, (Throwable) obj);
            }
        });
        c10590a.m40613a(new Function1() { // from class: oj.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9750i.m38552e(cVar, interfaceC10290f, (Bitmap) obj);
            }
        }, new Function1() { // from class: oj.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9750i.m38550c(interfaceC10290f, (Throwable) obj);
            }
        });
        fVar.m30772B(cVar);
        C7422n.m30883e(context).m30892i(interfaceC10290f.mo39529a(), interfaceC10290f.mo39532d(), fVar.m30780c());
        if (C11659h.m43403a().mo43560W3()) {
            m38567t(context, interfaceC10290f.getGroupId(), m38562o(context, interfaceC10290f), interfaceC10290f);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m38566s(C7419k.f fVar, Context context, InterfaceC10290f interfaceC10290f, Bitmap bitmap) {
        if (bitmap != null) {
            fVar.m30795s(bitmap);
        }
        C7422n.m30883e(context).m30892i(interfaceC10290f.mo39529a(), interfaceC10290f.mo39532d(), fVar.m30780c());
        if (C11659h.m43403a().mo43560W3()) {
            m38567t(context, interfaceC10290f.getGroupId(), m38562o(context, interfaceC10290f), interfaceC10290f);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m38567t(Context context, String str, String str2, InterfaceC10290f interfaceC10290f) {
        NotificationManager notificationManager;
        StatusBarNotification[] activeNotifications;
        if (TextUtils.isEmpty(str) || (notificationManager = (NotificationManager) context.getSystemService("notification")) == null || (activeNotifications = notificationManager.getActiveNotifications()) == null) {
            return;
        }
        C7419k.h hVar = new C7419k.h();
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && str.equals(C7419k.m30739b(notification)) && !C7419k.m30740c(notification) && (i10 = i10 + 1) <= 2) {
                CharSequence charSequence = notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE);
                hVar.m30830h(charSequence != null ? charSequence.toString() : "");
            }
        }
        C7422n c7422nM30883e = C7422n.m30883e(context);
        String str3 = "summary_" + str;
        if (i10 < 1) {
            c7422nM30883e.m30887b(str3, 0);
            return;
        }
        String string = context.getString(C11347q0.f39926M0, String.valueOf(i10));
        String string2 = context.getString(C11347q0.f39924L0, String.valueOf(i10));
        hVar.m30831i(string);
        c7422nM30883e.m30892i(str3, 0, new C7419k.f(context, str2).m30802z(interfaceC10290f.mo39537i(context)).m30788l(string).m30787k(string2).m30793q(str).m30794r(true).m30772B(hVar).m30780c());
    }

    /* JADX INFO: renamed from: u */
    public final boolean m38568u(Context context, InterfaceC10290f interfaceC10290f) {
        if (!interfaceC10290f.mo39550v()) {
            return true;
        }
        NotificationChannel notificationChannelM30890g = C7422n.m30883e(context).m30890g(C7193r.m30069k().m30073C(context, interfaceC10290f));
        return notificationChannelM30890g == null || notificationChannelM30890g.getImportance() > 0;
    }
}
