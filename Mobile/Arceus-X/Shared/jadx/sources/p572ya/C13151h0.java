package p572ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import p268l9.InterfaceC8036g;

/* JADX INFO: renamed from: ya.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13151h0 extends C13136a implements IInterface {
    public C13151h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m48751t2(InterfaceC13169z interfaceC13169z, BeginSignInRequest beginSignInRequest) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC13169z);
        C13163t.m48767c(parcelM48744r2, beginSignInRequest);
        m48745s2(1, parcelM48744r2);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m48752u2(InterfaceC13141c0 interfaceC13141c0, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC13141c0);
        C13163t.m48767c(parcelM48744r2, getPhoneNumberHintIntentRequest);
        parcelM48744r2.writeString(str);
        m48745s2(4, parcelM48744r2);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m48753v2(InterfaceC13145e0 interfaceC13145e0, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC13145e0);
        C13163t.m48767c(parcelM48744r2, getSignInIntentRequest);
        m48745s2(3, parcelM48744r2);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m48754w2(InterfaceC8036g interfaceC8036g, String str) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC8036g);
        parcelM48744r2.writeString(str);
        m48745s2(2, parcelM48744r2);
    }
}
