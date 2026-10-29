package ee;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ee.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5070g0 {
    /* JADX INFO: renamed from: a */
    public static final List m23801a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC5074i0 abstractC5074i0 = (AbstractC5074i0) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", abstractC5074i0.mo23804a());
            bundle.putLong("event_timestamp", abstractC5074i0.mo23805b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final void m23802b(int i10, List list) {
        list.add(AbstractC5074i0.m23807c(i10, System.currentTimeMillis()));
    }
}
