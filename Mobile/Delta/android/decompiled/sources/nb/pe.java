package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzom;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26686a;
    public final com.google.android.gms.internal.measurement.y6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f26688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final za f26689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f26690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f26691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f26692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26693i;

    public /* synthetic */ pe(long j10, com.google.android.gms.internal.measurement.y6 y6Var, String str, Map map, za zaVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f26686a = j10;
        this.b = y6Var;
        this.f26687c = str;
        this.f26688d = map;
        this.f26689e = zaVar;
        this.f26690f = j11;
        this.f26691g = j12;
        this.f26692h = j13;
        this.f26693i = i10;
    }

    public final yd a() {
        return new yd(this.f26687c, this.f26688d, this.f26689e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f26688d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f26686a;
        com.google.android.gms.internal.measurement.y6 y6Var = this.b;
        String str = this.f26687c;
        za zaVar = this.f26689e;
        return new zzom(j10, y6Var.d(), str, bundle, zaVar.zza(), this.f26691g, "");
    }

    public final long c() {
        return this.f26686a;
    }

    public final com.google.android.gms.internal.measurement.y6 d() {
        return this.b;
    }

    public final String e() {
        return this.f26687c;
    }

    public final za f() {
        return this.f26689e;
    }

    public final long g() {
        return this.f26690f;
    }

    public final long h() {
        return this.f26692h;
    }

    public final int i() {
        return this.f26693i;
    }
}
