package p306nb;

import android.content.SharedPreferences;
import android.util.Pair;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9125i6 {

    /* JADX INFO: renamed from: a */
    public final String f33026a;

    /* JADX INFO: renamed from: b */
    public final String f33027b;

    /* JADX INFO: renamed from: c */
    public final String f33028c;

    /* JADX INFO: renamed from: d */
    public final long f33029d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9157k6 f33030e;

    public /* synthetic */ C9125i6(C9157k6 c9157k6, String str, long j10, byte[] bArr) {
        Objects.requireNonNull(c9157k6);
        this.f33030e = c9157k6;
        C8953m.m36041f("health_monitor");
        C8953m.m36036a(j10 > 0);
        this.f33026a = "health_monitor:start";
        this.f33027b = "health_monitor:count";
        this.f33028c = "health_monitor:value";
        this.f33029d = j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m36349a(String str, long j10) {
        C9157k6 c9157k6 = this.f33030e;
        c9157k6.mo36088h();
        if (m36352d() == 0) {
            m36351c();
        }
        if (str == null) {
            str = "";
        }
        SharedPreferences sharedPreferencesM36443p = c9157k6.m36443p();
        String str2 = this.f33027b;
        long j11 = sharedPreferencesM36443p.getLong(str2, 0L);
        if (j11 <= 0) {
            SharedPreferences.Editor editorEdit = c9157k6.m36443p().edit();
            editorEdit.putString(this.f33028c, str);
            editorEdit.putLong(str2, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = c9157k6.f33067a.m36308C().m36972q0().nextLong() & Long.MAX_VALUE;
        long j12 = j11 + 1;
        long j13 = Long.MAX_VALUE / j12;
        SharedPreferences.Editor editorEdit2 = c9157k6.m36443p().edit();
        if (jNextLong < j13) {
            editorEdit2.putString(this.f33028c, str);
        }
        editorEdit2.putLong(str2, j12);
        editorEdit2.apply();
    }

    /* JADX INFO: renamed from: b */
    public final Pair m36350b() {
        long jAbs;
        C9157k6 c9157k6 = this.f33030e;
        c9157k6.mo36088h();
        c9157k6.mo36088h();
        long jM36352d = m36352d();
        if (jM36352d == 0) {
            m36351c();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jM36352d - c9157k6.f33067a.mo36325e().mo44175a());
        }
        long j10 = this.f33029d;
        if (jAbs < j10) {
            return null;
        }
        if (jAbs > j10 + j10) {
            m36351c();
            return null;
        }
        String string = c9157k6.m36443p().getString(this.f33028c, null);
        long j11 = c9157k6.m36443p().getLong(this.f33027b, 0L);
        m36351c();
        return (string == null || j11 <= 0) ? C9157k6.f33114A : new Pair(string, Long.valueOf(j11));
    }

    /* JADX INFO: renamed from: c */
    public final void m36351c() {
        C9157k6 c9157k6 = this.f33030e;
        c9157k6.mo36088h();
        long jMo44175a = c9157k6.f33067a.mo36325e().mo44175a();
        SharedPreferences.Editor editorEdit = c9157k6.m36443p().edit();
        editorEdit.remove(this.f33027b);
        editorEdit.remove(this.f33028c);
        editorEdit.putLong(this.f33026a, jMo44175a);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: d */
    public final long m36352d() {
        return this.f33030e.m36443p().getLong(this.f33026a, 0L);
    }
}
