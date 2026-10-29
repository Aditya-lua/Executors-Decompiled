package p306nb;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzoh;
import java.util.Objects;
import ne.InterfaceC9433q;

/* JADX INFO: renamed from: nb.b9 */
/* JADX INFO: loaded from: classes.dex */
public final class C9012b9 implements InterfaceC9433q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzoh f32722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f32723b;

    public C9012b9(C9257qa c9257qa, zzoh zzohVar) {
        this.f32722a = zzohVar;
        Objects.requireNonNull(c9257qa);
        this.f32723b = c9257qa;
    }

    /* JADX INFO: renamed from: a */
    public final void m36133a() {
        C9094g7 c9094g7 = this.f32723b.f33067a;
        SparseArray sparseArrayM36445r = c9094g7.m36339x().m36445r();
        zzoh zzohVar = this.f32722a;
        sparseArrayM36445r.put(zzohVar.f9508h, Long.valueOf(zzohVar.f9507g));
        C9157k6 c9157k6M36339x = c9094g7.m36339x();
        int[] iArr = new int[sparseArrayM36445r.size()];
        long[] jArr = new long[sparseArrayM36445r.size()];
        for (int i10 = 0; i10 < sparseArrayM36445r.size(); i10++) {
            iArr[i10] = sparseArrayM36445r.keyAt(i10);
            jArr[i10] = ((Long) sparseArrayM36445r.valueAt(i10)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c9157k6M36339x.f33127o.m36299b(bundle);
    }

    @Override // ne.InterfaceC9433q
    public final void onFailure(Throwable th2) {
        C9257qa c9257qa = this.f32723b;
        c9257qa.mo36088h();
        c9257qa.m36687Z(false);
        C9094g7 c9094g7 = c9257qa.f33067a;
        int iM36691d0 = (c9094g7.m36338w().m36406H(null, C9395z4.f33746U0) ? c9257qa.m36691d0(th2) : 2) - 1;
        if (iM36691d0 == 0) {
            c9094g7.mo36321a().m37006r().m36913c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C9348w5.m36998x(c9257qa.f33067a.m36317L().m36432q()), C9348w5.m36998x(th2.toString()));
            c9257qa.m36689b0(1);
            c9257qa.m36719w0().add(this.f32722a);
            return;
        }
        if (iM36691d0 != 1) {
            c9094g7.mo36321a().m37003o().m36913c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C9348w5.m36998x(c9257qa.f33067a.m36317L().m36432q()), th2);
            m36133a();
            c9257qa.m36689b0(1);
            c9257qa.m36721x0();
            return;
        }
        c9257qa.m36719w0().add(this.f32722a);
        if (c9257qa.m36688a0() > ((Integer) C9395z4.f33816x0.m37079b(null)).intValue()) {
            c9257qa.m36689b0(1);
            c9094g7.mo36321a().m37006r().m36913c("registerTriggerAsync failed. May try later. App ID, throwable", C9348w5.m36998x(c9257qa.f33067a.m36317L().m36432q()), C9348w5.m36998x(th2.toString()));
        } else {
            c9094g7.mo36321a().m37006r().m36914d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C9348w5.m36998x(c9257qa.f33067a.m36317L().m36432q()), C9348w5.m36998x(String.valueOf(c9257qa.m36688a0())), C9348w5.m36998x(th2.toString()));
            c9257qa.m36683V(c9257qa.m36688a0());
            int iM36688a0 = c9257qa.m36688a0();
            c9257qa.m36689b0(iM36688a0 + iM36688a0);
        }
    }

    @Override // ne.InterfaceC9433q
    public final void onSuccess(Object obj) {
        C9257qa c9257qa = this.f32723b;
        c9257qa.mo36088h();
        m36133a();
        c9257qa.m36687Z(false);
        c9257qa.m36689b0(1);
        c9257qa.f33067a.mo36321a().m37010v().m36912b("Successfully registered trigger URI", this.f32722a.f9506f);
        c9257qa.m36721x0();
    }
}
