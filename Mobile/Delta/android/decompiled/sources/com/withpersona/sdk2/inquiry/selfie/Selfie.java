package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0005\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "Landroid/os/Parcelable;", "<init>", "()V", "", "a", "()Ljava/lang/String;", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "f", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "SelfieImage", "SelfieVideo", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Selfie implements Parcelable {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u0017¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "Lkn/a;", "pose", "", "capturedTimestamp", "token", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lkn/a;JLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "f", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "c", "Lkn/a;", "i", "()Lkn/a;", "d", "J", "g", "()J", "e", "j", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieImage extends Selfie {

        @NotNull
        public static final Parcelable.Creator<SelfieImage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final a captureMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final kn.a pose;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        public final long capturedTimestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String token;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieImage(parcel.readString(), a.valueOf(parcel.readString()), kn.a.valueOf(parcel.readString()), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieImage[] newArray(int i10) {
                return new SelfieImage[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieImage(@NotNull String absoluteFilePath, @NotNull a captureMethod, @NotNull kn.a pose, long j10, @Nullable String str) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            Intrinsics.checkNotNullParameter(pose, "pose");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
            this.pose = pose;
            this.capturedTimestamp = j10;
            this.token = str;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAbsoluteFilePath() {
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
            if (!(other instanceof SelfieImage)) {
                return false;
            }
            SelfieImage selfieImage = (SelfieImage) other;
            return Intrinsics.c(this.absoluteFilePath, selfieImage.absoluteFilePath) && this.captureMethod == selfieImage.captureMethod && this.pose == selfieImage.pose && this.capturedTimestamp == selfieImage.capturedTimestamp && Intrinsics.c(this.token, selfieImage.token);
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final long getCapturedTimestamp() {
            return this.capturedTimestamp;
        }

        public int hashCode() {
            int iHashCode = ((((((this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode()) * 31) + this.pose.hashCode()) * 31) + Long.hashCode(this.capturedTimestamp)) * 31;
            String str = this.token;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final kn.a getPose() {
            return this.pose;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public String toString() {
            return "SelfieImage(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ", pose=" + this.pose + ", capturedTimestamp=" + this.capturedTimestamp + ", token=" + this.token + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
            dest.writeString(this.pose.name());
            dest.writeLong(this.capturedTimestamp);
            dest.writeString(this.token);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "", "absoluteFilePath", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "captureMethod", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "f", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieVideo extends Selfie {

        @NotNull
        public static final Parcelable.Creator<SelfieVideo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final a captureMethod;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieVideo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieVideo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieVideo(parcel.readString(), a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieVideo[] newArray(int i10) {
                return new SelfieVideo[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfieVideo(@NotNull String absoluteFilePath, @NotNull a captureMethod) {
            super(null);
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
            this.absoluteFilePath = absoluteFilePath;
            this.captureMethod = captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAbsoluteFilePath() {
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
            if (!(other instanceof SelfieVideo)) {
                return false;
            }
            SelfieVideo selfieVideo = (SelfieVideo) other;
            return Intrinsics.c(this.absoluteFilePath, selfieVideo.absoluteFilePath) && this.captureMethod == selfieVideo.captureMethod;
        }

        @Override // com.withpersona.sdk2.inquiry.selfie.Selfie
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public a getCaptureMethod() {
            return this.captureMethod;
        }

        public int hashCode() {
            return (this.absoluteFilePath.hashCode() * 31) + this.captureMethod.hashCode();
        }

        @NotNull
        public String toString() {
            return "SelfieVideo(absoluteFilePath=" + this.absoluteFilePath + ", captureMethod=" + this.captureMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.absoluteFilePath);
            dest.writeString(this.captureMethod.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;", "", "", "method", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        AUTO("auto"),
        MANUAL("manual");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f12414e = qt.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String method;

        a(String str) {
            this.method = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMethod() {
            return this.method;
        }
    }

    public /* synthetic */ Selfie(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String getAbsoluteFilePath();

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract a getCaptureMethod();

    public Selfie() {
    }
}
