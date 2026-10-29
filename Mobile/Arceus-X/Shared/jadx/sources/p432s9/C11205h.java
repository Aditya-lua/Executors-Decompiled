package p432s9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bb.C1293a;
import bb.C1295c;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import p268l9.InterfaceC8036g;

/* JADX INFO: renamed from: s9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C11205h extends C1293a implements IInterface {
    public C11205h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    /* JADX INFO: renamed from: u2 */
    public final void m42236u2(InterfaceC11204g interfaceC11204g, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcelM7086r2 = m7086r2();
        C1295c.m7093d(parcelM7086r2, interfaceC11204g);
        C1295c.m7092c(parcelM7086r2, apiFeatureRequest);
        m7087s2(1, parcelM7086r2);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m42237v2(InterfaceC11204g interfaceC11204g, ApiFeatureRequest apiFeatureRequest, InterfaceC11207j interfaceC11207j) {
        Parcel parcelM7086r2 = m7086r2();
        C1295c.m7093d(parcelM7086r2, interfaceC11204g);
        C1295c.m7092c(parcelM7086r2, apiFeatureRequest);
        C1295c.m7093d(parcelM7086r2, interfaceC11207j);
        m7087s2(2, parcelM7086r2);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m42238w2(InterfaceC8036g interfaceC8036g, InterfaceC11207j interfaceC11207j) {
        Parcel parcelM7086r2 = m7086r2();
        C1295c.m7093d(parcelM7086r2, interfaceC8036g);
        C1295c.m7093d(parcelM7086r2, interfaceC11207j);
        m7087s2(6, parcelM7086r2);
    }
}
