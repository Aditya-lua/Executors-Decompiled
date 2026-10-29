package p306nb;

import android.content.Context;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import p305n9.C8961p;
import p305n9.C8965r;
import p305n9.InterfaceC8963q;
import sb.InterfaceC11254f;

/* JADX INFO: renamed from: nb.s5 */
/* JADX INFO: loaded from: classes.dex */
public final class C9284s5 {

    /* JADX INFO: renamed from: d */
    public static C9284s5 f33451d;

    /* JADX INFO: renamed from: a */
    public final C9094g7 f33452a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8963q f33453b;

    /* JADX INFO: renamed from: c */
    public final AtomicLong f33454c = new AtomicLong(-1);

    public C9284s5(Context context, C9094g7 c9094g7) {
        this.f33453b = C8961p.m36064b(context, C8965r.m36068a().m36071b("measurement:api").m36070a());
        this.f33452a = c9094g7;
    }

    /* JADX INFO: renamed from: a */
    public static C9284s5 m36768a(C9094g7 c9094g7) {
        if (f33451d == null) {
            f33451d = new C9284s5(c9094g7.mo36324d(), c9094g7);
        }
        return f33451d;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m36769b(int i10, int i11, long j10, long j11, int i12) {
        final long jMo44176b = this.f33452a.mo36325e().mo44176b();
        AtomicLong atomicLong = this.f33454c;
        if (atomicLong.get() != -1 && jMo44176b - atomicLong.get() <= BacktraceMetrics.defaultTimeIntervalMs) {
            return;
        }
        this.f33453b.mo36065c(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).mo11891e(new InterfaceC11254f() { // from class: nb.r5
            @Override // sb.InterfaceC11254f
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f33428a.m36770c(jMo44176b, exc);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m36770c(long j10, Exception exc) {
        this.f33454c.set(j10);
    }
}
