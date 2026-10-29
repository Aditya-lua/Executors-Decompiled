package p306nb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2406y6;
import com.google.android.gms.measurement.internal.zzom;
import java.util.Map;

/* JADX INFO: renamed from: nb.pe */
/* JADX INFO: loaded from: classes.dex */
public final class C9245pe {

    /* JADX INFO: renamed from: a */
    public final long f33361a;

    /* JADX INFO: renamed from: b */
    public final C2406y6 f33362b;

    /* JADX INFO: renamed from: c */
    public final String f33363c;

    /* JADX INFO: renamed from: d */
    public final Map f33364d;

    /* JADX INFO: renamed from: e */
    public final EnumC9401za f33365e;

    /* JADX INFO: renamed from: f */
    public final long f33366f;

    /* JADX INFO: renamed from: g */
    public final long f33367g;

    /* JADX INFO: renamed from: h */
    public final long f33368h;

    /* JADX INFO: renamed from: i */
    public final int f33369i;

    public /* synthetic */ C9245pe(long j10, C2406y6 c2406y6, String str, Map map, EnumC9401za enumC9401za, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f33361a = j10;
        this.f33362b = c2406y6;
        this.f33363c = str;
        this.f33364d = map;
        this.f33365e = enumC9401za;
        this.f33366f = j11;
        this.f33367g = j12;
        this.f33368h = j13;
        this.f33369i = i10;
    }

    /* JADX INFO: renamed from: a */
    public final C9388yd m36631a() {
        return new C9388yd(this.f33363c, this.f33364d, this.f33365e, null);
    }

    /* JADX INFO: renamed from: b */
    public final zzom m36632b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f33364d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f33361a;
        C2406y6 c2406y6 = this.f33362b;
        String str = this.f33363c;
        EnumC9401za enumC9401za = this.f33365e;
        return new zzom(j10, c2406y6.m10628d(), str, bundle, enumC9401za.zza(), this.f33367g, "");
    }

    /* JADX INFO: renamed from: c */
    public final long m36633c() {
        return this.f33361a;
    }

    /* JADX INFO: renamed from: d */
    public final C2406y6 m36634d() {
        return this.f33362b;
    }

    /* JADX INFO: renamed from: e */
    public final String m36635e() {
        return this.f33363c;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC9401za m36636f() {
        return this.f33365e;
    }

    /* JADX INFO: renamed from: g */
    public final long m36637g() {
        return this.f33366f;
    }

    /* JADX INFO: renamed from: h */
    public final long m36638h() {
        return this.f33368h;
    }

    /* JADX INFO: renamed from: i */
    public final int m36639i() {
        return this.f33369i;
    }
}
