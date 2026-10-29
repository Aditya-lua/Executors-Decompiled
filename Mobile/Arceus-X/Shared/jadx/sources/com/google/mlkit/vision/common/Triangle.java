package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Triangle<T> {
    private final zzp zza;

    public Triangle(@NonNull T t8, @NonNull T t10, @NonNull T t11) {
        this.zza = zzp.zzj(t8, t10, t11);
    }

    @NonNull
    public List<T> getAllPoints() {
        return this.zza;
    }
}
