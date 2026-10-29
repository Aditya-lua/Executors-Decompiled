package p543xd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: xd.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C12783d extends C12780a implements InterfaceC12785f {
    public C12783d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: xd.h */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p543xd.InterfaceC12785f
    /* JADX INFO: renamed from: r1 */
    public final void mo47647r1(String str, Bundle bundle, InterfaceC12787h interfaceC12787h) {
        Parcel parcelM47644r2 = m47644r2();
        parcelM47644r2.writeString(str);
        int i10 = C12782c.f45518a;
        parcelM47644r2.writeInt(1);
        bundle.writeToParcel(parcelM47644r2, 0);
        parcelM47644r2.writeStrongBinder(interfaceC12787h);
        m47645s2(2, parcelM47644r2);
    }
}
