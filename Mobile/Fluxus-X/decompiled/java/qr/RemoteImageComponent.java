package qr;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qr.t4, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u00102\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lqr/t4;", "Lqr/x5;", "Lqr/h0;", BuildConfig.FLAVOR, "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", BuildConfig.FLAVOR, "lastValueUpdateTs", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;J)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "J", "S0", "()J", BuildConfig.FLAVOR, "Lbs/a;", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemoteImageComponent implements x5, h0 {

    @NotNull
    public static final Parcelable.Creator<RemoteImageComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long lastValueUpdateTs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<bs.a> associatedViews;

    /* JADX INFO: renamed from: qr.t4$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RemoteImageComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RemoteImageComponent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemoteImageComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(RemoteImageComponent.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RemoteImageComponent[] newArray(int i10) {
            return new RemoteImageComponent[i10];
        }
    }

    public RemoteImageComponent(@NotNull String name, @Nullable JsonLogicBoolean jsonLogicBoolean, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.lastValueUpdateTs = j10;
        this.associatedViews = new ArrayList();
    }

    @Override // qr.x5
    /* JADX INFO: renamed from: S0, reason: from getter */
    public long getLastValueUpdateTs() {
        return this.lastValueUpdateTs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteImageComponent)) {
            return false;
        }
        RemoteImageComponent remoteImageComponent = (RemoteImageComponent) other;
        return Intrinsics.c(this.name, remoteImageComponent.name) && Intrinsics.c(this.hidden, remoteImageComponent.hidden) && this.lastValueUpdateTs == remoteImageComponent.lastValueUpdateTs;
    }

    @Override // qr.h0
    @Nullable
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // qr.x5
    @NotNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        return ((iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31) + Long.hashCode(this.lastValueUpdateTs);
    }

    @Override // qr.h0
    @NotNull
    public List<bs.a> i() {
        return this.associatedViews;
    }

    @NotNull
    public String toString() {
        return "RemoteImageComponent(name=" + this.name + ", hidden=" + this.hidden + ", lastValueUpdateTs=" + this.lastValueUpdateTs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeLong(this.lastValueUpdateTs);
    }

    public /* synthetic */ RemoteImageComponent(String str, JsonLogicBoolean jsonLogicBoolean, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, (i10 & 4) != 0 ? 0L : j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteImageComponent(@NotNull RemoteImage config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String name = config.getName();
        RemoteImage.Attributes attributes = config.getAttributes();
        this(name, attributes != null ? attributes.getHidden() : null, 0L, 4, null);
    }
}
