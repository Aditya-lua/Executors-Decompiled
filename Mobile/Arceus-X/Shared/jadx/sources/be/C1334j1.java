package be;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: be.j1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1334j1 {

    /* JADX INFO: renamed from: a */
    public final List f5373a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final List m7176a() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC1340l1 abstractC1340l1 : this.f5373a) {
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC1340l1.mo7178a());
            bundle.putLong("event_timestamp", abstractC1340l1.mo7179b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m7177b(int i10) {
        this.f5373a.add(AbstractC1340l1.m7184c(i10, System.currentTimeMillis()));
    }
}
