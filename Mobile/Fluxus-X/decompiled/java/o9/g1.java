package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f26962a;
    public final int b;

    public g1(@NonNull d dVar, int i10) {
        this.f26962a = dVar;
        this.b = i10;
    }

    @Override // o9.m
    public final void T1(int i10, @NonNull IBinder iBinder, @NonNull l1 l1Var) {
        d dVar = this.f26962a;
        s.m(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        s.l(l1Var);
        dVar.zzc(l1Var);
        Z(i10, iBinder, l1Var.f26995f);
    }

    @Override // o9.m
    public final void Z(int i10, @NonNull IBinder iBinder, Bundle bundle) {
        s.m(this.f26962a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f26962a.onPostInitHandler(i10, iBinder, bundle, this.b);
        this.f26962a = null;
    }

    @Override // o9.m
    public final void i(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
