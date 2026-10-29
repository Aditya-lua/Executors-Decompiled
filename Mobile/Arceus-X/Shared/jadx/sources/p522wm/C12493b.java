package p522wm;

import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;

/* JADX INFO: renamed from: wm.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C12493b<T> extends AbstractC11873h<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f44655a;

    public C12493b(AbstractC11873h<T> abstractC11873h) {
        this.f44655a = abstractC11873h;
    }

    @Override // p471um.AbstractC11873h
    public T fromJson(AbstractC11878m abstractC11878m) {
        return abstractC11878m.mo44339u() == AbstractC11878m.c.NULL ? (T) abstractC11878m.mo44336o() : this.f44655a.fromJson(abstractC11878m);
    }

    @Override // p471um.AbstractC11873h
    public void toJson(AbstractC11885t abstractC11885t, T t8) {
        if (t8 == null) {
            abstractC11885t.mo44381o();
        } else {
            this.f44655a.toJson(abstractC11885t, t8);
        }
    }

    public String toString() {
        return this.f44655a + ".nullSafe()";
    }
}
