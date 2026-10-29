package gf;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ef.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n9.m;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile a f18202c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f18203a;
    public final Map b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        m.l(appMeasurementSdk);
        this.f18203a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    @NonNull
    public static a c(@NonNull e eVar, @NonNull Context context, @NonNull uf.d dVar) {
        m.l(eVar);
        m.l(context);
        m.l(dVar);
        m.l(context.getApplicationContext());
        if (f18202c == null) {
            synchronized (b.class) {
                try {
                    if (f18202c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.u()) {
                            dVar.a(ef.b.class, new Executor() { // from class: gf.d
                                @Override // java.util.concurrent.Executor
                                public final /* synthetic */ void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new uf.b() { // from class: gf.c
                                @Override // uf.b
                                public final /* synthetic */ void a(uf.a aVar) {
                                    b.d(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.t());
                        }
                        f18202c = new b(v3.r(context, bundle).s());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f18202c;
    }

    public static /* synthetic */ void d(uf.a aVar) {
        boolean z10 = ((ef.b) aVar.a()).f15448a;
        synchronized (b.class) {
            ((b) m.l(f18202c)).f18203a.zza(z10);
        }
    }

    @Override // gf.a
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (hf.b.a(str) && hf.b.b(str2, bundle) && hf.b.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f18203a.logEvent(str, str2, bundle);
        }
    }

    @Override // gf.a
    public void b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (hf.b.a(str) && hf.b.c(str, str2)) {
            this.f18203a.setUserProperty(str, str2, obj);
        }
    }
}
