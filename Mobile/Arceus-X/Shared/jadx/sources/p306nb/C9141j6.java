package p306nb;

import android.content.SharedPreferences;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9141j6 {

    /* JADX INFO: renamed from: a */
    public final String f33061a;

    /* JADX INFO: renamed from: b */
    public boolean f33062b;

    /* JADX INFO: renamed from: c */
    public String f33063c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9157k6 f33064d;

    public C9141j6(C9157k6 c9157k6, String str, String str2) {
        Objects.requireNonNull(c9157k6);
        this.f33064d = c9157k6;
        C8953m.m36041f(str);
        this.f33061a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m36369a() {
        if (!this.f33062b) {
            this.f33062b = true;
            C9157k6 c9157k6 = this.f33064d;
            this.f33063c = c9157k6.m36443p().getString(this.f33061a, null);
        }
        return this.f33063c;
    }

    /* JADX INFO: renamed from: b */
    public final void m36370b(String str) {
        SharedPreferences.Editor editorEdit = this.f33064d.m36443p().edit();
        editorEdit.putString(this.f33061a, str);
        editorEdit.apply();
        this.f33063c = str;
    }
}
