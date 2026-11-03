package ie;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class f<F, T> extends m0<F> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he.f<F, ? extends T> f21032a;
    public final m0<T> b;

    public f(he.f<F, ? extends T> fVar, m0<T> m0Var) {
        this.f21032a = (he.f) he.n.l(fVar);
        this.b = (m0) he.n.l(m0Var);
    }

    @Override // ie.m0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.b.compare(this.f21032a.apply(f10), this.f21032a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f21032a.equals(fVar.f21032a) && this.b.equals(fVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return he.j.b(this.f21032a, this.b);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(this.f21032a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(".onResultOf(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
