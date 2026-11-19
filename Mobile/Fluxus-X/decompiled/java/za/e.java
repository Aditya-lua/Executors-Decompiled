package za;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l9.g implements a9.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l9.a.g f39183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final l9.a.AbstractC0421a f39184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l9.a f39185n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f39186k;

    static {
        l9.a.g gVar = new l9.a.g();
        f39183l = gVar;
        c cVar = new c();
        f39184m = cVar;
        f39185n = new l9.a("Auth.Api.Identity.CredentialSaving.API", cVar, gVar);
    }

    public e(@NonNull Context context, @NonNull a9.n nVar) {
        super(context, (l9.a<a9.n>) f39185n, nVar, l9.g.a.f22012c);
        this.f39186k = r.a();
    }

    @Override // a9.c
    public final Task<a9.h> l(@NonNull a9.g gVar) {
        o9.s.l(gVar);
        a9.g.a aVarC3 = a9.g.C3(gVar);
        aVarC3.c(this.f39186k);
        final a9.g gVarA = aVarC3.a();
        return z(m9.u.c().d(q.f39203e).b(new m9.q() { // from class: za.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((a0) ((x) obj).getService()).t2(new d(this.f39181a, (tb.k) obj2), (a9.g) o9.s.l(gVarA));
            }
        }).c(false).e(1536).a());
    }
}
