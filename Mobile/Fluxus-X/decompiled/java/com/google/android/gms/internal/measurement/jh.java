package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jh extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(kh khVar, String str) {
        super("getVersion");
        Objects.requireNonNull(khVar);
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        return new j(Double.valueOf(0.0d));
    }
}
