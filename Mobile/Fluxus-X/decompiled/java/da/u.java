package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class u extends p9.a {

    @NonNull
    public static final Parcelable.Creator<u> CREATOR = new w0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final String f12135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final String f12136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f12137h;

    public u(@NonNull String str, @NonNull String str2, String str3) {
        this.f12135f = (String) o9.s.l(str);
        this.f12136g = (String) o9.s.l(str2);
        this.f12137h = str3;
    }

    public String A3() {
        return this.f12137h;
    }

    @NonNull
    public String B3() {
        return this.f12135f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return o9.q.b(this.f12135f, uVar.f12135f) && o9.q.b(this.f12136g, uVar.f12136g) && o9.q.b(this.f12137h, uVar.f12137h);
    }

    @NonNull
    public String getName() {
        return this.f12136g;
    }

    public int hashCode() {
        return o9.q.c(this.f12135f, this.f12136g, this.f12137h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialRpEntity{\n id='" + this.f12135f + "', \n name='" + this.f12136g + "', \n icon='" + this.f12137h + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, B3(), false);
        p9.c.v(parcel, 3, getName(), false);
        p9.c.v(parcel, 4, A3(), false);
        p9.c.b(parcel, iA);
    }
}
