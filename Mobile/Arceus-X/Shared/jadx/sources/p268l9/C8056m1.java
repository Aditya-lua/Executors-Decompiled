package p268l9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import sb.C11264k;

/* JADX INFO: renamed from: l9.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8056m1 extends AbstractC8070r0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC8078u f30050b;

    /* JADX INFO: renamed from: c */
    public final C11264k f30051c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8072s f30052d;

    public C8056m1(int i10, AbstractC8078u abstractC8078u, C11264k c11264k, InterfaceC8072s interfaceC8072s) {
        super(i10);
        this.f30051c = c11264k;
        this.f30050b = abstractC8078u;
        this.f30052d = interfaceC8072s;
        if (i10 == 2 && abstractC8078u.m33281e()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: a */
    public final void mo33184a(@NonNull Status status) {
        this.f30051c.m42329d(this.f30052d.mo33102a(status));
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: b */
    public final void mo33185b(@NonNull Exception exc) {
        this.f30051c.m42329d(exc);
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: c */
    public final void mo33186c(C8046j0 c8046j0) throws DeadObjectException {
        try {
            this.f30050b.mo33170d(c8046j0.m33226t(), this.f30051c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo33184a(AbstractC8062o1.m33253e(e11));
        } catch (RuntimeException e12) {
            this.f30051c.m42329d(e12);
        }
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: d */
    public final void mo33232d(@NonNull C8093z c8093z, boolean z10) {
        c8093z.m33299d(this.f30051c, z10);
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: f */
    public final boolean mo33238f(C8046j0 c8046j0) {
        return this.f30050b.m33281e();
    }

    @Override // p268l9.AbstractC8070r0
    /* JADX INFO: renamed from: g */
    public final Feature[] mo33239g(C8046j0 c8046j0) {
        return this.f30050b.m33283g();
    }
}
