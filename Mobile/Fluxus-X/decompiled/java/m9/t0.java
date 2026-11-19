package m9;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f23066a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f23067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23069e;

    public t0(f fVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f23066a = fVar;
        this.b = i10;
        this.f23067c = bVar;
        this.f23068d = j10;
        this.f23069e = j11;
    }

    public static t0 a(f fVar, int i10, b bVar) {
        boolean zD3;
        if (!fVar.e()) {
            return null;
        }
        o9.u uVarA = o9.t.b().a();
        if (uVarA == null) {
            zD3 = true;
        } else {
            if (!uVarA.C3()) {
                return null;
            }
            zD3 = uVarA.D3();
            j0 j0VarT = fVar.t(bVar);
            if (j0VarT != null) {
                if (!(j0VarT.t() instanceof o9.d)) {
                    return null;
                }
                o9.d dVar = (o9.d) j0VarT.t();
                if (dVar.hasConnectionInfo() && !dVar.isConnecting()) {
                    o9.g gVarB = b(j0VarT, dVar, i10);
                    if (gVarB == null) {
                        return null;
                    }
                    j0VarT.E();
                    zD3 = gVarB.E3();
                }
            }
        }
        return new t0(fVar, i10, bVar, zD3 ? System.currentTimeMillis() : 0L, zD3 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static o9.g b(j0 j0Var, o9.d dVar, int i10) {
        int[] iArrB3;
        int[] iArrC3;
        o9.g telemetryConfiguration = dVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.D3() || ((iArrB3 = telemetryConfiguration.B3()) != null ? !v9.b.a(iArrB3, i10) : !((iArrC3 = telemetryConfiguration.C3()) == null || !v9.b.a(iArrC3, i10))) || j0Var.q() >= telemetryConfiguration.A3()) {
            return null;
        }
        return telemetryConfiguration;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009a A[PHI: r9
      0x009a: PHI (r9v3 int) = (r9v0 int), (r9v2 int) binds: [B:38:0x0098, B:44:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        j0 j0VarT;
        int iE3;
        int i10;
        int i11;
        int iB3;
        long j10;
        long j11;
        if (this.f23066a.e()) {
            o9.u uVarA = o9.t.b().a();
            if ((uVarA == null || uVarA.C3()) && (j0VarT = this.f23066a.t(this.f23067c)) != null && (j0VarT.t() instanceof o9.d)) {
                o9.d dVar = (o9.d) j0VarT.t();
                int i12 = 0;
                boolean zD3 = this.f23068d > 0;
                int gCoreServiceId = dVar.getGCoreServiceId();
                int iC3 = 100;
                if (uVarA != null) {
                    zD3 &= uVarA.D3();
                    int iA3 = uVarA.A3();
                    int iB4 = uVarA.B3();
                    iE3 = uVarA.E3();
                    if (dVar.hasConnectionInfo() && !dVar.isConnecting()) {
                        o9.g gVarB = b(j0VarT, dVar, this.b);
                        if (gVarB == null) {
                            return;
                        }
                        boolean z10 = gVarB.E3() && this.f23068d > 0;
                        iB4 = gVarB.A3();
                        zD3 = z10;
                    }
                    i11 = iA3;
                    i10 = iB4;
                } else {
                    iE3 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                f fVar = this.f23066a;
                int iElapsedRealtime = -1;
                if (task.isSuccessful()) {
                    iB3 = 0;
                } else if (task.l()) {
                    i12 = iC3;
                    iB3 = -1;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof l9.b) {
                        Status statusA = ((l9.b) exception).a();
                        iC3 = statusA.C3();
                        k9.b bVarA3 = statusA.A3();
                        if (bVarA3 == null) {
                            i12 = iC3;
                            iB3 = -1;
                        } else {
                            iB3 = bVarA3.B3();
                            i12 = iC3;
                        }
                    } else {
                        i12 = MlKitException.NOT_ENOUGH_SPACE;
                        iB3 = -1;
                    }
                }
                if (zD3) {
                    long j12 = this.f23068d;
                    long j13 = this.f23069e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                fVar.G(new o9.p(this.b, i12, iB3, j10, j11, null, null, gCoreServiceId, iElapsedRealtime), iE3, i11, i10);
            }
        }
    }
}
