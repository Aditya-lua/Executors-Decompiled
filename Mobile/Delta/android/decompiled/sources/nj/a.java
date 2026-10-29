package nj;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ei.o;
import gk.p;
import gk.v;
import jj.r;
import jj.u;
import jj.w;
import jj.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sg.t0;
import sg.w0;
import sg.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010JS\u0010\u0016\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001d\u001a\u00020\b*\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\nJ5\u0010!\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lnj/a;", "Lsg/w0;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "g", "", "notificationType", "c", "(Ljava/lang/String;)V", "appContext", "", "openedClient", "receivedTag", "actionTaken", "d", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "notificationRequestCode", "a", "(Landroid/content/Context;I)V", "notificationTag", "b", "(Landroid/content/Context;Ljava/lang/String;I)V", "j", "i", "h", "(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V", "f", "(Landroid/content/Intent;)Ljava/lang/String;", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nj.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0004X\u0084T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnj/a$a;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Intent;Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Intent intent, @Nullable Context context) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
                p.i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
                o.a(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
                return;
            }
            p.i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            ei.p.a(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        }

        public Companion() {
        }
    }

    public static /* synthetic */ void e(a aVar, String str, Context context, Intent intent, boolean z10, String str2, String str3, String str4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: firePushNotificationInteractedAnalytics");
        }
        if ((i10 & 32) != 0) {
            str3 = "base";
        }
        aVar.d(str, context, intent, z10, str2, str3, (i10 & 64) != 0 ? null : str4);
    }

    public final void a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManager notificationManager = (NotificationManager) l2.b.k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    public final void b(@NotNull Context context, @Nullable String str, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        NotificationManager notificationManager = (NotificationManager) l2.b.k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.cancel(str, i10);
        }
    }

    public final void c(@Nullable String notificationType) {
        u.c().d(notificationType).clear();
    }

    public final void d(@Nullable String context, @Nullable Context appContext, @NotNull Intent intent, boolean openedClient, @Nullable String notificationType, @NotNull String receivedTag, @Nullable String actionTaken) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(receivedTag, "receivedTag");
        t0.q(context, new x().a(appContext, "GcmPlatform"), notificationType, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), actionTaken, v.a(appContext), openedClient, f(intent), receivedTag, w.a(intent));
    }

    @NotNull
    public final String f(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        if (stringExtra == null || stringExtra.length() == 0) {
            stringExtra = null;
        }
        return stringExtra == null ? "0" : stringExtra;
    }

    public final void g(@NotNull Context context, @NotNull Intent bundle) {
        Intent intentK;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (vi.h.e().f()) {
            p.h("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            Intent intentI = y.h().i(context);
            Intrinsics.checkNotNullExpressionValue(intentI, "getMainActivityIntent(...)");
            intentK = k(intentI, context, bundle);
            intentK.setFlags(268435456);
        } else {
            p.h("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            Intent intentO2 = ActivitySplash.o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
            Intrinsics.checkNotNullExpressionValue(intentO2, "buildIntent(...)");
            intentK = k(intentO2, context, bundle);
            intentK.setFlags(268468224);
        }
        Bundle extras = intentK.getExtras();
        if (extras != null) {
            r.k().G(extras);
        }
        context.startActivity(intentK);
    }

    public final void h(@Nullable String notificationType, @Nullable Context context, @NotNull Intent intent, @Nullable String actionTaken) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        c(notificationType);
        ei.p.a(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        d("actionTaken", context, intent, true, notificationType, "base2", actionTaken);
    }

    public void i(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        p.i("rbx.push", "notification of type " + stringExtra + " clicked");
        g(context, intent);
        c(stringExtra);
        INSTANCE.a(intent, context);
        e(this, "clicked", context, intent, true, stringExtra, null, null, 96, null);
    }

    public void j(@Nullable Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        p.i("rbx.push", "cleared notifications of type: " + stringExtra);
        c(stringExtra);
        e(this, "dismissed", context, intent, false, stringExtra, null, null, 96, null);
    }

    @NotNull
    public abstract Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent intent2);

    @Override // sg.w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        vi.b.f().l(context);
        com.roblox.client.startup.a.s(context);
        ei.c.e(context);
        Integer numValueOf = intent != null ? Integer.valueOf(intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            j(context, intent);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i(context, intent);
        }
    }
}
