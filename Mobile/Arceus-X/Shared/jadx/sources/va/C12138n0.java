package va;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzg;
import p487v8.AbstractC12101b;
import p487v8.C12103d;
import p487v8.InterfaceC12106g;
import sb.C11268m;

/* JADX INFO: renamed from: va.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12138n0 extends AbstractC12101b {

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final ExecutorC12136m0 f42759b;

    public C12138n0(@NonNull Context context) {
        this.f42759b = new ExecutorC12136m0(new C12124g0(context));
    }

    @Override // p487v8.AbstractC12101b
    /* JADX INFO: renamed from: b */
    public final Task<Void> mo44943b() {
        return this.f42759b.m44972d(zzg.m14389v3());
    }

    @Override // p487v8.AbstractC12101b
    /* JADX INFO: renamed from: c */
    public final Task<Void> mo44944c(InterfaceC12106g... interfaceC12106gArr) {
        Thing[] thingArr;
        if (interfaceC12106gArr == null) {
            thingArr = null;
        } else {
            try {
                int length = interfaceC12106gArr.length;
                Thing[] thingArr2 = new Thing[length];
                System.arraycopy(interfaceC12106gArr, 0, thingArr2, 0, length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                return C11268m.m42335e(new C12103d("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        if (thingArr == null) {
            return C11268m.m42335e(new C12103d("Indexables cannot be null."));
        }
        return this.f42759b.m44972d(zzg.m14390w3(thingArr));
    }
}
