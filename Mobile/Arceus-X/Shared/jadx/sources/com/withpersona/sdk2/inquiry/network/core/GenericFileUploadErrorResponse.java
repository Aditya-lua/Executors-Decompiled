package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC11874i(generateAdapter = true)
public final class GenericFileUploadErrorResponse {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final List<DocumentErrorResponse> errors;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AbstractC11873h.e getAdapter() {
            return C12232b.m45364b(DocumentErrorResponse.class, "code").m45368e(DocumentErrorResponse.DisabledFileTypeError.class, "document-generic-disabled-file-type-error").m45368e(DocumentErrorResponse.FileLimitExceededError.class, "document-generic-file-limit-exceeded-error").m45368e(DocumentErrorResponse.PageLimitExceededError.class, "document-generic-page-limit-exceeded-error").m45368e(DocumentErrorResponse.MalformedFileError.class, "document-generic-malformed-file-error").m45368e(DocumentErrorResponse.MalformedImageError.class, "document-generic-malformed-image-error").m45368e(DocumentErrorResponse.MalformedPdfError.class, "document-generic-malformed-pdf-error").m45368e(DocumentErrorResponse.GovernmentIdDimensionSizeError.class, "document-government-id-dimension-size-error").m45368e(DocumentErrorResponse.FileSizeExceededError.class, "document-generic-file-size-exceeded-error").m45367d(UnknownErrorAdapter.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public static abstract class DocumentErrorResponse implements Parcelable {

        @InterfaceC11874i(generateAdapter = true)
        public static final class DisabledFileTypeError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<DisabledFileTypeError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<DisabledFileTypeError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError createFromParcel(Parcel parcel) {
                    return new DisabledFileTypeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisabledFileTypeError[] newArray(int i10) {
                    return new DisabledFileTypeError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @NotNull
                private final List<String> enabledFileTypes;

                @NotNull
                private final String uploadedFileType;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readString(), parcel.createStringArrayList());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11872g(name = "uploaded_file_type") @NotNull String str, @InterfaceC11872g(name = "enabled_file_types") @NotNull List<String> list) {
                    this.uploadedFileType = str;
                    this.enabledFileTypes = list;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @NotNull
                public final List<String> getEnabledFileTypes() {
                    return this.enabledFileTypes;
                }

                @NotNull
                public final String getUploadedFileType() {
                    return this.uploadedFileType;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeString(this.uploadedFileType);
                    parcel.writeStringList(this.enabledFileTypes);
                }
            }

            public DisabledFileTypeError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class FileLimitExceededError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<FileLimitExceededError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<FileLimitExceededError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError createFromParcel(Parcel parcel) {
                    return new FileLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileLimitExceededError[] newArray(int i10) {
                    return new FileLimitExceededError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(1);
                }
            }

            public FileLimitExceededError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class FileSizeExceededError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<FileSizeExceededError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<FileSizeExceededError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileSizeExceededError createFromParcel(Parcel parcel) {
                    return new FileSizeExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FileSizeExceededError[] newArray(int i10) {
                    return new FileSizeExceededError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                @Nullable
                private final Long fileSizeLimit;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11872g(name = "file_size_limit") @Nullable Long l10) {
                    this.fileSizeLimit = l10;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Nullable
                public final Long getFileSizeLimit() {
                    return this.fileSizeLimit;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    Long l10 = this.fileSizeLimit;
                    if (l10 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeLong(l10.longValue());
                    }
                }
            }

            public FileSizeExceededError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class GovernmentIdDimensionSizeError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<GovernmentIdDimensionSizeError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<GovernmentIdDimensionSizeError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError createFromParcel(Parcel parcel) {
                    return new GovernmentIdDimensionSizeError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GovernmentIdDimensionSizeError[] newArray(int i10) {
                    return new GovernmentIdDimensionSizeError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int maxDimensionSize;
                private final int minDimensionSize;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt(), parcel.readInt());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11872g(name = "min_dimension_size") int i10, @InterfaceC11872g(name = "max_dimension_size") int i11) {
                    this.minDimensionSize = i10;
                    this.maxDimensionSize = i11;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int getMaxDimensionSize() {
                    return this.maxDimensionSize;
                }

                public final int getMinDimensionSize() {
                    return this.minDimensionSize;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(this.minDimensionSize);
                    parcel.writeInt(this.maxDimensionSize);
                }
            }

            public GovernmentIdDimensionSizeError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class MalformedFileError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedFileError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedFileError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError createFromParcel(Parcel parcel) {
                    return new MalformedFileError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedFileError[] newArray(int i10) {
                    return new MalformedFileError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(1);
                }
            }

            public MalformedFileError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class MalformedImageError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedImageError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedImageError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError createFromParcel(Parcel parcel) {
                    return new MalformedImageError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedImageError[] newArray(int i10) {
                    return new MalformedImageError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(1);
                }
            }

            public MalformedImageError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class MalformedPdfError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<MalformedPdfError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<MalformedPdfError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError createFromParcel(Parcel parcel) {
                    return new MalformedPdfError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MalformedPdfError[] newArray(int i10) {
                    return new MalformedPdfError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return new Details();
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(1);
                }
            }

            public MalformedPdfError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class PageLimitExceededError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<PageLimitExceededError> CREATOR = new Creator();

            @NotNull
            private final String code;

            @NotNull
            private final Details details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<PageLimitExceededError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError createFromParcel(Parcel parcel) {
                    return new PageLimitExceededError(parcel.readString(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PageLimitExceededError[] newArray(int i10) {
                    return new PageLimitExceededError[i10];
                }
            }

            @InterfaceC11874i(generateAdapter = true)
            public static final class Details implements ErrorDetails {

                @NotNull
                public static final Parcelable.Creator<Details> CREATOR = new Creator();
                private final int pageLimit;

                public static final class Creator implements Parcelable.Creator<Details> {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details createFromParcel(Parcel parcel) {
                        return new Details(parcel.readInt());
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Details[] newArray(int i10) {
                        return new Details[i10];
                    }
                }

                public Details(@InterfaceC11872g(name = "page_limit") int i10) {
                    this.pageLimit = i10;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final int getPageLimit() {
                    return this.pageLimit;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                    parcel.writeInt(this.pageLimit);
                }
            }

            public PageLimitExceededError(@NotNull String str, @NotNull String str2, @NotNull Details details) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = details;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                this.details.writeToParcel(parcel, i10);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: getDetails()Lcom/withpersona/sdk2/inquiry/network/core/ErrorDetails; */
            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public Details getDetails() {
                return this.details;
            }
        }

        @InterfaceC11874i(generateAdapter = true)
        public static final class UnknownError extends DocumentErrorResponse {

            @NotNull
            public static final Parcelable.Creator<UnknownError> CREATOR = new Creator();

            @Nullable
            private final String code;

            @Nullable
            private final ErrorDetails details;

            @NotNull
            private final String title;

            public static final class Creator implements Parcelable.Creator<UnknownError> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError createFromParcel(Parcel parcel) {
                    return new UnknownError(parcel.readString(), parcel.readString(), (ErrorDetails) parcel.readParcelable(UnknownError.class.getClassLoader()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UnknownError[] newArray(int i10) {
                    return new UnknownError[i10];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public UnknownError() {
                this(null, null, null, 7, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @Nullable
            public String getCode() {
                return this.code;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @Nullable
            public ErrorDetails getDetails() {
                return this.details;
            }

            @Override // com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse
            @NotNull
            public String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i10) {
                parcel.writeString(this.title);
                parcel.writeString(this.code);
                parcel.writeParcelable(this.details, i10);
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("Unknown Error") : (r2v0 java.lang.String))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
              (wrap com.withpersona.sdk2.inquiry.network.core.ErrorDetails:?: TERNARY null = ((wrap int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.withpersona.sdk2.inquiry.network.core.ErrorDetails) : (r4v0 com.withpersona.sdk2.inquiry.network.core.ErrorDetails))
             A[MD:(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.core.ErrorDetails):void (m)] (LINE:3) call: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.<init>(java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.core.ErrorDetails):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public /* synthetic */ UnknownError(String str, String str2, ErrorDetails errorDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? "Unknown Error" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : errorDetails);
            }

            public UnknownError(@NotNull String str, @Nullable String str2, @Nullable ErrorDetails errorDetails) {
                super(null);
                this.title = str;
                this.code = str2;
                this.details = errorDetails;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse.DocumentErrorResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ DocumentErrorResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract String getCode();

        @Nullable
        public abstract ErrorDetails getDetails();

        @NotNull
        public abstract String getTitle();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private DocumentErrorResponse() {
        }
    }

    public static final class UnknownErrorAdapter extends AbstractC11873h<DocumentErrorResponse.UnknownError> {

        @NotNull
        public static final UnknownErrorAdapter INSTANCE = new UnknownErrorAdapter();

        private UnknownErrorAdapter() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p471um.AbstractC11873h
        @NotNull
        public DocumentErrorResponse.UnknownError fromJson(@NotNull AbstractC11878m abstractC11878m) {
            abstractC11878m.mo44325b();
            String strNextStringOrNull = null;
            String strNextStringOrNull2 = null;
            while (abstractC11878m.mo44329f()) {
                String strMo44335n = abstractC11878m.mo44335n();
                if (Intrinsics.m31980c(strMo44335n, Title.type)) {
                    strNextStringOrNull = JsonReaderUtilsKt.nextStringOrNull(abstractC11878m);
                } else if (Intrinsics.m31980c(strMo44335n, "code")) {
                    strNextStringOrNull2 = JsonReaderUtilsKt.nextStringOrNull(abstractC11878m);
                } else {
                    abstractC11878m.mo44321P();
                }
            }
            abstractC11878m.mo44327d();
            if (strNextStringOrNull == null) {
                strNextStringOrNull = "Unknown Error";
            }
            return new DocumentErrorResponse.UnknownError(strNextStringOrNull, strNextStringOrNull2, null, 4, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
        @Override // p471um.AbstractC11873h
        public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable DocumentErrorResponse.UnknownError unknownError) {
            abstractC11885t.mo44374c();
            abstractC11885t.mo44380n(Title.type);
            abstractC11885t.mo44367M(unknownError != null ? unknownError.getTitle() : null);
            abstractC11885t.mo44380n("code");
            abstractC11885t.mo44367M(unknownError != null ? unknownError.getCode() : null);
            abstractC11885t.mo44378g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse$DocumentErrorResponse> */
    /* JADX WARN: Multi-variable type inference failed */
    public GenericFileUploadErrorResponse(@NotNull List<? extends DocumentErrorResponse> list) {
        this.errors = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericFileUploadErrorResponse copy$default(GenericFileUploadErrorResponse genericFileUploadErrorResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = genericFileUploadErrorResponse.errors;
        }
        return genericFileUploadErrorResponse.copy(list);
    }

    @NotNull
    public final List<DocumentErrorResponse> component1() {
        return this.errors;
    }

    @NotNull
    public final GenericFileUploadErrorResponse copy(@NotNull List<? extends DocumentErrorResponse> list) {
        return new GenericFileUploadErrorResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GenericFileUploadErrorResponse) && Intrinsics.m31980c(this.errors, ((GenericFileUploadErrorResponse) obj).errors);
    }

    @NotNull
    public final List<DocumentErrorResponse> getErrors() {
        return this.errors;
    }

    public int hashCode() {
        return this.errors.hashCode();
    }

    @NotNull
    public String toString() {
        return "GenericFileUploadErrorResponse(errors=" + this.errors + ")";
    }
}
