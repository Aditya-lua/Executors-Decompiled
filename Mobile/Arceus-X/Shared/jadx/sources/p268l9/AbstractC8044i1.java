package p268l9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: l9.i1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8044i1 extends AbstractC8070r0 {

    /* JADX INFO: renamed from: b */
    public final C11264k f30025b;

    public AbstractC8044i1(int i10, C11264k c11264k) {
        super(i10);
        this.f30025b = c11264k;
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: a */
    public final void mo33184a(@NonNull Status status) {
        this.f30025b.m42329d(new C7492b(status));
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: b */
    public final void mo33185b(@NonNull Exception exc) {
        this.f30025b.m42329d(exc);
    }

    @Override // p268l9.AbstractC8062o1
    /* JADX INFO: renamed from: c */
    public final void mo33186c(C8046j0 c8046j0) throws DeadObjectException {
        try {
            mo33187h(c8046j0);
        } catch (DeadObjectException e10) {
            mo33184a(AbstractC8062o1.m33253e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo33184a(AbstractC8062o1.m33253e(e11));
        } catch (RuntimeException e12) {
            this.f30025b.m42329d(e12);
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo33187h(C8046j0 c8046j0);
}
