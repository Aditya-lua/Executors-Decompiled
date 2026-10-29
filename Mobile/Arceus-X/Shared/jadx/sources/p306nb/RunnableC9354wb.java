package p306nb;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* JADX INFO: renamed from: nb.wb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9354wb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbg f33611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2383x1 f33613c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9307tc f33614d;

    public RunnableC9354wb(C9307tc c9307tc, zzbg zzbgVar, String str, InterfaceC2383x1 interfaceC2383x1) {
        this.f33611a = zzbgVar;
        this.f33612b = str;
        this.f33613c = interfaceC2383x1;
        Objects.requireNonNull(c9307tc);
        this.f33614d = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2383x1 interfaceC2383x1;
        C9341ve c9341veM36308C;
        byte[] bArrMo36103e0 = null;
        try {
            try {
                C9307tc c9307tc = this.f33614d;
                InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
                if (interfaceC9042d5M36873N == null) {
                    C9094g7 c9094g7 = c9307tc.f33067a;
                    c9094g7.mo36321a().m37003o().m36911a("Discarding data. Failed to send event to service to bundle");
                    c9341veM36308C = c9094g7.m36308C();
                    interfaceC2383x1 = this.f33613c;
                } else {
                    bArrMo36103e0 = interfaceC9042d5M36873N.mo36103e0(this.f33611a, this.f33612b);
                    c9307tc.m36869J();
                    C9307tc c9307tc2 = this.f33614d;
                    interfaceC2383x1 = this.f33613c;
                    c9341veM36308C = c9307tc2.f33067a.m36308C();
                }
            } catch (RemoteException e10) {
                this.f33614d.f33067a.mo36321a().m37003o().m36912b("Failed to send event to the service to bundle", e10);
            }
            c9341veM36308C.m36960d0(interfaceC2383x1, bArrMo36103e0);
        } catch (Throwable th2) {
            C9307tc c9307tc3 = this.f33614d;
            c9307tc3.f33067a.m36308C().m36960d0(this.f33613c, null);
            throw th2;
        }
    }
}
