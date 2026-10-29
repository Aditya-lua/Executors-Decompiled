package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/Relationships;", "Landroid/os/Parcelable;", "device", "Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;", "inquiry", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;)V", "getDevice", "()Lcom/withpersona/sdk2/inquiry/network/dto/Relationship;", "getInquiry", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class Relationships implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Relationships> CREATOR = new Creator();

    @Nullable
    private final Relationship device;

    @Nullable
    private final Relationship inquiry;

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<Relationships> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Relationships createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Relationships(parcel.readInt() == 0 ? null : Relationship.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Relationship.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Relationships[] newArray(int i10) {
            return new Relationships[i10];
        }
    }

    public Relationships(@Nullable Relationship relationship, @Nullable Relationship relationship2) {
        this.device = relationship;
        this.inquiry = relationship2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    public final Relationship getDevice() {
        return this.device;
    }

    @Nullable
    public final Relationship getInquiry() {
        return this.inquiry;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Relationship relationship = this.device;
        if (relationship == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            relationship.writeToParcel(dest, flags);
        }
        Relationship relationship2 = this.inquiry;
        if (relationship2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            relationship2.writeToParcel(dest, flags);
        }
    }
}
