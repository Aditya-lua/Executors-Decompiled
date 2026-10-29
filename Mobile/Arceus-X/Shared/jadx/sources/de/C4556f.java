package de;

import java.util.Map;

/* JADX INFO: renamed from: de.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C4556f extends AbstractC4572v {

    /* JADX INFO: renamed from: b */
    public final Integer f18671b;

    /* JADX INFO: renamed from: c */
    public final Map f18672c;

    public /* synthetic */ C4556f(Integer num, Map map, C4555e c4555e) {
        this.f18671b = num;
        this.f18672c = map;
    }

    @Override // de.AbstractC4572v
    /* JADX INFO: renamed from: a */
    public final Integer mo22628a() {
        return this.f18671b;
    }

    @Override // de.AbstractC4572v
    /* JADX INFO: renamed from: b */
    public final Map mo22629b() {
        return this.f18672c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4572v) {
            AbstractC4572v abstractC4572v = (AbstractC4572v) obj;
            Integer num = this.f18671b;
            if (num != null ? num.equals(abstractC4572v.mo22628a()) : abstractC4572v.mo22628a() == null) {
                if (this.f18672c.equals(abstractC4572v.mo22629b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f18671b;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f18672c.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f18671b + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f18672c) + "}";
    }
}
