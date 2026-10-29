package p338on;

import p388qn.AbstractC10623s;
import p388qn.C10602a0;
import p388qn.C10604b0;
import p388qn.C10611g;
import p388qn.C10624t;
import p388qn.C10630z;
import p472un.InterfaceC11892a;
import p472un.InterfaceC11893b;

/* JADX INFO: renamed from: on.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9826h implements InterfaceC11892a {

    /* JADX INFO: renamed from: a */
    public final char f35625a;

    public AbstractC9826h(char c10) {
        this.f35625a = c10;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: a */
    public int mo37443a(InterfaceC11893b interfaceC11893b, InterfaceC11893b interfaceC11893b2) {
        AbstractC10623s c10611g;
        if ((interfaceC11893b.mo37477c() || interfaceC11893b2.mo37481g()) && interfaceC11893b2.mo37480f() % 3 != 0 && (interfaceC11893b.mo37480f() + interfaceC11893b2.mo37480f()) % 3 == 0) {
            return 0;
        }
        int i10 = 2;
        if (interfaceC11893b.length() < 2 || interfaceC11893b2.length() < 2) {
            c10611g = new C10611g(String.valueOf(this.f35625a));
            i10 = 1;
        } else {
            c10611g = new C10602a0(String.valueOf(this.f35625a) + this.f35625a);
        }
        C10630z c10630zM40722c = C10630z.m40722c();
        c10630zM40722c.m40724b(interfaceC11893b.mo37475a(i10));
        C10604b0 c10604b0Mo37478d = interfaceC11893b.mo37478d();
        for (AbstractC10623s abstractC10623s : C10624t.m40707a(c10604b0Mo37478d, interfaceC11893b2.mo37476b())) {
            c10611g.mo40695c(abstractC10623s);
            c10630zM40722c.m40723a(abstractC10623s.m40702h());
        }
        c10630zM40722c.m40724b(interfaceC11893b2.mo37479e(i10));
        c10611g.m40705l(c10630zM40722c.m40725d());
        c10604b0Mo37478d.m40703i(c10611g);
        return i10;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: b */
    public char mo37444b() {
        return this.f35625a;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: c */
    public int mo37445c() {
        return 1;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: d */
    public char mo37446d() {
        return this.f35625a;
    }
}
