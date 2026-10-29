package de;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", i0Var.a());
            bundle.putLong("event_timestamp", i0Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i10, List list) {
        list.add(i0.c(i10, System.currentTimeMillis()));
    }
}
