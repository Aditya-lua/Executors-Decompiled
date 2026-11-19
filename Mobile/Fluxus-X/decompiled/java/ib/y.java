package ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends p9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mb.b0 f19346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<o9.e> f19347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public static final List<o9.e> f19344i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mb.b0 f19345j = new mb.b0();
    public static final Parcelable.Creator<y> CREATOR = new z();

    public y(mb.b0 b0Var, List<o9.e> list, String str) {
        this.f19346f = b0Var;
        this.f19347g = list;
        this.f19348h = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return o9.q.b(this.f19346f, yVar.f19346f) && o9.q.b(this.f19347g, yVar.f19347g) && o9.q.b(this.f19348h, yVar.f19348h);
    }

    public final int hashCode() {
        return this.f19346f.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f19346f);
        String strValueOf2 = String.valueOf(this.f19347g);
        String str = this.f19348h;
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 77 + strValueOf2.length() + String.valueOf(str).length());
        sb2.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb2.append(strValueOf);
        sb2.append(", clients=");
        sb2.append(strValueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("'}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, this.f19346f, i10, false);
        p9.c.z(parcel, 2, this.f19347g, false);
        p9.c.v(parcel, 3, this.f19348h, false);
        p9.c.b(parcel, iA);
    }
}
