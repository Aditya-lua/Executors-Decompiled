package zp;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.j0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000f\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzp/o;", "Landroid/os/Parcelable;", "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "g", "()Ljava/util/Map;", "Lzp/b;", "f", "()Lzp/b;", "operation", "a", "()Ljava/lang/String;", "nonce", "b", "Lzp/o$a;", "Lzp/o$b;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class o implements Parcelable {

    /* JADX INFO: renamed from: zp.o$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lzp/o$a;", "Lzp/o;", "Lzp/b;", "operation", BuildConfig.FLAVOR, "nonce", "Lzp/l;", "error", "<init>", "(Lzp/b;Ljava/lang/String;Lzp/l;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/b;", "f", "()Lzp/b;", "b", "Ljava/lang/String;", "c", "Lzp/l;", "i", "()Lzp/l;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure extends o {

        @NotNull
        public static final Parcelable.Creator<Failure> CREATOR = new C0792a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final b operation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String nonce;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final l error;

        /* JADX INFO: renamed from: zp.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0792a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failure createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failure(b.valueOf(parcel.readString()), parcel.readString(), (l) parcel.readParcelable(Failure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failure[] newArray(int i10) {
                return new Failure[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull b operation, @Nullable String str, @NotNull l error) {
            super(null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(error, "error");
            this.operation = operation;
            this.nonce = str;
            this.error = error;
        }

        @Override // zp.o
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getNonce() {
            return this.nonce;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.operation == failure.operation && Intrinsics.c(this.nonce, failure.nonce) && Intrinsics.c(this.error, failure.error);
        }

        @Override // zp.o
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public b getOperation() {
            return this.operation;
        }

        public int hashCode() {
            int iHashCode = this.operation.hashCode() * 31;
            String str = this.nonce;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.error.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final l getError() {
            return this.error;
        }

        @NotNull
        public String toString() {
            return "Failure(operation=" + this.operation + ", nonce=" + this.nonce + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.operation.name());
            dest.writeString(this.nonce);
            dest.writeParcelable(this.error, flags);
        }
    }

    /* JADX INFO: renamed from: zp.o$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lzp/o$b;", "Lzp/o;", "Lzp/b;", "operation", BuildConfig.FLAVOR, "nonce", "Lzp/k;", "data", "<init>", "(Lzp/b;Ljava/lang/String;Lzp/k;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lzp/b;", "f", "()Lzp/b;", "b", "Ljava/lang/String;", "c", "Lzp/k;", "i", "()Lzp/k;", "jp-my-number_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends o {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final b operation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String nonce;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final k data;

        /* JADX INFO: renamed from: zp.o$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(b.valueOf(parcel.readString()), parcel.readString(), (k) parcel.readParcelable(Success.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Success[] newArray(int i10) {
                return new Success[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull b operation, @Nullable String str, @NotNull k data) {
            super(null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(data, "data");
            this.operation = operation;
            this.nonce = str;
            this.data = data;
        }

        @Override // zp.o
        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getNonce() {
            return this.nonce;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this.operation == success.operation && Intrinsics.c(this.nonce, success.nonce) && Intrinsics.c(this.data, success.data);
        }

        @Override // zp.o
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public b getOperation() {
            return this.operation;
        }

        public int hashCode() {
            int iHashCode = this.operation.hashCode() * 31;
            String str = this.nonce;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final k getData() {
            return this.data;
        }

        @NotNull
        public String toString() {
            return "Success(operation=" + this.operation + ", nonce=" + this.nonce + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.operation.name());
            dest.writeString(this.nonce);
            dest.writeParcelable(this.data, flags);
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract String getNonce();

    @NotNull
    /* JADX INFO: renamed from: f */
    public abstract b getOperation();

    @NotNull
    public final Map<String, String> g() {
        Map mapD = j0.d();
        mapD.put("operation", getOperation().getRawValue());
        String nonce = getNonce();
        if (nonce != null) {
        }
        if (this instanceof Success) {
            mapD.putAll(((Success) this).getData().m2());
        } else {
            if (!(this instanceof Failure)) {
                throw new zt.l();
            }
            mapD.putAll(((Failure) this).getError().a());
        }
        return j0.c(mapD);
    }

    public o() {
    }
}
