package va;

import com.google.android.gms.common.api.Status;
import p268l9.InterfaceC8036g;
import sb.C11264k;

/* JADX INFO: renamed from: va.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC12128i0 extends InterfaceC8036g.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f42742a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C12132k0 f42743b;

    public BinderC12128i0(C12132k0 c12132k0, C11264k c11264k) {
        this.f42743b = c12132k0;
        this.f42742a = c11264k;
    }

    @Override // p268l9.InterfaceC8036g
    /* JADX INFO: renamed from: Z0 */
    public final void mo33169Z0(Status status) {
        if (this.f42742a.m42330e(null)) {
            if (status.m9163A3()) {
                this.f42743b.f42749d.f42753b.m42328c(null);
            } else {
                this.f42743b.f42749d.f42753b.m42327b(C12117d.m44957a(status, "Indexing error, please try again."));
            }
        }
    }
}
