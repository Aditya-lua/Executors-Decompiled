package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27617a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f27619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f27620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f27621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f27622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f27623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ va f27624i;

    public n9(va vaVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f27617a = str;
        this.b = str2;
        this.f27618c = j10;
        this.f27619d = bundle;
        this.f27620e = z10;
        this.f27621f = z11;
        this.f27622g = z12;
        this.f27623h = str3;
        Objects.requireNonNull(vaVar);
        this.f27624i = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27624i.v(this.f27617a, this.b, this.f27618c, this.f27619d, this.f27620e, this.f27621f, this.f27622g, this.f27623h);
    }
}
