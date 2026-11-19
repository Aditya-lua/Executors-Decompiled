package com.google.mlkit.vision.text.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo {
    private final zzp zza;
    private final ExecutorSelector zzb;

    public zzo(@NonNull zzp zzpVar, @NonNull ExecutorSelector executorSelector) {
        this.zza = zzpVar;
        this.zzb = executorSelector;
    }

    @NonNull
    public final TextRecognizer zza(@NonNull TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        return new zzn((TextRecognizerTaskWithResource) this.zza.get(textRecognizerOptionsInterface), this.zzb.getExecutorToUse(textRecognizerOptionsInterface.getExecutor()), zzun.zzb(textRecognizerOptionsInterface.getLoggingLibraryName()), textRecognizerOptionsInterface);
    }
}
