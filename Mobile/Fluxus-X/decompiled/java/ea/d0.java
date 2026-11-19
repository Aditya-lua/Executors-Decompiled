package ea;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends ha.p implements o {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f13262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13263i;

    public d0(int i10, String str, String str2, String str3) {
        this.f13260f = i10;
        this.f13261g = str;
        this.f13262h = str2;
        this.f13263i = str3;
    }

    public static boolean A3(o oVar, Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == oVar) {
            return true;
        }
        o oVar2 = (o) obj;
        return oVar2.c0() == oVar.c0() && o9.q.b(oVar2.zza(), oVar.zza()) && o9.q.b(oVar2.zzb(), oVar.zzb()) && o9.q.b(oVar2.zzc(), oVar.zzc());
    }

    public static String B3(o oVar) {
        o9.q.a aVarD = o9.q.d(oVar);
        aVarD.a("FriendStatus", Integer.valueOf(oVar.c0()));
        if (oVar.zza() != null) {
            aVarD.a("Nickname", oVar.zza());
        }
        if (oVar.zzb() != null) {
            aVarD.a("InvitationNickname", oVar.zzb());
        }
        if (oVar.zzc() != null) {
            aVarD.a("NicknameAbuseReportToken", oVar.zzb());
        }
        return aVarD.toString();
    }

    public static int a(o oVar) {
        return o9.q.c(Integer.valueOf(oVar.c0()), oVar.zza(), oVar.zzb(), oVar.zzc());
    }

    @Override // ea.o
    public final int c0() {
        return this.f13260f;
    }

    public final boolean equals(Object obj) {
        return A3(this, obj);
    }

    @Override // n9.e
    public final /* bridge */ /* synthetic */ o freeze() {
        return this;
    }

    public final int hashCode() {
        return a(this);
    }

    public final String toString() {
        return B3(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        e0.a(this, parcel, i10);
    }

    @Override // ea.o
    public final String zza() {
        return this.f13261g;
    }

    @Override // ea.o
    public final String zzb() {
        return this.f13262h;
    }

    @Override // ea.o
    public final String zzc() {
        return this.f13263i;
    }

    public d0(o oVar) {
        this.f13260f = oVar.c0();
        this.f13261g = oVar.zza();
        this.f13262h = oVar.zzb();
        this.f13263i = oVar.zzc();
    }
}
