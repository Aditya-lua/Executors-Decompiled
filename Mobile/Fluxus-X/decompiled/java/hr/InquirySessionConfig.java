package hr;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hr.g, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006,"}, d2 = {"Lhr/g;", "Landroid/os/Parcelable;", "Lhr/a;", "gpsCollectionRequirement", "Lhr/e;", "gpsPrecisionRequirement", BuildConfig.FLAVOR, "usePlayIntegrity", "<init>", "(Lhr/a;Lhr/e;Z)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhr/a;", "f", "()Lhr/a;", "b", "Lhr/e;", "g", "()Lhr/e;", "c", "Z", "i", "()Z", "j", "isDefault", "k", "isGpsRequired", "d", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InquirySessionConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final a gpsCollectionRequirement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final e gpsPrecisionRequirement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean usePlayIntegrity;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<InquirySessionConfig> CREATOR = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final InquirySessionConfig f18546e = new InquirySessionConfig(a.NONE, e.PRECISE, false);

    /* JADX INFO: renamed from: hr.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhr/g$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lhr/g;", "Default", "Lhr/g;", "a", "()Lhr/g;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InquirySessionConfig a() {
            return InquirySessionConfig.f18546e;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: hr.g$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<InquirySessionConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InquirySessionConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InquirySessionConfig(a.CREATOR.createFromParcel(parcel), e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InquirySessionConfig[] newArray(int i10) {
            return new InquirySessionConfig[i10];
        }
    }

    public InquirySessionConfig(@NotNull a gpsCollectionRequirement, @NotNull e gpsPrecisionRequirement, boolean z10) {
        Intrinsics.checkNotNullParameter(gpsCollectionRequirement, "gpsCollectionRequirement");
        Intrinsics.checkNotNullParameter(gpsPrecisionRequirement, "gpsPrecisionRequirement");
        this.gpsCollectionRequirement = gpsCollectionRequirement;
        this.gpsPrecisionRequirement = gpsPrecisionRequirement;
        this.usePlayIntegrity = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquirySessionConfig)) {
            return false;
        }
        InquirySessionConfig inquirySessionConfig = (InquirySessionConfig) other;
        return this.gpsCollectionRequirement == inquirySessionConfig.gpsCollectionRequirement && this.gpsPrecisionRequirement == inquirySessionConfig.gpsPrecisionRequirement && this.usePlayIntegrity == inquirySessionConfig.usePlayIntegrity;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getGpsCollectionRequirement() {
        return this.gpsCollectionRequirement;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getGpsPrecisionRequirement() {
        return this.gpsPrecisionRequirement;
    }

    public int hashCode() {
        return (((this.gpsCollectionRequirement.hashCode() * 31) + this.gpsPrecisionRequirement.hashCode()) * 31) + Boolean.hashCode(this.usePlayIntegrity);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getUsePlayIntegrity() {
        return this.usePlayIntegrity;
    }

    public final boolean j() {
        return this == f18546e;
    }

    public final boolean k() {
        return this.gpsCollectionRequirement == a.REQUIRED;
    }

    @NotNull
    public String toString() {
        return "InquirySessionConfig(gpsCollectionRequirement=" + this.gpsCollectionRequirement + ", gpsPrecisionRequirement=" + this.gpsPrecisionRequirement + ", usePlayIntegrity=" + this.usePlayIntegrity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.gpsCollectionRequirement.writeToParcel(dest, flags);
        this.gpsPrecisionRequirement.writeToParcel(dest, flags);
        dest.writeInt(this.usePlayIntegrity ? 1 : 0);
    }
}
