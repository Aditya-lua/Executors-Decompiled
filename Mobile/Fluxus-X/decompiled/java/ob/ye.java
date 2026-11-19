package ob;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28013a;
    public final com.google.android.gms.internal.measurement.c7 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f28015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eb f28016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f28019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28020i;

    public /* synthetic */ ye(long j10, com.google.android.gms.internal.measurement.c7 c7Var, String str, Map map, eb ebVar, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f28013a = j10;
        this.b = c7Var;
        this.f28014c = str;
        this.f28015d = map;
        this.f28016e = ebVar;
        this.f28017f = j11;
        this.f28018g = j12;
        this.f28019h = j13;
        this.f28020i = i10;
    }

    public final he a() {
        return new he(this.f28014c, this.f28015d, this.f28016e, null);
    }

    public final ae b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f28015d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f28013a;
        com.google.android.gms.internal.measurement.c7 c7Var = this.b;
        String str = this.f28014c;
        eb ebVar = this.f28016e;
        return new ae(j10, c7Var.d(), str, bundle, ebVar.zza(), this.f28018g, BuildConfig.FLAVOR);
    }

    public final long c() {
        return this.f28013a;
    }

    public final com.google.android.gms.internal.measurement.c7 d() {
        return this.b;
    }

    public final String e() {
        return this.f28014c;
    }

    public final eb f() {
        return this.f28016e;
    }

    public final long g() {
        return this.f28017f;
    }

    public final long h() {
        return this.f28019h;
    }

    public final int i() {
        return this.f28020i;
    }
}
