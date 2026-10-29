package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzom;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25865a;
    public final com.google.android.gms.internal.measurement.y6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final za f25868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f25870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f25871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f25872i;

    public /* synthetic */ pe(long j10, com.google.android.gms.internal.measurement.y6 y6Var, String str, Map map, za zaVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f25865a = j10;
        this.b = y6Var;
        this.f25866c = str;
        this.f25867d = map;
        this.f25868e = zaVar;
        this.f25869f = j11;
        this.f25870g = j12;
        this.f25871h = j13;
        this.f25872i = i10;
    }

    public final yd a() {
        return new yd(this.f25866c, this.f25867d, this.f25868e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f25867d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f25865a;
        com.google.android.gms.internal.measurement.y6 y6Var = this.b;
        String str = this.f25866c;
        za zaVar = this.f25868e;
        return new zzom(j10, y6Var.d(), str, bundle, zaVar.zza(), this.f25870g, "");
    }

    public final long c() {
        return this.f25865a;
    }

    public final com.google.android.gms.internal.measurement.y6 d() {
        return this.b;
    }

    public final String e() {
        return this.f25866c;
    }

    public final za f() {
        return this.f25868e;
    }

    public final long g() {
        return this.f25869f;
    }

    public final long h() {
        return this.f25871h;
    }

    public final int i() {
        return this.f25872i;
    }
}
