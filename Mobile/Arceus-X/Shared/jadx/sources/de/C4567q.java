package de;

import ae.InterfaceC0168i0;
import java.util.List;

/* JADX INFO: renamed from: de.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C4567q implements InterfaceC0168i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f18701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f18702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f18703c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f18704d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f18705e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4551a f18706f;

    public C4567q(C4551a c4551a, List list, List list2, long j10, boolean z10, List list3) {
        this.f18706f = c4551a;
        this.f18701a = list;
        this.f18702b = list2;
        this.f18703c = j10;
        this.f18704d = z10;
        this.f18705e = list3;
    }

    @Override // ae.InterfaceC0168i0
    /* JADX INFO: renamed from: a */
    public final void mo524a(int i10) {
        this.f18706f.m22615w(6, i10, null, null, null, null, null);
    }

    @Override // ae.InterfaceC0168i0
    public final void zza() {
        this.f18706f.m22614v(this.f18701a, this.f18702b, this.f18703c);
    }

    @Override // ae.InterfaceC0168i0
    public final void zzc() {
        if (this.f18704d) {
            return;
        }
        this.f18706f.m22612t(this.f18705e, this.f18701a, this.f18702b, this.f18703c, true);
    }
}
