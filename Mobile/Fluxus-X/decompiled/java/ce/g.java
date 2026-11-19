package ce;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4964a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f4968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f4969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f4970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4971i;

    public g(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f4964a = i10;
        this.b = i11;
        this.f4965c = i12;
        this.f4966d = j10;
        this.f4967e = j11;
        this.f4968f = list;
        this.f4969g = list2;
        this.f4970h = pendingIntent;
        this.f4971i = list3;
    }

    @Override // ce.e
    public final long a() {
        return this.f4966d;
    }

    @Override // ce.e
    public final int c() {
        return this.f4965c;
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
            if (this.f4964a == eVar.h() && this.b == eVar.i() && this.f4965c == eVar.c() && this.f4966d == eVar.a() && this.f4967e == eVar.j() && ((list = this.f4968f) != null ? list.equals(eVar.l()) : eVar.l() == null) && ((list2 = this.f4969g) != null ? list2.equals(eVar.k()) : eVar.k() == null) && ((pendingIntent = this.f4970h) != null ? pendingIntent.equals(eVar.g()) : eVar.g() == null) && ((list3 = this.f4971i) != null ? list3.equals(eVar.m()) : eVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ce.e
    @Deprecated
    public final PendingIntent g() {
        return this.f4970h;
    }

    @Override // ce.e
    public final int h() {
        return this.f4964a;
    }

    public final int hashCode() {
        int i10 = ((((this.f4964a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f4965c;
        long j10 = this.f4966d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f4967e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f4968f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f4969g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f4970h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f4971i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // ce.e
    public final int i() {
        return this.b;
    }

    @Override // ce.e
    public final long j() {
        return this.f4967e;
    }

    @Override // ce.e
    public final List k() {
        return this.f4969g;
    }

    @Override // ce.e
    public final List l() {
        return this.f4968f;
    }

    @Override // ce.e
    public final List m() {
        return this.f4971i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f4964a + ", status=" + this.b + ", errorCode=" + this.f4965c + ", bytesDownloaded=" + this.f4966d + ", totalBytesToDownload=" + this.f4967e + ", moduleNamesNullable=" + String.valueOf(this.f4968f) + ", languagesNullable=" + String.valueOf(this.f4969g) + ", resolutionIntent=" + String.valueOf(this.f4970h) + ", splitFileIntents=" + String.valueOf(this.f4971i) + "}";
    }
}
