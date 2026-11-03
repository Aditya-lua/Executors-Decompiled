package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f26251a;
    public final /* synthetic */ bb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f26252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f26254e;

    public cb(jb jbVar, Bundle bundle, bb bbVar, bb bbVar2, long j10) {
        this.f26251a = bundle;
        this.b = bbVar;
        this.f26252c = bbVar2;
        this.f26253d = j10;
        Objects.requireNonNull(jbVar);
        this.f26254e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26254e.A(this.f26251a, this.b, this.f26252c, this.f26253d);
    }
}
