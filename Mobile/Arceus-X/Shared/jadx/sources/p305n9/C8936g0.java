package p305n9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p242k9.AbstractC7499i;
import sb.C11264k;

/* JADX INFO: renamed from: n9.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8936g0 implements AbstractC7499i.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC7499i f32598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f32599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8950l.a f32600c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC8942i0 f32601d;

    public C8936g0(AbstractC7499i abstractC7499i, C11264k c11264k, C8950l.a aVar, InterfaceC8942i0 interfaceC8942i0) {
        this.f32598a = abstractC7499i;
        this.f32599b = c11264k;
        this.f32600c = aVar;
        this.f32601d = interfaceC8942i0;
    }

    @Override // p242k9.AbstractC7499i.a
    /* JADX INFO: renamed from: a */
    public final void mo31159a(Status status) {
        if (!status.m9163A3()) {
            this.f32599b.m42327b(C8917a.m35951a(status));
        } else {
            this.f32599b.m42328c(this.f32600c.mo8184a(this.f32598a.mo9172d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
