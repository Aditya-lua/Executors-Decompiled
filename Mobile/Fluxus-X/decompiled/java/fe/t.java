package fe;

import ce.v0;
import de.y0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f15974a;
    public final y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f15975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f15976d;

    public t(y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4) {
        this.f15974a = y0Var;
        this.b = y0Var2;
        this.f15975c = y0Var3;
        this.f15976d = y0Var4;
    }

    @Override // de.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((ce.k) this.f15974a).a(), (File) this.b.zza(), (v0) this.f15975c.zza(), de.v0.a(this.f15976d));
    }
}
