package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2921h0 implements InterfaceC2918g0 {
    /* JADX INFO: renamed from: d */
    public static <E> C2900a0.i<E> m13579d(Object obj, long j10) {
        return (C2900a0.i) C2949q1.m14068C(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2918g0
    /* JADX INFO: renamed from: a */
    public void mo13537a(Object obj, long j10) {
        m13579d(obj, j10).mo13388j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2918g0
    /* JADX INFO: renamed from: b */
    public <E> void mo13538b(Object obj, Object obj2, long j10) {
        C2900a0.i iVarM13579d = m13579d(obj, j10);
        C2900a0.i iVarM13579d2 = m13579d(obj2, j10);
        int size = iVarM13579d.size();
        int size2 = iVarM13579d2.size();
        if (size > 0 && size2 > 0) {
            if (!iVarM13579d.mo13389n()) {
                iVarM13579d = iVarM13579d.mo13390o(size2 + size);
            }
            iVarM13579d.addAll(iVarM13579d2);
        }
        if (size > 0) {
            iVarM13579d2 = iVarM13579d;
        }
        C2949q1.m14083R(obj, j10, iVarM13579d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2918g0
    /* JADX INFO: renamed from: c */
    public <L> List<L> mo13539c(Object obj, long j10) {
        C2900a0.i iVarM13579d = m13579d(obj, j10);
        if (iVarM13579d.mo13389n()) {
            return iVarM13579d;
        }
        int size = iVarM13579d.size();
        C2900a0.i iVarMo13390o = iVarM13579d.mo13390o(size == 0 ? 10 : size * 2);
        C2949q1.m14083R(obj, j10, iVarMo13390o);
        return iVarMo13390o;
    }
}
