package m9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class m1 extends r0 {
    public final u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.k f23036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f23037d;

    public m1(int i10, u uVar, tb.k kVar, s sVar) {
        super(i10);
        this.f23036c = kVar;
        this.b = uVar;
        this.f23037d = sVar;
        if (i10 == 2 && uVar.e()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // m9.o1
    public final void a(@NonNull Status status) {
        this.f23036c.d(this.f23037d.a(status));
    }

    @Override // m9.o1
    public final void b(@NonNull Exception exc) {
        this.f23036c.d(exc);
    }

    @Override // m9.o1
    public final void c(j0 j0Var) throws DeadObjectException {
        try {
            this.b.d(j0Var.t(), this.f23036c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(o1.e(e11));
        } catch (RuntimeException e12) {
            this.f23036c.d(e12);
        }
    }

    @Override // m9.o1
    public final void d(@NonNull z zVar, boolean z10) {
        zVar.d(this.f23036c, z10);
    }

    @Override // m9.r0
    public final boolean f(j0 j0Var) {
        return this.b.e();
    }

    @Override // m9.r0
    public final k9.d[] g(j0 j0Var) {
        return this.b.g();
    }
}
