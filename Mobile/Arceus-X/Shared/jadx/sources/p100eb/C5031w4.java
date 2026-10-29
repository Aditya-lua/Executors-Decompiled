package p100eb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* JADX INFO: renamed from: eb.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5031w4 extends C4894a implements IInterface {
    public C5031w4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: eb.v4 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t2 */
    public final void m23716t2(InterfaceC5025v4 interfaceC5025v4, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        Parcel parcelM23545r2 = m23545r2();
        ClassLoader classLoader = C4902b1.f19630a;
        parcelM23545r2.writeStrongBinder(interfaceC5025v4);
        C4902b1.m23554c(parcelM23545r2, publicKeyCredentialCreationOptions);
        m23546s2(1, parcelM23545r2);
    }
}
