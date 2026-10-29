package de;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: de.u */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4571u {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC4571u mo22619a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract AbstractC4571u mo22620b(Map map);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC4572v mo22621c();

    /* JADX INFO: renamed from: d */
    public abstract Map mo22622d();

    /* JADX INFO: renamed from: e */
    public final AbstractC4572v m22631e() {
        mo22620b(Collections.unmodifiableMap(mo22622d()));
        return mo22621c();
    }
}
