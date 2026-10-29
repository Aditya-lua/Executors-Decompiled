package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e9.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f5665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5666g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f5667a = new ArrayList();
        public boolean b = false;

        @NonNull
        public RetrieveBytesRequest a() {
            return new RetrieveBytesRequest(this.f5667a, this.b);
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            m.m(list, "Keys cannot be set to null");
            this.f5667a = list;
            return this;
        }
    }

    public RetrieveBytesRequest(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            m.q(z11, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f5666g = z10;
        this.f5665f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m.g(str, "Element in keys cannot be null or empty");
                this.f5665f.add(str);
            }
        }
    }

    @NonNull
    public List<String> v3() {
        return Collections.unmodifiableList(this.f5665f);
    }

    public boolean w3() {
        return this.f5666g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.x(parcel, 1, v3(), false);
        o9.b.c(parcel, 2, w3());
        o9.b.b(parcel, iA);
    }
}
