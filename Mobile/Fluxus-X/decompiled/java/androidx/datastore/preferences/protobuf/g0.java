package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements f0 {
    public static <E> z.f<E> d(Object obj, long j10) {
        return (z.f) q1.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, long j10) {
        d(obj, j10).k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <E> void b(Object obj, Object obj2, long j10) {
        z.f fVarD = d(obj, j10);
        z.f fVarD2 = d(obj2, j10);
        int size = fVarD.size();
        int size2 = fVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!fVarD.o()) {
                fVarD = fVarD.p(size2 + size);
            }
            fVarD.addAll(fVarD2);
        }
        if (size > 0) {
            fVarD2 = fVarD;
        }
        q1.O(obj, j10, fVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public <L> List<L> c(Object obj, long j10) {
        z.f fVarD = d(obj, j10);
        if (fVarD.o()) {
            return fVarD;
        }
        int size = fVarD.size();
        z.f fVarP = fVarD.p(size == 0 ? 10 : size * 2);
        q1.O(obj, j10, fVarP);
        return fVarP;
    }
}
