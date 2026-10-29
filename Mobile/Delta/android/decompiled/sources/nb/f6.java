package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25506a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f25509e;

    public f6(k6 k6Var, String str, boolean z10) {
        Objects.requireNonNull(k6Var);
        this.f25509e = k6Var;
        n9.m.f(str);
        this.f25506a = str;
        this.b = z10;
    }

    public final boolean a() {
        if (!this.f25507c) {
            this.f25507c = true;
            k6 k6Var = this.f25509e;
            this.f25508d = k6Var.p().getBoolean(this.f25506a, this.b);
        }
        return this.f25508d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f25509e.p().edit();
        editorEdit.putBoolean(this.f25506a, z10);
        editorEdit.apply();
        this.f25508d = z10;
    }
}
