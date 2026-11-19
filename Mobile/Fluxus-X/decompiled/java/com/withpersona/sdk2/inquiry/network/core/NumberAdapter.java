package com.withpersona.sdk2.inquiry.network.core;

import hn.m;
import hn.t;
import hn.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberAdapter {

    @NotNull
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    private NumberAdapter() {
    }

    @hn.f
    @Nullable
    public final Number fromJson(@NotNull m mVar) {
        Object objE = mVar.E();
        Number number = objE instanceof Number ? (Number) objE : null;
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
