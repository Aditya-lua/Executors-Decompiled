package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import k9.a.b;
import k9.f;
import k9.n;
import l9.d;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<R extends n, A extends k9.a.b> extends BasePendingResult<R> implements d<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k9.a.c<A> f5742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k9.a<?> f5743p;

    public a(@NonNull k9.a<?> aVar, @NonNull f fVar) {
        super((f) m.m(fVar, "GoogleApiClient must not be null"));
        m.m(aVar, "Api must not be null");
        this.f5742o = aVar.b();
        this.f5743p = aVar;
    }

    @Override // l9.d
    public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
        super.h((n) obj);
    }

    @Override // l9.d
    public final void b(@NonNull Status status) {
        m.b(!status.A3(), "Failed result must not be success");
        R rE = e(status);
        h(rE);
        o(rE);
    }

    public abstract void n(@NonNull A a10);

    public void o(@NonNull R r8) {
    }

    public final void p(@NonNull A a10) throws DeadObjectException {
        try {
            n(a10);
        } catch (DeadObjectException e10) {
            q(e10);
            throw e10;
        } catch (RemoteException e11) {
            q(e11);
        }
    }

    public final void q(@NonNull RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }
}
