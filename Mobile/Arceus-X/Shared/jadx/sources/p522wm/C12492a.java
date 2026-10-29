package p522wm;

import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11875j;

/* JADX INFO: renamed from: wm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12492a<T> extends AbstractC11873h<T> {

    /* JADX INFO: renamed from: a */
    public final AbstractC11873h<T> f44654a;

    public C12492a(AbstractC11873h<T> abstractC11873h) {
        this.f44654a = abstractC11873h;
    }

    @Override // p471um.AbstractC11873h
    public T fromJson(AbstractC11878m abstractC11878m) {
        if (abstractC11878m.mo44339u() != AbstractC11878m.c.NULL) {
            return this.f44654a.fromJson(abstractC11878m);
        }
        throw new C11875j("Unexpected null at " + abstractC11878m.getPath());
    }

    @Override // p471um.AbstractC11873h
    public void toJson(AbstractC11885t abstractC11885t, T t8) {
        if (t8 != null) {
            this.f44654a.toJson(abstractC11885t, t8);
            return;
        }
        throw new C11875j("Unexpected null at " + abstractC11885t.getPath());
    }

    public String toString() {
        return this.f44654a + ".nonNull()";
    }
}
