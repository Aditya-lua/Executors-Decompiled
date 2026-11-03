package nb;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b9 implements ne.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzoh f26185a;
    public final /* synthetic */ qa b;

    public b9(qa qaVar, zzoh zzohVar) {
        this.f26185a = zzohVar;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    public final void a() {
        g7 g7Var = this.b.f26446a;
        SparseArray sparseArrayR = g7Var.x().r();
        zzoh zzohVar = this.f26185a;
        sparseArrayR.put(zzohVar.f7502h, Long.valueOf(zzohVar.f7501g));
        k6 k6VarX = g7Var.x();
        int[] iArr = new int[sparseArrayR.size()];
        long[] jArr = new long[sparseArrayR.size()];
        for (int i10 = 0; i10 < sparseArrayR.size(); i10++) {
            iArr[i10] = sparseArrayR.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayR.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        k6VarX.f26501o.b(bundle);
    }

    @Override // ne.q
    public final void onFailure(Throwable th2) {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.Z(false);
        g7 g7Var = qaVar.f26446a;
        int iD0 = (g7Var.w().H(null, z4.U0) ? qaVar.d0(th2) : 2) - 1;
        if (iD0 == 0) {
            g7Var.a().r().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", w5.x(qaVar.f26446a.L().q()), w5.x(th2.toString()));
            qaVar.b0(1);
            qaVar.w0().add(this.f26185a);
            return;
        }
        if (iD0 != 1) {
            g7Var.a().o().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", w5.x(qaVar.f26446a.L().q()), th2);
            a();
            qaVar.b0(1);
            qaVar.x0();
            return;
        }
        qaVar.w0().add(this.f26185a);
        if (qaVar.a0() > ((Integer) z4.f27028x0.b(null)).intValue()) {
            qaVar.b0(1);
            g7Var.a().r().c("registerTriggerAsync failed. May try later. App ID, throwable", w5.x(qaVar.f26446a.L().q()), w5.x(th2.toString()));
        } else {
            g7Var.a().r().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", w5.x(qaVar.f26446a.L().q()), w5.x(String.valueOf(qaVar.a0())), w5.x(th2.toString()));
            qaVar.V(qaVar.a0());
            int iA0 = qaVar.a0();
            qaVar.b0(iA0 + iA0);
        }
    }

    @Override // ne.q
    public final void onSuccess(Object obj) {
        qa qaVar = this.b;
        qaVar.h();
        a();
        qaVar.Z(false);
        qaVar.b0(1);
        qaVar.f26446a.a().v().b("Successfully registered trigger URI", this.f26185a.f7500f);
        qaVar.x0();
    }
}
