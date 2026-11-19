package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i extends j {

    @NonNull
    public static final Parcelable.Creator<i> CREATOR = new t1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final n f12048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12050h;

    public i(int i10, String str, int i11) {
        try {
            this.f12048f = n.k(i10);
            this.f12049g = str;
            this.f12050h = i11;
        } catch (n.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public n A3() {
        return this.f12048f;
    }

    public int B3() {
        return this.f12048f.a();
    }

    public String C3() {
        return this.f12049g;
    }

    @NonNull
    public final JSONObject D3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.f12048f.a());
            String str = this.f12049g;
            if (str == null) {
                return jSONObject;
            }
            jSONObject.put("message", str);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return o9.q.b(this.f12048f, iVar.f12048f) && o9.q.b(this.f12049g, iVar.f12049g) && o9.q.b(Integer.valueOf(this.f12050h), Integer.valueOf(iVar.f12050h));
    }

    public int hashCode() {
        return o9.q.c(this.f12048f, this.f12049g, Integer.valueOf(this.f12050h));
    }

    @NonNull
    public String toString() {
        fb.j0 j0VarA = fb.k0.a(this);
        j0VarA.a("errorCode", this.f12048f.a());
        String str = this.f12049g;
        if (str != null) {
            j0VarA.b("errorMessage", str);
        }
        return j0VarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.n(parcel, 2, B3());
        p9.c.v(parcel, 3, C3(), false);
        p9.c.n(parcel, 4, this.f12050h);
        p9.c.b(parcel, iA);
    }
}
