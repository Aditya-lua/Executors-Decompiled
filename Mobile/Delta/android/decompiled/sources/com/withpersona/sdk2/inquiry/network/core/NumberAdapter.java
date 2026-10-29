package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.m;
import um.t;
import um.z;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberAdapter {

    @NotNull
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    private NumberAdapter() {
    }

    @Nullable
    @um.f
    public final Number fromJson(@NotNull m mVar) {
        Object objB = mVar.B();
        Number number = objB instanceof Number ? (Number) objB : null;
        if (number instanceof Double) {
            if (Double.compare(number.doubleValue(), (int) number.doubleValue()) == 0) {
                return Integer.valueOf((int) number.doubleValue());
            }
        } else if (!(number instanceof Integer)) {
            return null;
        }
        return number;
    }

    @z
    public final void toJson(@NotNull t tVar, @Nullable Number number) {
    }
}
