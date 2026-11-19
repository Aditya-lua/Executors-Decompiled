package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class l implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<l> CREATOR = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final da.a f12058a;

    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public l(@NonNull da.a aVar) {
        this.f12058a = (da.a) o9.s.l(aVar);
    }

    @NonNull
    public static l a(int i10) throws a {
        da.a aVar;
        if (i10 != x.LEGACY_RS1.a()) {
            for (x xVar : x.values()) {
                if (xVar.a() == i10) {
                    aVar = xVar;
                }
            }
            for (m mVar : m.values()) {
                if (mVar.a() == i10) {
                    aVar = mVar;
                }
            }
            throw new a(i10);
        }
        aVar = x.RS1;
        return new l(aVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && this.f12058a.a() == ((l) obj).f12058a.a();
    }

    public int f() {
        return this.f12058a.a();
    }

    public int hashCode() {
        return o9.q.c(this.f12058a);
    }

    @NonNull
    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + String.valueOf(this.f12058a) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f12058a.a());
    }
}
