package p166hb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;

/* JADX INFO: renamed from: hb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6331e extends C6327a implements InterfaceC6332f {
    public C6331e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // p166hb.InterfaceC6332f
    /* JADX INFO: renamed from: U */
    public final void mo27638U(zzl zzlVar) {
        Parcel parcelM27636r2 = m27636r2();
        C6346t.m27652c(parcelM27636r2, zzlVar);
        m27637s2(75, parcelM27636r2);
    }

    @Override // p166hb.InterfaceC6332f
    /* JADX INFO: renamed from: q2 */
    public final void mo27639q2(boolean z10) {
        Parcel parcelM27636r2 = m27636r2();
        C6346t.m27650a(parcelM27636r2, z10);
        m27637s2(12, parcelM27636r2);
    }

    @Override // p166hb.InterfaceC6332f
    /* JADX INFO: renamed from: w */
    public final void mo27640w(zzbc zzbcVar) {
        Parcel parcelM27636r2 = m27636r2();
        C6346t.m27652c(parcelM27636r2, zzbcVar);
        m27637s2(59, parcelM27636r2);
    }
}
