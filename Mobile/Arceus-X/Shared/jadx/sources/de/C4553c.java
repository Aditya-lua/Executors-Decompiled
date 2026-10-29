package de;

import java.util.Map;

/* JADX INFO: renamed from: de.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C4553c extends AbstractC4571u {

    /* JADX INFO: renamed from: a */
    public Integer f18666a;

    /* JADX INFO: renamed from: b */
    public Map f18667b;

    @Override // de.AbstractC4571u
    /* JADX INFO: renamed from: a */
    public final AbstractC4571u mo22619a(int i10) {
        this.f18666a = Integer.valueOf(i10);
        return this;
    }

    @Override // de.AbstractC4571u
    /* JADX INFO: renamed from: b */
    public final AbstractC4571u mo22620b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.f18667b = map;
        return this;
    }

    @Override // de.AbstractC4571u
    /* JADX INFO: renamed from: c */
    public final AbstractC4572v mo22621c() {
        if (this.f18667b != null) {
            return new C4556f(this.f18666a, this.f18667b, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // de.AbstractC4571u
    /* JADX INFO: renamed from: d */
    public final Map mo22622d() {
        Map map = this.f18667b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
