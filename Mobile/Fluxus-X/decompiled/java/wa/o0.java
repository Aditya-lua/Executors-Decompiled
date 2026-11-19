package wa;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.Thing;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends w8.b {

    @VisibleForTesting
    public final n0 b;

    public o0(@NonNull Context context) {
        this.b = new n0(new h0(context));
    }

    @Override // w8.b
    public final Task<Void> b() {
        return this.b.d(nf.g.A3());
    }

    @Override // w8.b
    public final Task<Void> c(w8.g... gVarArr) {
        Thing[] thingArr;
        if (gVarArr == null) {
            thingArr = null;
        } else {
            try {
                int length = gVarArr.length;
                Thing[] thingArr2 = new Thing[length];
                System.arraycopy(gVarArr, 0, thingArr2, 0, length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                return tb.m.e(new w8.d("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        if (thingArr == null) {
            return tb.m.e(new w8.d("Indexables cannot be null."));
        }
        return this.b.d(nf.g.B3(thingArr));
    }
}
