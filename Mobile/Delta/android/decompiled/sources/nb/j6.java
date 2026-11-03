package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26442a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f26444d;

    public j6(k6 k6Var, String str, String str2) {
        Objects.requireNonNull(k6Var);
        this.f26444d = k6Var;
        n9.m.f(str);
        this.f26442a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            k6 k6Var = this.f26444d;
            this.f26443c = k6Var.p().getString(this.f26442a, null);
        }
        return this.f26443c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f26444d.p().edit();
        editorEdit.putString(this.f26442a, str);
        editorEdit.apply();
        this.f26443c = str;
    }
}
