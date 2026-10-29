package p571y9;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p074db.BinderC4532n;

/* JADX INFO: renamed from: y9.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC13133a extends IInterface {

    /* JADX INFO: renamed from: y9.a$a */
    public static abstract class a extends BinderC4532n implements InterfaceC13133a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* JADX INFO: renamed from: s2 */
        public static InterfaceC13133a m48741s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC13133a ? (InterfaceC13133a) iInterfaceQueryLocalInterface : new C13135c(iBinder);
        }
    }
}
