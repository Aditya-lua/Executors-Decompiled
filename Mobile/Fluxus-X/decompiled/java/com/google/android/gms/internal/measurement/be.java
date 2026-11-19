package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public enum be {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(la.b),
    ENUM(null),
    MESSAGE(null);

    be(Object obj) {
    }
}
