package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e9.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f5662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5663g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f5664a = new ArrayList();
        public boolean b = false;

        @NonNull
        public DeleteBytesRequest a() {
            return new DeleteBytesRequest(this.f5664a, this.b);
        }

        @NonNull
        public a b(@NonNull List<String> list) {
            m.m(list, "Keys cannot be set to null");
            this.f5664a = list;
            return this;
        }
    }

    public DeleteBytesRequest(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            m.q(z11, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f5663g = z10;
        this.f5662f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                m.g(str, "Element in keys cannot be null or empty");
                this.f5662f.add(str);
            }
        }
    }

    public boolean v3() {
        return this.f5663g;
    }

    @NonNull
    public List<String> w3() {
        return Collections.unmodifiableList(this.f5662f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.x(parcel, 1, w3(), false);
        o9.b.c(parcel, 2, v3());
        o9.b.b(parcel, iA);
    }
}
