package p514wd;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.review.BinderC2891c;
import java.util.Map;
import p543xd.AbstractRunnableC12789j;
import p543xd.InterfaceC12785f;
import sb.C11264k;

/* JADX INFO: renamed from: wd.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C12353e extends AbstractRunnableC12789j {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11264k f44206b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C12355g f44207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12353e(C12355g c12355g, C11264k c11264k, C11264k c11264k2) {
        super(c11264k);
        this.f44206b = c11264k2;
        this.f44207c = c12355g;
    }

    @Override // p543xd.AbstractRunnableC12789j
    /* JADX INFO: renamed from: a */
    public final void mo46218a() {
        try {
            InterfaceC12785f interfaceC12785f = (InterfaceC12785f) this.f44207c.f44212a.m47673e();
            String str = this.f44207c.f44213b;
            Bundle bundle = new Bundle();
            Map mapM46222a = C12356h.m46222a();
            bundle.putInt("playcore_version_code", ((Integer) mapM46222a.get("java")).intValue());
            if (mapM46222a.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapM46222a.get("native")).intValue());
            }
            if (mapM46222a.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapM46222a.get("unity")).intValue());
            }
            C12355g c12355g = this.f44207c;
            interfaceC12785f.mo47647r1(str, bundle, new BinderC2891c(c12355g, this.f44206b, c12355g.f44213b));
        } catch (RemoteException e10) {
            C12355g.f44211c.m47651b(e10, "error requesting in-app review for %s", this.f44207c.f44213b);
            this.f44206b.m42329d(new RuntimeException(e10));
        }
    }
}
