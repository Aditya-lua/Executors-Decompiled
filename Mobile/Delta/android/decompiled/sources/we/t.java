package we;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f34467a;
    public final List<c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f34468c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<c> f34469a = new ArrayList<>();
        public r b = r.b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f34470c = null;

        public b a(pe.n nVar, int i10, String str, String str2) {
            ArrayList<c> arrayList = this.f34469a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new c(nVar, i10, str, str2));
            return this;
        }

        public t b() throws GeneralSecurityException {
            if (this.f34469a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f34470c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            t tVar = new t(this.b, Collections.unmodifiableList(this.f34469a), this.f34470c);
            this.f34469a = null;
            return tVar;
        }

        public final boolean c(int i10) {
            ArrayList<c> arrayList = this.f34469a;
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
            if (this.f34469a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.b = rVar;
            return this;
        }

        public b e(int i10) {
            if (this.f34469a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f34470c = Integer.valueOf(i10);
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pe.n f34471a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f34472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f34473d;

        public int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f34471a == cVar.f34471a && this.b == cVar.b && this.f34472c.equals(cVar.f34472c) && this.f34473d.equals(cVar.f34473d);
        }

        public int hashCode() {
            return Objects.hash(this.f34471a, Integer.valueOf(this.b), this.f34472c, this.f34473d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f34471a, Integer.valueOf(this.b), this.f34472c, this.f34473d);
        }

        public c(pe.n nVar, int i10, String str, String str2) {
            this.f34471a = nVar;
            this.b = i10;
            this.f34472c = str;
            this.f34473d = str2;
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
        return this.f34467a.equals(tVar.f34467a) && this.b.equals(tVar.b) && Objects.equals(this.f34468c, tVar.f34468c);
    }

    public int hashCode() {
        return Objects.hash(this.f34467a, this.b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f34467a, this.b, this.f34468c);
    }

    public t(r rVar, List<c> list, Integer num) {
        this.f34467a = rVar;
        this.b = list;
        this.f34468c = num;
    }
}
