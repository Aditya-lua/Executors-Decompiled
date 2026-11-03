package ae;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f417a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f424i;

    public g(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f417a = i10;
        this.b = i11;
        this.f418c = i12;
        this.f419d = j10;
        this.f420e = j11;
        this.f421f = list;
        this.f422g = list2;
        this.f423h = pendingIntent;
        this.f424i = list3;
    }

    @Override // ae.e
    public final long a() {
        return this.f419d;
    }

    @Override // ae.e
    public final int c() {
        return this.f418c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f417a == eVar.h() && this.b == eVar.i() && this.f418c == eVar.c() && this.f419d == eVar.a() && this.f420e == eVar.j() && ((list = this.f421f) != null ? list.equals(eVar.l()) : eVar.l() == null) && ((list2 = this.f422g) != null ? list2.equals(eVar.k()) : eVar.k() == null) && ((pendingIntent = this.f423h) != null ? pendingIntent.equals(eVar.g()) : eVar.g() == null) && ((list3 = this.f424i) != null ? list3.equals(eVar.m()) : eVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ae.e
    @Deprecated
    public final PendingIntent g() {
        return this.f423h;
    }

    @Override // ae.e
    public final int h() {
        return this.f417a;
    }

    public final int hashCode() {
        int i10 = ((((this.f417a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f418c;
        long j10 = this.f419d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f420e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f421f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f422g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f423h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f424i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // ae.e
    public final int i() {
        return this.b;
    }

    @Override // ae.e
    public final long j() {
        return this.f420e;
    }

    @Override // ae.e
    public final List k() {
        return this.f422g;
    }

    @Override // ae.e
    public final List l() {
        return this.f421f;
    }

    @Override // ae.e
    public final List m() {
        return this.f424i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f417a + ", status=" + this.b + ", errorCode=" + this.f418c + ", bytesDownloaded=" + this.f419d + ", totalBytesToDownload=" + this.f420e + ", moduleNamesNullable=" + String.valueOf(this.f421f) + ", languagesNullable=" + String.valueOf(this.f422g) + ", resolutionIntent=" + String.valueOf(this.f423h) + ", splitFileIntents=" + String.valueOf(this.f424i) + "}";
    }
}
