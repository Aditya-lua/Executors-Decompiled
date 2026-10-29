package p355p9;

import android.content.Context;
import bb.C1298f;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import p242k9.AbstractC7495e;
import p242k9.C7491a;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import p305n9.C8965r;
import p305n9.InterfaceC8963q;
import sb.C11264k;

/* JADX INFO: renamed from: p9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10181d extends AbstractC7495e implements InterfaceC8963q {

    /* JADX INFO: renamed from: k */
    public static final C7491a.g f36749k;

    /* JADX INFO: renamed from: l */
    public static final C7491a.a f36750l;

    /* JADX INFO: renamed from: m */
    public static final C7491a f36751m;

    static {
        C7491a.g gVar = new C7491a.g();
        f36749k = gVar;
        C10180c c10180c = new C10180c();
        f36750l = c10180c;
        f36751m = new C7491a("ClientTelemetry.API", c10180c, gVar);
    }

    public C10181d(Context context, C8965r c8965r) {
        super(context, (C7491a<C8965r>) f36751m, c8965r, AbstractC7495e.a.f28860c);
    }

    @Override // p305n9.InterfaceC8963q
    /* JADX INFO: renamed from: c */
    public final Task<Void> mo36065c(final TelemetryData telemetryData) {
        AbstractC8078u.a aVarM33280c = AbstractC8078u.m33280c();
        aVarM33280c.m33288d(C1298f.f5334a);
        aVarM33280c.m33287c(false);
        aVarM33280c.m33286b(new InterfaceC8066q() { // from class: p9.b
            /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                C7491a.g gVar = C10181d.f36749k;
                ((C10178a) ((C10182e) obj).getService()).m39204u2(telemetryData);
                ((C11264k) obj2).m42328c(null);
            }
        });
        return m31150y(aVarM33280c.m33285a());
    }
}
