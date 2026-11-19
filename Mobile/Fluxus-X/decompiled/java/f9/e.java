package f9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o9.q;

/* JADX INFO: loaded from: classes.dex */
public class e extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final Bundle f15708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f15709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f15710h;

    public static class a extends p9.a {

        @NonNull
        public static final Parcelable.Creator<a> CREATOR = new g();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f15711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f15712g;

        public a(byte[] bArr, String str) {
            this.f15711f = bArr;
            this.f15712g = str;
        }

        @NonNull
        public byte[] A3() {
            return this.f15711f;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f15711f, ((a) obj).f15711f);
        }

        public int hashCode() {
            return q.c(Integer.valueOf(Arrays.hashCode(this.f15711f)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = p9.c.a(parcel);
            p9.c.g(parcel, 1, A3(), false);
            p9.c.v(parcel, 2, this.f15712g, false);
            p9.c.b(parcel, iA);
        }

        @NonNull
        public final String zza() {
            return this.f15712g;
        }
    }

    public e(Bundle bundle, List list) {
        this.f15708f = bundle;
        this.f15709g = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            map.put(aVar.zza(), aVar);
        }
        this.f15710h = map;
    }

    @NonNull
    public Map<String, a> A3() {
        return Collections.unmodifiableMap(this.f15710h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Bundle bundle = this.f15708f;
        int iA = p9.c.a(parcel);
        p9.c.f(parcel, 1, bundle, false);
        p9.c.z(parcel, 2, this.f15709g, false);
        p9.c.b(parcel, iA);
    }
}
