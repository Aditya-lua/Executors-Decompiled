package ga;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p125fb.C5496a;
import p125fb.C5536k0;

/* JADX INFO: renamed from: ga.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6065h extends C5496a implements IInterface {
    public C6065h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m26907t2(InterfaceC6064g interfaceC6064g, long j10) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC6064g);
        parcelM25149r2.writeLong(j10);
        m25150s2(15501, parcelM25149r2);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m26908u2(long j10) {
        Parcel parcelM25149r2 = m25149r2();
        parcelM25149r2.writeLong(j10);
        m25150s2(5001, parcelM25149r2);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m26909v2(InterfaceC6062e interfaceC6062e) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC6062e);
        m25150s2(5002, parcelM25149r2);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m26910w2(IBinder iBinder, Bundle bundle) {
        Parcel parcelM25149r2 = m25149r2();
        parcelM25149r2.writeStrongBinder(iBinder);
        C5536k0.m25207c(parcelM25149r2, bundle);
        m25150s2(5005, parcelM25149r2);
    }

    /* JADX INFO: renamed from: x2 */
    public final void m26911x2() {
        m25150s2(5006, m25149r2());
    }

    /* JADX INFO: renamed from: y2 */
    public final void m26912y2(InterfaceC6062e interfaceC6062e, String str, IBinder iBinder, Bundle bundle) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC6062e);
        parcelM25149r2.writeString(str);
        parcelM25149r2.writeStrongBinder(iBinder);
        C5536k0.m25207c(parcelM25149r2, bundle);
        m25150s2(5024, parcelM25149r2);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m26913z2(InterfaceC6062e interfaceC6062e, boolean z10) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC6062e);
        parcelM25149r2.writeInt(z10 ? 1 : 0);
        m25150s2(6001, parcelM25149r2);
    }
}
