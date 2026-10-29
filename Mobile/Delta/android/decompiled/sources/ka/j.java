package ka;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, sb.k kVar) {
        super(kVar);
        Objects.requireNonNull(nVar);
    }

    @Override // ka.k, ka.t
    public final void g(Intent intent) {
        if (intent == null) {
            N0(new Status(17));
        } else {
            this.f22291a.e(intent);
        }
    }
}
