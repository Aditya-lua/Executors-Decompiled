package p296n0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: n0.v2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8836v2<C> {

    /* JADX INFO: renamed from: a */
    public Set<C> f32144a = new HashSet();

    /* JADX INFO: renamed from: a */
    public void m35463a(List<C> list) {
        this.f32144a.addAll(list);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC8836v2<C> clone();

    /* JADX INFO: renamed from: c */
    public List<C> m35465c() {
        return Collections.unmodifiableList(new ArrayList(this.f32144a));
    }
}
