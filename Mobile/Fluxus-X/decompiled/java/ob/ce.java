package ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ce extends p9.a {
    public static final Parcelable.Creator<ce> CREATOR = new de();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f27170f;

    public ce(List list) {
        this.f27170f = list;
    }

    public static ce a(eb... ebVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(ebVarArr[0].zza()));
        return new ce(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f27170f;
        int iA = p9.c.a(parcel);
        p9.c.p(parcel, 1, list, false);
        p9.c.b(parcel, iA);
    }
}
