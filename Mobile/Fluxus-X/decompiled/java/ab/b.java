package ab;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import m9.q;
import m9.u;

/* JADX INFO: loaded from: classes.dex */
public final class b extends b9.b {
    public b(Context context) {
        super(context);
    }

    @Override // b9.b
    public final Task<Void> P() {
        return D(u.c().b(new q() { // from class: ab.j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // m9.q
            public final void accept(Object obj, Object obj2) {
                ((f) ((i) obj).getService()).t2(new k(this.f394a, (tb.k) obj2));
            }
        }).d(c.f390c).e(1567).a());
    }
}
