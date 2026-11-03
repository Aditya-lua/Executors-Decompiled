package de;

import ae.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f14631a;
    public final /* synthetic */ List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f14634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f14635f;

    public q(a aVar, List list, List list2, long j10, boolean z10, List list3) {
        this.f14635f = aVar;
        this.f14631a = list;
        this.b = list2;
        this.f14632c = j10;
        this.f14633d = z10;
        this.f14634e = list3;
    }

    @Override // ae.i0
    public final void a(int i10) {
        this.f14635f.w(6, i10, null, null, null, null, null);
    }

    @Override // ae.i0
    public final void zza() {
        this.f14635f.v(this.f14631a, this.b, this.f14632c);
    }

    @Override // ae.i0
    public final void zzc() {
        if (this.f14633d) {
            return;
        }
        this.f14635f.t(this.f14634e, this.f14631a, this.b, this.f14632c, true);
    }
}
