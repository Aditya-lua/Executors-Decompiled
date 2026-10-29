package p037c1;

import android.hardware.camera2.params.SessionConfiguration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: c1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1502a implements InterfaceC1505d {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC1505d> f5778a;

    public C1502a(List<InterfaceC1505d> list) {
        this.f5778a = list;
    }

    @Override // p037c1.InterfaceC1505d
    /* JADX INFO: renamed from: a */
    public InterfaceC1505d.a mo7656a(SessionConfiguration sessionConfiguration) {
        Iterator<InterfaceC1505d> it = this.f5778a.iterator();
        while (it.hasNext()) {
            InterfaceC1505d.a aVarMo7656a = it.next().mo7656a(sessionConfiguration);
            if (aVarMo7656a.m7659a() != 0) {
                return aVarMo7656a;
            }
        }
        return new InterfaceC1505d.a(0, 0, 0L);
    }
}
