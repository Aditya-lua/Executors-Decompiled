package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f27564a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ob f27565c;

    public lb(ob obVar, gb gbVar, long j10) {
        this.f27564a = gbVar;
        this.b = j10;
        Objects.requireNonNull(obVar);
        this.f27565c = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ob obVar = this.f27565c;
        obVar.C(this.f27564a, false, this.b);
        obVar.f27649e = null;
        obVar.f27641a.J().u(null);
    }
}
