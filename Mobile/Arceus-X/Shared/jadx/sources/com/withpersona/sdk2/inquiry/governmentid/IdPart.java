package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "Landroid/os/Parcelable;", "<init>", "()V", "SideIdPart", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class IdPart implements Parcelable {

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class SideIdPart extends IdPart {

        @NotNull
        public static final Parcelable.Creator<SideIdPart> CREATOR = new C3516a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdConfig.EnumC3514b side;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.IdPart$SideIdPart$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3516a implements Parcelable.Creator<SideIdPart> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SideIdPart createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SideIdPart(IdConfig.EnumC3514b.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SideIdPart[] newArray(int i10) {
                return new SideIdPart[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SideIdPart(@NotNull IdConfig.EnumC3514b side) {
            super(null);
            Intrinsics.checkNotNullParameter(side, "side");
            this.side = side;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdConfig.EnumC3514b getSide() {
            return this.side;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SideIdPart) && this.side == ((SideIdPart) other).side;
        }

        public int hashCode() {
            return this.side.hashCode();
        }

        @NotNull
        public String toString() {
            return "SideIdPart(side=" + this.side + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.side.name());
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.IdPart.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ IdPart(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public IdPart() {
    }
}
