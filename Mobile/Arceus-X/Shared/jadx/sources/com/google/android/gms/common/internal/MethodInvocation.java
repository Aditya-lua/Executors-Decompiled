package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8930e0;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C8930e0();

    /* JADX INFO: renamed from: f */
    public final int f7479f;

    /* JADX INFO: renamed from: g */
    public final int f7480g;

    /* JADX INFO: renamed from: h */
    public final int f7481h;

    /* JADX INFO: renamed from: i */
    public final long f7482i;

    /* JADX INFO: renamed from: j */
    public final long f7483j;

    /* JADX INFO: renamed from: k */
    public final String f7484k;

    /* JADX INFO: renamed from: l */
    public final String f7485l;

    /* JADX INFO: renamed from: m */
    public final int f7486m;

    /* JADX INFO: renamed from: n */
    public final int f7487n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13) {
        this(i10, i11, i12, j10, j11, str, str2, i13, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.f7479f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38470n(parcel, 2, this.f7480g);
        C9718b.m38470n(parcel, 3, this.f7481h);
        C9718b.m38474r(parcel, 4, this.f7482i);
        C9718b.m38474r(parcel, 5, this.f7483j);
        C9718b.m38478v(parcel, 6, this.f7484k, false);
        C9718b.m38478v(parcel, 7, this.f7485l, false);
        C9718b.m38470n(parcel, 8, this.f7486m);
        C9718b.m38470n(parcel, 9, this.f7487n);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MethodInvocation(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f7479f = i10;
        this.f7480g = i11;
        this.f7481h = i12;
        this.f7482i = j10;
        this.f7483j = j11;
        this.f7484k = str;
        this.f7485l = str2;
        this.f7486m = i13;
        this.f7487n = i14;
    }
}
