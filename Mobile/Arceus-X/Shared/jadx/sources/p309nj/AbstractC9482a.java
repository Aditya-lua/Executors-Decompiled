package p309nj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.StartedForEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104ei.C5125c;
import p104ei.C5137o;
import p104ei.C5138p;
import p151gk.C6124q;
import p151gk.C6130w;
import p222jj.C7193r;
import p222jj.C7196u;
import p222jj.C7198w;
import p222jj.C7199x;
import p261l2.C7975b;
import sg.C11356t0;
import sg.C11365w0;
import sg.C11370y;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: renamed from: nj.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\b*\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\nJ5\u0010!\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b%\u0010&¨\u0006'"}, m31665d2 = {"Lnj/a;", "Lsg/w0;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "g", "", "notificationType", "c", "(Ljava/lang/String;)V", "appContext", "", "openedClient", "receivedTag", "actionTaken", "d", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "notificationRequestCode", "a", "(Landroid/content/Context;I)V", "notificationTag", "b", "(Landroid/content/Context;Ljava/lang/String;I)V", "j", "i", "h", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "f", "(Landroid/content/Intent;)Ljava/lang/String;", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC9482a extends C11365w0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nj.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0004X\u0084T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lnj/a$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Intent;Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: nj.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m37368a(@NotNull Intent intent, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
                C6124q.m27064i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
                C5137o.m23947a(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
                return;
            }
            C6124q.m27064i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            C5138p.m23950a(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37360e(AbstractC9482a abstractC9482a, String str, Context context, Intent intent, boolean z10, String str2, String str3, String str4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: firePushNotificationInteractedAnalytics");
        }
        if ((i10 & 32) != 0) {
            str3 = "base";
        }
        abstractC9482a.m37364d(str, context, intent, z10, str2, str3, (i10 & 64) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: a */
    public final void m37361a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManager notificationManager = (NotificationManager) C7975b.m33013k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m37362b(@NotNull Context context, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManager notificationManager = (NotificationManager) C7975b.m33013k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(str, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m37363c(@Nullable String notificationType) {
        C7196u.m30108c().m30111d(notificationType).clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m37364d(@Nullable String context, @Nullable Context appContext, @NotNull Intent intent, boolean openedClient, @Nullable String notificationType, @NotNull String receivedTag, @Nullable String actionTaken) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(receivedTag, "receivedTag");
        C11356t0.m42547q(context, new C7199x().m30120a(appContext, "GcmPlatform"), notificationType, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), actionTaken, C6130w.m27099a(appContext), openedClient, m37365f(intent), receivedTag, C7198w.m30118a(intent));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final String m37365f(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = null;
        }
        return stringExtra == null ? "0" : stringExtra;
    }

    /* JADX INFO: renamed from: g */
    public final void m37366g(@NotNull Context context, @NotNull Intent bundle) {
        Intent intentMo15416k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (C12217h.m45288e().m45295f()) {
            C6124q.m27063h("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            Intent intentM42589i = C11370y.m42581h().m42589i(context);
            Intrinsics.checkNotNullExpressionValue(intentM42589i, "getMainActivityIntent(...)");
            intentMo15416k = mo15416k(intentM42589i, context, bundle);
            intentMo15416k.setFlags(268435456);
        } else {
            C6124q.m27063h("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            Intent intentM15531o2 = ActivitySplash.m15531o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
            Intrinsics.checkNotNullExpressionValue(intentM15531o2, "buildIntent(...)");
            intentMo15416k = mo15416k(intentM15531o2, context, bundle);
            intentMo15416k.setFlags(268468224);
        }
        Bundle extras = intentMo15416k.getExtras();
        if (extras != null) {
            C7193r.m30069k().m30076G(extras);
        }
        context.startActivity(intentMo15416k);
    }

    /* JADX INFO: renamed from: h */
    public final void m37367h(@Nullable String notificationType, @Nullable Context context, @NotNull Intent intent, @Nullable String actionTaken) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        m37363c(notificationType);
        C5138p.m23950a(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        m37364d("actionTaken", context, intent, true, notificationType, "base2", actionTaken);
    }

    /* JADX INFO: renamed from: i */
    public void mo15414i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C6124q.m27064i("rbx.push", "notification of type " + stringExtra + " clicked");
        m37366g(context, intent);
        m37363c(stringExtra);
        INSTANCE.m37368a(intent, context);
        m37360e(this, "clicked", context, intent, true, stringExtra, null, null, 96, null);
    }

    /* JADX INFO: renamed from: j */
    public void mo15415j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C6124q.m27064i("rbx.push", "cleared notifications of type: " + stringExtra);
        m37363c(stringExtra);
        m37360e(this, "dismissed", context, intent, false, stringExtra, null, null, 96, null);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public abstract Intent mo15416k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent intent2);

    @Override // sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        C12211b.m45200f().m45210l(context);
        C3272a.m15711s(context);
        C5125c.m23921e(context);
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            mo15415j(context, intent);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            mo15414i(context, intent);
        }
    }
}
