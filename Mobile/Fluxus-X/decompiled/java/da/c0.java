package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum c0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");


    @NonNull
    public static final Parcelable.Creator<c0> CREATOR = new Parcelable.Creator() { // from class: da.g1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return c0.a(parcel.readString());
            } catch (h1 e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new c0[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f12003a;

    c0(String str) {
        this.f12003a = str;
    }

    @NonNull
    public static c0 a(@NonNull String str) throws h1 {
        for (c0 c0Var : values()) {
            if (str.equals(c0Var.f12003a)) {
                return c0Var;
            }
        }
        throw new h1(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return this.f12003a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f12003a);
    }
}
