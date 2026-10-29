package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p098e9.C4889c;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new C4889c();

    /* JADX INFO: renamed from: f */
    public final List f7344f;

    /* JADX INFO: renamed from: g */
    public final boolean f7345g;

    /* JADX INFO: renamed from: com.google.android.gms.auth.blockstore.DeleteBytesRequest$a */
    public static final class C1887a {

        /* JADX INFO: renamed from: a */
        public List f7346a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public boolean f7347b = false;

        @NonNull
        /* JADX INFO: renamed from: a */
        public DeleteBytesRequest m9113a() {
            return new DeleteBytesRequest(this.f7346a, this.f7347b);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1887a m9114b(@NonNull List<String> list) {
            C8953m.m36048m(list, "Keys cannot be set to null");
            this.f7346a = list;
            return this;
        }
    }

    public DeleteBytesRequest(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            C8953m.m36052q(z11, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f7345g = z10;
        this.f7344f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C8953m.m36042g(str, "Element in keys cannot be null or empty");
                this.f7344f.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: v3 */
    public boolean m9111v3() {
        return this.f7345g;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public List<String> m9112w3() {
        return Collections.unmodifiableList(this.f7344f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38480x(parcel, 1, m9112w3(), false);
        C9718b.m38459c(parcel, 2, m9111v3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
