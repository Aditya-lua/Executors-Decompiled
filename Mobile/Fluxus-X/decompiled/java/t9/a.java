package t9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator f32205j = new Comparator() { // from class: t9.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            k9.d dVar = (k9.d) obj;
            k9.d dVar2 = (k9.d) obj2;
            Parcelable.Creator<a> creator = a.CREATOR;
            return !dVar.getName().equals(dVar2.getName()) ? dVar.getName().compareTo(dVar2.getName()) : (dVar.B3() > dVar2.B3() ? 1 : (dVar.B3() == dVar2.B3() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f32206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f32207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f32208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f32209i;

    public a(@NonNull List list, boolean z10, String str, String str2) {
        o9.s.l(list);
        this.f32206f = list;
        this.f32207g = z10;
        this.f32208h = str;
        this.f32209i = str2;
    }

    public static a B3(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f32205j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((l9.j) it.next()).getOptionalFeatures());
        }
        return new a(new ArrayList(treeSet), z10, null, null);
    }

    @NonNull
    public static a a(@NonNull s9.f fVar) {
        return B3(fVar.a(), true);
    }

    @NonNull
    public List<k9.d> A3() {
        return this.f32206f;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f32207g == aVar.f32207g && o9.q.b(this.f32206f, aVar.f32206f) && o9.q.b(this.f32208h, aVar.f32208h) && o9.q.b(this.f32209i, aVar.f32209i);
    }

    public final int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f32207g), this.f32206f, this.f32208h, this.f32209i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.z(parcel, 1, A3(), false);
        p9.c.c(parcel, 2, this.f32207g);
        p9.c.v(parcel, 3, this.f32208h, false);
        p9.c.v(parcel, 4, this.f32209i, false);
        p9.c.b(parcel, iA);
    }
}
