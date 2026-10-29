package com.withpersona.sdk2.inquiry.p057ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "error", "", "timestamp", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;J)V", "lastFieldUpdateTs", "a", "(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "b", "J", "getTimestamp", "()J", "", "getName", "()Ljava/lang/String;", "name", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class UiComponentErrorInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UiComponentErrorInfo> CREATOR = new C4132a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UiComponentError error;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long timestamp;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C4132a implements Parcelable.Creator<UiComponentErrorInfo> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiComponentErrorInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiComponentErrorInfo((UiComponentError) parcel.readParcelable(UiComponentErrorInfo.class.getClassLoader()), parcel.readLong());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UiComponentErrorInfo[] newArray(int i10) {
            return new UiComponentErrorInfo[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UiComponentErrorInfo(@NotNull UiComponentError error, long j10) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.timestamp = j10;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final UiComponentError m20987a(long lastFieldUpdateTs) {
        if (lastFieldUpdateTs > this.timestamp) {
            return null;
        }
        return this.error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String getName() {
        return this.error.getName();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.error, flags);
        dest.writeLong(this.timestamp);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (r1v0 com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError)
      (wrap long:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:4)) : (r2v0 long))
     A[MD:(com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError, long):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo.<init>(com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError, long):void type: THIS */
    public /* synthetic */ UiComponentErrorInfo(UiComponentError uiComponentError, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiComponentError, (i10 & 2) != 0 ? System.currentTimeMillis() : j10);
    }
}
