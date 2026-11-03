package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26421a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f26423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f26426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f26427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qa f26428i;

    public i9(qa qaVar, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f26421a = str;
        this.b = str2;
        this.f26422c = j10;
        this.f26423d = bundle;
        this.f26424e = z10;
        this.f26425f = z11;
        this.f26426g = z12;
        this.f26427h = str3;
        Objects.requireNonNull(qaVar);
        this.f26428i = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26428i.v(this.f26421a, this.b, this.f26422c, this.f26423d, this.f26424e, this.f26425f, this.f26426g, this.f26427h);
    }
}
