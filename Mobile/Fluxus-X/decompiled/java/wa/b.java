package wa;

import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public abstract class b extends m9.u implements m9.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tb.k f35699d;

    public b() {
        super(null, false, 28902);
    }

    @Override // m9.d
    public final void b(Status status) {
        o9.s.b(!status.F3(), "Failed result must not be success.");
        String strD3 = status.D3();
        if (strD3 == null) {
            strD3 = BuildConfig.FLAVOR;
        }
        this.f35699d.b(d.a(status, strD3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m9.u
    public final /* bridge */ /* synthetic */ void d(l9.a.b bVar, tb.k kVar) {
        a0 a0Var = (a0) ((e0) bVar).getService();
        this.f35699d = kVar;
        h(a0Var);
    }

    public abstract void h(a0 a0Var);

    @Override // m9.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void a(Status status) {
        if (status.F3()) {
            this.f35699d.c(null);
        } else {
            this.f35699d.b(d.a(status, "User Action indexing error, please try again."));
        }
    }
}
