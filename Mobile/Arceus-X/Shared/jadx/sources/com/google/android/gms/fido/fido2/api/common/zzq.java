package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import ca.C1590f0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p100eb.AbstractC4970m3;
import p305n9.C8947k;
import p305n9.C8953m;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C1590f0();

    /* JADX INFO: renamed from: f */
    public final long f7751f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AbstractC4970m3 f7752g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AbstractC4970m3 f7753h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AbstractC4970m3 f7754i;

    public zzq(long j10, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        byte[] bArr4 = (byte[]) C8953m.m36047l(bArr);
        AbstractC4970m3 abstractC4970m3 = AbstractC4970m3.f19698b;
        AbstractC4970m3 abstractC4970m3M23673m = AbstractC4970m3.m23673m(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) C8953m.m36047l(bArr2);
        AbstractC4970m3 abstractC4970m3M23673m2 = AbstractC4970m3.m23673m(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) C8953m.m36047l(bArr3);
        AbstractC4970m3 abstractC4970m3M23673m3 = AbstractC4970m3.m23673m(bArr6, 0, bArr6.length);
        this.f7751f = j10;
        this.f7752g = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m);
        this.f7753h = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m2);
        this.f7754i = (AbstractC4970m3) C8953m.m36047l(abstractC4970m3M23673m3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f7751f == zzqVar.f7751f && C8947k.m36026b(this.f7752g, zzqVar.f7752g) && C8947k.m36026b(this.f7753h, zzqVar.f7753h) && C8947k.m36026b(this.f7754i, zzqVar.f7754i);
    }

    public final int hashCode() {
        return C8947k.m36027c(Long.valueOf(this.f7751f), this.f7752g, this.f7753h, this.f7754i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f7751f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38474r(parcel, 1, j10);
        C9718b.m38463g(parcel, 2, this.f7752g.m23675p(), false);
        C9718b.m38463g(parcel, 3, this.f7753h.m23675p(), false);
        C9718b.m38463g(parcel, 4, this.f7754i.m23675p(), false);
        C9718b.m38458b(parcel, iM38457a);
    }
}
