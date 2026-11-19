package da;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends p9.a {

    @NonNull
    public static final Parcelable.Creator<d0> CREATOR = new i1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f12027f;

    public d0(List list) {
        this.f12027f = list;
    }

    public List<e0> A3() {
        return this.f12027f;
    }

    @NonNull
    public final JSONArray B3() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f12027f != null) {
                for (int i10 = 0; i10 < this.f12027f.size(); i10++) {
                    e0 e0Var = (e0) this.f12027f.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) e0Var.B3());
                    jSONArray2.put((int) e0Var.A3());
                    jSONArray2.put((int) e0Var.B3());
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        List list2 = this.f12027f;
        if (list2 == null && d0Var.f12027f == null) {
            return true;
        }
        return list2 != null && (list = d0Var.f12027f) != null && list2.containsAll(list) && d0Var.f12027f.containsAll(this.f12027f);
    }

    public int hashCode() {
        List list = this.f12027f;
        return o9.q.c(list == null ? null : new HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.z(parcel, 1, A3(), false);
        p9.c.b(parcel, iA);
    }
}
