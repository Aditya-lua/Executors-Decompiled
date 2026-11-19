package k9;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21275a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21276c;

    public /* synthetic */ m0(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f21275a = str;
        this.b = z10;
        this.f21276c = z13;
    }

    public final boolean a() {
        return this.f21276c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, z9.a] */
    public final f0 b(Context context) {
        return new f0(this.f21275a, this.b, false, z9.b.u2(context), false, true, false);
    }
}
