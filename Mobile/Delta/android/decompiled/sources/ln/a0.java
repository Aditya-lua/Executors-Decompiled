package ln;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f23653a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<sn.a> f23654c = new LinkedList<>();

    public a0(char c10) {
        this.f23653a = c10;
    }

    @Override // sn.a
    public char a() {
        return this.f23653a;
    }

    @Override // sn.a
    public int b() {
        return this.b;
    }

    @Override // sn.a
    public char c() {
        return this.f23653a;
    }

    @Override // sn.a
    public int d(sn.b bVar, sn.b bVar2) {
        return f(bVar.length()).d(bVar, bVar2);
    }

    public void e(sn.a aVar) {
        int iB = aVar.b();
        ListIterator<sn.a> listIterator = this.f23654c.listIterator();
        while (listIterator.hasNext()) {
            sn.a next = listIterator.next();
            int iB2 = next.b();
            if (iB > iB2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iB == iB2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f23653a + "' and minimum length " + iB + "; conflicting processors: " + next + ", " + aVar);
            }
        }
        this.f23654c.add(aVar);
        this.b = iB;
    }

    public final sn.a f(int i10) {
        for (sn.a aVar : this.f23654c) {
            if (aVar.b() <= i10) {
                return aVar;
            }
        }
        return this.f23654c.getFirst();
    }
}
