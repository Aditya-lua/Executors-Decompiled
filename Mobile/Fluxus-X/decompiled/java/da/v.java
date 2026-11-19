package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum v implements Parcelable {
    PUBLIC_KEY("public-key");


    @NonNull
    public static final Parcelable.Creator<v> CREATOR = new Parcelable.Creator() { // from class: da.x0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return v.a(parcel.readString());
            } catch (v.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new v[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f12139a = "public-key";

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(str);
        }
    }

    v(String str) {
    }

    @NonNull
    public static v a(@NonNull String str) throws a {
        for (v vVar : values()) {
            if (str.equals(vVar.f12139a)) {
                return vVar;
            }
        }
        throw new a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f12139a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f12139a);
    }
}
