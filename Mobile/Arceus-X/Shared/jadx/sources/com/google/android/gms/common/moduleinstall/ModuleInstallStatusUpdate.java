package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p325o9.C9718b;
import p405r9.C10805i;

/* JADX INFO: loaded from: classes.dex */
public class ModuleInstallStatusUpdate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ModuleInstallStatusUpdate> CREATOR = new C10805i();

    /* JADX INFO: renamed from: f */
    public final int f7513f;

    /* JADX INFO: renamed from: g */
    public final int f7514g;

    /* JADX INFO: renamed from: h */
    public final Long f7515h;

    /* JADX INFO: renamed from: i */
    public final Long f7516i;

    /* JADX INFO: renamed from: j */
    public final int f7517j;

    /* JADX INFO: renamed from: k */
    public final C1905a f7518k;

    /* JADX INFO: renamed from: com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate$a */
    public static class C1905a {

        /* JADX INFO: renamed from: a */
        public final long f7519a;

        /* JADX INFO: renamed from: b */
        public final long f7520b;

        public C1905a(long j10, long j11) {
            C8953m.m36050o(j11);
            this.f7519a = j10;
            this.f7520b = j11;
        }
    }

    public ModuleInstallStatusUpdate(int i10, int i11, Long l10, Long l11, int i12) {
        this.f7513f = i10;
        this.f7514g = i11;
        this.f7515h = l10;
        this.f7516i = l11;
        this.f7517j = i12;
        this.f7518k = (l10 == null || l11 == null || l11.longValue() == 0) ? null : new C1905a(l10.longValue(), l11.longValue());
    }

    /* JADX INFO: renamed from: v3 */
    public int m9227v3() {
        return this.f7517j;
    }

    /* JADX INFO: renamed from: w3 */
    public int m9228w3() {
        return this.f7514g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9229x3());
        C9718b.m38470n(parcel, 2, m9228w3());
        C9718b.m38475s(parcel, 3, this.f7515h, false);
        C9718b.m38475s(parcel, 4, this.f7516i, false);
        C9718b.m38470n(parcel, 5, m9227v3());
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public int m9229x3() {
        return this.f7513f;
    }
}
