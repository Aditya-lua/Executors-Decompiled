package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f25561a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb f25562c;

    public gb(jb jbVar, bb bbVar, long j10) {
        this.f25561a = bbVar;
        this.b = j10;
        Objects.requireNonNull(jbVar);
        this.f25562c = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.f25562c;
        jbVar.C(this.f25561a, false, this.b);
        jbVar.f25633e = null;
        jbVar.f25625a.J().u(null);
    }
}
