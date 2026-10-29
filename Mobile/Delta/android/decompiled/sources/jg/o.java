package jg;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedTreeMap<String, l> f21440a = new LinkedTreeMap<>(false);

    public void A(String str, String str2) {
        x(str, str2 == null ? n.f21439a : new r(str2));
    }

    public Map<String, l> B() {
        return this.f21440a;
    }

    @Override // jg.l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f21440a.entrySet()) {
            oVar.x(entry.getKey(), entry.getValue().a());
        }
        return oVar;
    }

    public Set<Map.Entry<String, l>> D() {
        return this.f21440a.entrySet();
    }

    public l E(String str) {
        return this.f21440a.get(str);
    }

    public i F(String str) {
        return (i) this.f21440a.get(str);
    }

    public o G(String str) {
        return (o) this.f21440a.get(str);
    }

    public boolean H(String str) {
        return this.f21440a.containsKey(str);
    }

    public Set<String> I() {
        return this.f21440a.keySet();
    }

    public l J(String str) {
        return this.f21440a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof o) && ((o) obj).f21440a.equals(this.f21440a);
        }
        return true;
    }

    public int hashCode() {
        return this.f21440a.hashCode();
    }

    public boolean isEmpty() {
        return this.f21440a.isEmpty();
    }

    public void x(String str, l lVar) {
        LinkedTreeMap<String, l> linkedTreeMap = this.f21440a;
        if (lVar == null) {
            lVar = n.f21439a;
        }
        linkedTreeMap.put(str, lVar);
    }

    public void y(String str, Boolean bool) {
        x(str, bool == null ? n.f21439a : new r(bool));
    }

    public void z(String str, Number number) {
        x(str, number == null ? n.f21439a : new r(number));
    }
}
