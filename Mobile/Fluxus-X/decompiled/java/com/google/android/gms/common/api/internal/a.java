package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import l9.a.b;
import l9.h;
import l9.p;
import m9.d;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<R extends p, A extends l9.a.b> extends BasePendingResult<R> implements d<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l9.a.c<A> f6132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l9.a<?> f6133p;

    public a(@NonNull l9.a<?> aVar, @NonNull h hVar) {
        super((h) s.m(hVar, "GoogleApiClient must not be null"));
        s.m(aVar, "Api must not be null");
        this.f6132o = aVar.b();
        this.f6133p = aVar;
    }

    @Override // m9.d
    public /* bridge */ /* synthetic */ void a(@NonNull Object obj) {
        super.h((p) obj);
    }

    @Override // m9.d
    public final void b(@NonNull Status status) {
        s.b(!status.F3(), "Failed result must not be success");
        R rE = e(status);
        h(rE);
        o(rE);
    }

    public abstract void n(@NonNull A a10);

    public void o(@NonNull R r10) {
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
