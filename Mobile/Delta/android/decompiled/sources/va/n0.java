package va;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzg;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends v8.b {

    @VisibleForTesting
    public final m0 b;

    public n0(@NonNull Context context) {
        this.b = new m0(new g0(context));
    }

    @Override // v8.b
    public final Task<Void> b() {
        return this.b.d(zzg.v3());
    }

    @Override // v8.b
    public final Task<Void> c(v8.g... gVarArr) {
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
                return sb.m.e(new v8.d("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        if (thingArr == null) {
            return sb.m.e(new v8.d("Indexables cannot be null."));
        }
        return this.b.d(zzg.w3(thingArr));
    }
}
