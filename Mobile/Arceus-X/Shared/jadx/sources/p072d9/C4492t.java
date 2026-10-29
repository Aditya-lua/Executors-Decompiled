package p072d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p572ya.C13136a;
import p572ya.C13163t;

/* JADX INFO: renamed from: d9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C4492t extends C13136a implements IInterface {
    public C4492t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m22449t2(InterfaceC4491s interfaceC4491s, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC4491s);
        C13163t.m48767c(parcelM48744r2, googleSignInOptions);
        m48745s2(103, parcelM48744r2);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m22450u2(InterfaceC4491s interfaceC4491s, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelM48744r2 = m48744r2();
        C13163t.m48768d(parcelM48744r2, interfaceC4491s);
        C13163t.m48767c(parcelM48744r2, googleSignInOptions);
        m48745s2(102, parcelM48744r2);
    }
}
