package ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends a implements IInterface {
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void t2(z zVar, BeginSignInRequest beginSignInRequest) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, zVar);
        t.c(parcelR2, beginSignInRequest);
        s2(1, parcelR2);
    }

    public final void u2(c0 c0Var, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, c0Var);
        t.c(parcelR2, getPhoneNumberHintIntentRequest);
        parcelR2.writeString(str);
        s2(4, parcelR2);
    }

    public final void v2(e0 e0Var, GetSignInIntentRequest getSignInIntentRequest) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, e0Var);
        t.c(parcelR2, getSignInIntentRequest);
        s2(3, parcelR2);
    }

    public final void w2(l9.g gVar, String str) {
        Parcel parcelR2 = r2();
        t.d(parcelR2, gVar);
        parcelR2.writeString(str);
        s2(2, parcelR2);
    }
}
