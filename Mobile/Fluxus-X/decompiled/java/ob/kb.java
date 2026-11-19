package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27519a;
    public final /* synthetic */ ob b;

    public kb(ob obVar, long j10) {
        this.f27519a = j10;
        Objects.requireNonNull(obVar);
        this.b = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ob obVar = this.b;
        obVar.f27641a.M().k(this.f27519a);
        obVar.f27649e = null;
    }
}
