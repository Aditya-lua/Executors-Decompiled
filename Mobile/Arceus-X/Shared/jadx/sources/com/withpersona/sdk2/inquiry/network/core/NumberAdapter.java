package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberAdapter {

    @NotNull
    public static final NumberAdapter INSTANCE = new NumberAdapter();

    private NumberAdapter() {
    }

    @Nullable
    @InterfaceC11871f
    public final Number fromJson(@NotNull AbstractC11878m abstractC11878m) {
        Object objM44315B = abstractC11878m.m44315B();
        Number number = objM44315B instanceof Number ? (Number) objM44315B : null;
        if (number instanceof Double) {
            if (Double.compare(number.doubleValue(), (int) number.doubleValue()) == 0) {
                return Integer.valueOf((int) number.doubleValue());
            }
        } else if (!(number instanceof Integer)) {
            return null;
        }
        return number;
    }

    @InterfaceC11891z
    public final void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable Number number) {
    }
}
