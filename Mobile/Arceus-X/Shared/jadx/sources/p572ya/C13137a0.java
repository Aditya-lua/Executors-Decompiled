package p572ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* JADX INFO: renamed from: ya.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13137a0 extends C13136a implements IInterface {
    public C13137a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m48746t2(InterfaceC13149g0 interfaceC13149g0, SavePasswordRequest savePasswordRequest) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC13149g0);
        C13163t.m48767c(parcelM48744r2, savePasswordRequest);
        m48745s2(2, parcelM48744r2);
    }
}
