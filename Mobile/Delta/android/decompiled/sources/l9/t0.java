package l9;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23081a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23084e;

    public t0(f fVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f23081a = fVar;
        this.b = i10;
        this.f23082c = bVar;
        this.f23083d = j10;
        this.f23084e = j11;
    }

    public static t0 a(f fVar, int i10, b bVar) {
        boolean zY3;
        if (!fVar.e()) {
            return null;
        }
        RootTelemetryConfiguration rootTelemetryConfigurationA = n9.n.b().a();
        if (rootTelemetryConfigurationA == null) {
            zY3 = true;
        } else {
            if (!rootTelemetryConfigurationA.x3()) {
                return null;
            }
            zY3 = rootTelemetryConfigurationA.y3();
            j0 j0VarT = fVar.t(bVar);
            if (j0VarT != null) {
                if (!(j0VarT.t() instanceof n9.c)) {
                    return null;
                }
                n9.c cVar = (n9.c) j0VarT.t();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(j0VarT, cVar, i10);
                    if (connectionTelemetryConfigurationB == null) {
                        return null;
                    }
                    j0VarT.E();
                    zY3 = connectionTelemetryConfigurationB.z3();
                }
            }
        }
        return new t0(fVar, i10, bVar, zY3 ? System.currentTimeMillis() : 0L, zY3 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static ConnectionTelemetryConfiguration b(j0 j0Var, n9.c cVar, int i10) {
        int[] iArrW3;
        int[] iArrX3;
        ConnectionTelemetryConfiguration telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.y3() || ((iArrW3 = telemetryConfiguration.w3()) != null ? !u9.b.a(iArrW3, i10) : !((iArrX3 = telemetryConfiguration.x3()) == null || !u9.b.a(iArrX3, i10))) || j0Var.q() >= telemetryConfiguration.v3()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
      0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        j0 j0VarT;
        int iZ3;
        int i10;
        int i11;
        int iW3;
        long j10;
        long j11;
        if (this.f23081a.e()) {
            RootTelemetryConfiguration rootTelemetryConfigurationA = n9.n.b().a();
            if ((rootTelemetryConfigurationA == null || rootTelemetryConfigurationA.x3()) && (j0VarT = this.f23081a.t(this.f23082c)) != null && (j0VarT.t() instanceof n9.c)) {
                n9.c cVar = (n9.c) j0VarT.t();
                int i12 = 0;
                boolean zY3 = this.f23083d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                int iX3 = 100;
                if (rootTelemetryConfigurationA != null) {
                    zY3 &= rootTelemetryConfigurationA.y3();
                    int iV3 = rootTelemetryConfigurationA.v3();
                    int iW4 = rootTelemetryConfigurationA.w3();
                    iZ3 = rootTelemetryConfigurationA.z3();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(j0VarT, cVar, this.b);
                        if (connectionTelemetryConfigurationB == null) {
                            return;
                        }
                        boolean z10 = connectionTelemetryConfigurationB.z3() && this.f23083d > 0;
                        iW4 = connectionTelemetryConfigurationB.v3();
                        zY3 = z10;
                    }
                    i11 = iV3;
                    i10 = iW4;
                } else {
                    iZ3 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                f fVar = this.f23081a;
                int iElapsedRealtime = -1;
                if (task.isSuccessful()) {
                    iW3 = 0;
                } else if (task.l()) {
                    i12 = iX3;
                    iW3 = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof k9.b) {
                        Status statusA = ((k9.b) exception).a();
                        iX3 = statusA.x3();
                        ConnectionResult connectionResultV3 = statusA.v3();
                        if (connectionResultV3 == null) {
                            i12 = iX3;
                            iW3 = -1;
                        } else {
                            iW3 = connectionResultV3.w3();
                            i12 = iX3;
                        }
                    } else {
                        i12 = 101;
                        iW3 = -1;
                    }
                }
                if (zY3) {
                    long j12 = this.f23083d;
                    long j13 = this.f23084e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                fVar.G(new MethodInvocation(this.b, i12, iW3, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iZ3, i11, i10);
            }
        }
    }
}
