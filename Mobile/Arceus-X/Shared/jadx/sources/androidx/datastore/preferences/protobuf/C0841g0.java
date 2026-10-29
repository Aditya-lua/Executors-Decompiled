package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0841g0 implements InterfaceC0838f0 {
    /* JADX INFO: renamed from: d */
    public static <E> C0892z.f<E> m3467d(Object obj, long j10) {
        return (C0892z.f) C0872q1.m4002z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0838f0
    /* JADX INFO: renamed from: a */
    public void mo3393a(Object obj, long j10) {
        m3467d(obj, j10).mo3359j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0838f0
    /* JADX INFO: renamed from: b */
    public <E> void mo3394b(Object obj, Object obj2, long j10) {
        C0892z.f fVarM3467d = m3467d(obj, j10);
        C0892z.f fVarM3467d2 = m3467d(obj2, j10);
        int size = fVarM3467d.size();
        int size2 = fVarM3467d2.size();
        if (size > 0 && size2 > 0) {
            if (!fVarM3467d.mo3360n()) {
                fVarM3467d = fVarM3467d.mo3381o(size2 + size);
            }
            fVarM3467d.addAll(fVarM3467d2);
        }
        if (size > 0) {
            fVarM3467d2 = fVarM3467d;
        }
        C0872q1.m3974O(obj, j10, fVarM3467d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0838f0
    /* JADX INFO: renamed from: c */
    public <L> List<L> mo3395c(Object obj, long j10) {
        C0892z.f fVarM3467d = m3467d(obj, j10);
        if (fVarM3467d.mo3360n()) {
            return fVarM3467d;
        }
        int size = fVarM3467d.size();
        C0892z.f fVarMo3381o = fVarM3467d.mo3381o(size == 0 ? 10 : size * 2);
        C0872q1.m3974O(obj, j10, fVarMo3381o);
        return fVarMo3381o;
    }
}
