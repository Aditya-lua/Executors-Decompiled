package q9;

import android.content.Context;
import cb.f;
import com.google.android.gms.tasks.Task;
import l9.g;
import m9.q;
import m9.u;
import o9.w;
import o9.y;
import o9.z;
import tb.k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends g implements y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l9.a.g f29945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f29946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a f29947m;

    static {
        l9.a.g gVar = new l9.a.g();
        f29945k = gVar;
        c cVar = new c();
        f29946l = cVar;
        f29947m = new l9.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, z zVar) {
        super(context, (l9.a<z>) f29947m, zVar, g.a.f22012c);
    }

    @Override // o9.y
    public final Task<Void> g(final w wVar) {
        u.a aVarC = u.c();
        aVarC.d(f.f4946a);
        aVarC.c(false);
        aVarC.b(new q() { // from class: q9.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                l9.a.g gVar = d.f29945k;
                ((a) ((e) obj).getService()).u2(wVar);
                ((k) obj2).c(null);
            }
        });
        return y(aVarC.a());
    }
}
