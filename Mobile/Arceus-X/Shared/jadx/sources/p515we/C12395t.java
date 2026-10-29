package p515we;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import pe.C10233n;

/* JADX INFO: renamed from: we.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C12395t {

    /* JADX INFO: renamed from: a */
    public final C12391r f44346a;

    /* JADX INFO: renamed from: b */
    public final List<c> f44347b;

    /* JADX INFO: renamed from: c */
    public final Integer f44348c;

    /* JADX INFO: renamed from: we.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public ArrayList<c> f44349a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public C12391r f44350b = C12391r.f44342b;

        /* JADX INFO: renamed from: c */
        public Integer f44351c = null;

        /* JADX INFO: renamed from: a */
        public b m46457a(C10233n c10233n, int i10, String str, String str2) {
            ArrayList<c> arrayList = this.f44349a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(c10233n, i10, str, str2));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12395t m46458b() throws GeneralSecurityException {
            if (this.f44349a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f44351c;
            if (num != null && !m46459c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            C12395t c12395t = new C12395t(this.f44350b, Collections.unmodifiableList(this.f44349a), this.f44351c);
            this.f44349a = null;
            return c12395t;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m46459c(int i10) {
            ArrayList<c> arrayList = this.f44349a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                c cVar = arrayList.get(i11);
                i11++;
                if (cVar.m46462a() == i10) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public b m46460d(C12391r c12391r) {
            if (this.f44349a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f44350b = c12391r;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m46461e(int i10) {
            if (this.f44349a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f44351c = Integer.valueOf(i10);
            return this;
        }
    }

    /* JADX INFO: renamed from: we.t$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final C10233n f44352a;

        /* JADX INFO: renamed from: b */
        public final int f44353b;

        /* JADX INFO: renamed from: c */
        public final String f44354c;

        /* JADX INFO: renamed from: d */
        public final String f44355d;

        /* JADX INFO: renamed from: a */
        public int m46462a() {
            return this.f44353b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f44352a == cVar.f44352a && this.f44353b == cVar.f44353b && this.f44354c.equals(cVar.f44354c) && this.f44355d.equals(cVar.f44355d);
        }

        public int hashCode() {
            return Objects.hash(this.f44352a, Integer.valueOf(this.f44353b), this.f44354c, this.f44355d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f44352a, Integer.valueOf(this.f44353b), this.f44354c, this.f44355d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(C10233n c10233n, int i10, String str, String str2) {
            this.f44352a = c10233n;
            this.f44353b = i10;
            this.f44354c = str;
            this.f44355d = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m46456a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12395t)) {
            return false;
        }
        C12395t c12395t = (C12395t) obj;
        return this.f44346a.equals(c12395t.f44346a) && this.f44347b.equals(c12395t.f44347b) && Objects.equals(this.f44348c, c12395t.f44348c);
    }

    public int hashCode() {
        return Objects.hash(this.f44346a, this.f44347b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f44346a, this.f44347b, this.f44348c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12395t(C12391r c12391r, List<c> list, Integer num) {
        this.f44346a = c12391r;
        this.f44347b = list;
        this.f44348c = num;
    }
}
