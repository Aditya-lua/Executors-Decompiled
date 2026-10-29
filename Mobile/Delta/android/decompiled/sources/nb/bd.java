package nb;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25373a;

    public bd(Context context) {
        n9.m.l(context);
        this.f25373a = context;
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    public final void a() {
        Log.v("FA", this.f25373a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f25373a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f25373a;
        g7 g7VarO = g7.O(context, null, null);
        final w5 w5VarA = g7VarO.a();
        String action = intent.getAction();
        g7VarO.c();
        w5VarA.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(me.F(context), new Runnable() { // from class: nb.ad
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f25339a.f(i11, w5VarA, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new i8(me.F(this.f25373a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @TargetApi(24)
    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) n9.m.l(string);
            me meVarF = me.F(this.f25373a);
            final w5 w5VarA = meVarF.a();
            meVarF.c();
            w5VarA.w().b("Local AppMeasurementJobService called. action", str);
            k(meVarF, new Runnable() { // from class: nb.yc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f26137a.g(w5VarA, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.v3.r(this.f25373a, null).G(new Runnable() { // from class: nb.zc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26232a.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void f(int i10, w5 w5Var, Intent intent) {
        Context context = this.f25373a;
        xc xcVar = (xc) context;
        if (xcVar.a(i10)) {
            w5Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            g7.O(context, null, null).a().w().a("Completed wakeful intent.");
            xcVar.g(intent);
        }
    }

    public final /* synthetic */ void g(w5 w5Var, JobParameters jobParameters) {
        w5Var.w().a("AppMeasurementJobService processed last upload request.");
        ((xc) this.f25373a).b(jobParameters, false);
    }

    public final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((xc) this.f25373a).b(jobParameters, false);
    }

    public final void k(me meVar, Runnable runnable) {
        meVar.b().t(new wc(this, meVar, runnable));
    }
}
