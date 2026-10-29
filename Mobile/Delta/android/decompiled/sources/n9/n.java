package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f25290c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f25291a;

    @NonNull
    public static synchronized n b() {
        try {
            if (b == null) {
                b = new n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b;
    }

    public RootTelemetryConfiguration a() {
        return this.f25291a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                this.f25291a = f25290c;
                return;
            }
            RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f25291a;
            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.z3() < rootTelemetryConfiguration.z3()) {
                this.f25291a = rootTelemetryConfiguration;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
