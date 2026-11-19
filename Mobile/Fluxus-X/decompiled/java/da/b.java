package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");


    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator() { // from class: da.f0
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return b.a(parcel.readString());
            } catch (b.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f11994a;

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    b(String str) {
        this.f11994a = str;
    }

    @NonNull
    public static b a(@NonNull String str) throws a {
        for (b bVar : values()) {
            if (str.equals(bVar.f11994a)) {
                return bVar;
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
        return this.f11994a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f11994a);
    }
}
