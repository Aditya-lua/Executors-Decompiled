package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import hn.f;
import hn.h;
import hn.i;
import hn.m;
import hn.t;
import hn.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bj\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "ROUGH", "PRECISE", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = false)
public enum GpsPrecisionRequirement implements Parcelable {
    ROUGH,
    PRECISE;

    private static final /* synthetic */ hu.a $ENTRIES = hu.b.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GpsPrecisionRequirement> CREATOR = new Parcelable.Creator<GpsPrecisionRequirement>() { // from class: com.withpersona.sdk2.inquiry.network.dto.GpsPrecisionRequirement.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsPrecisionRequirement createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return GpsPrecisionRequirement.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsPrecisionRequirement[] newArray(int i10) {
            return new GpsPrecisionRequirement[i10];
        }
    };

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement$Companion;", "Lhn/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "<init>", "()V", "Lhn/m;", "reader", "fromJson", "(Lhn/m;)Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;", "Lhn/t;", "writer", "value", BuildConfig.FLAVOR, "toJson", "(Lhn/t;Lcom/withpersona/sdk2/inquiry/network/dto/GpsPrecisionRequirement;)V", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends h<GpsPrecisionRequirement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // hn.h
        @z
        public void toJson(@NotNull t writer, @Nullable GpsPrecisionRequirement value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // hn.h
        @f
        @NotNull
        public GpsPrecisionRequirement fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Intrinsics.c(reader.E(), "rough") ? GpsPrecisionRequirement.ROUGH : GpsPrecisionRequirement.PRECISE;
        }
    }

    @NotNull
    public static hu.a<GpsPrecisionRequirement> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
