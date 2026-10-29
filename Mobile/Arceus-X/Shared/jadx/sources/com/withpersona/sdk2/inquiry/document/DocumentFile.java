package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "Landroid/os/Parcelable;", "<init>", "()V", "Local", "Remote", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class DocumentFile implements Parcelable {

    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "captureMethod", "", "uploadProgress", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;I)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "g", "b", "Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "i", "()Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;", "c", "I", "j", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Local extends DocumentFile {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new C3413a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final CaptureMethod captureMethod;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final int uploadProgress;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentFile$Local$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3413a implements Parcelable.Creator<Local> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Local createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString(), CaptureMethod.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Local[] newArray(int i10) {
                return new Local[i10];
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 com.withpersona.sdk2.inquiry.document.CaptureMethod)
          (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.document.CaptureMethod, int):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentFile.Local.<init>(java.lang.String, com.withpersona.sdk2.inquiry.document.CaptureMethod, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Local(String str, CaptureMethod captureMethod, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, captureMethod, (i11 & 4) != 0 ? 0 : i10);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ Local m16255f(Local local, String str, CaptureMethod captureMethod, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = local.absoluteFilePath;
            }
            if ((i11 & 2) != 0) {
                captureMethod = local.captureMethod;
            }
            if ((i11 & 4) != 0) {
                i10 = local.uploadProgress;
            }
            return local.m16256a(str, captureMethod, i10);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Local m16256a(@NotNull String absoluteFilePath, @NotNull CaptureMethod captureMethod, int uploadProgress) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            return new Local(absoluteFilePath, captureMethod, uploadProgress);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.m31980c(Local.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.m31981d(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
            return Intrinsics.m31980c(this.absoluteFilePath, ((Local) other).absoluteFilePath);
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        public int hashCode() {
            return this.absoluteFilePath.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final CaptureMethod getCaptureMethod() {
            return this.captureMethod;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final int getUploadProgress() {
            return this.uploadProgress;
        }

        @NotNull
        public String toString() {
            return "Local(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", uploadProgress=" + this.uploadProgress + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            this.captureMethod.writeToParcel(dest, flags);
            dest.writeInt(this.uploadProgress);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(@NotNull String absoluteFilePath, @NotNull CaptureMethod captureMethod, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.uploadProgress = i10;
        }
    }

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u0013¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;", "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;", "", "absoluteFilePath", "filename", "remoteUrl", "documentFileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "g", "c", "i", "d", "f", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Remote extends DocumentFile {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new C3414a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String filename;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String remoteUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String documentFileId;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentFile$Remote$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3414a implements Parcelable.Creator<Remote> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Remote createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Remote[] newArray(int i10) {
                return new Remote[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(@Nullable String str, @Nullable String str2, @NotNull String remoteUrl, @NotNull String documentFileId) {
            super(null);
            Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
            Intrinsics.checkNotNullParameter(documentFileId, "documentFileId");
            this.absoluteFilePath = str;
            this.filename = str2;
            this.remoteUrl = remoteUrl;
            this.documentFileId = documentFileId;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.m31980c(this.absoluteFilePath, remote.absoluteFilePath) && Intrinsics.m31980c(this.filename, remote.filename) && Intrinsics.m31980c(this.remoteUrl, remote.remoteUrl) && Intrinsics.m31980c(this.documentFileId, remote.documentFileId);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentFileId() {
            return this.documentFileId;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        public int hashCode() {
            String str = this.absoluteFilePath;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.filename;
            return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.remoteUrl.hashCode()) * 31) + this.documentFileId.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getRemoteUrl() {
            return this.remoteUrl;
        }

        @NotNull
        public String toString() {
            return "Remote(absoluteFilePath=" + this.absoluteFilePath + ", filename=" + this.filename + ", remoteUrl=" + this.remoteUrl + ", documentFileId=" + this.documentFileId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.filename);
            dest.writeString(this.remoteUrl);
            dest.writeString(this.documentFileId);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentFile.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ DocumentFile(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public DocumentFile() {
    }
}
