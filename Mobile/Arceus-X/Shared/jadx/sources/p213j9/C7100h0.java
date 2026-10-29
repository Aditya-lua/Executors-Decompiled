package p213j9;

import android.content.Context;
import com.google.android.gms.common.zzp;
import p571y9.BinderC13134b;

/* JADX INFO: renamed from: j9.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7100h0 {

    /* JADX INFO: renamed from: a */
    public final String f27717a;

    /* JADX INFO: renamed from: b */
    public final boolean f27718b;

    /* JADX INFO: renamed from: c */
    public final boolean f27719c;

    public /* synthetic */ C7100h0(String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, byte[] bArr) {
        this.f27717a = str;
        this.f27718b = z10;
        this.f27719c = z13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29897a() {
        return this.f27719c;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, y9.a] */
    /* JADX INFO: renamed from: b */
    public final zzp m29898b(Context context) {
        return new zzp(this.f27717a, this.f27718b, false, BinderC13134b.m48743u2(context), false, true, false);
    }
}
