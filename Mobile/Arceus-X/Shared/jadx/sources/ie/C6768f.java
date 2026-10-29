package ie;

import java.io.Serializable;
import p169he.C6380j;
import p169he.C6384n;
import p169he.InterfaceC6376f;

/* JADX INFO: renamed from: ie.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6768f<F, T> extends AbstractC6783m0<F> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6376f<F, ? extends T> f26633a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6783m0<T> f26634b;

    public C6768f(InterfaceC6376f<F, ? extends T> interfaceC6376f, AbstractC6783m0<T> abstractC6783m0) {
        this.f26633a = (InterfaceC6376f) C6384n.m27928l(interfaceC6376f);
        this.f26634b = (AbstractC6783m0) C6384n.m27928l(abstractC6783m0);
    }

    @Override // ie.AbstractC6783m0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f26634b.compare(this.f26633a.apply(f10), this.f26633a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6768f) {
            C6768f c6768f = (C6768f) obj;
            if (this.f26633a.equals(c6768f.f26633a) && this.f26634b.equals(c6768f.f26634b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C6380j.m27911b(this.f26633a, this.f26634b);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f26634b);
        String strValueOf2 = String.valueOf(this.f26633a);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(".onResultOf(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
