package nb;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25621a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f25623d;

    public j6(k6 k6Var, String str, String str2) {
        Objects.requireNonNull(k6Var);
        this.f25623d = k6Var;
        n9.m.f(str);
        this.f25621a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            k6 k6Var = this.f25623d;
            this.f25622c = k6Var.p().getString(this.f25621a, null);
        }
        return this.f25622c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f25623d.p().edit();
        editorEdit.putString(this.f25621a, str);
        editorEdit.apply();
        this.f25622c = str;
    }
}
