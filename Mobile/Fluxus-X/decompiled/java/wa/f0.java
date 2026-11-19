package wa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p9.a implements w8.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f35702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f35703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f35704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f35705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f35706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f35707k;

    public f0(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.f35702f = str;
        this.f35703g = str2;
        this.f35704h = str3;
        this.f35705i = str4;
        this.f35706j = str5;
        if (bundle != null) {
            this.f35707k = bundle;
        } else {
            this.f35707k = Bundle.EMPTY;
        }
        ClassLoader classLoader = f0.class.getClassLoader();
        u.a(classLoader);
        this.f35707k.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActionImpl { { actionType: '");
        sb2.append(this.f35702f);
        sb2.append("' } { objectName: '");
        sb2.append(this.f35703g);
        sb2.append("' } { objectUrl: '");
        sb2.append(this.f35704h);
        sb2.append("' } ");
        if (this.f35705i != null) {
            sb2.append("{ objectSameAs: '");
            sb2.append(this.f35705i);
            sb2.append("' } ");
        }
        if (this.f35706j != null) {
            sb2.append("{ actionStatus: '");
            sb2.append(this.f35706j);
            sb2.append("' } ");
        }
        if (!this.f35707k.isEmpty()) {
            sb2.append("{ ");
            sb2.append(this.f35707k);
            sb2.append(" } ");
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, this.f35702f, false);
        p9.c.v(parcel, 2, this.f35703g, false);
        p9.c.v(parcel, 3, this.f35704h, false);
        p9.c.v(parcel, 4, this.f35705i, false);
        p9.c.v(parcel, 6, this.f35706j, false);
        p9.c.f(parcel, 7, this.f35707k, false);
        p9.c.b(parcel, iA);
    }
}
