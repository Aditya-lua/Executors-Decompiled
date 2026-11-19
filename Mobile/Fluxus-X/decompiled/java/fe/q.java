package fe;

import ce.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f15968a;
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f15969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f15970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f15971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f15972f;

    public q(a aVar, List list, List list2, long j10, boolean z10, List list3) {
        this.f15972f = aVar;
        this.f15968a = list;
        this.b = list2;
        this.f15969c = j10;
        this.f15970d = z10;
        this.f15971e = list3;
    }

    @Override // ce.i0
    public final void a(int i10) {
        this.f15972f.w(6, i10, null, null, null, null, null);
    }

    @Override // ce.i0
    public final void zza() {
        this.f15972f.v(this.f15968a, this.b, this.f15969c);
    }

    @Override // ce.i0
    public final void zzc() {
        if (this.f15970d) {
            return;
        }
        this.f15972f.t(this.f15971e, this.f15968a, this.b, this.f15969c, true);
    }
}
