package p125fb;

import android.content.Context;
import p073da.C4511o;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p305n9.C8926d;

/* JADX INFO: renamed from: fb.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5557r0 extends AbstractC7495e {

    /* JADX INFO: renamed from: k */
    public static final C7491a.a f21349k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.g f21350l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f21351m;

    static {
        C5551p0 c5551p0 = new C5551p0();
        f21349k = c5551p0;
        C7491a.g gVar = new C7491a.g();
        f21350l = gVar;
        f21351m = new C7491a("Games.API", c5551p0, gVar);
    }

    public C5557r0(Context context, C4511o c4511o) {
        super(context, (C7491a<C4511o>) f21351m, c4511o, AbstractC7495e.a.f28860c);
    }

    @Override // p242k9.AbstractC7495e
    /* JADX INFO: renamed from: x */
    public final C8926d.a mo25219x() {
        C8926d.a aVarMo25219x = super.mo25219x();
        if (m31138F() != null) {
            String str = ((C4511o) m31138F()).f18560k;
        }
        return aVarMo25219x;
    }
}
