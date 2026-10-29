package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000b¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/ImageLightCondition;", "Landroid/os/Parcelable;", "", "luminosity", "rmsContrast", "lowHighContrast", "", "sampleSize", "<init>", "(DDDI)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "f", "()D", "b", "g", "c", "d", "I", "getSampleSize", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class ImageLightCondition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImageLightCondition> CREATOR = new C3400a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final double luminosity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final double rmsContrast;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final double lowHighContrast;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int sampleSize;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.ImageLightCondition$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3400a implements Parcelable.Creator<ImageLightCondition> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ImageLightCondition createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImageLightCondition(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ImageLightCondition[] newArray(int i10) {
            return new ImageLightCondition[i10];
        }
    }

    public ImageLightCondition(double d10, double d11, double d12, int i10) {
        this.luminosity = d10;
        this.rmsContrast = d11;
        this.lowHighContrast = d12;
        this.sampleSize = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLowHighContrast() {
        return this.lowHighContrast;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageLightCondition)) {
            return false;
        }
        ImageLightCondition imageLightCondition = (ImageLightCondition) other;
        return Double.compare(this.luminosity, imageLightCondition.luminosity) == 0 && Double.compare(this.rmsContrast, imageLightCondition.rmsContrast) == 0 && Double.compare(this.lowHighContrast, imageLightCondition.lowHighContrast) == 0 && this.sampleSize == imageLightCondition.sampleSize;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getLuminosity() {
        return this.luminosity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getRmsContrast() {
        return this.rmsContrast;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.luminosity) * 31) + Double.hashCode(this.rmsContrast)) * 31) + Double.hashCode(this.lowHighContrast)) * 31) + Integer.hashCode(this.sampleSize);
    }

    @NotNull
    public String toString() {
        return "ImageLightCondition(luminosity=" + this.luminosity + ", rmsContrast=" + this.rmsContrast + ", lowHighContrast=" + this.lowHighContrast + ", sampleSize=" + this.sampleSize + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.luminosity);
        dest.writeDouble(this.rmsContrast);
        dest.writeDouble(this.lowHighContrast);
        dest.writeInt(this.sampleSize);
    }
}
