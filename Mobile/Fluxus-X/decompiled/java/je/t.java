package je;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    public static class a<T> implements s<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s<T> f20764a;
        public volatile transient boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient T f20765c;

        public a(s<T> sVar) {
            this.f20764a = (s) n.l(sVar);
        }

        @Override // je.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            T t8 = this.f20764a.get();
                            this.f20765c = t8;
                            this.b = true;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) i.a(this.f20765c);
        }

        public String toString() {
            Object string;
            if (this.b) {
                String strValueOf = String.valueOf(this.f20765c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.f20764a;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static class b<T> implements s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile s<T> f20766a;
        public volatile boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f20767c;

        public b(s<T> sVar) {
            this.f20766a = (s) n.l(sVar);
        }

        @Override // je.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            s<T> sVar = this.f20766a;
                            Objects.requireNonNull(sVar);
                            T t8 = sVar.get();
                            this.f20767c = t8;
                            this.b = true;
                            this.f20766a = null;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) i.a(this.f20767c);
        }

        public String toString() {
            Object string = this.f20766a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f20767c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static class c<T> implements s<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f20768a;

        public c(T t8) {
            this.f20768a = t8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f20768a, ((c) obj).f20768a);
            }
            return false;
        }

        @Override // je.s
        public T get() {
            return this.f20768a;
        }

        public int hashCode() {
            return j.b(this.f20768a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f20768a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public static <T> s<T> a(s<T> sVar) {
        if ((sVar instanceof b) || (sVar instanceof a)) {
            return sVar;
        }
        return sVar instanceof Serializable ? new a(sVar) : new b(sVar);
    }

    public static <T> s<T> b(T t8) {
        return new c(t8);
    }
}
