package fb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.games_v2.zzs;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sb.k f16587a;

    public y1(a2 a2Var, sb.k kVar) {
        this.f16587a = kVar;
        Objects.requireNonNull(a2Var);
    }

    @Override // fb.f2
    public final void v0(Status status, zzs zzsVar) {
        if (zzsVar == null) {
            this.f16587a.b(new k9.b(status));
        } else {
            this.f16587a.c(zzsVar);
        }
    }
}
