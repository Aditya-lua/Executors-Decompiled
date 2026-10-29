package androidx.p616lifecycle;

import java.util.Iterator;
import java.util.Map;
import p423s.C11139b;

/* JADX INFO: renamed from: androidx.lifecycle.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C0943b0<T> extends C0949d0<T> {

    /* JADX INFO: renamed from: l */
    public C11139b<AbstractC0940a0<?>, a<?>> f3619l = new C11139b<>();

    /* JADX INFO: renamed from: androidx.lifecycle.b0$a */
    public static class a<V> implements InterfaceC0952e0<V> {

        /* JADX INFO: renamed from: a */
        public final AbstractC0940a0<V> f3620a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC0952e0<? super V> f3621b;

        /* JADX INFO: renamed from: c */
        public int f3622c = -1;

        public a(AbstractC0940a0<V> abstractC0940a0, InterfaceC0952e0<? super V> interfaceC0952e0) {
            this.f3620a = abstractC0940a0;
            this.f3621b = interfaceC0952e0;
        }

        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: a */
        public void mo4884a(V v5) {
            if (this.f3622c != this.f3620a.m4855g()) {
                this.f3622c = this.f3620a.m4855g();
                this.f3621b.mo4884a(v5);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m4885b() {
            this.f3620a.m4858j(this);
        }

        /* JADX INFO: renamed from: c */
        public void m4886c() {
            this.f3620a.mo4862n(this);
        }
    }

    @Override // androidx.p616lifecycle.AbstractC0940a0
    /* JADX INFO: renamed from: k */
    public void mo4859k() {
        Iterator<Map.Entry<AbstractC0940a0<?>, a<?>>> it = this.f3619l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m4885b();
        }
    }

    @Override // androidx.p616lifecycle.AbstractC0940a0
    /* JADX INFO: renamed from: l */
    public void mo4860l() {
        Iterator<Map.Entry<AbstractC0940a0<?>, a<?>>> it = this.f3619l.iterator();
        while (it.hasNext()) {
            it.next().getValue().m4886c();
        }
    }

    /* JADX INFO: renamed from: p */
    public <S> void m4882p(AbstractC0940a0<S> abstractC0940a0, InterfaceC0952e0<? super S> interfaceC0952e0) {
        if (abstractC0940a0 == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(abstractC0940a0, interfaceC0952e0);
        a<?> aVarMo41918f = this.f3619l.mo41918f(abstractC0940a0, aVar);
        if (aVarMo41918f != null && aVarMo41918f.f3621b != interfaceC0952e0) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarMo41918f == null && m4856h()) {
            aVar.m4885b();
        }
    }

    /* JADX INFO: renamed from: q */
    public <S> void m4883q(AbstractC0940a0<S> abstractC0940a0) {
        a<?> aVarMo41919g = this.f3619l.mo41919g(abstractC0940a0);
        if (aVarMo41919g != null) {
            aVarMo41919g.m4886c();
        }
    }
}
