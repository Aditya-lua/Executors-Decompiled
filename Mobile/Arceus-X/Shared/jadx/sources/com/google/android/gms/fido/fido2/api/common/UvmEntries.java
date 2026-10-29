package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1608u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new C1608u();

    /* JADX INFO: renamed from: f */
    public final List f7729f;

    public UvmEntries(List list) {
        this.f7729f = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f7729f;
        if (list2 == null && uvmEntries.f7729f == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.f7729f) != null && list2.containsAll(list) && uvmEntries.f7729f.containsAll(this.f7729f);
    }

    public int hashCode() {
        List list = this.f7729f;
        return C8947k.m36027c(list == null ? null : new HashSet(list));
    }

    /* JADX INFO: renamed from: v3 */
    public List<UvmEntry> m9351v3() {
        return this.f7729f;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public final JSONArray m9352w3() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f7729f != null) {
                for (int i10 = 0; i10 < this.f7729f.size(); i10++) {
                    UvmEntry uvmEntry = (UvmEntry) this.f7729f.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.m9354w3());
                    jSONArray2.put((int) uvmEntry.m9353v3());
                    jSONArray2.put((int) uvmEntry.m9354w3());
                    jSONArray.put(i10, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, m9351v3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
