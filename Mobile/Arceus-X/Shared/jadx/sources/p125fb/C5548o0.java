package p125fb;

import com.google.android.gms.tasks.Task;
import p073da.C4499c;
import p073da.InterfaceC4501e;

/* JADX INFO: renamed from: fb.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5548o0 implements InterfaceC4501e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5541m f21333a;

    /* JADX INFO: renamed from: b */
    public final C5524h f21334b;

    public C5548o0(InterfaceC5541m interfaceC5541m, C5524h c5524h) {
        this.f21333a = interfaceC5541m;
        this.f21334b = c5524h;
    }

    @Override // p073da.InterfaceC4501e
    /* JADX INFO: renamed from: a */
    public final Task<C4499c> mo22462a() {
        return this.f21333a.zzc();
    }
}
