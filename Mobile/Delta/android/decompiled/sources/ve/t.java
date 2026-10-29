package ve;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f33013a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f33014c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<c> f33015a = new ArrayList<>();
        public r b = r.b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f33016c = null;

        public b a(oe.n nVar, int i10, String str, String str2) {
            ArrayList<c> arrayList = this.f33015a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(nVar, i10, str, str2));
            return this;
        }

        public t b() throws GeneralSecurityException {
            if (this.f33015a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f33016c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            t tVar = new t(this.b, Collections.unmodifiableList(this.f33015a), this.f33016c);
            this.f33015a = null;
            return tVar;
        }

        public final boolean c(int i10) {
            ArrayList<c> arrayList = this.f33015a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                c cVar = arrayList.get(i11);
                i11++;
                if (cVar.a() == i10) {
                    return true;
                }
            }
            return false;
        }

        public b d(r rVar) {
            if (this.f33015a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.b = rVar;
            return this;
        }

        public b e(int i10) {
            if (this.f33015a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f33016c = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final oe.n f33017a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f33018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f33019d;

        public int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f33017a == cVar.f33017a && this.b == cVar.b && this.f33018c.equals(cVar.f33018c) && this.f33019d.equals(cVar.f33019d);
        }

        public int hashCode() {
            return Objects.hash(this.f33017a, Integer.valueOf(this.b), this.f33018c, this.f33019d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f33017a, Integer.valueOf(this.b), this.f33018c, this.f33019d);
        }

        public c(oe.n nVar, int i10, String str, String str2) {
            this.f33017a = nVar;
            this.b = i10;
            this.f33018c = str;
            this.f33019d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f33013a.equals(tVar.f33013a) && this.b.equals(tVar.b) && Objects.equals(this.f33014c, tVar.f33014c);
    }

    public int hashCode() {
        return Objects.hash(this.f33013a, this.b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f33013a, this.b, this.f33014c);
    }

    public t(r rVar, List<c> list, Integer num) {
        this.f33013a = rVar;
        this.b = list;
        this.f33014c = num;
    }
}
