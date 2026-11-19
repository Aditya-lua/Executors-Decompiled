package nt;

import androidx.annotation.NonNull;
import lt.r;
import lt.t;

/* JADX INFO: loaded from: classes3.dex */
public class g implements t {
    @Override // lt.t
    public Object a(@NonNull lt.g gVar, @NonNull r rVar) {
        if (mt.b.a.BULLET == mt.b.f24386a.c(rVar)) {
            return new ot.b(gVar.e(), mt.b.b.c(rVar).intValue());
        }
        return new ot.i(gVar.e(), String.valueOf(mt.b.f24387c.c(rVar)) + ". ");
    }
}
