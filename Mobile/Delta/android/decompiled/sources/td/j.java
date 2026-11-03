package td;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends ee.u0 {
    public final /* synthetic */ byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f32246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f32247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb.k f32248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f32249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m f32250g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, sb.k kVar, byte[] bArr, Long l10, Parcelable parcelable, sb.k kVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(kVar);
        this.b = bArr;
        this.f32246c = l10;
        this.f32247d = parcelable;
        this.f32248e = kVar2;
        this.f32249f = integrityTokenRequest;
        this.f32250g = mVar;
    }

    @Override // ee.u0
    public final void a(Exception exc) {
        if (exc instanceof ee.g) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // ee.u0
    public final void b() {
        try {
            ((ee.q0) this.f32250g.f32269f.e()).F1(m.a(this.f32250g, this.b, this.f32246c, this.f32247d), new l(this.f32250g, this.f32248e));
        } catch (RemoteException e10) {
            this.f32250g.f32265a.b(e10, "requestIntegrityToken(%s)", this.f32249f);
            this.f32248e.d(new a(-100, e10));
        }
    }
}
