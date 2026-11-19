package k9;

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
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import m9.q0;

/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {cb.d.class, cb.e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class e extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21235c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f21233e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f21234f = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21232d = f.f21244a;

    @NonNull
    public static e o() {
        return f21234f;
    }

    @NonNull
    public static final Task z(@NonNull l9.i iVar, @NonNull l9.i... iVarArr) {
        o9.s.m(iVar, "Requested API must not be null.");
        for (l9.i iVar2 : iVarArr) {
            o9.s.m(iVar2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(iVarArr.length + 1);
        arrayList.add(iVar);
        arrayList.addAll(Arrays.asList(iVarArr));
        return m9.f.u().x(arrayList);
    }

    @Override // k9.f
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // k9.f
    public PendingIntent c(@NonNull Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // k9.f
    @NonNull
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // k9.f
    @ResultIgnorabilityUnspecified
    public int g(@NonNull Context context) {
        return super.g(context);
    }

    @Override // k9.f
    public int h(@NonNull Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // k9.f
    public final boolean j(int i10) {
        return super.j(i10);
    }

    @NonNull
    public Task<Void> l(@NonNull l9.i<?> iVar, @NonNull l9.i<?>... iVarArr) {
        return z(iVar, iVarArr).o(new tb.j() { // from class: k9.o
            @Override // tb.j
            public final Task then(Object obj) {
                int i10 = e.f21232d;
                return tb.m.f(null);
            }
        });
    }

    public Dialog m(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return r(activity, i10, o9.i0.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent n(@NonNull Context context, @NonNull b bVar) {
        return bVar.E3() ? bVar.D3() : c(context, bVar.B3(), 0);
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

    public final Dialog r(@NonNull Context context, int i10, o9.i0 i0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(o9.f0.c(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = o9.f0.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = i0Var;
        if (strB != null) {
            if (i0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder.setPositiveButton(strB, onClickListener2);
        }
        String strF = o9.f0.f(context, i10);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    public final Dialog s(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(o9.f0.c(activity, 18));
        builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        u(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    public final q0 t(Context context, m9.p0 p0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        q0 q0Var = new q0(p0Var);
        cb.h.r(context, q0Var, intentFilter);
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
            if (activity instanceof f4.v) {
                m.u2(dialog, onCancelListener).t2(((f4.v) activity).l1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
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
        String strE = o9.f0.e(context, i10);
        String strD = o9.f0.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) o9.s.l(context.getSystemService("notification"));
        k2.k.f fVarE = new k2.k.f(context).w(true).g(true).n(strE).E(new k2.k.d().h(strD));
        if (v9.i.c(context)) {
            o9.s.p(v9.m.d());
            fVarE.C(context.getApplicationInfo().icon).A(2);
            if (v9.i.d(context)) {
                fVarE.a(i9.a.f19291a, resources.getString(i9.b.f19305o), pendingIntent);
            } else {
                fVarE.l(pendingIntent);
            }
        } else {
            fVarE.C(R.drawable.stat_sys_warning).F(resources.getString(i9.b.f19298h)).J(System.currentTimeMillis()).l(pendingIntent).m(strD);
        }
        if (v9.m.g()) {
            o9.s.p(v9.m.g());
            synchronized (f21233e) {
                str2 = this.f21235c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(i9.b.f19297g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            fVarE.i(str2);
        }
        Notification notificationD = fVarE.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            j.b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationD);
    }

    public final void w(Context context) {
        new p(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    public final boolean x(@NonNull Activity activity, @NonNull m9.j jVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogR = r(activity, i10, o9.i0.c(jVar, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogR == null) {
            return false;
        }
        u(activity, dialogR, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean y(@NonNull Context context, @NonNull b bVar, int i10) {
        PendingIntent pendingIntentN;
        if (x9.a.a(context) || (pendingIntentN = n(context, bVar)) == null) {
            return false;
        }
        v(context, bVar.B3(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentN, i10, true), cb.i.f4947a | 134217728));
        return true;
    }
}
