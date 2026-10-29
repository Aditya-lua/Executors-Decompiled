package wa;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import l9.u;

/* JADX INFO: loaded from: classes.dex */
public final class p extends k9.e<k9.a.d.c> implements x8.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k9.a.g<d> f34152m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k9.a.AbstractC0392a<d, k9.a.d.c> f34153n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k9.a<k9.a.d.c> f34154o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f34155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j9.d f34156l;

    static {
        k9.a.g<d> gVar = new k9.a.g<>();
        f34152m = gVar;
        n nVar = new n();
        f34153n = nVar;
        f34154o = new k9.a<>("AppSet.API", nVar, gVar);
    }

    public p(Context context, j9.d dVar) {
        super(context, f34154o, k9.a.d.Jo, k9.e.a.f22280c);
        this.f34155k = context;
        this.f34156l = dVar;
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        return this.f34156l.h(this.f34155k, 212800000) == 0 ? z(u.c().d(x8.f.f35157a).b(new l9.q() { // from class: wa.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((g) ((d) obj).getService()).t2(new zza(null, null), new o(this.f34150a, (sb.k) obj2));
            }
        }).c(false).e(27601).a()) : sb.m.e(new k9.b(new Status(17)));
    }
}
