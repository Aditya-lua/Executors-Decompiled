package p243ka;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzi;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzr;
import java.util.List;
import p125fb.C5496a;
import p125fb.C5536k0;

/* JADX INFO: renamed from: ka.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7532r extends C5496a implements IInterface {
    public C7532r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.v2.appshortcuts.IAppShortcutsService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m31178t2(InterfaceC7534t interfaceC7534t, zzr zzrVar, List list, List list2) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC7534t);
        C5536k0.m25207c(parcelM25149r2, zzrVar);
        parcelM25149r2.writeTypedList(list);
        parcelM25149r2.writeTypedList(list2);
        m25150s2(3, parcelM25149r2);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m31179u2(InterfaceC7534t interfaceC7534t, zzr zzrVar, zzi zziVar) {
        Parcel parcelM25149r2 = m25149r2();
        C5536k0.m25208d(parcelM25149r2, interfaceC7534t);
        C5536k0.m25207c(parcelM25149r2, zzrVar);
        C5536k0.m25207c(parcelM25149r2, zziVar);
        m25150s2(4, parcelM25149r2);
    }
}
