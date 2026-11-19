package e9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13240a = 1;

    @NonNull
    public b a(Object obj) {
        this.f13240a = (this.f13240a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f13240a;
    }

    @NonNull
    public final b c(boolean z10) {
        this.f13240a = (this.f13240a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
