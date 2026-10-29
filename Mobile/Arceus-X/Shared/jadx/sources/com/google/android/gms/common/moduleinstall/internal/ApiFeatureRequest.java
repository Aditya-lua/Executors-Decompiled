package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p242k9.InterfaceC7498h;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;
import p405r9.C10800d;
import p432s9.C11202e;

/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C11202e();

    /* JADX INFO: renamed from: j */
    public static final Comparator f7521j = new Comparator() { // from class: s9.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.m9145w3() > feature2.m9145w3() ? 1 : (feature.m9145w3() == feature2.m9145w3() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: f */
    public final List f7522f;

    /* JADX INFO: renamed from: g */
    public final boolean f7523g;

    /* JADX INFO: renamed from: h */
    public final String f7524h;

    /* JADX INFO: renamed from: i */
    public final String f7525i;

    public ApiFeatureRequest(@NonNull List list, boolean z10, String str, String str2) {
        C8953m.m36047l(list);
        this.f7522f = list;
        this.f7523g = z10;
        this.f7524h = str;
        this.f7525i = str2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ApiFeatureRequest m9230a(@NonNull C10800d c10800d) {
        return m9231w3(c10800d.m41165a(), true);
    }

    /* JADX INFO: renamed from: w3 */
    public static ApiFeatureRequest m9231w3(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f7521j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC7498h) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f7523g == apiFeatureRequest.f7523g && C8947k.m36026b(this.f7522f, apiFeatureRequest.f7522f) && C8947k.m36026b(this.f7524h, apiFeatureRequest.f7524h) && C8947k.m36026b(this.f7525i, apiFeatureRequest.f7525i);
    }

    public final int hashCode() {
        return C8947k.m36027c(Boolean.valueOf(this.f7523g), this.f7522f, this.f7524h, this.f7525i);
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public List<Feature> m9232v3() {
        return this.f7522f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38482z(parcel, 1, m9232v3(), false);
        C9718b.m38459c(parcel, 2, this.f7523g);
        C9718b.m38478v(parcel, 3, this.f7524h, false);
        C9718b.m38478v(parcel, 4, this.f7525i, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
