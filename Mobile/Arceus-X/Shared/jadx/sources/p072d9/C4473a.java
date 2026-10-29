package p072d9;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: d9.a */
/* JADX INFO: loaded from: classes.dex */
public class C4473a {

    /* JADX INFO: renamed from: a */
    public int f18511a = 1;

    @NonNull
    /* JADX INFO: renamed from: a */
    public C4473a m22420a(Object obj) {
        this.f18511a = (this.f18511a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* JADX INFO: renamed from: b */
    public int m22421b() {
        return this.f18511a;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final C4473a m22422c(boolean z10) {
        this.f18511a = (this.f18511a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
