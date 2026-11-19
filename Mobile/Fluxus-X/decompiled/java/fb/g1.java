package fb;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends h1 {
    @Override // fb.z0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = q().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // fb.h1
    public final boolean g() {
        return false;
    }

    @Override // fb.h1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return y1.a(q().c());
    }

    public abstract f1 q();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return q().size();
    }
}
