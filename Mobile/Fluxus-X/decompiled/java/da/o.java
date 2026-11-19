package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class o extends p9.a {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new d2();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f12083f;

    public o(@NonNull String str) {
        this.f12083f = (String) o9.s.l(str);
    }

    @NonNull
    public String A3() {
        return this.f12083f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f12083f.equals(((o) obj).f12083f);
        }
        return false;
    }

    public int hashCode() {
        return o9.q.c(this.f12083f);
    }

    @NonNull
    public final String toString() {
        return "FidoAppIdExtension{appid='" + this.f12083f + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, A3(), false);
        p9.c.b(parcel, iA);
    }
}
