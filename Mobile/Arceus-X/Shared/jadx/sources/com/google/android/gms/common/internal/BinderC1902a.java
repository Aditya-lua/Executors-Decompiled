package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.a */
/* JADX INFO: loaded from: classes.dex */
public class BinderC1902a extends InterfaceC1903b.a {
    /* JADX INFO: renamed from: t2 */
    public static Account m9218t2(@NonNull InterfaceC1903b interfaceC1903b) {
        if (interfaceC1903b == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC1903b.zzb();
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
