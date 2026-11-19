package ob;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27507a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6 f27510e;

    public k6(p6 p6Var, String str, boolean z10) {
        Objects.requireNonNull(p6Var);
        this.f27510e = p6Var;
        o9.s.f(str);
        this.f27507a = str;
        this.b = z10;
    }

    public final boolean a() {
        if (!this.f27508c) {
            this.f27508c = true;
            p6 p6Var = this.f27510e;
            this.f27509d = p6Var.p().getBoolean(this.f27507a, this.b);
        }
        return this.f27509d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f27510e.p().edit();
        editorEdit.putBoolean(this.f27507a, z10);
        editorEdit.apply();
        this.f27509d = z10;
    }
}
