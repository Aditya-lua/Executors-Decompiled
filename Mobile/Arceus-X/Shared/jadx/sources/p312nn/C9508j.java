package p312nn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: nn.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9508j {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m37484a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
