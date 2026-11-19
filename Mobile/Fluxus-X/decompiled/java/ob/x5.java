package ob;

import android.content.Context;
import backtraceio.library.services.BacktraceMetrics;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static x5 f27962d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f27963a;
    public final o9.y b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f27964c = new AtomicLong(-1);

    public x5(Context context, l7 l7Var) {
        this.b = o9.x.b(context, o9.z.a().b("measurement:api").a());
        this.f27963a = l7Var;
    }

    public static x5 a(l7 l7Var) {
        if (f27962d == null) {
            f27962d = new x5(l7Var.d(), l7Var);
        }
        return f27962d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jB = this.f27963a.e().b();
        AtomicLong atomicLong = this.f27964c;
        if (atomicLong.get() != -1 && jB - atomicLong.get() <= BacktraceMetrics.defaultTimeIntervalMs) {
            return;
        }
        this.b.g(new o9.w(0, Arrays.asList(new o9.p(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new tb.f() { // from class: ob.w5
            @Override // tb.f
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f27946a.c(jB, exc);
            }
        });
    }

    public final /* synthetic */ void c(long j10, Exception exc) {
        this.f27964c.set(j10);
    }
}
