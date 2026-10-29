package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import n9.k;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6026f;

    public UvmEntries(List list) {
        this.f6026f = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f6026f;
        if (list2 == null && uvmEntries.f6026f == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.f6026f) != null && list2.containsAll(list) && uvmEntries.f6026f.containsAll(this.f6026f);
    }

    public int hashCode() {
        List list = this.f6026f;
        return k.c(list == null ? null : new HashSet(list));
    }

    public List<UvmEntry> v3() {
        return this.f6026f;
    }

    @NonNull
    public final JSONArray w3() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f6026f != null) {
                for (int i10 = 0; i10 < this.f6026f.size(); i10++) {
                    UvmEntry uvmEntry = (UvmEntry) this.f6026f.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.w3());
                    jSONArray2.put((int) uvmEntry.v3());
                    jSONArray2.put((int) uvmEntry.w3());
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
        int iA = o9.b.a(parcel);
        o9.b.z(parcel, 1, v3(), false);
        o9.b.b(parcel, iA);
    }
}
