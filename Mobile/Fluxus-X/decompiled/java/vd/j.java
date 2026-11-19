package vd;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ge.u0 {
    public final /* synthetic */ byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f34280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f34281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tb.k f34282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f34283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f34284g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, tb.k kVar, byte[] bArr, Long l10, Parcelable parcelable, tb.k kVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(kVar);
        this.b = bArr;
        this.f34280c = l10;
        this.f34281d = parcelable;
        this.f34282e = kVar2;
        this.f34283f = integrityTokenRequest;
        this.f34284g = mVar;
    }

    @Override // ge.u0
    public final void a(Exception exc) {
        if (exc instanceof ge.g) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // ge.u0
    public final void b() {
        try {
            ((ge.q0) this.f34284g.f34303f.e()).e1(m.a(this.f34284g, this.b, this.f34280c, this.f34281d), new l(this.f34284g, this.f34282e));
        } catch (RemoteException e10) {
            this.f34284g.f34299a.b(e10, "requestIntegrityToken(%s)", this.f34283f);
            this.f34282e.d(new a(-100, e10));
        }
    }
}
