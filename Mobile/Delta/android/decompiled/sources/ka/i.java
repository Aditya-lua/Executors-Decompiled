package ka;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, sb.k kVar) {
        super(kVar);
        Objects.requireNonNull(nVar);
    }

    @Override // ka.k, ka.t
    public final void A1(zzg zzgVar) {
        if (zzgVar == null) {
            J0(new Status(17));
        } else {
            this.f22515a.e(zzgVar);
        }
    }
}
