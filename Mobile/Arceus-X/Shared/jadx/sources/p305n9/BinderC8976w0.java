package p305n9;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: renamed from: n9.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8976w0 extends AbstractBinderC8958n1 {

    /* JADX INFO: renamed from: a */
    public AbstractC8923c f32643a;

    /* JADX INFO: renamed from: b */
    public final int f32644b;

    public BinderC8976w0(@NonNull AbstractC8923c abstractC8923c, int i10) {
        this.f32643a = abstractC8923c;
        this.f32644b = i10;
    }

    @Override // p305n9.InterfaceC8938h
    /* JADX INFO: renamed from: d0 */
    public final void mo36011d0(int i10, @NonNull IBinder iBinder, Bundle bundle) {
        C8953m.m36048m(this.f32643a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f32643a.onPostInitHandler(i10, iBinder, bundle, this.f32644b);
        this.f32643a = null;
    }

    @Override // p305n9.InterfaceC8938h
    /* JADX INFO: renamed from: i */
    public final void mo36012i(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p305n9.InterfaceC8938h
    /* JADX INFO: renamed from: x1 */
    public final void mo36013x1(int i10, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        AbstractC8923c abstractC8923c = this.f32643a;
        C8953m.m36048m(abstractC8923c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C8953m.m36047l(zzjVar);
        abstractC8923c.zzc(zzjVar);
        mo36011d0(i10, iBinder, zzjVar.f7504f);
    }
}
