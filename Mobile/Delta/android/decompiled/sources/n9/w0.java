package n9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f25303a;
    public final int b;

    public w0(@NonNull c cVar, int i10) {
        this.f25303a = cVar;
        this.b = i10;
    }

    @Override // n9.h
    public final void f0(int i10, @NonNull IBinder iBinder, Bundle bundle) {
        m.m(this.f25303a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f25303a.onPostInitHandler(i10, iBinder, bundle, this.b);
        this.f25303a = null;
    }

    @Override // n9.h
    public final void i(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // n9.h
    public final void z1(int i10, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        c cVar = this.f25303a;
        m.m(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        m.l(zzjVar);
        cVar.zzc(zzjVar);
        f0(i10, iBinder, zzjVar.f5815f);
    }
}
