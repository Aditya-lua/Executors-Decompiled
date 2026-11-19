package kf;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hf.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import o9.s;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f21453c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f21454a;
    public final Map b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        s.l(appMeasurementSdk);
        this.f21454a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @NonNull
    public static a c(@NonNull e eVar, @NonNull Context context, @NonNull xf.d dVar) {
        s.l(eVar);
        s.l(context);
        s.l(dVar);
        s.l(context.getApplicationContext());
        if (f21453c == null) {
            synchronized (b.class) {
                try {
                    if (f21453c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.u()) {
                            dVar.b(hf.b.class, new Executor() { // from class: kf.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new xf.b() { // from class: kf.c
                                @Override // xf.b
                                public final /* synthetic */ void a(xf.a aVar) {
                                    b.d(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.t());
                        }
                        f21453c = new b(z3.r(context, bundle).s());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21453c;
    }

    public static /* synthetic */ void d(xf.a aVar) {
        boolean z10 = ((hf.b) aVar.a()).f18188a;
        synchronized (b.class) {
            ((b) s.l(f21453c)).f21454a.zza(z10);
        }
    }

    @Override // kf.a
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (lf.b.a(str) && lf.b.b(str2, bundle) && lf.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f21454a.logEvent(str, str2, bundle);
        }
    }

    @Override // kf.a
    public void b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (lf.b.a(str) && lf.b.c(str, str2)) {
            this.f21454a.setUserProperty(str, str2, obj);
        }
    }
}
