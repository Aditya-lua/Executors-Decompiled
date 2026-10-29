package p125fb;

import android.content.Context;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import sb.C11264k;

/* JADX INFO: renamed from: fb.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5499a2 extends AbstractC7495e implements InterfaceC5573w1 {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f21262k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.a f21263l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f21264m;

    static {
        C7491a.g gVar = new C7491a.g();
        f21262k = gVar;
        C5576x1 c5576x1 = new C5576x1();
        f21263l = c5576x1;
        f21264m = new C7491a("GamesConnect.API", c5576x1, gVar);
    }

    public C5499a2(Context context, C5552p1 c5552p1) {
        super(context, (C7491a<C5552p1>) f21264m, c5552p1, AbstractC7495e.a.f28860c);
    }

    @Override // p125fb.InterfaceC5573w1
    /* JADX INFO: renamed from: f */
    public final Task mo25152f(final zzq zzqVar, boolean z10) {
        AbstractC8078u abstractC8078uM33285a = AbstractC8078u.m33280c().m33286b(new InterfaceC8066q() { // from class: fb.z1
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                ((C5523g2) ((C5503b2) obj).getService()).m25186t2(new BinderC5579y1(this.f21372a, (C11264k) obj2), zzqVar);
            }
        }).m33289e(6737).m33287c(z10).m33285a();
        return z10 ? m31136D(abstractC8078uM33285a) : m31150y(abstractC8078uM33285a);
    }
}
