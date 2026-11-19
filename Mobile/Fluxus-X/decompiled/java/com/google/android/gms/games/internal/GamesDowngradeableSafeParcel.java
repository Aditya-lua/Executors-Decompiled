package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import v9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel {
    public static boolean C3(Integer num) {
        if (num == null) {
            return false;
        }
        return j.a(num.intValue());
    }
}
