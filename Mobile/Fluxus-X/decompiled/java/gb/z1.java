package gb;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb.k f17682a;

    public z1(b2 b2Var, tb.k kVar) {
        this.f17682a = kVar;
        Objects.requireNonNull(b2Var);
    }

    @Override // gb.i2
    public final void k1(Status status, f2 f2Var) {
        if (f2Var == null) {
            this.f17682a.b(new l9.b(status));
        } else {
            this.f17682a.c(f2Var);
        }
    }
}
