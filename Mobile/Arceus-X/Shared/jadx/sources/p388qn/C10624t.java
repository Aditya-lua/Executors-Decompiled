package p388qn;

import java.util.Iterator;

/* JADX INFO: renamed from: qn.t */
/* JADX INFO: loaded from: classes3.dex */
public class C10624t {

    /* JADX INFO: renamed from: qn.t$a */
    public static class a implements Iterable<AbstractC10623s> {

        /* JADX INFO: renamed from: a */
        public final AbstractC10623s f38097a;

        /* JADX INFO: renamed from: b */
        public final AbstractC10623s f38098b;

        @Override // java.lang.Iterable
        public Iterator<AbstractC10623s> iterator() {
            return new b(this.f38097a, this.f38098b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(AbstractC10623s abstractC10623s, AbstractC10623s abstractC10623s2) {
            this.f38097a = abstractC10623s;
            this.f38098b = abstractC10623s2;
        }
    }

    /* JADX INFO: renamed from: qn.t$b */
    public static class b implements Iterator<AbstractC10623s> {

        /* JADX INFO: renamed from: a */
        public AbstractC10623s f38099a;

        /* JADX INFO: renamed from: b */
        public final AbstractC10623s f38100b;

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC10623s next() {
            AbstractC10623s abstractC10623s = this.f38099a;
            this.f38099a = abstractC10623s.m40701f();
            return abstractC10623s;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            AbstractC10623s abstractC10623s = this.f38099a;
            return (abstractC10623s == null || abstractC10623s == this.f38100b) ? false : true;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(AbstractC10623s abstractC10623s, AbstractC10623s abstractC10623s2) {
            this.f38099a = abstractC10623s;
            this.f38100b = abstractC10623s2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Iterable<AbstractC10623s> m40707a(AbstractC10623s abstractC10623s, AbstractC10623s abstractC10623s2) {
        return new a(abstractC10623s.m40701f(), abstractC10623s2);
    }
}
