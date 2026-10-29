package za;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import l9.q;
import l9.u;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a9.b {
    public b(Context context) {
        super(context);
    }

    @Override // a9.b
    public final Task<Void> P() {
        return D(u.c().b(new q() { // from class: za.j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l9.q
            public final void accept(Object obj, Object obj2) {
                ((f) ((i) obj).getService()).t2(new k(this.f37355a, (sb.k) obj2));
            }
        }).d(c.f37351c).e(1567).a());
    }
}
