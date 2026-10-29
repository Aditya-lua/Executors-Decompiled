package qn;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    public static class a implements Iterable<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f29498a;
        public final s b;

        @Override // java.lang.Iterable
        public Iterator<s> iterator() {
            return new b(this.f29498a, this.b);
        }

        public a(s sVar, s sVar2) {
            this.f29498a = sVar;
            this.b = sVar2;
        }
    }

    public static class b implements Iterator<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f29499a;
        public final s b;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s next() {
            s sVar = this.f29499a;
            this.f29499a = sVar.f();
            return sVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            s sVar = this.f29499a;
            return (sVar == null || sVar == this.b) ? false : true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public b(s sVar, s sVar2) {
            this.f29499a = sVar;
            this.b = sVar2;
        }
    }

    public static Iterable<s> a(s sVar, s sVar2) {
        return new a(sVar.f(), sVar2);
    }
}
