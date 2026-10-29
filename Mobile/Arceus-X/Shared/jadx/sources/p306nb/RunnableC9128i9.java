package p306nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: nb.i9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9128i9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f33038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Bundle f33039d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f33040e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f33041f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f33042g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f33043h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C9257qa f33044i;

    public RunnableC9128i9(C9257qa c9257qa, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f33036a = str;
        this.f33037b = str2;
        this.f33038c = j10;
        this.f33039d = bundle;
        this.f33040e = z10;
        this.f33041f = z11;
        this.f33042g = z12;
        this.f33043h = str3;
        Objects.requireNonNull(c9257qa);
        this.f33044i = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33044i.m36716v(this.f33036a, this.f33037b, this.f33038c, this.f33039d, this.f33040e, this.f33041f, this.f33042g, this.f33043h);
    }
}
