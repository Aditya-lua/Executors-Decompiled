package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26004a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w5 f26006d;

    public u5(w5 w5Var, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(w5Var);
        this.f26006d = w5Var;
        this.f26004a = i10;
        this.b = z10;
        this.f26005c = z11;
    }

    public final void a(String str) {
        this.f26006d.y(this.f26004a, this.b, this.f26005c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f26006d.y(this.f26004a, this.b, this.f26005c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f26006d.y(this.f26004a, this.b, this.f26005c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f26006d.y(this.f26004a, this.b, this.f26005c, str, obj, obj2, obj3);
    }
}
