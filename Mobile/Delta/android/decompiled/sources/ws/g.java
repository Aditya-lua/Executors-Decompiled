package ws;

import androidx.annotation.NonNull;
import us.r;
import us.t;

/* JADX INFO: loaded from: classes3.dex */
public class g implements t {
    @Override // us.t
    public Object a(@NonNull us.g gVar, @NonNull r rVar) {
        if (vs.b.a.BULLET == vs.b.f33468a.c(rVar)) {
            return new xs.b(gVar.e(), vs.b.b.c(rVar).intValue());
        }
        return new xs.h(gVar.e(), String.valueOf(vs.b.f33469c.c(rVar)) + ". ");
    }
}
