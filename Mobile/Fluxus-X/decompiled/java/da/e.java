package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class e extends p9.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new k1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f12028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f12029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f12030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1 f12031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f12032j;

    public e(d0 d0Var, n1 n1Var, f fVar, p1 p1Var, String str) {
        this.f12028f = d0Var;
        this.f12029g = n1Var;
        this.f12030h = fVar;
        this.f12031i = p1Var;
        this.f12032j = str;
    }

    public f A3() {
        return this.f12030h;
    }

    public d0 B3() {
        return this.f12028f;
    }

    @NonNull
    public final JSONObject C3() {
        try {
            JSONObject jSONObject = new JSONObject();
            f fVar = this.f12030h;
            if (fVar != null) {
                jSONObject.put("credProps", fVar.B3());
            }
            d0 d0Var = this.f12028f;
            if (d0Var != null) {
                jSONObject.put("uvm", d0Var.B3());
            }
            p1 p1Var = this.f12031i;
            if (p1Var != null) {
                jSONObject.put("prf", p1Var.A3());
            }
            String str = this.f12032j;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return o9.q.b(this.f12028f, eVar.f12028f) && o9.q.b(this.f12029g, eVar.f12029g) && o9.q.b(this.f12030h, eVar.f12030h) && o9.q.b(this.f12031i, eVar.f12031i) && o9.q.b(this.f12032j, eVar.f12032j);
    }

    public int hashCode() {
        return o9.q.c(this.f12028f, this.f12029g, this.f12030h, this.f12031i, this.f12032j);
    }

    @NonNull
    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + C3().toString() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, B3(), i10, false);
        p9.c.t(parcel, 2, this.f12029g, i10, false);
        p9.c.t(parcel, 3, A3(), i10, false);
        p9.c.t(parcel, 4, this.f12031i, i10, false);
        p9.c.v(parcel, 5, this.f12032j, false);
        p9.c.b(parcel, iA);
    }
}
