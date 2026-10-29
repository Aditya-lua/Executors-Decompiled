package l9;

import android.os.DeadObjectException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends o1 {
    public final com.google.android.gms.common.api.internal.a b;

    public k1(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        this.b = (com.google.android.gms.common.api.internal.a) n9.m.m(aVar, "Null methods are not runnable.");
    }

    @Override // l9.o1
    public final void a(@NonNull Status status) {
        try {
            this.b.b(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // l9.o1
    public final void b(@NonNull Exception exc) {
        try {
            this.b.b(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // l9.o1
    public final void c(j0 j0Var) throws DeadObjectException {
        try {
            this.b.p(j0Var.t());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // l9.o1
    public final void d(@NonNull z zVar, boolean z10) {
        zVar.c(this.b, z10);
    }
}
