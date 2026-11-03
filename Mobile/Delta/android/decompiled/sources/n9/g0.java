package n9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements k9.i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k9.i f26089a;
    public final /* synthetic */ sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l.a f26090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f26091d;

    public g0(k9.i iVar, sb.k kVar, l.a aVar, i0 i0Var) {
        this.f26089a = iVar;
        this.b = kVar;
        this.f26090c = aVar;
        this.f26091d = i0Var;
    }

    @Override // k9.i.a
    public final void a(Status status) {
        if (!status.A3()) {
            this.b.b(a.a(status));
        } else {
            this.b.c(this.f26090c.a(this.f26089a.d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
