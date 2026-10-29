package p306nb;

import android.content.SharedPreferences;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9077f6 {

    /* JADX INFO: renamed from: a */
    public final String f32911a;

    /* JADX INFO: renamed from: b */
    public final boolean f32912b;

    /* JADX INFO: renamed from: c */
    public boolean f32913c;

    /* JADX INFO: renamed from: d */
    public boolean f32914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9157k6 f32915e;

    public C9077f6(C9157k6 c9157k6, String str, boolean z10) {
        Objects.requireNonNull(c9157k6);
        this.f32915e = c9157k6;
        C8953m.m36041f(str);
        this.f32911a = str;
        this.f32912b = z10;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36295a() {
        if (!this.f32913c) {
            this.f32913c = true;
            C9157k6 c9157k6 = this.f32915e;
            this.f32914d = c9157k6.m36443p().getBoolean(this.f32911a, this.f32912b);
        }
        return this.f32914d;
    }

    /* JADX INFO: renamed from: b */
    public final void m36296b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f32915e.m36443p().edit();
        editorEdit.putBoolean(this.f32911a, z10);
        editorEdit.apply();
        this.f32914d = z10;
    }
}
