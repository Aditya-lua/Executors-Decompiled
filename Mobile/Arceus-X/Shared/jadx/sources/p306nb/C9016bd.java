package p306nb;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2349v3;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C9016bd {

    /* JADX INFO: renamed from: a */
    public final Context f32734a;

    public C9016bd(Context context) {
        C8953m.m36047l(context);
        this.f32734a = context;
    }

    /* JADX INFO: renamed from: i */
    public static final void m36139i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m36140j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m36141a() {
        Log.v("FA", this.f32734a.getClass().getSimpleName().concat(" is starting up."));
    }

    /* JADX INFO: renamed from: b */
    public final void m36142b() {
        Log.v("FA", this.f32734a.getClass().getSimpleName().concat(" is shutting down."));
    }

    /* JADX INFO: renamed from: c */
    public final int m36143c(final Intent intent, int i10, final int i11) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f32734a;
        C9094g7 c9094g7M36300O = C9094g7.m36300O(context, null, null);
        final C9348w5 c9348w5Mo36321a = c9094g7M36300O.mo36321a();
        String action = intent.getAction();
        c9094g7M36300O.mo36323c();
        c9348w5Mo36321a.m37011w().m36913c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m36149k(C9197me.m36488F(context), new Runnable() { // from class: nb.ad
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f32691a.m36146f(i11, c9348w5Mo36321a, intent);
                }
            });
        }
        return 2;
    }

    /* JADX INFO: renamed from: d */
    public final IBinder m36144d(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC9127i8(C9197me.m36488F(this.f32734a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: e */
    public final boolean m36145e(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) C8953m.m36047l(string);
            C9197me c9197meM36488F = C9197me.m36488F(this.f32734a);
            final C9348w5 c9348w5Mo36321a = c9197meM36488F.mo36321a();
            c9197meM36488F.mo36323c();
            c9348w5Mo36321a.m37011w().m36912b("Local AppMeasurementJobService called. action", str);
            m36149k(c9197meM36488F, new Runnable() { // from class: nb.yc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f33691a.m36147g(c9348w5Mo36321a, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C2349v3.m10791r(this.f32734a, null).m10798G(new Runnable() { // from class: nb.zc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33847a.m36148h(jobParameters);
            }
        });
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m36146f(int i10, C9348w5 c9348w5, Intent intent) {
        Context context = this.f32734a;
        InterfaceC9371xc interfaceC9371xc = (InterfaceC9371xc) context;
        if (interfaceC9371xc.mo11870a(i10)) {
            c9348w5.m37011w().m36912b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            C9094g7.m36300O(context, null, null).mo36321a().m37011w().m36911a("Completed wakeful intent.");
            interfaceC9371xc.mo11873g(intent);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m36147g(C9348w5 c9348w5, JobParameters jobParameters) {
        c9348w5.m37011w().m36911a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC9371xc) this.f32734a).mo11871b(jobParameters, false);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m36148h(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC9371xc) this.f32734a).mo11871b(jobParameters, false);
    }

    /* JADX INFO: renamed from: k */
    public final void m36149k(C9197me c9197me, Runnable runnable) {
        c9197me.mo36322b().m36263t(new RunnableC9355wc(this, c9197me, runnable));
    }
}
