package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.fido.common.Transport;
import fb.m3;
import fb.p3;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s extends p9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final v f12130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final m3 f12131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final fb.h1 f12129i = fb.h1.n(p3.f15798a, p3.b);

    @NonNull
    public static final Parcelable.Creator<s> CREATOR = new u0();

    public s(String str, m3 m3Var, List<Transport> list) {
        o9.s.l(str);
        try {
            this.f12130f = v.a(str);
            this.f12131g = (m3) o9.s.l(m3Var);
            this.f12132h = list;
        } catch (v.a e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @NonNull
    public static s D3(@NonNull JSONObject jSONObject) {
        return new s(jSONObject.getString(Payload.TYPE), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.k(jSONObject.getJSONArray("transports")) : null);
    }

    @NonNull
    public byte[] A3() {
        return this.f12131g.n();
    }

    public List<Transport> B3() {
        return this.f12132h;
    }

    @NonNull
    public String C3() {
        return this.f12130f.toString();
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.f12130f.equals(sVar.f12130f) || !o9.q.b(this.f12131g, sVar.f12131g)) {
            return false;
        }
        List list2 = this.f12132h;
        if (list2 == null && sVar.f12132h == null) {
            return true;
        }
        return list2 != null && (list = sVar.f12132h) != null && list2.containsAll(list) && sVar.f12132h.containsAll(this.f12132h);
    }

    public int hashCode() {
        return o9.q.c(this.f12130f, this.f12131g, this.f12132h);
    }

    @NonNull
    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.f12130f) + ", \n id=" + v9.c.b(A3()) + ", \n transports=" + String.valueOf(this.f12132h) + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, C3(), false);
        p9.c.g(parcel, 3, A3(), false);
        p9.c.z(parcel, 4, B3(), false);
        p9.c.b(parcel, iA);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(@NonNull String str, @NonNull byte[] bArr, List<Transport> list) {
        this(str, m3.m(bArr, 0, bArr.length), list);
        m3 m3Var = m3.b;
    }
}
