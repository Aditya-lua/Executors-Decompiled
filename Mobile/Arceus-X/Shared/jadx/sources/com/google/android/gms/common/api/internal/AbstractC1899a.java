package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import p242k9.AbstractC7496f;
import p242k9.C7491a;
import p242k9.C7491a.b;
import p242k9.InterfaceC7504n;
import p268l9.InterfaceC8027d;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1899a<R extends InterfaceC7504n, A extends C7491a.b> extends BasePendingResult<R> implements InterfaceC8027d<R> {

    /* JADX INFO: renamed from: o */
    public final C7491a.c<A> f7430o;

    /* JADX INFO: renamed from: p */
    public final C7491a<?> f7431p;

    public AbstractC1899a(@NonNull C7491a<?> c7491a, @NonNull AbstractC7496f abstractC7496f) {
        super((AbstractC7496f) C8953m.m36048m(abstractC7496f, "GoogleApiClient must not be null"));
        C8953m.m36048m(c7491a, "Api must not be null");
        this.f7430o = c7491a.m31126b();
        this.f7431p = c7491a;
    }

    @Override // p268l9.InterfaceC8027d
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ void mo9181a(@NonNull Object obj) {
        super.m9176h((InterfaceC7504n) obj);
    }

    @Override // p268l9.InterfaceC8027d
    /* JADX INFO: renamed from: b */
    public final void mo9182b(@NonNull Status status) {
        C8953m.m36037b(!status.m9163A3(), "Failed result must not be success");
        R rMo9173e = mo9173e(status);
        m9176h(rMo9173e);
        m9184o(rMo9173e);
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo9183n(@NonNull A a10);

    /* JADX INFO: renamed from: o */
    public void m9184o(@NonNull R r8) {
    }

    /* JADX INFO: renamed from: p */
    public final void m9185p(@NonNull A a10) throws DeadObjectException {
        try {
            mo9183n(a10);
        } catch (DeadObjectException e10) {
            m9186q(e10);
            throw e10;
        } catch (RemoteException e11) {
            m9186q(e11);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m9186q(@NonNull RemoteException remoteException) {
        mo9182b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }
}
