package p190i8;

import java.util.Map;
import p267l8.InterfaceC8011a;
import p569y7.EnumC13118e;

/* JADX INFO: renamed from: i8.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6661b extends AbstractC6665f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8011a f25691a;

    /* JADX INFO: renamed from: b */
    public final Map<EnumC13118e, AbstractC6665f.b> f25692b;

    public C6661b(InterfaceC8011a interfaceC8011a, Map<EnumC13118e, AbstractC6665f.b> map) {
        if (interfaceC8011a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f25691a = interfaceC8011a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f25692b = map;
    }

    @Override // p190i8.AbstractC6665f
    /* JADX INFO: renamed from: e */
    public InterfaceC8011a mo28727e() {
        return this.f25691a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6665f) {
            AbstractC6665f abstractC6665f = (AbstractC6665f) obj;
            if (this.f25691a.equals(abstractC6665f.mo28727e()) && this.f25692b.equals(abstractC6665f.mo28728h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p190i8.AbstractC6665f
    /* JADX INFO: renamed from: h */
    public Map<EnumC13118e, AbstractC6665f.b> mo28728h() {
        return this.f25692b;
    }

    public int hashCode() {
        return ((this.f25691a.hashCode() ^ 1000003) * 1000003) ^ this.f25692b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f25691a + ", values=" + this.f25692b + "}";
    }
}
