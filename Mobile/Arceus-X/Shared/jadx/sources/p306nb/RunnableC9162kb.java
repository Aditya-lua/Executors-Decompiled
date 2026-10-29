package p306nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC2383x1;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.kb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9162kb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f33150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f33151d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC2383x1 f33152e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9307tc f33153f;

    public RunnableC9162kb(C9307tc c9307tc, String str, String str2, zzr zzrVar, boolean z10, InterfaceC2383x1 interfaceC2383x1) {
        this.f33148a = str;
        this.f33149b = str2;
        this.f33150c = zzrVar;
        this.f33151d = z10;
        this.f33152e = interfaceC2383x1;
        Objects.requireNonNull(c9307tc);
        this.f33153f = c9307tc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            C9307tc c9307tc = this.f33153f;
            InterfaceC9042d5 interfaceC9042d5M36873N = c9307tc.m36873N();
            if (interfaceC9042d5M36873N == null) {
                C9094g7 c9094g7 = c9307tc.f33067a;
                c9094g7.mo36321a().m37003o().m36913c("Failed to get user properties; not connected to service", this.f33148a, this.f33149b);
                c9094g7.m36308C().m36962f0(this.f33152e, bundle2);
                return;
            }
            zzr zzrVar = this.f33150c;
            C8953m.m36047l(zzrVar);
            List<zzpl> listMo36101Y1 = interfaceC9042d5M36873N.mo36101Y1(this.f33148a, this.f33149b, this.f33151d, zzrVar);
            String[] strArr = C9341ve.f33574i;
            bundle = new Bundle();
            if (listMo36101Y1 != null) {
                for (zzpl zzplVar : listMo36101Y1) {
                    String str = zzplVar.f9522j;
                    if (str != null) {
                        bundle.putString(zzplVar.f9519g, str);
                    } else {
                        Long l10 = zzplVar.f9521i;
                        if (l10 != null) {
                            bundle.putLong(zzplVar.f9519g, l10.longValue());
                        } else {
                            Double d10 = zzplVar.f9524l;
                            if (d10 != null) {
                                bundle.putDouble(zzplVar.f9519g, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c9307tc.m36869J();
                    C9094g7 c9094g8 = c9307tc.f33067a;
                    c9094g8.m36308C().m36962f0(this.f33152e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f33153f.f33067a.mo36321a().m37003o().m36913c("Failed to get user properties; remote exception", this.f33148a, e10);
                    C9307tc c9307tc2 = this.f33153f;
                    c9307tc2.f33067a.m36308C().m36962f0(this.f33152e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                C9307tc c9307tc3 = this.f33153f;
                c9307tc3.f33067a.m36308C().m36962f0(this.f33152e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            C9307tc c9307tc4 = this.f33153f;
            c9307tc4.f33067a.m36308C().m36962f0(this.f33152e, bundle2);
            throw th;
        }
    }
}
