package wa;

import android.content.Context;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class c extends w8.h {
    public final u0 b;

    public c(Context context) {
        this.b = new u0(context);
    }

    @Override // w8.h
    public final Task<Void> a(w8.a aVar) {
        return c(aVar);
    }

    public final Task c(w8.a aVar) {
        f0[] f0VarArr = new f0[1];
        if (aVar != null) {
            if (!(aVar instanceof f0)) {
                return tb.m.e(new w8.d("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            f0VarArr[0] = (f0) aVar;
        }
        return this.b.D(new s0(this, f0VarArr));
    }
}
