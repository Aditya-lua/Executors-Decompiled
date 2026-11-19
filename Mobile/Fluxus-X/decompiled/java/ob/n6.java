package ob;

import android.content.SharedPreferences;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27610a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f27612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6 f27613e;

    public /* synthetic */ n6(p6 p6Var, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(p6Var);
        this.f27613e = p6Var;
        o9.s.f("health_monitor");
        o9.s.a(j10 > 0);
        this.f27610a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.f27611c = "health_monitor:value";
        this.f27612d = j10;
    }

    public final void a(String str, long j10) {
        p6 p6Var = this.f27613e;
        p6Var.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        SharedPreferences sharedPreferencesP = p6Var.p();
        String str2 = this.b;
        long j11 = sharedPreferencesP.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = p6Var.p().edit();
            editorEdit.putString(this.f27611c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = p6Var.f27641a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = p6Var.p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f27611c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair b() {
        long jAbs;
        p6 p6Var = this.f27613e;
        p6Var.h();
        p6Var.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - p6Var.f27641a.e().a());
        }
        long j10 = this.f27612d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = p6Var.p().getString(this.f27611c, null);
        long j11 = p6Var.p().getLong(this.b, 0L);
        c();
        return (string == null || j11 <= 0) ? p6.A : new Pair(string, Long.valueOf(j11));
    }

    public final void c() {
        p6 p6Var = this.f27613e;
        p6Var.h();
        long jA = p6Var.f27641a.e().a();
        SharedPreferences.Editor editorEdit = p6Var.p().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.f27611c);
        editorEdit.putLong(this.f27610a, jA);
        editorEdit.apply();
    }

    public final long d() {
        return this.f27613e.p().getLong(this.f27610a, 0L);
    }
}
