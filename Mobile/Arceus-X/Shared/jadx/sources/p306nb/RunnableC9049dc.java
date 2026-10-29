package p306nb;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.dc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9049dc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f32854a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f32855b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f32856c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC2383x1 f32857d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9307tc f32858e;

    public RunnableC9049dc(C9307tc c9307tc, String str, String str2, zzr zzrVar, InterfaceC2383x1 interfaceC2383x1) {
        this.f32854a = str;
        this.f32855b = str2;
        this.f32856c = zzrVar;
        this.f32857d = interfaceC2383x1;
        Objects.requireNonNull(c9307tc);
        this.f32858e = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2383x1 interfaceC2383x1;
        C9341ve c9341veM36308C;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C9307tc c9307tc = this.f32858e;
                InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                if (interfaceC9042d5M36873N == null) {
                    C9094g7 c9094g7 = c9307tc.f33067a;
                    c9094g7.mo36321a().m37003o().m36913c("Failed to get conditional properties; not connected to service", this.f32854a, this.f32855b);
                    c9341veM36308C = c9094g7.m36308C();
                    interfaceC2383x1 = this.f32857d;
                } else {
                    zzr zzrVar = this.f32856c;
                    C8953m.m36047l(zzrVar);
                    arrayList = C9341ve.m36929h0(interfaceC9042d5M36873N.mo36104e2(this.f32854a, this.f32855b, zzrVar));
                    c9307tc.m36869J();
                    C9307tc c9307tc2 = this.f32858e;
                    interfaceC2383x1 = this.f32857d;
                    c9341veM36308C = c9307tc2.f33067a.m36308C();
                }
            } catch (RemoteException e10) {
                this.f32858e.f33067a.mo36321a().m37003o().m36914d("Failed to get conditional properties; remote exception", this.f32854a, this.f32855b, e10);
            }
            c9341veM36308C.m36963g0(interfaceC2383x1, arrayList);
        } catch (Throwable th2) {
            C9307tc c9307tc3 = this.f32858e;
            c9307tc3.f33067a.m36308C().m36963g0(this.f32857d, arrayList);
            throw th2;
        }
    }
}
