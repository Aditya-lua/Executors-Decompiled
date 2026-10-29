package p268l9;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p242k9.C7492b;
import p305n9.AbstractC8923c;
import p305n9.C8956n;
import p462u9.C11811b;

/* JADX INFO: renamed from: l9.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8076t0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a */
    public final C8033f f30091a;

    /* JADX INFO: renamed from: b */
    public final int f30092b;

    /* JADX INFO: renamed from: c */
    public final C8021b f30093c;

    /* JADX INFO: renamed from: d */
    public final long f30094d;

    /* JADX INFO: renamed from: e */
    public final long f30095e;

    public C8076t0(C8033f c8033f, int i10, C8021b c8021b, long j10, long j11, String str, String str2) {
        this.f30091a = c8033f;
        this.f30092b = i10;
        this.f30093c = c8021b;
        this.f30094d = j10;
        this.f30095e = j11;
    }

    /* JADX INFO: renamed from: a */
    public static C8076t0 m33272a(C8033f c8033f, int i10, C8021b c8021b) {
        boolean zM9213y3;
        if (!c8033f.m33153e()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationM36055a = C8956n.m36054b().m36055a();
        if (rootTelemetryConfigurationM36055a == null) {
            zM9213y3 = true;
        } else {
            if (!rootTelemetryConfigurationM36055a.m9212x3()) {
                return null;
            }
            zM9213y3 = rootTelemetryConfigurationM36055a.m9213y3();
            C8046j0 c8046j0M33160t = c8033f.m33160t(c8021b);
            if (c8046j0M33160t != null) {
                if (!(c8046j0M33160t.m33226t() instanceof AbstractC8923c)) {
                    return null;
                }
                AbstractC8923c abstractC8923c = (AbstractC8923c) c8046j0M33160t.m33226t();
                if (abstractC8923c.hasConnectionInfo() && !abstractC8923c.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationM33273b = m33273b(c8046j0M33160t, abstractC8923c, i10);
                    if (connectionTelemetryConfigurationM33273b == null) {
                        return null;
                    }
                    c8046j0M33160t.m33200E();
                    zM9213y3 = connectionTelemetryConfigurationM33273b.m9205z3();
                }
            }
        }
        return new C8076t0(c8033f, i10, c8021b, zM9213y3 ? System.currentTimeMillis() : 0L, zM9213y3 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static ConnectionTelemetryConfiguration m33273b(C8046j0 c8046j0, AbstractC8923c abstractC8923c, int i10) {
        int[] iArrM9202w3;
        int[] iArrM9203x3;
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC8923c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.m9204y3() || ((iArrM9202w3 = telemetryConfiguration.m9202w3()) != null ? !C11811b.m44169a(iArrM9202w3, i10) : !((iArrM9203x3 = telemetryConfiguration.m9203x3()) == null || !C11811b.m44169a(iArrM9203x3, i10))) || c8046j0.m33224q() >= telemetryConfiguration.m9201v3()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
      0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        C8046j0 c8046j0M33160t;
        int iM9214z3;
        int i10;
        int i11;
        int iM9140w3;
        long j10;
        long j11;
        if (this.f30091a.m33153e()) {
            RootTelemetryConfiguration rootTelemetryConfigurationM36055a = C8956n.m36054b().m36055a();
            if ((rootTelemetryConfigurationM36055a == null || rootTelemetryConfigurationM36055a.m9212x3()) && (c8046j0M33160t = this.f30091a.m33160t(this.f30093c)) != null && (c8046j0M33160t.m33226t() instanceof AbstractC8923c)) {
                AbstractC8923c abstractC8923c = (AbstractC8923c) c8046j0M33160t.m33226t();
                int i12 = 0;
                boolean zM9213y3 = this.f30094d > 0;
                int gCoreServiceId = abstractC8923c.getGCoreServiceId();
                int iM9166x3 = 100;
                if (rootTelemetryConfigurationM36055a != null) {
                    zM9213y3 &= rootTelemetryConfigurationM36055a.m9213y3();
                    int iM9210v3 = rootTelemetryConfigurationM36055a.m9210v3();
                    int iM9211w3 = rootTelemetryConfigurationM36055a.m9211w3();
                    iM9214z3 = rootTelemetryConfigurationM36055a.m9214z3();
                    if (abstractC8923c.hasConnectionInfo() && !abstractC8923c.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationM33273b = m33273b(c8046j0M33160t, abstractC8923c, this.f30092b);
                        if (connectionTelemetryConfigurationM33273b == null) {
                            return;
                        }
                        boolean z10 = connectionTelemetryConfigurationM33273b.m9205z3() && this.f30094d > 0;
                        iM9211w3 = connectionTelemetryConfigurationM33273b.m9201v3();
                        zM9213y3 = z10;
                    }
                    i11 = iM9210v3;
                    i10 = iM9211w3;
                } else {
                    iM9214z3 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                C8033f c8033f = this.f30091a;
                int iElapsedRealtime = -1;
                if (task.isSuccessful()) {
                    iM9140w3 = 0;
                } else if (task.mo11898l()) {
                    i12 = iM9166x3;
                    iM9140w3 = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof C7492b) {
                        Status statusM31130a = ((C7492b) exception).m31130a();
                        iM9166x3 = statusM31130a.m9166x3();
                        ConnectionResult connectionResultM9164v3 = statusM31130a.m9164v3();
                        if (connectionResultM9164v3 == null) {
                            i12 = iM9166x3;
                            iM9140w3 = -1;
                        } else {
                            iM9140w3 = connectionResultM9164v3.m9140w3();
                            i12 = iM9166x3;
                        }
                    } else {
                        i12 = 101;
                        iM9140w3 = -1;
                    }
                }
                if (zM9213y3) {
                    long j12 = this.f30094d;
                    long j13 = this.f30095e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c8033f.m33147G(new MethodInvocation(this.f30092b, i12, iM9140w3, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iM9214z3, i11, i10);
            }
        }
    }
}
