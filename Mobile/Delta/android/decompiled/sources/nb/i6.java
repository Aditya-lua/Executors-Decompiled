package nb;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25593a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f25596e;

    public /* synthetic */ i6(k6 k6Var, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(k6Var);
        this.f25596e = k6Var;
        n9.m.f("health_monitor");
        n9.m.a(j10 > 0);
        this.f25593a = "health_monitor:start";
        this.b = "health_monitor:count";
        this.f25594c = "health_monitor:value";
        this.f25595d = j10;
    }

    public final void a(String str, long j10) {
        k6 k6Var = this.f25596e;
        k6Var.h();
        if (d() == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesP = k6Var.p();
        String str2 = this.b;
        long j11 = sharedPreferencesP.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = k6Var.p().edit();
            editorEdit.putString(this.f25594c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = k6Var.f25625a.C().q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = k6Var.p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f25594c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    public final Pair b() {
        long jAbs;
        k6 k6Var = this.f25596e;
        k6Var.h();
        k6Var.h();
        long jD = d();
        if (jD == 0) {
            c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jD - k6Var.f25625a.e().a());
        }
        long j10 = this.f25595d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            c();
            return null;
        }
        String string = k6Var.p().getString(this.f25594c, null);
        long j11 = k6Var.p().getLong(this.b, 0L);
        c();
        return (string == null || j11 <= 0) ? k6.A : new Pair(string, Long.valueOf(j11));
    }

    public final void c() {
        k6 k6Var = this.f25596e;
        k6Var.h();
        long jA = k6Var.f25625a.e().a();
        SharedPreferences.Editor editorEdit = k6Var.p().edit();
        editorEdit.remove(this.b);
        editorEdit.remove(this.f25594c);
        editorEdit.putLong(this.f25593a, jA);
        editorEdit.apply();
    }

    public final long d() {
        return this.f25596e.p().getLong(this.f25593a, 0L);
    }
}
