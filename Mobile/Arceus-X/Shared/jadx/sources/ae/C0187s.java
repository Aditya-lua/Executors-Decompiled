package ae;

import android.os.RemoteException;
import be.AbstractRunnableC1358r1;
import be.C1334j1;
import java.util.ArrayList;
import java.util.Collection;
import sb.C11264k;

/* JADX INFO: renamed from: ae.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C0187s extends AbstractRunnableC1358r1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collection f582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Collection f583c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1334j1 f584d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11264k f585e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0150a0 f586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187s(C0150a0 c0150a0, C11264k c11264k, Collection collection, Collection collection2, C1334j1 c1334j1, C11264k c11264k2) {
        super(c11264k);
        this.f586f = c0150a0;
        this.f582b = collection;
        this.f583c = collection2;
        this.f584d = c1334j1;
        this.f585e = c11264k2;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.IInterface, be.k0] */
    @Override // be.AbstractRunnableC1358r1
    /* JADX INFO: renamed from: c */
    public final void mo534c() {
        ArrayList arrayListM472i = C0150a0.m472i(this.f582b);
        arrayListM472i.addAll(C0150a0.m471h(this.f583c));
        try {
            this.f584d.m7177b(2);
            this.f586f.f518b.m7151e().mo7168E0(this.f586f.f517a, arrayListM472i, C0150a0.m468b(this.f584d), new BinderC0199y(this.f586f, this.f585e));
        } catch (RemoteException e10) {
            C0150a0.f515c.m7209c(e10, "startInstall(%s,%s)", this.f582b, this.f583c);
            this.f585e.m42329d(new RuntimeException(e10));
        }
    }
}
