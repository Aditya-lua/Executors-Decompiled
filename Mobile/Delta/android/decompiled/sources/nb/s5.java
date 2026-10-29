package nb;

import android.content.Context;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s5 f25941d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f25942a;
    public final n9.q b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f25943c = new AtomicLong(-1);

    public s5(Context context, g7 g7Var) {
        this.b = n9.p.b(context, n9.r.a().b("measurement:api").a());
        this.f25942a = g7Var;
    }

    public static s5 a(g7 g7Var) {
        if (f25941d == null) {
            f25941d = new s5(g7Var.d(), g7Var);
        }
        return f25941d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jB = this.f25942a.e().b();
        AtomicLong atomicLong = this.f25943c;
        if (atomicLong.get() != -1 && jB - atomicLong.get() <= BacktraceMetrics.defaultTimeIntervalMs) {
            return;
        }
        this.b.c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new sb.f() { // from class: nb.r5
            @Override // sb.f
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f25924a.c(jB, exc);
            }
        });
    }

    public final /* synthetic */ void c(long j10, Exception exc) {
        this.f25943c.set(j10);
    }
}
