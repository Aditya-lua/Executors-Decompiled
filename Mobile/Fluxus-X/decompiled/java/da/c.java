package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;

/* JADX INFO: loaded from: classes.dex */
public enum c implements Parcelable {
    NONE(PayloadNotificationChannel.SOUND_NONE),
    INDIRECT("indirect"),
    DIRECT("direct");


    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator() { // from class: da.e1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return c.a(parcel.readString());
            } catch (c.a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f11999a;

    public static class a extends Exception {
        public a(@NonNull String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    c(String str) {
        this.f11999a = str;
    }

    @NonNull
    public static c a(@NonNull String str) throws a {
        for (c cVar : values()) {
            if (str.equals(cVar.f11999a)) {
                return cVar;
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
        return this.f11999a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f11999a);
    }
}
