package j9;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import l9.p0;
import l9.q0;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {bb.d.class, bb.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21175c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f21173e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21174f = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21172d = d.f21184a;

    @NonNull
    public static c o() {
        return f21174f;
    }

    @NonNull
    public static final Task z(@NonNull k9.g gVar, @NonNull k9.g... gVarArr) {
        n9.m.m(gVar, "Requested API must not be null.");
        for (k9.g gVar2 : gVarArr) {
            n9.m.m(gVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(gVarArr.length + 1);
        arrayList.add(gVar);
        arrayList.addAll(Arrays.asList(gVarArr));
        return l9.f.u().x(arrayList);
    }

    @Override // j9.d
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // j9.d
    public PendingIntent c(@NonNull Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // j9.d
    @NonNull
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // j9.d
    @ResultIgnorabilityUnspecified
    public int g(@NonNull Context context) {
        return super.g(context);
    }

    @Override // j9.d
    public int h(@NonNull Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // j9.d
    public final boolean j(int i10) {
        return super.j(i10);
    }

    @NonNull
    public Task<Void> l(@NonNull k9.g<?> gVar, @NonNull k9.g<?>... gVarArr) {
        return z(gVar, gVarArr).o(new sb.j() { // from class: j9.m
            @Override // sb.j
            public final Task then(Object obj) {
                int i10 = c.f21172d;
                return sb.m.f(null);
            }
        });
    }

    public Dialog m(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i10, n9.a0.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent n(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.z3() ? connectionResult.y3() : c(context, connectionResult.w3(), 0);
    }

    @ResultIgnorabilityUnspecified
    public boolean p(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM = m(activity, i10, i11, onCancelListener);
        if (dialogM == null) {
            return false;
        }
        u(activity, dialogM, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void q(@NonNull Context context, int i10) {
        v(context, i10, null, d(context, i10, 0, "n"));
    }

    public final Dialog r(@NonNull Context context, int i10, n9.a0 a0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(n9.x.c(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strB = n9.x.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = a0Var;
        if (strB != null) {
            if (a0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strB, onClickListener2);
        }
        String strF = n9.x.f(context, i10);
        if (strF != null) {
            builder2.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder2.create();
    }

    @NonNull
    public final Dialog s(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(n9.x.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        u(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final q0 t(Context context, p0 p0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q0 q0Var = new q0(p0Var);
        bb.h.r(context, q0Var, intentFilter);
        q0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return q0Var;
        }
        p0Var.a();
        q0Var.b();
        return null;
    }

    public final void u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof e4.q) {
                k.u2(dialog, onCancelListener).t2(((e4.q) activity).l1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    public final void v(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = n9.x.e(context, i10);
        String strD = n9.x.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) n9.m.l(context.getSystemService("notification"));
        k2.k.f fVarB = new k2.k.f(context).u(true).f(true).l(strE).B(new k2.k.d().h(strD));
        if (u9.i.c(context)) {
            n9.m.p(u9.m.d());
            fVarB.z(context.getApplicationInfo().icon).x(2);
            if (u9.i.d(context)) {
                fVarB.a(h9.a.f18734a, resources.getString(h9.b.f18748o), pendingIntent);
            } else {
                fVarB.j(pendingIntent);
            }
        } else {
            fVarB.z(R.drawable.stat_sys_warning).C(resources.getString(h9.b.f18741h)).G(System.currentTimeMillis()).j(pendingIntent).k(strD);
        }
        if (u9.m.g()) {
            n9.m.p(u9.m.g());
            synchronized (f21173e) {
                str2 = this.f21175c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(h9.b.f18740g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            fVarB.g(str2);
        }
        Notification notificationC = fVarB.c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            h.b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationC);
    }

    public final void w(Context context) {
        new n(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean x(@NonNull Activity activity, @NonNull l9.j jVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogR = r(activity, i10, n9.a0.c(jVar, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogR == null) {
            return false;
        }
        u(activity, dialogR, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntentN;
        if (w9.a.a(context) || (pendingIntentN = n(context, connectionResult)) == null) {
            return false;
        }
        v(context, connectionResult.w3(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentN, i10, true), bb.i.f4084a | 134217728));
        return true;
    }
}
