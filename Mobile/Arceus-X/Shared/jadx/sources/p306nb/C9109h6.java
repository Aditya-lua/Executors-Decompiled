package p306nb;

import android.content.SharedPreferences;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.h6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9109h6 {

    /* JADX INFO: renamed from: a */
    public final String f33000a;

    /* JADX INFO: renamed from: b */
    public final long f33001b;

    /* JADX INFO: renamed from: c */
    public boolean f33002c;

    /* JADX INFO: renamed from: d */
    public long f33003d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9157k6 f33004e;

    public C9109h6(C9157k6 c9157k6, String str, long j10) {
        Objects.requireNonNull(c9157k6);
        this.f33004e = c9157k6;
        C8953m.m36041f(str);
        this.f33000a = str;
        this.f33001b = j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m36345a() {
        if (!this.f33002c) {
            this.f33002c = true;
            C9157k6 c9157k6 = this.f33004e;
            this.f33003d = c9157k6.m36443p().getLong(this.f33000a, this.f33001b);
        }
        return this.f33003d;
    }

    /* JADX INFO: renamed from: b */
    public final void m36346b(long j10) {
        SharedPreferences.Editor editorEdit = this.f33004e.m36443p().edit();
        editorEdit.putLong(this.f33000a, j10);
        editorEdit.apply();
        this.f33003d = j10;
    }
}
