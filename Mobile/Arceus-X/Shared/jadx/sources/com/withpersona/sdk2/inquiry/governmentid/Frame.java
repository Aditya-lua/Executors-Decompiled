package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "Landroid/os/Parcelable;", "", "absoluteFilePath", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class Frame implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Frame> CREATOR = new C3482a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String absoluteFilePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String mimeType;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.Frame$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3482a implements Parcelable.Creator<Frame> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Frame createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Frame(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Frame[] newArray(int i10) {
            return new Frame[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Frame(@NotNull String absoluteFilePath, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.absoluteFilePath = absoluteFilePath;
        this.mimeType = mimeType;
    }

    @NotNull
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
        if (!(other instanceof Frame)) {
            return false;
        }
        Frame frame = (Frame) other;
        return Intrinsics.m31980c(this.absoluteFilePath, frame.absoluteFilePath) && Intrinsics.m31980c(this.mimeType, frame.mimeType);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        return (this.absoluteFilePath.hashCode() * 31) + this.mimeType.hashCode();
    }

    @NotNull
    public String toString() {
        return "Frame(absoluteFilePath=" + this.absoluteFilePath + ", mimeType=" + this.mimeType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.absoluteFilePath);
        dest.writeString(this.mimeType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Frame(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String fileExtensionFromUrl;
        if ((i10 & 2) != 0 && ((fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str)) == null || (str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null)) {
            str2 = "image/*";
        }
        this(str, str2);
    }
}
