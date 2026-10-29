package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p305n9.C8953m;
import p325o9.C9718b;
import p540x9.C12774b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<DriveId> CREATOR = new C12774b();

    /* JADX INFO: renamed from: f */
    public final String f7548f;

    /* JADX INFO: renamed from: g */
    public final long f7549g;

    /* JADX INFO: renamed from: h */
    public final long f7550h;

    /* JADX INFO: renamed from: i */
    public final int f7551i;

    /* JADX INFO: renamed from: j */
    public volatile String f7552j = null;

    public DriveId(String str, long j10, long j11, int i10) {
        this.f7548f = str;
        boolean z10 = true;
        C8953m.m36036a(!"".equals(str));
        if (str == null && j10 == -1) {
            z10 = false;
            j10 = -1;
        }
        C8953m.m36036a(z10);
        this.f7549g = j10;
        this.f7550h = j11;
        this.f7551i = i10;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.f7550h != this.f7550h) {
                return false;
            }
            long j10 = driveId.f7549g;
            if (j10 == -1) {
                if (this.f7549g == -1) {
                    return ((String) C8953m.m36047l(driveId.f7548f)).equals(this.f7548f);
                }
                j10 = -1;
            }
            String str2 = this.f7548f;
            if (str2 != null && (str = driveId.f7548f) != null) {
                return j10 == this.f7549g && str.equals(str2);
            }
            if (j10 == this.f7549g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7549g;
        if (j10 == -1) {
            String str = this.f7548f;
            C8953m.m36047l(str);
            return str.hashCode();
        }
        long j11 = this.f7550h;
        String strValueOf = String.valueOf(j10);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + String.valueOf(strValueOf).length());
        sb2.append(j11);
        sb2.append(strValueOf);
        return sb2.toString().hashCode();
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.f7548f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, str, false);
        C9718b.m38474r(parcel, 3, this.f7549g);
        C9718b.m38474r(parcel, 4, this.f7550h);
        C9718b.m38470n(parcel, 5, this.f7551i);
        C9718b.m38458b(parcel, iM38457a);
    }
}
