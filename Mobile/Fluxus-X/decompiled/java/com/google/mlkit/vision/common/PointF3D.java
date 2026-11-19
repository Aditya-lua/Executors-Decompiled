package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PointF3D {
    @NonNull
    public static PointF3D from(float f10, float f11, float f12) {
        return new zza(f10, f11, f12);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
