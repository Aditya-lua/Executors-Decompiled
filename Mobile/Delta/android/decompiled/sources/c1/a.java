package c1;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f4315a;

    public a(List<d> list) {
        this.f4315a = list;
    }

    @Override // c1.d
    public d.a a(SessionConfiguration sessionConfiguration) {
        Iterator<d> it = this.f4315a.iterator();
        while (it.hasNext()) {
            d.a aVarA = it.next().a(sessionConfiguration);
            if (aVarA.a() != 0) {
                return aVarA;
            }
        }
        return new d.a(0, 0, 0L);
    }
}
