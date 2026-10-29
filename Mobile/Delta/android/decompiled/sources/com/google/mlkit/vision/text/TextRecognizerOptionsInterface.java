package com.google.mlkit.vision.text;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public interface TextRecognizerOptionsInterface {
    public static final int CREDIT_CARD = 6;
    public static final int DOCUMENT = 7;
    public static final int LATIN = 1;
    public static final int LATIN_AND_CHINESE = 2;
    public static final int LATIN_AND_DEVANAGARI = 3;
    public static final int LATIN_AND_JAPANESE = 4;
    public static final int LATIN_AND_KOREAN = 5;
    public static final int PIXEL_AI = 8;

    @Retention(RetentionPolicy.CLASS)
    public @interface LanguageOption {
    }

    @NonNull
    String getConfigLabel();

    Executor getExecutor();

    boolean getIsThickClient();

    @NonNull
    String getLanguageHint();

    int getLoggingEventId();

    @LanguageOption
    int getLoggingLanguageOption();

    @NonNull
    String getLoggingLibraryName();

    @NonNull
    String getLoggingLibraryNameForOptionalModule();

    @NonNull
    String getModuleId();
}
