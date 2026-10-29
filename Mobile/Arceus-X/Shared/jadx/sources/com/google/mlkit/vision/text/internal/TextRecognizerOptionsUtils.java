package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class TextRecognizerOptionsUtils {
    private TextRecognizerOptionsUtils() {
    }

    public static boolean isThickClient(@NonNull AtomicReference<Boolean> atomicReference, @NonNull String str) {
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean z10 = DynamiteModule.m9233a(MlKitContext.getInstance().getApplicationContext(), str) > 0;
        atomicReference.set(Boolean.valueOf(z10));
        return z10;
    }
}
