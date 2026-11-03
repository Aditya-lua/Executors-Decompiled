package nb;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26519a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f26520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc f26523f;

    public kb(tc tcVar, String str, String str2, zzr zzrVar, boolean z10, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26519a = str;
        this.b = str2;
        this.f26520c = zzrVar;
        this.f26521d = z10;
        this.f26522e = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26523f = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            tc tcVar = this.f26523f;
            d5 d5VarN = tcVar.N();
            if (d5VarN == null) {
                g7 g7Var = tcVar.f26446a;
                g7Var.a().o().c("Failed to get user properties; not connected to service", this.f26519a, this.b);
                g7Var.C().f0(this.f26522e, bundle2);
                return;
            }
            zzr zzrVar = this.f26520c;
            n9.m.l(zzrVar);
            List<zzpl> listY1 = d5VarN.Y1(this.f26519a, this.b, this.f26521d, zzrVar);
            String[] strArr = ve.f26861i;
            bundle = new Bundle();
            if (listY1 != null) {
                for (zzpl zzplVar : listY1) {
                    String str = zzplVar.f7516j;
                    if (str != null) {
                        bundle.putString(zzplVar.f7513g, str);
                    } else {
                        Long l10 = zzplVar.f7515i;
                        if (l10 != null) {
                            bundle.putLong(zzplVar.f7513g, l10.longValue());
                        } else {
                            Double d10 = zzplVar.f7518l;
                            if (d10 != null) {
                                bundle.putDouble(zzplVar.f7513g, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    tcVar.J();
                    g7 g7Var2 = tcVar.f26446a;
                    g7Var2.C().f0(this.f26522e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f26523f.f26446a.a().o().c("Failed to get user properties; remote exception", this.f26519a, e10);
                    tc tcVar2 = this.f26523f;
                    tcVar2.f26446a.C().f0(this.f26522e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                tc tcVar3 = this.f26523f;
                tcVar3.f26446a.C().f0(this.f26522e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            tc tcVar4 = this.f26523f;
            tcVar4.f26446a.C().f0(this.f26522e, bundle2);
            throw th;
        }
    }
}
