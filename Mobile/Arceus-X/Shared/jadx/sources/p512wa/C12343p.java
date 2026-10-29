package p512wa;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p213j9.C7091d;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p242k9.C7492b;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import p539x8.C12769c;
import p539x8.C12772f;
import p539x8.InterfaceC12768b;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: wa.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12343p extends AbstractC7495e<C7491a.d.c> implements InterfaceC12768b {

    /* JADX INFO: renamed from: m */
    public static final C7491a.g<C12331d> f44198m;

    /* JADX INFO: renamed from: n */
    public static final C7491a.a<C12331d, C7491a.d.c> f44199n;

    /* JADX INFO: renamed from: o */
    public static final C7491a<C7491a.d.c> f44200o;

    /* JADX INFO: renamed from: k */
    public final Context f44201k;

    /* JADX INFO: renamed from: l */
    public final C7091d f44202l;

    static {
        C7491a.g<C12331d> gVar = new C7491a.g<>();
        f44198m = gVar;
        C12341n c12341n = new C12341n();
        f44199n = c12341n;
        f44200o = new C7491a<>("AppSet.API", c12341n, gVar);
    }

    public C12343p(Context context, C7091d c7091d) {
        super(context, f44200o, C7491a.d.f28847Jo, AbstractC7495e.a.f28860c);
        this.f44201k = context;
        this.f44202l = c7091d;
    }

    /* JADX DEBUG: Type inference failed for r0v10. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, com.google.android.gms.tasks.Task<x8.c> */
    @Override // p539x8.InterfaceC12768b
    /* JADX INFO: renamed from: j */
    public final Task<C12769c> mo46198j() {
        return this.f44202l.mo29855h(this.f44201k, 212800000) == 0 ? m31151z(AbstractC8078u.m33280c().m33288d(C12772f.f45505a).m33286b(new InterfaceC8066q() { // from class: wa.m
            /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C12334g) ((C12331d) obj).getService()).m46190t2(new zza(null, null), new BinderC12342o(this.f44196a, (C11264k) obj2));
            }
        }).m33287c(false).m33289e(27601).m33285a()) : C11268m.m42335e(new C7492b(new Status(17)));
    }
}
