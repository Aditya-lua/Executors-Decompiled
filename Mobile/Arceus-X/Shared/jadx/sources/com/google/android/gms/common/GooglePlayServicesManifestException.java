package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a */
    public final int f7383a;

    public GooglePlayServicesManifestException(int i10, @NonNull String str) {
        super(str);
        this.f7383a = i10;
    }
}
