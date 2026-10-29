package com.google.mlkit.vision.text.internal;

import com.google.android.gms.common.Feature;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class TextOptionalModuleUtils {
    private TextOptionalModuleUtils() {
    }

    public static Feature[] zza(TextRecognizerOptionsInterface textRecognizerOptionsInterface) {
        if (textRecognizerOptionsInterface.getIsThickClient()) {
            return OptionalModuleUtils.EMPTY_FEATURES;
        }
        switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
            case 2:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR_CHINESE};
            case 3:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR_DEVANAGARI};
            case 4:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR_JAPANESE};
            case 5:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR_KOREAN};
            case 6:
            case 7:
            case 8:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR_COMMON};
            default:
                return new Feature[]{OptionalModuleUtils.FEATURE_OCR};
        }
    }
}
