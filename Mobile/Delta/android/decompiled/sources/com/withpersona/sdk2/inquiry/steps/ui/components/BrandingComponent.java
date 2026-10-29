package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Branding;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "", "name", "", "showBranding", "contentDescription", "", "lastValueUpdateTs", "<init>", "(Ljava/lang/String;ZLjava/lang/String;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Branding;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Z", "f", "()Z", "c", "d", "J", "R0", "()J", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrandingComponent implements UiComponent {

    @NotNull
    public static final Parcelable.Creator<BrandingComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean showBranding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String contentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BrandingComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrandingComponent(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BrandingComponent[] newArray(int i10) {
            return new BrandingComponent[i10];
        }
    }

    public BrandingComponent(@NotNull String name, boolean z10, @Nullable String str, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.showBranding = z10;
        this.contentDescription = str;
        this.lastValueUpdateTs = j10;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    /* JADX INFO: renamed from: R0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandingComponent)) {
            return false;
        }
        BrandingComponent brandingComponent = (BrandingComponent) other;
        return Intrinsics.c(this.name, brandingComponent.name) && this.showBranding == brandingComponent.showBranding && Intrinsics.c(this.contentDescription, brandingComponent.contentDescription) && this.lastValueUpdateTs == brandingComponent.lastValueUpdateTs;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShowBranding() {
        return this.showBranding;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + Boolean.hashCode(this.showBranding)) * 31;
        String str = this.contentDescription;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @NotNull
    public String toString() {
        return "BrandingComponent(name=" + this.name + ", showBranding=" + this.showBranding + ", contentDescription=" + this.contentDescription + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeInt(this.showBranding ? 1 : 0);
        dest.writeString(this.contentDescription);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ BrandingComponent(String str, boolean z10, String str2, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, str2, (i10 & 8) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BrandingComponent(@NotNull Branding config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        Branding.Attributes attributes = config.getAttributes();
        boolean z10 = !(attributes != null ? Intrinsics.c(attributes.getHideLogo(), Boolean.TRUE) : false);
        Branding.Attributes attributes2 = config.getAttributes();
        this(name, z10, attributes2 != null ? attributes2.getContentDescription() : null, 0L, 8, null);
    }
}
