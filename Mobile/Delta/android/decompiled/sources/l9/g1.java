package l9;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u.a f23422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f23422d = aVar;
    }

    @Override // l9.u
    public final void d(k9.a.b bVar, sb.k kVar) {
        this.f23422d.f23484a.accept(bVar, kVar);
    }
}
