package us;

import androidx.annotation.NonNull;
import ss.r;
import ss.t;

/* JADX INFO: loaded from: classes3.dex */
public class g implements t {
    @Override // ss.t
    public Object a(@NonNull ss.g gVar, @NonNull r rVar) {
        if (ts.b.a.BULLET == ts.b.f32604a.c(rVar)) {
            return new vs.b(gVar.e(), ts.b.b.c(rVar).intValue());
        }
        return new vs.h(gVar.e(), String.valueOf(ts.b.f32605c.c(rVar)) + ". ");
    }
}
