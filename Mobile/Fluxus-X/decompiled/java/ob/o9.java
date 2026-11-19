package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27642a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f27643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va f27645e;

    public o9(va vaVar, String str, String str2, Object obj, long j10) {
        this.f27642a = str;
        this.b = str2;
        this.f27643c = obj;
        this.f27644d = j10;
        Objects.requireNonNull(vaVar);
        this.f27645e = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27645e.B(this.f27642a, this.b, this.f27643c, this.f27644d);
    }
}
