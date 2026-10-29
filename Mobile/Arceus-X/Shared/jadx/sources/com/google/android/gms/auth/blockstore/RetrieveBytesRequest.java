package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p098e9.C4890d;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new C4890d();

    /* JADX INFO: renamed from: f */
    public final List f7348f;

    /* JADX INFO: renamed from: g */
    public final boolean f7349g;

    /* JADX INFO: renamed from: com.google.android.gms.auth.blockstore.RetrieveBytesRequest$a */
    public static final class C1888a {

        /* JADX INFO: renamed from: a */
        public List f7350a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public boolean f7351b = false;

        @NonNull
        /* JADX INFO: renamed from: a */
        public RetrieveBytesRequest m9117a() {
            return new RetrieveBytesRequest(this.f7350a, this.f7351b);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1888a m9118b(@NonNull List<String> list) {
            C8953m.m36048m(list, "Keys cannot be set to null");
            this.f7350a = list;
            return this;
        }
    }

    public RetrieveBytesRequest(List list, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            }
            C8953m.m36052q(z11, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.f7349g = z10;
        this.f7348f = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C8953m.m36042g(str, "Element in keys cannot be null or empty");
                this.f7348f.add(str);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public List<String> m9115v3() {
        return Collections.unmodifiableList(this.f7348f);
    }

    /* JADX INFO: renamed from: w3 */
    public boolean m9116w3() {
        return this.f7349g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38480x(parcel, 1, m9115v3(), false);
        C9718b.m38459c(parcel, 2, m9116w3());
        C9718b.m38458b(parcel, iM38457a);
    }
}
