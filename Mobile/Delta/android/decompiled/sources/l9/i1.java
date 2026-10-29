package l9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends r0 {
    public final sb.k b;

    public i1(int i10, sb.k kVar) {
        super(i10);
        this.b = kVar;
    }

    @Override // l9.o1
    public final void a(@NonNull Status status) {
        this.b.d(new k9.b(status));
    }

    @Override // l9.o1
    public final void b(@NonNull Exception exc) {
        this.b.d(exc);
    }

    @Override // l9.o1
    public final void c(j0 j0Var) throws DeadObjectException {
        try {
            h(j0Var);
        } catch (DeadObjectException e10) {
            a(o1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(o1.e(e11));
        } catch (RuntimeException e12) {
            this.b.d(e12);
        }
    }

    public abstract void h(j0 j0Var);
}
