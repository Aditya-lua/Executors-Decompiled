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
import n9.k;

/* JADX INFO: loaded from: classes.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesResponse> CREATOR = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final Bundle f5668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f5669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f5670h;

    public static class BlockstoreData extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<BlockstoreData> CREATOR = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f5671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5672g;

        public BlockstoreData(byte[] bArr, String str) {
            this.f5671f = bArr;
            this.f5672g = str;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f5671f, ((BlockstoreData) obj).f5671f);
        }

        public int hashCode() {
            return k.c(Integer.valueOf(Arrays.hashCode(this.f5671f)));
        }

        @NonNull
        public byte[] v3() {
            return this.f5671f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            int iA = o9.b.a(parcel);
            o9.b.g(parcel, 1, v3(), false);
            o9.b.v(parcel, 2, this.f5672g, false);
            o9.b.b(parcel, iA);
        }

        @NonNull
        public final String zza() {
            return this.f5672g;
        }
    }

    public RetrieveBytesResponse(Bundle bundle, List list) {
        this.f5668f = bundle;
        this.f5669g = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            map.put(blockstoreData.zza(), blockstoreData);
        }
        this.f5670h = map;
    }

    @NonNull
    public Map<String, BlockstoreData> v3() {
        return Collections.unmodifiableMap(this.f5670h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Bundle bundle = this.f5668f;
        int iA = o9.b.a(parcel);
        o9.b.f(parcel, 1, bundle, false);
        o9.b.z(parcel, 2, this.f5669g, false);
        o9.b.b(parcel, iA);
    }
}
