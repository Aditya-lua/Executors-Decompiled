package no;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lno/e;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "b", "Lno/e$a;", "Lno/e$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class e implements Parcelable {

    /* JADX INFO: renamed from: no.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010¨\u0006%"}, d2 = {"Lno/e$a;", "Lno/e;", BuildConfig.FLAVOR, "absoluteFilePath", "Lno/a;", "captureMethod", BuildConfig.FLAVOR, "uploadProgress", "<init>", "(Ljava/lang/String;Lno/a;I)V", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "(Ljava/lang/String;Lno/a;I)Lno/e$a;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "g", "b", "Lno/a;", "i", "()Lno/a;", "c", "I", "j", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Local extends e {

        @NotNull
        public static final Parcelable.Creator<Local> CREATOR = new C0513a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final a captureMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final int uploadProgress;

        /* JADX INFO: renamed from: no.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0513a implements Parcelable.Creator<Local> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Local createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Local(parcel.readString(), a.CREATOR.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Local[] newArray(int i10) {
                return new Local[i10];
            }
        }

        public /* synthetic */ Local(String str, a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, (i11 & 4) != 0 ? 0 : i10);
        }

        public static /* synthetic */ Local f(Local local, String str, a aVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = local.absoluteFilePath;
            }
            if ((i11 & 2) != 0) {
                aVar = local.captureMethod;
            }
            if ((i11 & 4) != 0) {
                i10 = local.uploadProgress;
            }
            return local.a(str, aVar, i10);
        }

        @NotNull
        public final Local a(@NotNull String absoluteFilePath, @NotNull a captureMethod, int uploadProgress) {
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
            if (!Intrinsics.c(Local.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.d(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.DocumentFile.Local");
            return Intrinsics.c(this.absoluteFilePath, ((Local) other).absoluteFilePath);
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
        public final a getCaptureMethod() {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Local(@NotNull String absoluteFilePath, @NotNull a captureMethod, int i10) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.uploadProgress = i10;
        }
    }

    /* JADX INFO: renamed from: no.e$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"Lno/e$b;", "Lno/e;", BuildConfig.FLAVOR, "absoluteFilePath", "filename", "remoteUrl", "documentFileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "g", "c", "i", "d", "f", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Remote extends e {

        @NotNull
        public static final Parcelable.Creator<Remote> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String filename;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String remoteUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String documentFileId;

        /* JADX INFO: renamed from: no.e$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Remote> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Remote createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

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
            return Intrinsics.c(this.absoluteFilePath, remote.absoluteFilePath) && Intrinsics.c(this.filename, remote.filename) && Intrinsics.c(this.remoteUrl, remote.remoteUrl) && Intrinsics.c(this.documentFileId, remote.documentFileId);
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

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public e() {
    }
}
