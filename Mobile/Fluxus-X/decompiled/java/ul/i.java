package ul;

import android.R;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import androidx.core.graphics.drawable.IconCompat;
import bh.q0;
import com.github.luben.zstd.BuildConfig;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u001c\u0010,\u001a\n **\u0004\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/¨\u00061"}, d2 = {"Lul/i;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "d", "(Landroid/content/Context;)V", "Lul/a;", "call", "j", "(Landroid/content/Context;Lul/a;)V", "i", "Landroid/content/Intent;", "b", "(Landroid/content/Context;)Landroid/content/Intent;", "Landroid/app/Notification;", "e", "(Landroid/content/Context;Lul/a;)Landroid/app/Notification;", "g", "Lk2/r;", "c", "(Landroid/content/Context;Lul/a;)Lk2/r;", "intent", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;Lul/a;Landroid/content/Intent;)Landroid/app/PendingIntent;", "Landroid/content/ComponentName;", "activity", BuildConfig.FLAVOR, "f", "(Landroid/content/Context;Landroid/content/ComponentName;)Z", BuildConfig.FLAVOR, "notificationId", "notification", "h", "(Landroid/content/Context;ILandroid/app/Notification;)V", BuildConfig.FLAVOR, "[J", "VIBRATION_PATTERN", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "Landroid/media/AudioAttributes;", "RINGTONE_ATTRIBUTES", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ljava/util/Set;", "postedRings", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f33541a = new i();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final long[] VIBRATION_PATTERN = {0, 1000, 1000};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final AudioAttributes RINGTONE_ATTRIBUTES = new AudioAttributes.Builder().setUsage(6).setContentType(4).build();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Set<String> postedRings = new LinkedHashSet();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33544a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.RINGING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.ONGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.ENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.MISSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33544a = iArr;
        }
    }

    public final PendingIntent a(Context context, ActiveCall call, Intent intent) {
        PendingIntent activity = PendingIntent.getActivity(context, call.getNotificationId(), intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    @NotNull
    public final Intent b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentI = bh.y.h().i(context);
        ComponentName component = intentI.getComponent();
        if (component != null && f33541a.f(context, component)) {
            Intent intentAddFlags = intentI.addFlags(268435456);
            Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            launchIntentForPackage = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName());
        }
        Intent intentAddFlags2 = launchIntentForPackage.addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags2, "addFlags(...)");
        return intentAddFlags2;
    }

    public final k2.r c(Context context, ActiveCall call) {
        k2.r.c cVarD = new k2.r.c().f(b.a(context, call.getCallerName())).d(true);
        Bitmap callerAvatar = call.getCallerAvatar();
        k2.r rVarA = cVarD.c(callerAvatar != null ? IconCompat.c(callerAvatar) : null).a();
        Intrinsics.checkNotNullExpressionValue(rVarA, "build(...)");
        return rVarA;
    }

    public final void d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("roblox_calls_ringing", context.getString(q0.f4254l1), 4);
        notificationChannel.setSound(Settings.System.DEFAULT_RINGTONE_URI, RINGTONE_ATTRIBUTES);
        notificationChannel.enableVibration(true);
        notificationChannel.setVibrationPattern(VIBRATION_PATTERN);
        notificationChannel.setLockscreenVisibility(1);
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.createNotificationChannel(new NotificationChannel("roblox_calls_missed", context.getString(q0.f4272r1), 3));
    }

    public final Notification e(Context context, ActiveCall call) {
        k2.r rVarC = c(context, call);
        k.Companion bVar = k.INSTANCE;
        k2.k.g gVarH = k2.k.g.h(rVarC, bVar.a(context, k.a.DECLINE, call), bVar.a(context, k.a.ANSWER, call));
        Intrinsics.checkNotNullExpressionValue(gVarH, "forIncomingCall(...)");
        PendingIntent pendingIntentA = a(context, call, g0.INSTANCE.a(context, call.getCallId()));
        k2.k.f fVarR = new k2.k.f(context, "roblox_calls_ringing").C(R.drawable.sym_action_call).E(gVarH).h("call").A(1).I(1).y(true).z(true).l(pendingIntentA).r(pendingIntentA, true);
        Bundle bundle = new Bundle();
        bundle.putString("com.roblox.protocols.calling.CALL_ID", call.getCallId());
        Notification notificationD = fVarR.c(bundle).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        notificationD.flags |= 4;
        return notificationD;
    }

    public final boolean f(Context context, ComponentName activity) {
        ActivityManager activityManager;
        Object objB;
        if (Build.VERSION.SDK_INT < 29 || (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) == null) {
            return false;
        }
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        Intrinsics.checkNotNullExpressionValue(appTasks, "getAppTasks(...)");
        List<ActivityManager.AppTask> list = appTasks;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityManager.AppTask appTask : list) {
            try {
                zt.n.Companion companion = zt.n.INSTANCE;
                objB = zt.n.b(appTask.getTaskInfo());
            } catch (Throwable th2) {
                zt.n.Companion companion2 = zt.n.INSTANCE;
                objB = zt.n.b(zt.o.a(th2));
            }
            if (zt.n.g(objB)) {
                objB = null;
            }
            ActivityManager.RecentTaskInfo recentTaskInfo = (ActivityManager.RecentTaskInfo) objB;
            if (recentTaskInfo != null && recentTaskInfo.isRunning && (Intrinsics.c(recentTaskInfo.baseActivity, activity) || Intrinsics.c(recentTaskInfo.topActivity, activity))) {
                return true;
            }
        }
        return false;
    }

    public final Notification g(Context context, ActiveCall call) {
        Notification notificationD = new k2.k.f(context, "roblox_calls_missed").C(R.drawable.sym_call_missed).h("missed_call").n(context.getString(q0.Y)).m(context.getString(q0.f4221a0, b.a(context, call.getCallerName()))).u(call.getCallerAvatar()).l(a(context, call, b(context))).g(true).d();
        Intrinsics.checkNotNullExpressionValue(notificationD, "build(...)");
        return notificationD;
    }

    public final void h(Context context, int notificationId, Notification notification) {
        if (Build.VERSION.SDK_INT < 33 || l2.b.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            k2.n.g(context).m(notificationId, notification);
        } else {
            ok.q.k("CallNotifications", "POST_NOTIFICATIONS not granted; call notification not shown");
        }
    }

    public final void i() {
        postedRings.clear();
    }

    public final void j(@NotNull Context context, @NotNull ActiveCall call) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(call, "call");
        if (call.getPhase() != j.RINGING) {
            postedRings.remove(call.getCallId());
        }
        int i10 = a.f33544a[call.getPhase().ordinal()];
        if (i10 == 1) {
            if (call.k() && postedRings.add(call.getCallId())) {
                h(context, call.getNotificationId(), e(context, call));
                return;
            }
            return;
        }
        if (i10 == 2 || i10 == 3) {
            k2.n.g(context).b(call.getNotificationId());
        } else {
            if (i10 != 4) {
                throw new zt.l();
            }
            h(context, call.getNotificationId(), g(context, call));
        }
    }
}
