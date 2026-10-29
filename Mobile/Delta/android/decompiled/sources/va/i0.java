package va;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends l9.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f32890a;
    public final /* synthetic */ k0 b;

    public i0(k0 k0Var, sb.k kVar) {
        this.b = k0Var;
        this.f32890a = kVar;
    }

    @Override // l9.g
    public final void c1(Status status) {
        if (this.f32890a.e(null)) {
            if (status.A3()) {
                this.b.f32895d.b.c(null);
            } else {
                this.b.f32895d.b.b(d.a(status, "Indexing error, please try again."));
            }
        }
    }
}
