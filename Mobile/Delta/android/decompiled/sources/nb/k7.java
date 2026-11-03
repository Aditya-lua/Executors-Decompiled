package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26513a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8 f26516e;

    public k7(i8 i8Var, String str, String str2, String str3, long j10) {
        this.f26513a = str;
        this.b = str2;
        this.f26514c = str3;
        this.f26515d = j10;
        Objects.requireNonNull(i8Var);
        this.f26516e = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f26513a;
        if (str == null) {
            i8 i8Var = this.f26516e;
            i8Var.z2().t0(this.b, null);
        } else {
            bb bbVar = new bb(this.f26514c, str, this.f26515d);
            i8 i8Var2 = this.f26516e;
            i8Var2.z2().t0(this.b, bbVar);
        }
    }
}
