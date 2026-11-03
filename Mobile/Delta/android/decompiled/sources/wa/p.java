package wa;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import l9.u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k9.e<k9.a.d.c> implements x8.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a.g<d> f34358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k9.a.AbstractC0391a<d, k9.a.d.c> f34359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k9.a<k9.a.d.c> f34360o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f34361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.d f34362l;

    static {
        k9.a.g<d> gVar = new k9.a.g<>();
        f34358m = gVar;
        n nVar = new n();
        f34359n = nVar;
        f34360o = new k9.a<>("AppSet.API", nVar, gVar);
    }

    public p(Context context, j9.d dVar) {
        super(context, f34360o, k9.a.d.Ko, k9.e.a.f22504c);
        this.f34361k = context;
        this.f34362l = dVar;
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        return this.f34362l.h(this.f34361k, 212800000) == 0 ? z(u.c().d(x8.f.f35655a).b(new l9.q() { // from class: wa.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).t2(new zza(null, null), new o(this.f34356a, (sb.k) obj2));
            }
        }).c(false).e(27601).a()) : sb.m.e(new k9.b(new Status(17)));
    }
}
