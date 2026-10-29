package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25573a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f25576e;

    public h6(k6 k6Var, String str, long j10) {
        Objects.requireNonNull(k6Var);
        this.f25576e = k6Var;
        n9.m.f(str);
        this.f25573a = str;
        this.b = j10;
    }

    public final long a() {
        if (!this.f25574c) {
            this.f25574c = true;
            k6 k6Var = this.f25576e;
            this.f25575d = k6Var.p().getLong(this.f25573a, this.b);
        }
        return this.f25575d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f25576e.p().edit();
        editorEdit.putLong(this.f25573a, j10);
        editorEdit.apply();
        this.f25575d = j10;
    }
}
