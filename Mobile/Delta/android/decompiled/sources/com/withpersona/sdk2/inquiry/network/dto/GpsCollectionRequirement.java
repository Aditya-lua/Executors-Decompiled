package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.f;
import sm.h;
import sm.i;
import sm.m;
import sm.t;
import sm.z;

/* JADX INFO: loaded from: classes3.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRE", "OPTIONAL", "NONE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum GpsCollectionRequirement implements Parcelable {
    REQUIRE,
    OPTIONAL,
    NONE;

    private static final /* synthetic */ ot.a $ENTRIES = ot.b.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GpsCollectionRequirement> CREATOR = new Parcelable.Creator<GpsCollectionRequirement>() { // from class: com.withpersona.sdk2.inquiry.network.dto.GpsCollectionRequirement.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsCollectionRequirement createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return GpsCollectionRequirement.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GpsCollectionRequirement[] newArray(int i10) {
            return new GpsCollectionRequirement[i10];
        }
    };

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement$Companion;", "Lsm/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "<init>", "()V", "Lsm/m;", "reader", "fromJson", "(Lsm/m;)Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;", "Lsm/t;", "writer", "value", "", "toJson", "(Lsm/t;Lcom/withpersona/sdk2/inquiry/network/dto/GpsCollectionRequirement;)V", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion extends h<GpsCollectionRequirement> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // sm.h
        @z
        public void toJson(@NotNull t writer, @Nullable GpsCollectionRequirement value) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sm.h
        @f
        @NotNull
        public GpsCollectionRequirement fromJson(@NotNull m reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            Object objA = reader.A();
            if (Intrinsics.c(objA, "require")) {
                return GpsCollectionRequirement.REQUIRE;
            }
            return Intrinsics.c(objA, "optional") ? GpsCollectionRequirement.OPTIONAL : GpsCollectionRequirement.NONE;
        }
    }

    @NotNull
    public static ot.a<GpsCollectionRequirement> getEntries() {
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
