package z9;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import eb.n;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: z9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0786a extends n implements a {
        public AbstractBinderC0786a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        public static a s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder);
        }
    }
}
