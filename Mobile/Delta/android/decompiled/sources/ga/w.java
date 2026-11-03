package ga;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class w extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f18519a;

    public w(sb.k kVar) {
        this.f18519a = kVar;
    }

    @Override // ga.a, ga.e
    public final void z0(DataHolder dataHolder) {
        int iY3 = dataHolder.y3();
        if (iY3 == 0 || iY3 == 3) {
            this.f18519a.c(new da.b(new ea.a(dataHolder), iY3 == 3));
        } else {
            da.f.b(this.f18519a, iY3);
            dataHolder.close();
        }
    }
}
