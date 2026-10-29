package dk;

import androidx.p000lifecycle.e0;
import androidx.p000lifecycle.s;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f14742a;

    public class a implements e0<ol.a> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ol.a aVar) {
            b bVar = e.this.f14742a;
            if (aVar == null) {
                aVar = fk.c.f16787k;
            }
            bVar.u(aVar);
        }
    }

    public interface b {
        void u(ol.a aVar);
    }

    public e(b bVar) {
        this.f14742a = bVar;
    }

    public void b(s sVar) {
        fk.c.c().h().i(sVar, new a());
    }
}
