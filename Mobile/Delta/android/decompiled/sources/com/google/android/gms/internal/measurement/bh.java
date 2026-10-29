package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gg f6394c;

    public bh(gg ggVar) {
        super("internal.logger");
        this.f6394c = ggVar;
        this.b.put("log", new ah(this, false, true));
        this.b.put("silent", new de(this, "silent"));
        ((k) this.b.get("silent")).d("log", new ah(this, true, true));
        this.b.put("unmonitored", new ef(this, "unmonitored"));
        ((k) this.b.get("unmonitored")).d("log", new ah(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        return q.f6743zo;
    }

    public final /* synthetic */ gg j() {
        return this.f6394c;
    }
}
