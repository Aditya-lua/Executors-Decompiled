package ao;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements io.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f3056a;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<io.a> f3057c = new LinkedList<>();

    public a0(char c10) {
        this.f3056a = c10;
    }

    @Override // io.a
    public int a(io.b bVar, io.b bVar2) {
        return f(bVar.length()).a(bVar, bVar2);
    }

    @Override // io.a
    public char b() {
        return this.f3056a;
    }

    @Override // io.a
    public int c() {
        return this.b;
    }

    @Override // io.a
    public char d() {
        return this.f3056a;
    }

    public void e(io.a aVar) {
        int iC = aVar.c();
        ListIterator<io.a> listIterator = this.f3057c.listIterator();
        while (listIterator.hasNext()) {
            io.a next = listIterator.next();
            int iC2 = next.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f3056a + "' and minimum length " + iC + "; conflicting processors: " + next + ", " + aVar);
            }
        }
        this.f3057c.add(aVar);
        this.b = iC;
    }

    public final io.a f(int i10) {
        for (io.a aVar : this.f3057c) {
            if (aVar.c() <= i10) {
                return aVar;
            }
        }
        return this.f3057c.getFirst();
    }
}
