package sd;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends de.u0 {
    public final /* synthetic */ byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f30637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f30638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f30639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f30640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f30641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, sb.k kVar, byte[] bArr, Long l10, Parcelable parcelable, sb.k kVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(kVar);
        this.b = bArr;
        this.f30637c = l10;
        this.f30638d = parcelable;
        this.f30639e = kVar2;
        this.f30640f = integrityTokenRequest;
        this.f30641g = mVar;
    }

    @Override // de.u0
    public final void a(Exception exc) {
        if (exc instanceof de.g) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // de.u0
    public final void b() {
        try {
            ((de.q0) this.f30641g.f30660f.e()).f1(m.a(this.f30641g, this.b, this.f30637c, this.f30638d), new l(this.f30641g, this.f30639e));
        } catch (RemoteException e10) {
            this.f30641g.f30656a.b(e10, "requestIntegrityToken(%s)", this.f30640f);
            this.f30639e.d(new a(-100, e10));
        }
    }
}
