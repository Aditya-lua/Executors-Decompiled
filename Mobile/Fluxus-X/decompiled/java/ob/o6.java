package ob;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27637a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6 f27639d;

    public o6(p6 p6Var, String str, String str2) {
        Objects.requireNonNull(p6Var);
        this.f27639d = p6Var;
        o9.s.f(str);
        this.f27637a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            p6 p6Var = this.f27639d;
            this.f27638c = p6Var.p().getString(this.f27637a, null);
        }
        return this.f27638c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f27639d.p().edit();
        editorEdit.putString(this.f27637a, str);
        editorEdit.apply();
        this.f27638c = str;
    }
}
