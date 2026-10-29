package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f25430a;
    public final /* synthetic */ bb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f25431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f25432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f25433e;

    public cb(jb jbVar, Bundle bundle, bb bbVar, bb bbVar2, long j10) {
        this.f25430a = bundle;
        this.b = bbVar;
        this.f25431c = bbVar2;
        this.f25432d = j10;
        Objects.requireNonNull(jbVar);
        this.f25433e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25433e.A(this.f25430a, this.b, this.f25431c, this.f25432d);
    }
}
