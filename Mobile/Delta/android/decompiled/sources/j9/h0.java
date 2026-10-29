package j9;

import android.content.Context;
import com.google.android.gms.common.zzp;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21193a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21194c;

    public /* synthetic */ h0(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f21193a = str;
        this.b = z10;
        this.f21194c = z13;
    }

    public final boolean a() {
        return this.f21194c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, y9.a] */
    public final zzp b(Context context) {
        return new zzp(this.f21193a, this.b, false, y9.b.u2(context), false, true, false);
    }
}
