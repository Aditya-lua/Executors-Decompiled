package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.games.internal.zzg;
import p305n9.C8947k;
import p325o9.C9718b;
import p406ra.C10806a;

/* JADX INFO: loaded from: classes.dex */
public final class VideoCapabilities extends zzg {

    @NonNull
    public static final Parcelable.Creator<VideoCapabilities> CREATOR = new C10806a();

    /* JADX INFO: renamed from: f */
    public final boolean f7982f;

    /* JADX INFO: renamed from: g */
    public final boolean f7983g;

    /* JADX INFO: renamed from: h */
    public final boolean f7984h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f7985i;

    /* JADX INFO: renamed from: j */
    public final boolean[] f7986j;

    public VideoCapabilities(boolean z10, boolean z11, boolean z12, @NonNull boolean[] zArr, @NonNull boolean[] zArr2) {
        this.f7982f = z10;
        this.f7983g = z11;
        this.f7984h = z12;
        this.f7985i = zArr;
        this.f7986j = zArr2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoCapabilities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        VideoCapabilities videoCapabilities = (VideoCapabilities) obj;
        return C8947k.m36026b(videoCapabilities.m9523v3(), m9523v3()) && C8947k.m36026b(videoCapabilities.m9524w3(), m9524w3()) && C8947k.m36026b(Boolean.valueOf(videoCapabilities.m9525x3()), Boolean.valueOf(m9525x3())) && C8947k.m36026b(Boolean.valueOf(videoCapabilities.m9526y3()), Boolean.valueOf(m9526y3())) && C8947k.m36026b(Boolean.valueOf(videoCapabilities.m9527z3()), Boolean.valueOf(m9527z3()));
    }

    public int hashCode() {
        return C8947k.m36027c(m9523v3(), m9524w3(), Boolean.valueOf(m9525x3()), Boolean.valueOf(m9526y3()), Boolean.valueOf(m9527z3()));
    }

    @NonNull
    public String toString() {
        return C8947k.m36028d(this).m36029a("SupportedCaptureModes", m9523v3()).m36029a("SupportedQualityLevels", m9524w3()).m36029a("CameraSupported", Boolean.valueOf(m9525x3())).m36029a("MicSupported", Boolean.valueOf(m9526y3())).m36029a("StorageWriteSupported", Boolean.valueOf(m9527z3())).toString();
    }

    @NonNull
    /* JADX INFO: renamed from: v3 */
    public boolean[] m9523v3() {
        return this.f7985i;
    }

    @NonNull
    /* JADX INFO: renamed from: w3 */
    public boolean[] m9524w3() {
        return this.f7986j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38459c(parcel, 1, m9525x3());
        C9718b.m38459c(parcel, 2, m9526y3());
        C9718b.m38459c(parcel, 3, m9527z3());
        C9718b.m38460d(parcel, 4, m9523v3(), false);
        C9718b.m38460d(parcel, 5, m9524w3(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public boolean m9525x3() {
        return this.f7982f;
    }

    /* JADX INFO: renamed from: y3 */
    public boolean m9526y3() {
        return this.f7983g;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m9527z3() {
        return this.f7984h;
    }
}
