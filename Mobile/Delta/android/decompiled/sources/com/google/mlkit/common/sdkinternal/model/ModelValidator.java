package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.mlkit.common.model.RemoteModel;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface ModelValidator {

    public static class ValidationResult {

        @NonNull
        public static final ValidationResult VALID = new ValidationResult(ErrorCode.OK, null);
        private final ErrorCode zza;
        private final String zzb;

        public enum ErrorCode {
            OK,
            TFLITE_VERSION_INCOMPATIBLE,
            MODEL_FORMAT_INVALID
        }

        public ValidationResult(@NonNull ErrorCode errorCode, String str) {
            this.zza = errorCode;
            this.zzb = str;
        }

        @NonNull
        public ErrorCode getErrorCode() {
            return this.zza;
        }

        public String getErrorMessage() {
            return this.zzb;
        }

        public boolean isValid() {
            return this.zza == ErrorCode.OK;
        }
    }

    @NonNull
    ValidationResult validateModel(@NonNull File file, @NonNull RemoteModel remoteModel);
}
