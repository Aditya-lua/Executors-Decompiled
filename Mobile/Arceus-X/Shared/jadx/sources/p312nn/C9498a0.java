package p312nn;

import java.util.LinkedList;
import java.util.ListIterator;
import p472un.InterfaceC11892a;
import p472un.InterfaceC11893b;

/* JADX INFO: renamed from: nn.a0 */
/* JADX INFO: loaded from: classes3.dex */
public class C9498a0 implements InterfaceC11892a {

    /* JADX INFO: renamed from: a */
    public final char f34179a;

    /* JADX INFO: renamed from: b */
    public int f34180b = 0;

    /* JADX INFO: renamed from: c */
    public LinkedList<InterfaceC11892a> f34181c = new LinkedList<>();

    public C9498a0(char c10) {
        this.f34179a = c10;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: a */
    public int mo37443a(InterfaceC11893b interfaceC11893b, InterfaceC11893b interfaceC11893b2) {
        return m37448f(interfaceC11893b.length()).mo37443a(interfaceC11893b, interfaceC11893b2);
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: b */
    public char mo37444b() {
        return this.f34179a;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: c */
    public int mo37445c() {
        return this.f34180b;
    }

    @Override // p472un.InterfaceC11892a
    /* JADX INFO: renamed from: d */
    public char mo37446d() {
        return this.f34179a;
    }

    /* JADX INFO: renamed from: e */
    public void m37447e(InterfaceC11892a interfaceC11892a) {
        int iMo37445c = interfaceC11892a.mo37445c();
        ListIterator<InterfaceC11892a> listIterator = this.f34181c.listIterator();
        while (listIterator.hasNext()) {
            InterfaceC11892a next = listIterator.next();
            int iMo37445c2 = next.mo37445c();
            if (iMo37445c > iMo37445c2) {
                listIterator.previous();
                listIterator.add(interfaceC11892a);
                return;
            } else if (iMo37445c == iMo37445c2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f34179a + "' and minimum length " + iMo37445c + "; conflicting processors: " + next + ", " + interfaceC11892a);
            }
        }
        this.f34181c.add(interfaceC11892a);
        this.f34180b = iMo37445c;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC11892a m37448f(int i10) {
        for (InterfaceC11892a interfaceC11892a : this.f34181c) {
            if (interfaceC11892a.mo37445c() <= i10) {
                return interfaceC11892a;
            }
        }
        return this.f34181c.getFirst();
    }
}
