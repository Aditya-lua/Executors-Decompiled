package p243ka;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzg;
import java.util.Objects;
import sb.C11264k;

/* JADX INFO: renamed from: ka.i */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC7523i extends BinderC7525k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC7523i(C7528n c7528n, C11264k c11264k) {
        super(c11264k);
        Objects.requireNonNull(c7528n);
    }

    @Override // p243ka.BinderC7525k, p243ka.InterfaceC7534t
    /* JADX INFO: renamed from: A1 */
    public final void mo31174A1(zzg zzgVar) {
        if (zzgVar == null) {
            mo31176J0(new Status(17));
        } else {
            this.f28875a.m42330e(zzgVar);
        }
    }
}
