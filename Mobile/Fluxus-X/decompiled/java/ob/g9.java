package ob;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g9 implements pe.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd f27353a;
    public final /* synthetic */ va b;

    public g9(va vaVar, vd vdVar) {
        this.f27353a = vdVar;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    public final void a() {
        l7 l7Var = this.b.f27641a;
        SparseArray sparseArrayR = l7Var.x().r();
        vd vdVar = this.f27353a;
        sparseArrayR.put(vdVar.f27902h, Long.valueOf(vdVar.f27901g));
        p6 p6VarX = l7Var.x();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i10 = 0; i10 < sparseArrayR.size(); i10++) {
            iArr[i10] = sparseArrayR.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayR.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        p6VarX.f27695o.b(bundle);
    }

    @Override // pe.q
    public final void onFailure(Throwable th2) {
        va vaVar = this.b;
        vaVar.h();
        vaVar.Z(false);
        l7 l7Var = vaVar.f27641a;
        int iD0 = (l7Var.w().H(null, e5.U0) ? vaVar.d0(th2) : 2) - 1;
        if (iD0 == 0) {
            l7Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", b6.x(vaVar.f27641a.L().q()), b6.x(th2.toString()));
            vaVar.b0(1);
            vaVar.w0().add(this.f27353a);
            return;
        }
        if (iD0 != 1) {
            l7Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", b6.x(vaVar.f27641a.L().q()), th2);
            a();
            vaVar.b0(1);
            vaVar.x0();
            return;
        }
        vaVar.w0().add(this.f27353a);
        if (vaVar.a0() > ((Integer) e5.f27282x0.b(null)).intValue()) {
            vaVar.b0(1);
            l7Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", b6.x(vaVar.f27641a.L().q()), b6.x(th2.toString()));
        } else {
            l7Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", b6.x(vaVar.f27641a.L().q()), b6.x(String.valueOf(vaVar.a0())), b6.x(th2.toString()));
            vaVar.V(vaVar.a0());
            int iA0 = vaVar.a0();
            vaVar.b0(iA0 + iA0);
        }
    }

    @Override // pe.q
    public final void onSuccess(Object obj) {
        va vaVar = this.b;
        vaVar.h();
        a();
        vaVar.Z(false);
        vaVar.b0(1);
        vaVar.f27641a.a().v().b("Successfully registered trigger URI", this.f27353a.f27900f);
        vaVar.x0();
    }
}
