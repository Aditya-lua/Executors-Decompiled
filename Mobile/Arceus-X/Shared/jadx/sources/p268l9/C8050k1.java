package p268l9;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1899a;
import p305n9.C8953m;

/* JADX INFO: renamed from: l9.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8050k1 extends AbstractC8062o1 {

    /* JADX INFO: renamed from: b */
    public final AbstractC1899a f30044b;

    public C8050k1(int i10, AbstractC1899a abstractC1899a) {
        super(i10);
        this.f30044b = (AbstractC1899a) C8953m.m36048m(abstractC1899a, "Null methods are not runnable.");
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: a */
    public final void mo33184a(@NonNull Status status) {
        try {
            this.f30044b.mo9182b(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: b */
    public final void mo33185b(@NonNull Exception exc) {
        try {
            this.f30044b.mo9182b(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: c */
    public final void mo33186c(C8046j0 c8046j0) throws DeadObjectException {
        try {
            this.f30044b.m9185p(c8046j0.m33226t());
        } catch (RuntimeException e10) {
            mo33185b(e10);
        }
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: d */
    public final void mo33232d(@NonNull C8093z c8093z, boolean z10) {
        c8093z.m33298c(this.f30044b, z10);
    }
}
