package ob;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27579a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6 f27582e;

    public m6(p6 p6Var, String str, long j10) {
        Objects.requireNonNull(p6Var);
        this.f27582e = p6Var;
        o9.s.f(str);
        this.f27579a = str;
        this.b = j10;
    }

    public final long a() {
        if (!this.f27580c) {
            this.f27580c = true;
            p6 p6Var = this.f27582e;
            this.f27581d = p6Var.p().getLong(this.f27579a, this.b);
        }
        return this.f27581d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f27582e.p().edit();
        editorEdit.putLong(this.f27579a, j10);
        editorEdit.apply();
        this.f27581d = j10;
    }
}
