package p418rn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p312nn.C9504f;
import p312nn.C9509k;
import p312nn.C9515q;
import p312nn.C9519u;
import p388qn.AbstractC10601a;
import p388qn.AbstractC10623s;
import p472un.InterfaceC11892a;
import sn.InterfaceC11418b;
import sn.InterfaceC11421e;
import tn.InterfaceC11711e;

/* JADX INFO: renamed from: rn.f */
/* JADX INFO: loaded from: classes3.dex */
public class C10931f {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC11711e> f38710a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11418b> f38711b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC11892a> f38712c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC11421e> f38713d;

    /* JADX INFO: renamed from: e */
    public final Set<Character> f38714e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10929d f38715f;

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC10933h> f38716g;

    /* JADX INFO: renamed from: h */
    public final EnumC10926a f38717h;

    /* JADX INFO: renamed from: i */
    public final int f38718i;

    /* JADX INFO: renamed from: rn.f$a */
    public static class a {

        /* JADX INFO: renamed from: h */
        public InterfaceC10929d f38726h;

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC11711e> f38719a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC11418b> f38720b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC11892a> f38721c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public final List<InterfaceC11421e> f38722d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final List<InterfaceC10933h> f38723e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public final Set<Character> f38724f = new HashSet();

        /* JADX INFO: renamed from: g */
        public Set<Class<? extends AbstractC10601a>> f38725g = C9509k.m37486t();

        /* JADX INFO: renamed from: i */
        public EnumC10926a f38727i = EnumC10926a.NONE;

        /* JADX INFO: renamed from: j */
        public int f38728j = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: k */
        public C10931f m41524k() {
            return new C10931f(this);
        }

        /* JADX INFO: renamed from: l */
        public final InterfaceC10929d m41525l() {
            InterfaceC10929d interfaceC10929d = this.f38726h;
            return interfaceC10929d != null ? interfaceC10929d : new InterfaceC10929d() { // from class: rn.e
                @Override // p418rn.InterfaceC10929d
                /* JADX INFO: renamed from: a */
                public final InterfaceC10927b mo41510a(InterfaceC10928c interfaceC10928c) {
                    return new C9519u(interfaceC10928c);
                }
            };
        }
    }

    /* JADX INFO: renamed from: a */
    public final C9509k m41511a() {
        return new C9509k(this.f38710a, this.f38715f, this.f38711b, this.f38712c, this.f38713d, this.f38714e, this.f38717h, this.f38718i);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC10623s m41512b(String str) {
        Objects.requireNonNull(str, "input must not be null");
        return m41513c(m41511a().m37509u(str));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC10623s m41513c(AbstractC10623s abstractC10623s) {
        Iterator<InterfaceC10933h> it = this.f38716g.iterator();
        while (it.hasNext()) {
            abstractC10623s = it.next().m41526a(abstractC10623s);
        }
        return abstractC10623s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10931f(a aVar) {
        this.f38710a = C9509k.m37485m(aVar.f38719a, aVar.f38725g);
        InterfaceC10929d interfaceC10929dM41525l = aVar.m41525l();
        this.f38715f = interfaceC10929dM41525l;
        this.f38716g = aVar.f38723e;
        List<InterfaceC11418b> list = aVar.f38720b;
        this.f38711b = list;
        List<InterfaceC11892a> list2 = aVar.f38721c;
        this.f38712c = list2;
        List<InterfaceC11421e> list3 = aVar.f38722d;
        this.f38713d = list3;
        Set<Character> set = aVar.f38724f;
        this.f38714e = set;
        this.f38717h = aVar.f38727i;
        this.f38718i = aVar.f38728j;
        interfaceC10929dM41525l.mo41510a(new C9515q(list, list2, list3, set, new C9504f()));
    }
}
