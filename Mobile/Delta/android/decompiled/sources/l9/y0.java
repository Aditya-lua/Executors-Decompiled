package l9;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p.a f23106e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p.a aVar, k kVar, Feature[] featureArr, boolean z10, int i10) {
        super(kVar, featureArr, z10, i10);
        this.f23106e = aVar;
    }

    @Override // l9.o
    public final void d(k9.a.b bVar, sb.k<Void> kVar) {
        this.f23106e.f23066a.accept(bVar, kVar);
    }
}
