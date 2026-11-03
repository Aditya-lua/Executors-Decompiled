package de;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f14605a;
    public Map b;

    @Override // de.u
    public final u a(int i10) {
        this.f14605a = Integer.valueOf(i10);
        return this;
    }

    @Override // de.u
    public final u b(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.b = map;
        return this;
    }

    @Override // de.u
    public final v c() {
        if (this.b != null) {
            return new f(this.f14605a, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // de.u
    public final Map d() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
}
