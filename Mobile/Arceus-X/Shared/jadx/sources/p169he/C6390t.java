package p169he;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: he.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C6390t {

    /* JADX INFO: renamed from: he.t$a */
    public static class a<T> implements InterfaceC6389s<T>, Serializable {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6389s<T> f24313a;

        /* JADX INFO: renamed from: b */
        public volatile transient boolean f24314b;

        /* JADX INFO: renamed from: c */
        public transient T f24315c;

        public a(InterfaceC6389s<T> interfaceC6389s) {
            this.f24313a = (InterfaceC6389s) C6384n.m27928l(interfaceC6389s);
        }

        @Override // p169he.InterfaceC6389s
        public T get() {
            if (!this.f24314b) {
                synchronized (this) {
                    try {
                        if (!this.f24314b) {
                            T t8 = this.f24313a.get();
                            this.f24315c = t8;
                            this.f24314b = true;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) C6379i.m27909a(this.f24315c);
        }

        public String toString() {
            Object string;
            if (this.f24314b) {
                String strValueOf = String.valueOf(this.f24315c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 25);
                sb2.append("<supplier that returned ");
                sb2.append(strValueOf);
                sb2.append(">");
                string = sb2.toString();
            } else {
                string = this.f24313a;
            }
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 19);
            sb3.append("Suppliers.memoize(");
            sb3.append(strValueOf2);
            sb3.append(")");
            return sb3.toString();
        }
    }

    /* JADX INFO: renamed from: he.t$b */
    public static class b<T> implements InterfaceC6389s<T> {

        /* JADX INFO: renamed from: a */
        public volatile InterfaceC6389s<T> f24316a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f24317b;

        /* JADX INFO: renamed from: c */
        public T f24318c;

        public b(InterfaceC6389s<T> interfaceC6389s) {
            this.f24316a = (InterfaceC6389s) C6384n.m27928l(interfaceC6389s);
        }

        @Override // p169he.InterfaceC6389s
        public T get() {
            if (!this.f24317b) {
                synchronized (this) {
                    try {
                        if (!this.f24317b) {
                            InterfaceC6389s<T> interfaceC6389s = this.f24316a;
                            Objects.requireNonNull(interfaceC6389s);
                            T t8 = interfaceC6389s.get();
                            this.f24318c = t8;
                            this.f24317b = true;
                            this.f24316a = null;
                            return t8;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return (T) C6379i.m27909a(this.f24318c);
        }

        public String toString() {
            Object string = this.f24316a;
            if (string == null) {
                String strValueOf = String.valueOf(this.f24318c);
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

    /* JADX INFO: renamed from: he.t$c */
    public static class c<T> implements InterfaceC6389s<T>, Serializable {

        /* JADX INFO: renamed from: a */
        public final T f24319a;

        public c(T t8) {
            this.f24319a = t8;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C6380j.m27910a(this.f24319a, ((c) obj).f24319a);
            }
            return false;
        }

        @Override // p169he.InterfaceC6389s
        public T get() {
            return this.f24319a;
        }

        public int hashCode() {
            return C6380j.m27911b(this.f24319a);
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f24319a);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22);
            sb2.append("Suppliers.ofInstance(");
            sb2.append(strValueOf);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC6389s<T> m27959a(InterfaceC6389s<T> interfaceC6389s) {
        if ((interfaceC6389s instanceof b) || (interfaceC6389s instanceof a)) {
            return interfaceC6389s;
        }
        return interfaceC6389s instanceof Serializable ? new a(interfaceC6389s) : new b(interfaceC6389s);
    }

    /* JADX INFO: renamed from: b */
    public static <T> InterfaceC6389s<T> m27960b(T t8) {
        return new c(t8);
    }
}
