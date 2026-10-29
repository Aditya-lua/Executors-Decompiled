package va;

import android.content.Context;
import com.google.android.gms.internal.appindex.zzk;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public final class c extends v8.h {
    public final t0 b;

    public c(Context context) {
        this.b = new t0(context);
    }

    @Override // v8.h
    public final Task<Void> a(v8.a aVar) {
        return c(aVar);
    }

    public final Task c(v8.a aVar) {
        zzk[] zzkVarArr = new zzk[1];
        if (aVar != null) {
            if (!(aVar instanceof zzk)) {
                return sb.m.e(new v8.d("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects."));
            }
            zzkVarArr[0] = (zzk) aVar;
        }
        return this.b.D(new r0(this, zzkVarArr));
    }
}
