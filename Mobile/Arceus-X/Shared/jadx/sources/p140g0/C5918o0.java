package p140g0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: g0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5918o0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m26551a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
