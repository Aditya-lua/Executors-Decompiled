package p100eb;

import java.util.Map;

/* JADX INFO: renamed from: eb.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4932g1 extends AbstractC4938h1 {
    @Override // p100eb.AbstractC5044z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = mo23597t().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p100eb.AbstractC4938h1
    /* JADX INFO: renamed from: g */
    public final boolean mo23596g() {
        return false;
    }

    @Override // p100eb.AbstractC4938h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return C5040y1.m23725a(mo23597t().m23592c());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return mo23597t().size();
    }

    /* JADX INFO: renamed from: t */
    public abstract AbstractC4926f1 mo23597t();
}
