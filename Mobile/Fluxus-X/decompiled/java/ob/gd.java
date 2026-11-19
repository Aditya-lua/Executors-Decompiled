package ob;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27362a;

    public gd(Context context) {
        o9.s.l(context);
        this.f27362a = context;
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
        Log.v("FA", this.f27362a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void b() {
        Log.v("FA", this.f27362a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f27362a;
        l7 l7VarO = l7.O(context, null, null);
        final b6 b6VarA = l7VarO.a();
        String action = intent.getAction();
        l7VarO.c();
        b6VarA.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(ve.F(context), new Runnable() { // from class: ob.fd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27330a.f(i11, b6VarA, intent);
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
            return new n8(ve.F(this.f27362a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @TargetApi(24)
    public final boolean e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) o9.s.l(string);
            ve veVarF = ve.F(this.f27362a);
            final b6 b6VarA = veVarF.a();
            veVarF.c();
            b6VarA.w().b("Local AppMeasurementJobService called. action", str);
            k(veVarF, new Runnable() { // from class: ob.dd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f27199a.g(b6VarA, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.z3.r(this.f27362a, null).I(new Runnable() { // from class: ob.ed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f27307a.h(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void f(int i10, b6 b6Var, Intent intent) {
        Context context = this.f27362a;
        cd cdVar = (cd) context;
        if (cdVar.a(i10)) {
            b6Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            l7.O(context, null, null).a().w().a("Completed wakeful intent.");
            cdVar.g(intent);
        }
    }

    public final /* synthetic */ void g(b6 b6Var, JobParameters jobParameters) {
        b6Var.w().a("AppMeasurementJobService processed last upload request.");
        ((cd) this.f27362a).b(jobParameters, false);
    }

    public final /* synthetic */ void h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((cd) this.f27362a).b(jobParameters, false);
    }

    public final void k(ve veVar, Runnable runnable) {
        veVar.b().t(new bd(this, veVar, runnable));
    }
}
