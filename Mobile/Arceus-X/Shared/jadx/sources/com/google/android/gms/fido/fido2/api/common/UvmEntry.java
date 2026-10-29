package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1609v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new C1609v();

    /* JADX INFO: renamed from: f */
    public final int f7730f;

    /* JADX INFO: renamed from: g */
    public final short f7731g;

    /* JADX INFO: renamed from: h */
    public final short f7732h;

    public UvmEntry(int i10, short s8, short s10) {
        this.f7730f = i10;
        this.f7731g = s8;
        this.f7732h = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f7730f == uvmEntry.f7730f && this.f7731g == uvmEntry.f7731g && this.f7732h == uvmEntry.f7732h;
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7730f), Short.valueOf(this.f7731g), Short.valueOf(this.f7732h));
    }

    /* JADX INFO: renamed from: v3 */
    public short m9353v3() {
        return this.f7731g;
    }

    /* JADX INFO: renamed from: w3 */
    public short m9354w3() {
        return this.f7732h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9355x3());
        C9718b.m38477u(parcel, 2, m9353v3());
        C9718b.m38477u(parcel, 3, m9354w3());
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public int m9355x3() {
        return this.f7730f;
    }
}
