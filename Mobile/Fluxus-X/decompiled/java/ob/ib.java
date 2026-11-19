package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ib implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f27471a;
    public final /* synthetic */ gb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f27472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ob f27474e;

    public ib(ob obVar, gb gbVar, gb gbVar2, long j10, boolean z10) {
        this.f27471a = gbVar;
        this.b = gbVar2;
        this.f27472c = j10;
        this.f27473d = z10;
        Objects.requireNonNull(obVar);
        this.f27474e = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27474e.B(this.f27471a, this.b, this.f27472c, this.f27473d, null);
    }
}
