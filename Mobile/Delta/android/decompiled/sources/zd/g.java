package zd;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37461a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f37465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f37466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PendingIntent f37467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f37468i;

    public g(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f37461a = i10;
        this.b = i11;
        this.f37462c = i12;
        this.f37463d = j10;
        this.f37464e = j11;
        this.f37465f = list;
        this.f37466g = list2;
        this.f37467h = pendingIntent;
        this.f37468i = list3;
    }

    @Override // zd.e
    public final long a() {
        return this.f37463d;
    }

    @Override // zd.e
    public final int c() {
        return this.f37462c;
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
            if (this.f37461a == eVar.h() && this.b == eVar.i() && this.f37462c == eVar.c() && this.f37463d == eVar.a() && this.f37464e == eVar.j() && ((list = this.f37465f) != null ? list.equals(eVar.l()) : eVar.l() == null) && ((list2 = this.f37466g) != null ? list2.equals(eVar.k()) : eVar.k() == null) && ((pendingIntent = this.f37467h) != null ? pendingIntent.equals(eVar.g()) : eVar.g() == null) && ((list3 = this.f37468i) != null ? list3.equals(eVar.m()) : eVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.e
    @Deprecated
    public final PendingIntent g() {
        return this.f37467h;
    }

    @Override // zd.e
    public final int h() {
        return this.f37461a;
    }

    public final int hashCode() {
        int i10 = ((((this.f37461a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.f37462c;
        long j10 = this.f37463d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f37464e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f37465f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f37466g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f37467h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f37468i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // zd.e
    public final int i() {
        return this.b;
    }

    @Override // zd.e
    public final long j() {
        return this.f37464e;
    }

    @Override // zd.e
    public final List k() {
        return this.f37466g;
    }

    @Override // zd.e
    public final List l() {
        return this.f37465f;
    }

    @Override // zd.e
    public final List m() {
        return this.f37468i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f37461a + ", status=" + this.b + ", errorCode=" + this.f37462c + ", bytesDownloaded=" + this.f37463d + ", totalBytesToDownload=" + this.f37464e + ", moduleNamesNullable=" + String.valueOf(this.f37465f) + ", languagesNullable=" + String.valueOf(this.f37466g) + ", resolutionIntent=" + String.valueOf(this.f37467h) + ", splitFileIntents=" + String.valueOf(this.f37468i) + "}";
    }
}
