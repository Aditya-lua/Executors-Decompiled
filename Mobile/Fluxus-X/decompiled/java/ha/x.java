package ha;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class x extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f18156a;

    public x(tb.k kVar) {
        this.f18156a = kVar;
    }

    @Override // ha.a, ha.e
    public final void G0(DataHolder dataHolder) {
        int iD3 = dataHolder.D3();
        if (iD3 == 0 || iD3 == 3) {
            this.f18156a.c(new ea.b(new fa.b(dataHolder), iD3 == 3));
        } else {
            ea.h.b(this.f18156a, iD3);
            dataHolder.close();
        }
    }
}
