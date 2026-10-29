package p358pd;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;
import p193ib.AbstractRunnableC6723e;
import p193ib.C6734p;
import p378qd.InterfaceC10503a;
import sb.C11264k;

/* JADX INFO: renamed from: pd.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10205j extends AbstractRunnableC6723e {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f36802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C10199d f36803c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C10207l f36804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10205j(C10207l c10207l, C11264k c11264k, C11264k c11264k2, C10199d c10199d) {
        super(c11264k);
        this.f36802b = c11264k2;
        this.f36803c = c10199d;
        Objects.requireNonNull(c10207l);
        this.f36804d = c10207l;
    }

    @Override // p193ib.AbstractRunnableC6723e
    /* JADX INFO: renamed from: a */
    public final void mo28823a(Exception exc) {
        if (exc instanceof C6734p) {
            super.mo28823a(new C10196a(-5));
        } else {
            super.mo28823a(exc);
        }
    }

    @Override // p193ib.AbstractRunnableC6723e
    /* JADX INFO: renamed from: b */
    public final void mo28824b() {
        try {
            C10207l c10207l = this.f36804d;
            InterfaceC10503a interfaceC10503a = (InterfaceC10503a) c10207l.f36810b.m28844e();
            String packageName = c10207l.f36809a.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("playcore.version.code", 3);
            interfaceC10503a.mo40332y1(packageName, bundle, new BinderC10206k(c10207l, this.f36802b));
        } catch (RemoteException e10) {
            C10207l.f36808c.m28820b(e10, "checkAgeSignals(%s)", this.f36803c);
            this.f36802b.m42329d(new C10196a(-100));
        }
    }
}
