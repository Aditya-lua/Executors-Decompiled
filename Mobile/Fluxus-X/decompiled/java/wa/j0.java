package wa;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends m9.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb.k f35713a;
    public final /* synthetic */ l0 b;

    public j0(l0 l0Var, tb.k kVar) {
        this.b = l0Var;
        this.f35713a = kVar;
    }

    @Override // m9.g
    public final void j1(Status status) {
        if (this.f35713a.e(null)) {
            if (status.F3()) {
                this.b.f35719d.b.c(null);
            } else {
                this.b.f35719d.b.b(d.a(status, "Indexing error, please try again."));
            }
        }
    }
}
