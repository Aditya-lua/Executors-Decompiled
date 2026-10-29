package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh(gh ghVar, String str) {
        super("getVersion");
        Objects.requireNonNull(ghVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        return new j(Double.valueOf(0.0d));
    }
}
