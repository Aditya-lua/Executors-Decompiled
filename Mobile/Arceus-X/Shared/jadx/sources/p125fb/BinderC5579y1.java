package p125fb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzs;
import java.util.Objects;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: fb.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5579y1 extends BinderC5514e1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11264k f21370a;

    public BinderC5579y1(C5499a2 c5499a2, C11264k c11264k) {
        this.f21370a = c11264k;
        Objects.requireNonNull(c5499a2);
    }

    @Override // p125fb.InterfaceC5519f2
    /* JADX INFO: renamed from: t0 */
    public final void mo25177t0(Status status, zzs zzsVar) {
        if (zzsVar == null) {
            this.f21370a.m42327b(new C7492b(status));
        } else {
            this.f21370a.m42328c(zzsVar);
        }
    }
}
