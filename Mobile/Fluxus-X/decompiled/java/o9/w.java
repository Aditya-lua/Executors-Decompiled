package o9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class w extends p9.a {

    @NonNull
    public static final Parcelable.Creator<w> CREATOR = new b0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f27057g;

    public w(int i10, List list) {
        this.f27056f = i10;
        this.f27057g = list;
    }

    public final int A3() {
        return this.f27056f;
    }

    public final List B3() {
        return this.f27057g;
    }

    public final void C3(@NonNull p pVar) {
        if (this.f27057g == null) {
            this.f27057g = new ArrayList();
        }
        this.f27057g.add(pVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 1, this.f27056f);
        p9.c.z(parcel, 2, this.f27057g, false);
        p9.c.b(parcel, iA);
    }
}
