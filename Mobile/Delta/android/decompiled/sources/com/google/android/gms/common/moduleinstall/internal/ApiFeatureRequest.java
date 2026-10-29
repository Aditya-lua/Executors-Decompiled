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
import k9.h;
import n9.k;
import n9.m;
import o9.b;
import r9.d;
import s9.e;

/* JADX INFO: loaded from: classes.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Comparator f5831j = new Comparator() { // from class: s9.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Feature feature = (Feature) obj;
            Feature feature2 = (Feature) obj2;
            Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
            return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.w3() > feature2.w3() ? 1 : (feature.w3() == feature2.w3() ? 0 : -1));
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f5832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f5834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f5835i;

    public ApiFeatureRequest(@NonNull List list, boolean z10, String str, String str2) {
        m.l(list);
        this.f5832f = list;
        this.f5833g = z10;
        this.f5834h = str;
        this.f5835i = str2;
    }

    @NonNull
    public static ApiFeatureRequest a(@NonNull d dVar) {
        return w3(dVar.a(), true);
    }

    public static ApiFeatureRequest w3(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f5831j);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((h) it.next()).getOptionalFeatures());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.f5833g == apiFeatureRequest.f5833g && k.b(this.f5832f, apiFeatureRequest.f5832f) && k.b(this.f5834h, apiFeatureRequest.f5834h) && k.b(this.f5835i, apiFeatureRequest.f5835i);
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f5833g), this.f5832f, this.f5834h, this.f5835i);
    }

    @NonNull
    public List<Feature> v3() {
        return this.f5832f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.z(parcel, 1, v3(), false);
        b.c(parcel, 2, this.f5833g);
        b.v(parcel, 3, this.f5834h, false);
        b.v(parcel, 4, this.f5835i, false);
        b.b(parcel, iA);
    }
}
