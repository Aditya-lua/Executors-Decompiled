package p9;

import android.content.Context;
import bb.f;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import l9.u;
import n9.q;
import n9.r;
import sb.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k9.e implements q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.a.g f28604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k9.a.AbstractC0391a f28605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a f28606m;

    static {
        k9.a.g gVar = new k9.a.g();
        f28604k = gVar;
        c cVar = new c();
        f28605l = cVar;
        f28606m = new k9.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, r rVar) {
        super(context, (k9.a<r>) f28606m, rVar, k9.e.a.f22504c);
    }

    @Override // n9.q
    public final Task<Void> c(final TelemetryData telemetryData) {
        u.a aVarC = u.c();
        aVarC.d(f.f3981a);
        aVarC.c(false);
        aVarC.b(new l9.q() { // from class: p9.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                k9.a.g gVar = d.f28604k;
                ((a) ((e) obj).getService()).u2(telemetryData);
                ((k) obj2).c(null);
            }
        });
        return y(aVarC.a());
    }
}
