package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26394a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f26397e;

    public h6(k6 k6Var, String str, long j10) {
        Objects.requireNonNull(k6Var);
        this.f26397e = k6Var;
        n9.m.f(str);
        this.f26394a = str;
        this.b = j10;
    }

    public final long a() {
        if (!this.f26395c) {
            this.f26395c = true;
            k6 k6Var = this.f26397e;
            this.f26396d = k6Var.p().getLong(this.f26394a, this.b);
        }
        return this.f26396d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f26397e.p().edit();
        editorEdit.putLong(this.f26394a, j10);
        editorEdit.apply();
        this.f26396d = j10;
    }
}
