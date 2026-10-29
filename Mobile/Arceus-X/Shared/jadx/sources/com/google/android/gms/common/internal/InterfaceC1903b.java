package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import p074db.BinderC4532n;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1903b extends IInterface {

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.b$a */
    public static abstract class a extends BinderC4532n implements InterfaceC1903b {
        @NonNull
        /* JADX INFO: renamed from: s2 */
        public static InterfaceC1903b m9219s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC1903b ? (InterfaceC1903b) iInterfaceQueryLocalInterface : new C1904c(iBinder);
        }
    }

    @NonNull
    Account zzb();
}
