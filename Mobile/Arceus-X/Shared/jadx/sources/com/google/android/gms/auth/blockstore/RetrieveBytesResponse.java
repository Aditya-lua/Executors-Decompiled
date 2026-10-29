package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new C1891b();

    /* JADX INFO: renamed from: f */
    @Deprecated
    public final Bundle f7352f;

    /* JADX INFO: renamed from: g */
    public final List f7353g;

    /* JADX INFO: renamed from: h */
    public final Map f7354h;

    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new C1890a();

        /* JADX INFO: renamed from: f */
        public final byte[] f7355f;

        /* JADX INFO: renamed from: g */
        public final String f7356g;

        public BlockstoreData(byte[] bArr, String str) {
            this.f7355f = bArr;
            this.f7356g = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f7355f, ((BlockstoreData) obj).f7355f);
        }

        public int hashCode() {
            return C8947k.m36027c(Integer.valueOf(Arrays.hashCode(this.f7355f)));
        }

        @NonNull
        /* JADX INFO: renamed from: v3 */
        public byte[] m9120v3() {
            return this.f7355f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iM38457a = C9718b.m38457a(parcel);
            C9718b.m38463g(parcel, 1, m9120v3(), false);
            C9718b.m38478v(parcel, 2, this.f7356g, false);
            C9718b.m38458b(parcel, iM38457a);
        }

        @NonNull
        public final String zza() {
            return this.f7356g;
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.f7352f = bundle;
        this.f7353g = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            map.put(blockstoreData.zza(), blockstoreData);
        }
        this.f7354h = map;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public Map<String, BlockstoreData> m9119v3() {
        return Collections.unmodifiableMap(this.f7354h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Bundle bundle = this.f7352f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, bundle, false);
        C9718b.m38482z(parcel, 2, this.f7353g, false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
