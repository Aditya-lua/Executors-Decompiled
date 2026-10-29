package za;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import p010a9.AbstractC0100b;
import p268l9.AbstractC8078u;
import p268l9.InterfaceC8066q;
import sb.C11264k;

/* JADX INFO: renamed from: za.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13760b extends AbstractC0100b {
    public C13760b(Context context) {
        super(context);
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TResult>, com.google.android.gms.tasks.Task<java.lang.Void> */
    @Override // p010a9.AbstractC0100b
    /* JADX INFO: renamed from: P */
    public final Task<Void> mo298P() {
        return m31136D(AbstractC8078u.m33280c().m33286b(new InterfaceC8066q() { // from class: za.j
            /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p268l9.InterfaceC8066q
            public final void accept(Object obj, Object obj2) {
                ((C13764f) ((C13767i) obj).getService()).m50176t2(new BinderC13769k(this.f48334a, (C11264k) obj2));
            }
        }).m33288d(C13761c.f48330c).m33289e(1567).m33285a());
    }
}
