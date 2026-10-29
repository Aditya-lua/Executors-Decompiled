package nn;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements un.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f26364a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<un.a> f26365c = new LinkedList<>();

    public a0(char c10) {
        this.f26364a = c10;
    }

    @Override // un.a
    public int a(un.b bVar, un.b bVar2) {
        return f(bVar.length()).a(bVar, bVar2);
    }

    @Override // un.a
    public char b() {
        return this.f26364a;
    }

    @Override // un.a
    public int c() {
        return this.b;
    }

    @Override // un.a
    public char d() {
        return this.f26364a;
    }

    public void e(un.a aVar) {
        int iC = aVar.c();
        ListIterator<un.a> listIterator = this.f26365c.listIterator();
        while (listIterator.hasNext()) {
            un.a next = listIterator.next();
            int iC2 = next.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f26364a + "' and minimum length " + iC + "; conflicting processors: " + next + ", " + aVar);
            }
        }
        this.f26365c.add(aVar);
        this.b = iC;
    }

    public final un.a f(int i10) {
        for (un.a aVar : this.f26365c) {
            if (aVar.c() <= i10) {
                return aVar;
            }
        }
        return this.f26365c.getFirst();
    }
}
