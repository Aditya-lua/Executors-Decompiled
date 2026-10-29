package td;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import ee.AbstractRunnableC5098u0;
import ee.C5069g;
import ee.InterfaceC5090q0;
import sb.C11264k;

/* JADX INFO: renamed from: td.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C11592j extends AbstractRunnableC5098u0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte[] f40958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Long f40959c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Parcelable f40960d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11264k f40961e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ IntegrityTokenRequest f40962f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C11601m f40963g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11592j(C11601m c11601m, C11264k c11264k, byte[] bArr, Long l10, Parcelable parcelable, C11264k c11264k2, IntegrityTokenRequest integrityTokenRequest) {
        super(c11264k);
        this.f40958b = bArr;
        this.f40959c = l10;
        this.f40960d = parcelable;
        this.f40961e = c11264k2;
        this.f40962f = integrityTokenRequest;
        this.f40963g = c11601m;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: a */
    public final void mo23843a(Exception exc) {
        if (exc instanceof C5069g) {
            super.mo23843a(new C11565a(-9, exc));
        } else {
            super.mo23843a(exc);
        }
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        try {
            ((InterfaceC5090q0) this.f40963g.f40985f.m23792e()).mo23825F1(C11601m.m43263a(this.f40963g, this.f40958b, this.f40959c, this.f40960d), new BinderC11598l(this.f40963g, this.f40961e));
        } catch (RemoteException e10) {
            this.f40963g.f40980a.m23840b(e10, "requestIntegrityToken(%s)", this.f40962f);
            this.f40961e.m42329d(new C11565a(-100, e10));
        }
    }
}
