package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;
import td.c;
import td.s1;
import td.x;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static c a(Context context) {
        return x.a(context).a();
    }

    @NonNull
    public static IntegrityManager create(Context context) {
        return s1.a(context).a();
    }
}
