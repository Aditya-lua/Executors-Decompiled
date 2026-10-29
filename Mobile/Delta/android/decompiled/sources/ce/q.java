package ce;

import java.util.List;
import zd.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4793a;
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f4795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f4796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f4797f;

    public q(a aVar, List list, List list2, long j10, boolean z10, List list3) {
        this.f4797f = aVar;
        this.f4793a = list;
        this.b = list2;
        this.f4794c = j10;
        this.f4795d = z10;
        this.f4796e = list3;
    }

    @Override // zd.i0
    public final void a(int i10) {
        this.f4797f.w(6, i10, null, null, null, null, null);
    }

    @Override // zd.i0
    public final void zza() {
        this.f4797f.v(this.f4793a, this.b, this.f4794c);
    }

    @Override // zd.i0
    public final void zzc() {
        if (this.f4795d) {
            return;
        }
        this.f4797f.t(this.f4796e, this.f4793a, this.b, this.f4794c, true);
    }
}
