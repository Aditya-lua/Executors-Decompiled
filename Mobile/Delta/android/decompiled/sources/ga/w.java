package ga;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: loaded from: classes.dex */
public final class w extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sb.k f17980a;

    public w(sb.k kVar) {
        this.f17980a = kVar;
    }

    @Override // ga.a, ga.e
    public final void D0(DataHolder dataHolder) {
        int iY3 = dataHolder.y3();
        if (iY3 == 0 || iY3 == 3) {
            this.f17980a.c(new da.b(new ea.a(dataHolder), iY3 == 3));
        } else {
            da.f.b(this.f17980a, iY3);
            dataHolder.close();
        }
    }
}
