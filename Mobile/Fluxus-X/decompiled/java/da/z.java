package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public enum z implements Parcelable {
    RESIDENT_KEY_DISCOURAGED("discouraged"),
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");


    @NonNull
    public static final Parcelable.Creator<z> CREATOR = new Parcelable.Creator() { // from class: da.z0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            if (string == null) {
                string = BuildConfig.FLAVOR;
            }
            try {
                return z.a(string);
            } catch (z.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new z[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f12161a;

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("Resident key requirement %s not supported", str));
        }
    }

    z(String str) {
        this.f12161a = str;
    }

    @NonNull
    public static z a(@NonNull String str) throws a {
        for (z zVar : values()) {
            if (str.equals(zVar.f12161a)) {
                return zVar;
            }
        }
        throw new a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f12161a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f12161a);
    }
}
