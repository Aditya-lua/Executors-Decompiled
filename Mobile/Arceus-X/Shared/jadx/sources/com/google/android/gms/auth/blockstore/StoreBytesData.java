package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p098e9.C4891e;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class StoreBytesData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StoreBytesData> CREATOR = new C4891e();

    /* JADX INFO: renamed from: f */
    public final byte[] f7357f;

    /* JADX INFO: renamed from: g */
    public final boolean f7358g;

    /* JADX INFO: renamed from: h */
    public final String f7359h;

    /* JADX INFO: renamed from: com.google.android.gms.auth.blockstore.StoreBytesData$a */
    public static final class C1889a {

        /* JADX INFO: renamed from: a */
        public byte[] f7360a;

        /* JADX INFO: renamed from: b */
        public boolean f7361b;

        /* JADX INFO: renamed from: c */
        public String f7362c = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";

        @NonNull
        /* JADX INFO: renamed from: a */
        public StoreBytesData m9124a() {
            return new StoreBytesData(this.f7360a, this.f7361b, this.f7362c);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C1889a m9125b(@NonNull byte[] bArr) {
            this.f7360a = bArr;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C1889a m9126c(@NonNull String str) {
            C8953m.m36042g(str, "key cannot be null or empty");
            this.f7362c = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C1889a m9127d(boolean z10) {
            this.f7361b = z10;
            return this;
        }
    }

    public StoreBytesData(byte[] bArr, boolean z10, String str) {
        this.f7357f = bArr;
        this.f7358g = z10;
        this.f7359h = str;
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public byte[] m9121v3() {
        return this.f7357f;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public String m9122w3() {
        return this.f7359h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38463g(parcel, 1, m9121v3(), false);
        C9718b.m38459c(parcel, 2, m9123x3());
        C9718b.m38478v(parcel, 3, m9122w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m9123x3() {
        return this.f7358g;
    }
}
