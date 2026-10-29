package y9;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import db.n;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: y9.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0656a extends n implements a {
        public AbstractBinderC0656a() {
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
