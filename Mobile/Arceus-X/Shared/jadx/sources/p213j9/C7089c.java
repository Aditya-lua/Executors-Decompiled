package p213j9;

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
import bb.C1300h;
import bb.C1301i;
import bb.InterfaceC1296d;
import bb.InterfaceC1297e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import p093e4.ActivityC4831q;
import p164h9.C6324a;
import p164h9.C6325b;
import p235k2.C7419k;
import p242k9.InterfaceC7497g;
import p268l9.AbstractC8064p0;
import p268l9.C8033f;
import p268l9.C8067q0;
import p268l9.InterfaceC8045j;
import p305n9.AbstractDialogInterfaceOnClickListenerC8918a0;
import p305n9.C8953m;
import p305n9.C8977x;
import p462u9.C11818i;
import p462u9.C11822m;
import p511w9.C12325a;
import sb.C11268m;
import sb.InterfaceC11262j;

/* JADX INFO: renamed from: j9.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {InterfaceC1296d.class, InterfaceC1297e.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
public class C7089c extends C7091d {

    /* JADX INFO: renamed from: c */
    public String f27694c;

    /* JADX INFO: renamed from: e */
    public static final Object f27692e = new Object();

    /* JADX INFO: renamed from: f */
    public static final C7089c f27693f = new C7089c();

    /* JADX INFO: renamed from: d */
    public static final int f27691d = C7091d.f27704a;

    @NonNull
    /* JADX INFO: renamed from: o */
    public static C7089c m29849o() {
        return f27693f;
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public static final Task m29850z(@NonNull InterfaceC7497g interfaceC7497g, @NonNull InterfaceC7497g... interfaceC7497gArr) {
        C8953m.m36048m(interfaceC7497g, "Requested API must not be null.");
        for (InterfaceC7497g interfaceC7497g2 : interfaceC7497gArr) {
            C8953m.m36048m(interfaceC7497g2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(interfaceC7497gArr.length + 1);
        arrayList.add(interfaceC7497g);
        arrayList.addAll(Arrays.asList(interfaceC7497gArr));
        return C8033f.m33142u().m33161x(arrayList);
    }

    @Override // p213j9.C7091d
    /* JADX INFO: renamed from: b */
    public Intent mo29851b(Context context, int i10, String str) {
        return super.mo29851b(context, i10, str);
    }

    @Override // p213j9.C7091d
    /* JADX INFO: renamed from: c */
    public PendingIntent mo29852c(@NonNull Context context, int i10, int i11) {
        return super.mo29852c(context, i10, i11);
    }

    @Override // p213j9.C7091d
    @NonNull
    /* JADX INFO: renamed from: e */
    public final String mo29853e(int i10) {
        return super.mo29853e(i10);
    }

    @Override // p213j9.C7091d
    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: g */
    public int mo29854g(@NonNull Context context) {
        return super.mo29854g(context);
    }

    @Override // p213j9.C7091d
    /* JADX INFO: renamed from: h */
    public int mo29855h(@NonNull Context context, int i10) {
        return super.mo29855h(context, i10);
    }

    @Override // p213j9.C7091d
    /* JADX INFO: renamed from: j */
    public final boolean mo29856j(int i10) {
        return super.mo29856j(i10);
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public Task<Void> m29857l(@NonNull InterfaceC7497g<?> interfaceC7497g, @NonNull InterfaceC7497g<?>... interfaceC7497gArr) {
        return m29850z(interfaceC7497g, interfaceC7497gArr).mo11901o(new InterfaceC11262j() { // from class: j9.m
            @Override // sb.InterfaceC11262j
            public final Task then(Object obj) {
                int i10 = C7089c.f27691d;
                return C11268m.m42336f(null);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public Dialog m29858m(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return m29862r(activity, i10, AbstractDialogInterfaceOnClickListenerC8918a0.m35952b(activity, mo29851b(activity, i10, "d"), i11), onCancelListener, null);
    }

    /* JADX INFO: renamed from: n */
    public PendingIntent m29859n(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.m9143z3() ? connectionResult.m9142y3() : mo29852c(context, connectionResult.m9140w3(), 0);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: p */
    public boolean m29860p(@NonNull Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM29858m = m29858m(activity, i10, i11, onCancelListener);
        if (dialogM29858m == null) {
            return false;
        }
        m29865u(activity, dialogM29858m, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public void m29861q(@NonNull Context context, int i10) {
        m29866v(context, i10, null, m29878d(context, i10, 0, "n"));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:8:0x002c */
    /* JADX INFO: renamed from: r */
    public final Dialog m29862r(@NonNull Context context, int i10, AbstractDialogInterfaceOnClickListenerC8918a0 abstractDialogInterfaceOnClickListenerC8918a0, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
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
        builder2.setMessage(C8977x.m36080c(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strM36079b = C8977x.m36079b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = abstractDialogInterfaceOnClickListenerC8918a0;
        if (strM36079b != null) {
            if (abstractDialogInterfaceOnClickListenerC8918a0 == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strM36079b, onClickListener2);
        }
        String strM36083f = C8977x.m36083f(context, i10);
        if (strM36083f != null) {
            builder2.setTitle(strM36083f);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder2.create();
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public final Dialog m29863s(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C8977x.m36080c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        m29865u(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: t */
    public final C8067q0 m29864t(Context context, AbstractC8064p0 abstractC8064p0) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C8067q0 c8067q0 = new C8067q0(abstractC8064p0);
        C1300h.m7095r(context, c8067q0, intentFilter);
        c8067q0.m33268a(context);
        if (m29879i(context, "com.google.android.gms")) {
            return c8067q0;
        }
        abstractC8064p0.mo33264a();
        c8067q0.m33269b();
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m29865u(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof ActivityC4831q) {
                C7105k.m29912u2(dialog, onCancelListener).mo23339t2(((ActivityC4831q) activity).m23360l1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC7087b.m29848a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* JADX INFO: renamed from: v */
    public final void m29866v(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            m29867w(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM36082e = C8977x.m36082e(context, i10);
        String strM36081d = C8977x.m36081d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) C8953m.m36047l(context.getSystemService("notification"));
        C7419k.f fVarM30772B = new C7419k.f(context).m30797u(true).m30782f(true).m30788l(strM36082e).m30772B(new C7419k.d().m30768h(strM36081d));
        if (C11818i.m44183c(context)) {
            C8953m.m36051p(C11822m.m44197d());
            fVarM30772B.m30802z(context.getApplicationInfo().icon).m30800x(2);
            if (C11818i.m44184d(context)) {
                fVarM30772B.m30778a(C6324a.f24054a, resources.getString(C6325b.f24069o), pendingIntent);
            } else {
                fVarM30772B.m30786j(pendingIntent);
            }
        } else {
            fVarM30772B.m30802z(R.drawable.stat_sys_warning).m30773C(resources.getString(C6325b.f24062h)).m30777G(System.currentTimeMillis()).m30786j(pendingIntent).m30787k(strM36081d);
        }
        if (C11822m.m44200g()) {
            C8953m.m36051p(C11822m.m44200g());
            synchronized (f27692e) {
                str2 = this.f27694c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(C6325b.f24061g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            fVarM30772B.m30783g(str2);
        }
        Notification notificationM30780c = fVarM30772B.m30780c();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            C7099h.f27713b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationM30780c);
    }

    /* JADX INFO: renamed from: w */
    public final void m29867w(Context context) {
        new HandlerC7109n(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: x */
    public final boolean m29868x(@NonNull Activity activity, @NonNull InterfaceC8045j interfaceC8045j, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM29862r = m29862r(activity, i10, AbstractDialogInterfaceOnClickListenerC8918a0.m35953c(interfaceC8045j, mo29851b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogM29862r == null) {
            return false;
        }
        m29865u(activity, dialogM29862r, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m29869y(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i10) {
        PendingIntent pendingIntentM29859n;
        if (C12325a.m46173a(context) || (pendingIntentM29859n = m29859n(context, connectionResult)) == null) {
            return false;
        }
        m29866v(context, connectionResult.m9140w3(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m9160a(context, pendingIntentM29859n, i10, true), C1301i.f5336a | 134217728));
        return true;
    }
}
