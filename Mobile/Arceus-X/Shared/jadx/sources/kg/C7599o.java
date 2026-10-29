package kg;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: kg.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7599o extends AbstractC7596l {

    /* JADX INFO: renamed from: a */
    public final LinkedTreeMap<String, AbstractC7596l> f29113a = new LinkedTreeMap<>(false);

    /* JADX INFO: renamed from: A */
    public void m31464A(String str, String str2) {
        m31474x(str, str2 == null ? C7598n.f29112a : new C7602r(str2));
    }

    /* JADX INFO: renamed from: B */
    public Map<String, AbstractC7596l> m31465B() {
        return this.f29113a;
    }

    /* JADX DEBUG: Method merged with bridge method: a()Lkg/l; */
    @Override // kg.AbstractC7596l
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C7599o mo31444a() {
        C7599o c7599o = new C7599o();
        for (Map.Entry<String, AbstractC7596l> entry : this.f29113a.entrySet()) {
            c7599o.m31474x(entry.getKey(), entry.getValue().mo31444a());
        }
        return c7599o;
    }

    /* JADX INFO: renamed from: D */
    public Set<Map.Entry<String, AbstractC7596l>> m31467D() {
        return this.f29113a.entrySet();
    }

    /* JADX INFO: renamed from: E */
    public AbstractC7596l m31468E(String str) {
        return this.f29113a.get(str);
    }

    /* JADX INFO: renamed from: F */
    public C7593i m31469F(String str) {
        return (C7593i) this.f29113a.get(str);
    }

    /* JADX INFO: renamed from: G */
    public C7599o m31470G(String str) {
        return (C7599o) this.f29113a.get(str);
    }

    /* JADX INFO: renamed from: H */
    public boolean m31471H(String str) {
        return this.f29113a.containsKey(str);
    }

    /* JADX INFO: renamed from: I */
    public Set<String> m31472I() {
        return this.f29113a.keySet();
    }

    /* JADX INFO: renamed from: J */
    public AbstractC7596l m31473J(String str) {
        return this.f29113a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C7599o) && ((C7599o) obj).f29113a.equals(this.f29113a);
        }
        return true;
    }

    public int hashCode() {
        return this.f29113a.hashCode();
    }

    public boolean isEmpty() {
        return this.f29113a.isEmpty();
    }

    /* JADX INFO: renamed from: x */
    public void m31474x(String str, AbstractC7596l abstractC7596l) {
        LinkedTreeMap<String, AbstractC7596l> linkedTreeMap = this.f29113a;
        if (abstractC7596l == null) {
            abstractC7596l = C7598n.f29112a;
        }
        linkedTreeMap.put(str, abstractC7596l);
    }

    /* JADX INFO: renamed from: y */
    public void m31475y(String str, Boolean bool) {
        m31474x(str, bool == null ? C7598n.f29112a : new C7602r(bool));
    }

    /* JADX INFO: renamed from: z */
    public void m31476z(String str, Number number) {
        m31474x(str, number == null ? C7598n.f29112a : new C7602r(number));
    }
}
