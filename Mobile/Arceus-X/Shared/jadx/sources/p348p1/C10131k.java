package p348p1;

import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0943b0;
import androidx.p616lifecycle.InterfaceC0952e0;

/* JADX INFO: renamed from: p1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10131k<T> extends C0943b0<T> {

    /* JADX INFO: renamed from: m */
    public AbstractC0940a0<T> f36480m;

    @Override // androidx.p616lifecycle.AbstractC0940a0
    /* JADX INFO: renamed from: f */
    public T mo4854f() {
        AbstractC0940a0<T> abstractC0940a0 = this.f36480m;
        if (abstractC0940a0 == null) {
            return null;
        }
        return abstractC0940a0.mo4854f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.a0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public void m39078r(AbstractC0940a0<T> abstractC0940a0) {
        AbstractC0940a0<T> abstractC0940a1 = this.f36480m;
        if (abstractC0940a1 != null) {
            super.m4883q(abstractC0940a1);
        }
        this.f36480m = abstractC0940a0;
        super.m4882p(abstractC0940a0, new InterfaceC0952e0() { // from class: p1.j
            @Override // androidx.p616lifecycle.InterfaceC0952e0
            /* JADX INFO: renamed from: a */
            public final void mo4884a(Object obj) {
                this.f36478a.mo4863o(obj);
            }
        });
    }
}
