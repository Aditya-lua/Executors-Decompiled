package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class f extends p9.a {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new m1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12037f;

    public f(boolean z10) {
        this.f12037f = z10;
    }

    public boolean A3() {
        return this.f12037f;
    }

    @NonNull
    public final JSONObject B3() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rk", this.f12037f);
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f12037f == ((f) obj).f12037f;
    }

    public int hashCode() {
        return o9.q.c(Boolean.valueOf(this.f12037f));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, A3());
        p9.c.b(parcel, iA);
    }
}
