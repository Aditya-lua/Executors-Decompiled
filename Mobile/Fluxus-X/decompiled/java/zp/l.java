package zp;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.j0;
import p001kotlin.collections.k0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00062\u00020\u0001:\u000b\u0006\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lzp/l;", "Landroid/os/Parcelable;", "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "()Ljava/util/Map;", "c", "d", "e", "j", "f", "g", "h", "k", "i", "b", "Lzp/l$a;", "Lzp/l$c;", "Lzp/l$d;", "Lzp/l$e;", "Lzp/l$f;", "Lzp/l$g;", "Lzp/l$h;", "Lzp/l$i;", "Lzp/l$j;", "Lzp/l$k;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class l implements Parcelable {

    /* JADX INFO: renamed from: zp.l$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$a;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChipLocked extends l {

        @NotNull
        public static final Parcelable.Creator<ChipLocked> CREATOR = new C0791a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0791a implements Parcelable.Creator<ChipLocked> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChipLocked createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChipLocked(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChipLocked[] newArray(int i10) {
                return new ChipLocked[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChipLocked(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChipLocked) && Intrinsics.c(this.details, ((ChipLocked) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "ChipLocked(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lzp/l$c;", "Lzp/l;", BuildConfig.FLAVOR, "retriesRemaining", BuildConfig.FLAVOR, "details", "<init>", "(ILjava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "I", "g", "c", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncorrectPasswordLimitedRetries extends l {

        @NotNull
        public static final Parcelable.Creator<IncorrectPasswordLimitedRetries> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int retriesRemaining;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IncorrectPasswordLimitedRetries> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordLimitedRetries createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncorrectPasswordLimitedRetries(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordLimitedRetries[] newArray(int i10) {
                return new IncorrectPasswordLimitedRetries[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectPasswordLimitedRetries(int i10, @NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.retriesRemaining = i10;
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncorrectPasswordLimitedRetries)) {
                return false;
            }
            IncorrectPasswordLimitedRetries incorrectPasswordLimitedRetries = (IncorrectPasswordLimitedRetries) other;
            return this.retriesRemaining == incorrectPasswordLimitedRetries.retriesRemaining && Intrinsics.c(this.details, incorrectPasswordLimitedRetries.details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getRetriesRemaining() {
            return this.retriesRemaining;
        }

        public int hashCode() {
            return (Integer.hashCode(this.retriesRemaining) * 31) + this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "IncorrectPasswordLimitedRetries(retriesRemaining=" + this.retriesRemaining + ", details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.retriesRemaining);
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$d, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$d;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncorrectPasswordUnlimitedRetries extends l {

        @NotNull
        public static final Parcelable.Creator<IncorrectPasswordUnlimitedRetries> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IncorrectPasswordUnlimitedRetries> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordUnlimitedRetries createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncorrectPasswordUnlimitedRetries(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IncorrectPasswordUnlimitedRetries[] newArray(int i10) {
                return new IncorrectPasswordUnlimitedRetries[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectPasswordUnlimitedRetries(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectPasswordUnlimitedRetries) && Intrinsics.c(this.details, ((IncorrectPasswordUnlimitedRetries) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "IncorrectPasswordUnlimitedRetries(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$e, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$e;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidPasswordFormat extends l {

        @NotNull
        public static final Parcelable.Creator<InvalidPasswordFormat> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$e$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InvalidPasswordFormat> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InvalidPasswordFormat createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvalidPasswordFormat(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final InvalidPasswordFormat[] newArray(int i10) {
                return new InvalidPasswordFormat[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidPasswordFormat(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidPasswordFormat) && Intrinsics.c(this.details, ((InvalidPasswordFormat) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "InvalidPasswordFormat(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$f, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$f;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NfcDisabled extends l {

        @NotNull
        public static final Parcelable.Creator<NfcDisabled> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$f$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NfcDisabled> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcDisabled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NfcDisabled(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NfcDisabled[] newArray(int i10) {
                return new NfcDisabled[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcDisabled(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcDisabled) && Intrinsics.c(this.details, ((NfcDisabled) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcDisabled(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$g, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$g;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NfcError extends l {

        @NotNull
        public static final Parcelable.Creator<NfcError> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$g$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NfcError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NfcError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NfcError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final NfcError[] newArray(int i10) {
                return new NfcError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcError(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NfcError) && Intrinsics.c(this.details, ((NfcError) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "NfcError(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$h, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$h;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Timeout extends l {

        @NotNull
        public static final Parcelable.Creator<Timeout> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$h$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Timeout> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Timeout[] newArray(int i10) {
                return new Timeout[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Timeout) && Intrinsics.c(this.details, ((Timeout) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "Timeout(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$i, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$i;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnknownError extends l {

        @NotNull
        public static final Parcelable.Creator<UnknownError> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$i$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UnknownError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnknownError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnknownError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UnknownError[] newArray(int i10) {
                return new UnknownError[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownError(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnknownError) && Intrinsics.c(this.details, ((UnknownError) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnknownError(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    /* JADX INFO: renamed from: zp.l$j, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lzp/l$j;", "Lzp/l;", BuildConfig.FLAVOR, "details", "<init>", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "f", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsupportedVersion extends l {

        @NotNull
        public static final Parcelable.Creator<UnsupportedVersion> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String details;

        /* JADX INFO: renamed from: zp.l$j$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UnsupportedVersion> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UnsupportedVersion createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsupportedVersion(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UnsupportedVersion[] newArray(int i10) {
                return new UnsupportedVersion[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnsupportedVersion(@NotNull String details) {
            super(null);
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnsupportedVersion) && Intrinsics.c(this.details, ((UnsupportedVersion) other).details);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public int hashCode() {
            return this.details.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnsupportedVersion(details=" + this.details + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.details);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzp/l$k;", "Lzp/l;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k extends l {

        @NotNull
        public static final k b = new k();

        @NotNull
        public static final Parcelable.Creator<k> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return k.b;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof k);
        }

        public int hashCode() {
            return -171356450;
        }

        @NotNull
        public String toString() {
            return "UserCancelled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Map<String, String> a() {
        if (this instanceof ChipLocked) {
            return k0.m(zt.s.a("error", "chipLocked"), zt.s.a("details", ((ChipLocked) this).getDetails()));
        }
        if (this instanceof IncorrectPasswordLimitedRetries) {
            IncorrectPasswordLimitedRetries incorrectPasswordLimitedRetries = (IncorrectPasswordLimitedRetries) this;
            return k0.m(zt.s.a("error", "incorrectPasswordLimitedRetries"), zt.s.a("details", incorrectPasswordLimitedRetries.getDetails()), zt.s.a("retriesRemaining", String.valueOf(incorrectPasswordLimitedRetries.getRetriesRemaining())));
        }
        if (this instanceof IncorrectPasswordUnlimitedRetries) {
            return k0.m(zt.s.a("error", "incorrectPasswordUnlimitedRetries"), zt.s.a("details", ((IncorrectPasswordUnlimitedRetries) this).getDetails()));
        }
        if (this instanceof InvalidPasswordFormat) {
            return k0.m(zt.s.a("error", "invalidPasswordFormat"), zt.s.a("details", ((InvalidPasswordFormat) this).getDetails()));
        }
        if (this instanceof UnsupportedVersion) {
            return k0.m(zt.s.a("error", "unsupportedVersion"), zt.s.a("details", ((UnsupportedVersion) this).getDetails()));
        }
        if (this instanceof NfcDisabled) {
            return k0.m(zt.s.a("error", "nfcDisabled"), zt.s.a("details", ((NfcDisabled) this).getDetails()));
        }
        if (this instanceof NfcError) {
            return k0.m(zt.s.a("error", "nfcError"), zt.s.a("details", ((NfcError) this).getDetails()));
        }
        if (this instanceof Timeout) {
            return k0.m(zt.s.a("error", "timeout"), zt.s.a("details", ((Timeout) this).getDetails()));
        }
        if (Intrinsics.c(this, k.b)) {
            return j0.g(zt.s.a("error", "userCancelled"));
        }
        if (this instanceof UnknownError) {
            return k0.m(zt.s.a("error", "unknownError"), zt.s.a("details", ((UnknownError) this).getDetails()));
        }
        throw new zt.l();
    }

    public l() {
    }
}
