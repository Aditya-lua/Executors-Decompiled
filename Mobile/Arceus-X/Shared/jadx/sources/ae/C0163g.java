package ae;

import android.app.PendingIntent;
import java.util.List;

/* JADX INFO: renamed from: ae.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0163g extends AbstractC0159e {

    /* JADX INFO: renamed from: a */
    public final int f533a;

    /* JADX INFO: renamed from: b */
    public final int f534b;

    /* JADX INFO: renamed from: c */
    public final int f535c;

    /* JADX INFO: renamed from: d */
    public final long f536d;

    /* JADX INFO: renamed from: e */
    public final long f537e;

    /* JADX INFO: renamed from: f */
    public final List f538f;

    /* JADX INFO: renamed from: g */
    public final List f539g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f540h;

    /* JADX INFO: renamed from: i */
    public final List f541i;

    public C0163g(int i10, int i11, int i12, long j10, long j11, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f533a = i10;
        this.f534b = i11;
        this.f535c = i12;
        this.f536d = j10;
        this.f537e = j11;
        this.f538f = list;
        this.f539g = list2;
        this.f540h = pendingIntent;
        this.f541i = list3;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: a */
    public final long mo504a() {
        return this.f536d;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: c */
    public final int mo505c() {
        return this.f535c;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0159e) {
            AbstractC0159e abstractC0159e = (AbstractC0159e) obj;
            if (this.f533a == abstractC0159e.mo510h() && this.f534b == abstractC0159e.mo511i() && this.f535c == abstractC0159e.mo505c() && this.f536d == abstractC0159e.mo504a() && this.f537e == abstractC0159e.mo512j() && ((list = this.f538f) != null ? list.equals(abstractC0159e.mo514l()) : abstractC0159e.mo514l() == null) && ((list2 = this.f539g) != null ? list2.equals(abstractC0159e.mo513k()) : abstractC0159e.mo513k() == null) && ((pendingIntent = this.f540h) != null ? pendingIntent.equals(abstractC0159e.mo509g()) : abstractC0159e.mo509g() == null) && ((list3 = this.f541i) != null ? list3.equals(abstractC0159e.mo515m()) : abstractC0159e.mo515m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // ae.AbstractC0159e
    @Deprecated
    /* JADX INFO: renamed from: g */
    public final PendingIntent mo509g() {
        return this.f540h;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: h */
    public final int mo510h() {
        return this.f533a;
    }

    public final int hashCode() {
        int i10 = ((((this.f533a ^ 1000003) * 1000003) ^ this.f534b) * 1000003) ^ this.f535c;
        long j10 = this.f536d;
        long j11 = j10 ^ (j10 >>> 32);
        long j12 = this.f537e;
        long j13 = (j12 >>> 32) ^ j12;
        List list = this.f538f;
        int iHashCode = ((((((i10 * 1000003) ^ ((int) j11)) * 1000003) ^ ((int) j13)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f539g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f540h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.f541i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: i */
    public final int mo511i() {
        return this.f534b;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: j */
    public final long mo512j() {
        return this.f537e;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: k */
    public final List mo513k() {
        return this.f539g;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: l */
    public final List mo514l() {
        return this.f538f;
    }

    @Override // ae.AbstractC0159e
    /* JADX INFO: renamed from: m */
    public final List mo515m() {
        return this.f541i;
    }

    public final String toString() {
        return "SplitInstallSessionState{sessionId=" + this.f533a + ", status=" + this.f534b + ", errorCode=" + this.f535c + ", bytesDownloaded=" + this.f536d + ", totalBytesToDownload=" + this.f537e + ", moduleNamesNullable=" + String.valueOf(this.f538f) + ", languagesNullable=" + String.valueOf(this.f539g) + ", resolutionIntent=" + String.valueOf(this.f540h) + ", splitFileIntents=" + String.valueOf(this.f541i) + "}";
    }
}
