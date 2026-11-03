package he;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    public static class a<T> implements s<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s<T> f19449a;
        public volatile transient boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public transient T f19450c;

        public a(s<T> sVar) {
            this.f19449a = (s) n.l(sVar);
        }

        @Override // he.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            T t8 = this.f19449a.get();
                            this.f19450c = t8;
                            this.b = true;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) i.a(this.f19450c);
        }

        public String toString() {
            Object string;
            if (this.b) {
                String strValueOf = String.valueOf(this.f19450c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.f19449a;
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
        public volatile s<T> f19451a;
        public volatile boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f19452c;

        public b(s<T> sVar) {
            this.f19451a = (s) n.l(sVar);
        }

        @Override // he.s
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            s<T> sVar = this.f19451a;
                            Objects.requireNonNull(sVar);
                            T t8 = sVar.get();
                            this.f19452c = t8;
                            this.b = true;
                            this.f19451a = null;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) i.a(this.f19452c);
        }

        public String toString() {
            Object string = this.f19451a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f19452c);
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
        public final T f19453a;

        public c(T t8) {
            this.f19453a = t8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f19453a, ((c) obj).f19453a);
            }
            return false;
        }

        @Override // he.s
        public T get() {
            return this.f19453a;
        }

        public int hashCode() {
            return j.b(this.f19453a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f19453a);
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
