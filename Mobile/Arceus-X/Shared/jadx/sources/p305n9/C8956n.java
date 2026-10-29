package p305n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: n9.n */
/* JADX INFO: loaded from: classes.dex */
public final class C8956n {

    /* JADX INFO: renamed from: b */
    public static C8956n f32624b;

    /* JADX INFO: renamed from: c */
    public static final RootTelemetryConfiguration f32625c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a */
    public RootTelemetryConfiguration f32626a;

    @NonNull
    /* JADX INFO: renamed from: b */
    public static synchronized C8956n m36054b() {
        try {
            if (f32624b == null) {
                f32624b = new C8956n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32624b;
    }

    /* JADX INFO: renamed from: a */
    public RootTelemetryConfiguration m36055a() {
        return this.f32626a;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m36056c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.f32626a = f32625c;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f32626a;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.m9214z3() < rootTelemetryConfiguration.m9214z3()) {
                this.f32626a = rootTelemetryConfiguration;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
