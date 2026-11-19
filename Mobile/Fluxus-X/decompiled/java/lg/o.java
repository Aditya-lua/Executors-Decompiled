package lg;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng.b0<String, l> f22141a = new ng.b0<>(false);

    public void A(String str, String str2) {
        v(str, str2 == null ? n.f22140a : new r(str2));
    }

    public Map<String, l> B() {
        return this.f22141a;
    }

    @Override // lg.l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f22141a.entrySet()) {
            oVar.v(entry.getKey(), entry.getValue().a());
        }
        return oVar;
    }

    public Set<Map.Entry<String, l>> D() {
        return this.f22141a.entrySet();
    }

    public l E(String str) {
        return this.f22141a.get(str);
    }

    public i F(String str) {
        return (i) this.f22141a.get(str);
    }

    public o G(String str) {
        return (o) this.f22141a.get(str);
    }

    public boolean H(String str) {
        return this.f22141a.containsKey(str);
    }

    public Set<String> I() {
        return this.f22141a.keySet();
    }

    public l J(String str) {
        return this.f22141a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f22141a.equals(this.f22141a);
        }
        return true;
    }

    public int hashCode() {
        return this.f22141a.hashCode();
    }

    public boolean isEmpty() {
        return this.f22141a.isEmpty();
    }

    public void v(String str, l lVar) {
        ng.b0<String, l> b0Var = this.f22141a;
        if (lVar == null) {
            lVar = n.f22140a;
        }
        b0Var.put(str, lVar);
    }

    public void w(String str, Boolean bool) {
        v(str, bool == null ? n.f22140a : new r(bool));
    }

    public void x(String str, Number number) {
        v(str, number == null ? n.f22140a : new r(number));
    }
}
