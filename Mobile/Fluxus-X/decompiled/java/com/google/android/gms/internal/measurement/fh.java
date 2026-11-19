package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kg f6509c;

    public fh(kg kgVar) {
        super("internal.logger");
        this.f6509c = kgVar;
        this.b.put("log", new eh(this, false, true));
        this.b.put("silent", new he(this, "silent"));
        ((k) this.b.get("silent")).d("log", new eh(this, true, true));
        this.b.put("unmonitored", new jf(this, "unmonitored"));
        ((k) this.b.get("unmonitored")).d("log", new eh(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        return q.Co;
    }

    public final /* synthetic */ kg j() {
        return this.f6509c;
    }
}
