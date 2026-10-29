package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5698a;

    public GooglePlayServicesManifestException(int i10, @NonNull String str) {
        super(str);
        this.f5698a = i10;
    }
}
