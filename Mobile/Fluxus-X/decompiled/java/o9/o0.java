package o9;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements l9.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l9.k f27001a;
    public final /* synthetic */ tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r.a f27002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f27003d;

    public o0(l9.k kVar, tb.k kVar2, r.a aVar, q0 q0Var) {
        this.f27001a = kVar;
        this.b = kVar2;
        this.f27002c = aVar;
        this.f27003d = q0Var;
    }

    @Override // l9.k.a
    public final void a(Status status) {
        if (!status.F3()) {
            this.b.b(b.a(status));
        } else {
            this.b.c(this.f27002c.a(this.f27001a.d(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
