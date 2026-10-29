package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements g0 {
    public static <E> a0.i<E> d(Object obj, long j10) {
        return (a0.i) q1.C(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public void a(Object obj, long j10) {
        d(obj, j10).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <E> void b(Object obj, Object obj2, long j10) {
        a0.i iVarD = d(obj, j10);
        a0.i iVarD2 = d(obj2, j10);
        int size = iVarD.size();
        int size2 = iVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!iVarD.n()) {
                iVarD = iVarD.o(size2 + size);
            }
            iVarD.addAll(iVarD2);
        }
        if (size > 0) {
            iVarD2 = iVarD;
        }
        q1.R(obj, j10, iVarD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <L> List<L> c(Object obj, long j10) {
        a0.i iVarD = d(obj, j10);
        if (iVarD.n()) {
            return iVarD;
        }
        int size = iVarD.size();
        a0.i iVarO = iVarD.o(size == 0 ? 10 : size * 2);
        q1.R(obj, j10, iVarO);
        return iVarO;
    }
}
