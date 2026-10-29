package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25600a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f25602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f25603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f25604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f25605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f25606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qa f25607i;

    public i9(qa qaVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f25600a = str;
        this.b = str2;
        this.f25601c = j10;
        this.f25602d = bundle;
        this.f25603e = z10;
        this.f25604f = z11;
        this.f25605g = z12;
        this.f25606h = str3;
        Objects.requireNonNull(qaVar);
        this.f25607i = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25607i.v(this.f25600a, this.b, this.f25601c, this.f25602d, this.f25603e, this.f25604f, this.f25605g, this.f25606h);
    }
}
