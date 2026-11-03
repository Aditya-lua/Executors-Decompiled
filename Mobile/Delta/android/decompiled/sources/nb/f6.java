package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26327a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k6 f26330e;

    public f6(k6 k6Var, String str, boolean z10) {
        Objects.requireNonNull(k6Var);
        this.f26330e = k6Var;
        n9.m.f(str);
        this.f26327a = str;
        this.b = z10;
    }

    public final boolean a() {
        if (!this.f26328c) {
            this.f26328c = true;
            k6 k6Var = this.f26330e;
            this.f26329d = k6Var.p().getBoolean(this.f26327a, this.b);
        }
        return this.f26329d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f26330e.p().edit();
        editorEdit.putBoolean(this.f26327a, z10);
        editorEdit.apply();
        this.f26329d = z10;
    }
}
