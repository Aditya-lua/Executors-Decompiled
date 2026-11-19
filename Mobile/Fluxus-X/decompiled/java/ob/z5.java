package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28029a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b6 f28031d;

    public z5(b6 b6Var, int i10, boolean z10, boolean z11) {
        Objects.requireNonNull(b6Var);
        this.f28031d = b6Var;
        this.f28029a = i10;
        this.b = z10;
        this.f28030c = z11;
    }

    public final void a(String str) {
        this.f28031d.y(this.f28029a, this.b, this.f28030c, str, null, null, null);
    }

    public final void b(String str, Object obj) {
        this.f28031d.y(this.f28029a, this.b, this.f28030c, str, obj, null, null);
    }

    public final void c(String str, Object obj, Object obj2) {
        this.f28031d.y(this.f28029a, this.b, this.f28030c, str, obj, obj2, null);
    }

    public final void d(String str, Object obj, Object obj2, Object obj3) {
        this.f28031d.y(this.f28029a, this.b, this.f28030c, str, obj, obj2, obj3);
    }
}
