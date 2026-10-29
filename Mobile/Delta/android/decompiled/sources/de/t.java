package de;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends p implements Set {
    public transient s b;

    public static t g() {
        return v.f14604f;
    }

    public final s e() {
        s sVar = this.b;
        if (sVar != null) {
            return sVar;
        }
        s sVarF = f();
        this.b = sVarF;
        return sVarF;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            ((t) obj).h();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract s f();

    public abstract boolean h();
}
