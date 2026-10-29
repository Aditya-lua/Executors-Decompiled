package com.google.mlkit.common;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p305n9.C8953m;

/* JADX INFO: loaded from: classes2.dex */
public class MlKitException extends Exception {
    public static final int ABORTED = 10;
    public static final int ALREADY_EXISTS = 6;
    public static final int CANCELLED = 1;
    public static final int CODE_SCANNER_APP_NAME_UNAVAILABLE = 203;
    public static final int CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED = 202;
    public static final int CODE_SCANNER_CANCELLED = 201;
    public static final int CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD = 207;
    public static final int CODE_SCANNER_PIPELINE_INFERENCE_ERROR = 206;
    public static final int CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR = 205;
    public static final int CODE_SCANNER_TASK_IN_PROGRESS = 204;
    public static final int CODE_SCANNER_UNAVAILABLE = 200;
    public static final int DATA_LOSS = 15;
    public static final int DEADLINE_EXCEEDED = 4;
    public static final int FAILED_PRECONDITION = 9;
    public static final int INTERNAL = 13;
    public static final int INVALID_ARGUMENT = 3;
    public static final int LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE = 300;
    public static final int LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE = 301;
    public static final int MODEL_HASH_MISMATCH = 102;
    public static final int MODEL_INCOMPATIBLE_WITH_TFLITE = 100;
    public static final int NETWORK_ISSUE = 17;
    public static final int NOT_ENOUGH_SPACE = 101;
    public static final int NOT_FOUND = 5;
    public static final int OUT_OF_RANGE = 11;
    public static final int PERMISSION_DENIED = 7;
    public static final int RESOURCE_EXHAUSTED = 8;
    public static final int UNAUTHENTICATED = 16;
    public static final int UNAVAILABLE = 14;
    public static final int UNIMPLEMENTED = 12;
    public static final int UNKNOWN = 2;
    public static final int UNSUPPORTED = 18;

    @ErrorCode
    private final int zza;

    @Retention(RetentionPolicy.CLASS)
    public @interface ErrorCode {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MlKitException(@NonNull String str, @ErrorCode int i10) {
        super(C8953m.m36042g(str, "Provided message must not be empty."));
        this.zza = i10;
    }

    @ErrorCode
    public int getErrorCode() {
        return this.zza;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MlKitException(@NonNull String str, @ErrorCode int i10, Throwable th2) {
        super(C8953m.m36042g(str, "Provided message must not be empty."), th2);
        this.zza = i10;
    }
}
