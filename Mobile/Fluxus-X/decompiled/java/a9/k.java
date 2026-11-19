package a9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class k extends p9.a {

    @NonNull
    public static final Parcelable.Creator<k> CREATOR = new z();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f385g;

    public k(@NonNull String str, @NonNull String str2) {
        this.f384f = o9.s.g(((String) o9.s.m(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f385g = o9.s.f(str2);
    }

    @NonNull
    public String A3() {
        return this.f384f;
    }

    @NonNull
    public String B3() {
        return this.f385g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return o9.q.b(this.f384f, kVar.f384f) && o9.q.b(this.f385g, kVar.f385g);
    }

    public int hashCode() {
        return o9.q.c(this.f384f, this.f385g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, A3(), false);
        p9.c.v(parcel, 2, B3(), false);
        p9.c.b(parcel, iA);
    }
}
