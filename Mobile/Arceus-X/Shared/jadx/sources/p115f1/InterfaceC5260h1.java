package p115f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p140g0.C5902k0;
import p156h1.AbstractC6268i;

/* JADX INFO: renamed from: f1.h1 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5260h1 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5260h1 f20371a = new a();

    /* JADX INFO: renamed from: f1.h1$a */
    public class a implements InterfaceC5260h1 {
        @Override // p115f1.InterfaceC5260h1
        /* JADX INFO: renamed from: c */
        public Set<C5902k0> mo24277c() {
            return new HashSet();
        }

        @Override // p115f1.InterfaceC5260h1
        /* JADX INFO: renamed from: e */
        public List<C5306x> mo24279e(C5902k0 c5902k0) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    default C5306x mo24275a(Size size, C5902k0 c5902k0) {
        return C5306x.f20635g;
    }

    /* JADX INFO: renamed from: b */
    default AbstractC6268i mo24276b(Size size, C5902k0 c5902k0) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    Set<C5902k0> mo24277c();

    /* JADX INFO: renamed from: d */
    default AbstractC6268i mo24278d(C5306x c5306x, C5902k0 c5902k0) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    List<C5306x> mo24279e(C5902k0 c5902k0);
}
