package la;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, tb.k kVar) {
        super(kVar);
        Objects.requireNonNull(pVar);
    }

    @Override // la.m, la.w
    public final void g(Intent intent) {
        if (intent == null) {
            P0(new Status(17));
        } else {
            this.f22031a.e(intent);
        }
    }
}
