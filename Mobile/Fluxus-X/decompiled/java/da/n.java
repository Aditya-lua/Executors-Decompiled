package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum n implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);


    @NonNull
    public static final Parcelable.Creator<n> CREATOR = new Parcelable.Creator() { // from class: da.c2
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return n.k(parcel.readInt());
            } catch (n.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new n[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12080a;

    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    n(int i10) {
        this.f12080a = i10;
    }

    @NonNull
    public static n k(int i10) throws a {
        for (n nVar : values()) {
            if (i10 == nVar.f12080a) {
                return nVar;
            }
        }
        throw new a(i10);
    }

    public int a() {
        return this.f12080a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f12080a);
    }
}
