package xa;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import m9.u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends l9.g<l9.a.d.c> implements y8.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a.g<d> f36642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l9.a.AbstractC0421a<d, l9.a.d.c> f36643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final l9.a<l9.a.d.c> f36644o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f36645k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k9.f f36646l;

    static {
        l9.a.g<d> gVar = new l9.a.g<>();
        f36642m = gVar;
        n nVar = new n();
        f36643n = nVar;
        f36644o = new l9.a<>("AppSet.API", nVar, gVar);
    }

    public p(Context context, k9.f fVar) {
        super(context, f36644o, l9.a.d.Oo, l9.g.a.f22012c);
        this.f36645k = context;
        this.f36646l = fVar;
    }

    @Override // y8.b
    public final Task<y8.c> j() {
        return this.f36646l.h(this.f36645k, 212800000) == 0 ? z(u.c().d(y8.h.f37705a).b(new m9.q() { // from class: xa.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).t2(new y8.d(null, null), new o(this.f36640a, (tb.k) obj2));
            }
        }).c(false).e(27601).a()) : tb.m.e(new l9.b(new Status(17)));
    }
}
