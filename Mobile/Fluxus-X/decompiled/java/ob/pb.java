package ob;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27713a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hf f27714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f27716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc f27717f;

    public pb(yc ycVar, String str, String str2, hf hfVar, boolean z10, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f27713a = str;
        this.b = str2;
        this.f27714c = hfVar;
        this.f27715d = z10;
        this.f27716e = x1Var;
        Objects.requireNonNull(ycVar);
        this.f27717f = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e10;
        Bundle bundle2 = new Bundle();
        try {
            yc ycVar = this.f27717f;
            i5 i5VarN = ycVar.N();
            if (i5VarN == null) {
                l7 l7Var = ycVar.f27641a;
                l7Var.a().o().c("Failed to get user properties; not connected to service", this.f27713a, this.b);
                l7Var.C().f0(this.f27716e, bundle2);
                return;
            }
            hf hfVar = this.f27714c;
            o9.s.l(hfVar);
            List<bf> listX1 = i5VarN.x1(this.f27713a, this.b, this.f27715d, hfVar);
            String[] strArr = ff.f27333i;
            bundle = new Bundle();
            if (listX1 != null) {
                for (bf bfVar : listX1) {
                    String str = bfVar.f27130j;
                    if (str != null) {
                        bundle.putString(bfVar.f27127g, str);
                    } else {
                        Long l10 = bfVar.f27129i;
                        if (l10 != null) {
                            bundle.putLong(bfVar.f27127g, l10.longValue());
                        } else {
                            Double d10 = bfVar.f27132l;
                            if (d10 != null) {
                                bundle.putDouble(bfVar.f27127g, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    ycVar.J();
                    l7 l7Var2 = ycVar.f27641a;
                    l7Var2.C().f0(this.f27716e, bundle);
                } catch (RemoteException e11) {
                    e10 = e11;
                    this.f27717f.f27641a.a().o().c("Failed to get user properties; remote exception", this.f27713a, e10);
                    yc ycVar2 = this.f27717f;
                    ycVar2.f27641a.C().f0(this.f27716e, bundle);
                }
            } catch (Throwable th2) {
                th = th2;
                bundle2 = bundle;
                yc ycVar3 = this.f27717f;
                ycVar3.f27641a.C().f0(this.f27716e, bundle2);
                throw th;
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            yc ycVar4 = this.f27717f;
            ycVar4.f27641a.C().f0(this.f27716e, bundle2);
            throw th;
        }
    }
}
