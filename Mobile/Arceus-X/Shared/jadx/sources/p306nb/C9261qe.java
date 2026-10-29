package p306nb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: nb.qe */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9261qe {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Set m36724a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
