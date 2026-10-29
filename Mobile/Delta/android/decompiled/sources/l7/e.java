package l7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f22977c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f22978a;
    public f b;

    public e(String... strArr) {
        this.f22978a = Arrays.asList(strArr);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f22978a.add(str);
        return eVar;
    }

    public final boolean b() {
        List<String> list = this.f22978a;
        return list.get(list.size() - 1).equals("**");
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f22978a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f22978a.size() - 1;
        String str2 = this.f22978a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f22978a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f22978a.get(i10 + 1).equals(str)) {
            return i10 == this.f22978a.size() + (-2) || (i10 == this.f22978a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f22978a.size() - 1) {
            return false;
        }
        return this.f22978a.get(i11).equals(str);
    }

    public f d() {
        return this.b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f22978a.get(i10).equals("**")) {
            return (i10 != this.f22978a.size() - 1 && this.f22978a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f22978a.equals(eVar.f22978a)) {
                return false;
            }
            f fVar = this.b;
            f fVar2 = eVar.b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f22978a.size()) {
            return false;
        }
        return this.f22978a.get(i10).equals(str) || this.f22978a.get(i10).equals("**") || this.f22978a.get(i10).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f22978a.size() - 1 || this.f22978a.get(i10).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f22978a.hashCode() * 31;
        f fVar = this.b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f22978a);
        sb2.append(",resolved=");
        sb2.append(this.b != null);
        sb2.append('}');
        return sb2.toString();
    }

    public e(e eVar) {
        this.f22978a = new ArrayList(eVar.f22978a);
        this.b = eVar.b;
    }
}
