package l7;

/* JADX INFO: loaded from: classes3.dex */
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f23376a;
    public T b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t8, T t10) {
        this.f23376a = t8;
        this.b = t10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x2.c)) {
            return false;
        }
        x2.c cVar = (x2.c) obj;
        return a(cVar.f35179a, this.f23376a) && a(cVar.b, this.b);
    }

    public int hashCode() {
        T t8 = this.f23376a;
        int iHashCode = t8 == null ? 0 : t8.hashCode();
        T t10 = this.b;
        return iHashCode ^ (t10 != null ? t10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f23376a + " " + this.b + "}";
    }
}
