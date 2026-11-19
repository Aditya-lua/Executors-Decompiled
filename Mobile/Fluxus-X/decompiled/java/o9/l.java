package o9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface l extends IInterface {

    public static abstract class a extends eb.n implements l {
        @NonNull
        public static l s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new v1(iBinder);
        }
    }

    @NonNull
    Account zzb();
}
