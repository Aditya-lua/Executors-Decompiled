package d9;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14468a = 1;

    @NonNull
    public a a(Object obj) {
        this.f14468a = (this.f14468a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f14468a;
    }

    @NonNull
    public final a c(boolean z10) {
        this.f14468a = (this.f14468a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
