package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000eR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u000eR\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010'¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties;", "Landroid/os/Parcelable;", "", "label", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "Landroid/util/Size;", "size", "", "frameRate", "rotation", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "f", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "c", "Landroid/util/Size;", "k", "()Landroid/util/Size;", "d", "I", "g", "e", "j", "", "()D", "aspectRatio", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraProperties implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CameraProperties> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b facingMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int frameRate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int rotation;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CameraProperties> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CameraProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraProperties(parcel.readString(), b.valueOf(parcel.readString()), parcel.readSize(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CameraProperties[] newArray(int i10) {
            return new CameraProperties[i10];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/camera/CameraProperties$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        User,
        Environment,
        Unknown;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f9911e = qt.b.a(a());
    }

    public CameraProperties() {
        this(null, null, null, 0, 0, 31, null);
    }

    public final double a() {
        if (this.size.getHeight() == 0) {
            return 0.0d;
        }
        return ((double) this.size.getWidth()) / ((double) this.size.getHeight());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getFacingMode() {
        return this.facingMode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.label);
        dest.writeString(this.facingMode.name());
        dest.writeSize(this.size);
        dest.writeInt(this.frameRate);
        dest.writeInt(this.rotation);
    }

    public CameraProperties(@NotNull String label, @NotNull b facingMode, @NotNull Size size, int i10, int i11) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        Intrinsics.checkNotNullParameter(size, "size");
        this.label = label;
        this.facingMode = facingMode;
        this.size = size;
        this.frameRate = i10;
        this.rotation = i11;
    }

    public /* synthetic */ CameraProperties(String str, b bVar, Size size, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? b.Unknown : bVar, (i12 & 4) != 0 ? new Size(0, 0) : size, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
    }
}
