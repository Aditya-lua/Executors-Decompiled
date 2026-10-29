package p296n0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: n0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C8833v {

    /* JADX INFO: renamed from: n0.v$a */
    public static final class a extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public final List<AbstractC8828u> f32137a = new ArrayList();

        public a(List<AbstractC8828u> list) {
            for (AbstractC8828u abstractC8828u : list) {
                if (!(abstractC8828u instanceof b)) {
                    this.f32137a.add(abstractC8828u);
                }
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: a */
        public void mo35425a(int i10) {
            Iterator<AbstractC8828u> it = this.f32137a.iterator();
            while (it.hasNext()) {
                it.next().mo35425a(i10);
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            Iterator<AbstractC8828u> it = this.f32137a.iterator();
            while (it.hasNext()) {
                it.next().mo2221b(i10, interfaceC8743e0);
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: c */
        public void mo35426c(int i10, C8838w c8838w) {
            Iterator<AbstractC8828u> it = this.f32137a.iterator();
            while (it.hasNext()) {
                it.next().mo35426c(i10, c8838w);
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: d */
        public void mo33844d(int i10) {
            Iterator<AbstractC8828u> it = this.f32137a.iterator();
            while (it.hasNext()) {
                it.next().mo33844d(i10);
            }
        }

        /* JADX INFO: renamed from: e */
        public List<AbstractC8828u> m35462e() {
            return this.f32137a;
        }
    }

    /* JADX INFO: renamed from: n0.v$b */
    public static final class b extends AbstractC8828u {
        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: c */
        public void mo35426c(int i10, C8838w c8838w) {
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: d */
        public void mo33844d(int i10) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC8828u m35459a(List<AbstractC8828u> list) {
        if (list.isEmpty()) {
            return m35461c();
        }
        return list.size() == 1 ? list.get(0) : new a(list);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC8828u m35460b(AbstractC8828u... abstractC8828uArr) {
        return m35459a(Arrays.asList(abstractC8828uArr));
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC8828u m35461c() {
        return new b();
    }
}
