package la;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p9.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PersistableBundle f22028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f22029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f22030i;

    public h(String str, PersistableBundle persistableBundle, Boolean bool, Boolean bool2) {
        this.f22027f = str;
        this.f22028g = persistableBundle;
        this.f22029h = bool;
        this.f22030i = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22027f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.t(parcel, 2, this.f22028g, i10, false);
        p9.c.e(parcel, 3, this.f22029h, false);
        p9.c.e(parcel, 4, this.f22030i, false);
        p9.c.b(parcel, iA);
    }

    public final String zza() {
        return this.f22027f;
    }
}
