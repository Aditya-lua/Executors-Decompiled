package lk;

import androidx.p000lifecycle.e0;
import androidx.p000lifecycle.s;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f22278a;

    public class a implements e0<cm.a> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(cm.a aVar) {
            b bVar = e.this.f22278a;
            if (aVar == null) {
                aVar = nk.c.f25799k;
            }
            bVar.g0(aVar);
        }
    }

    public interface b {
        void g0(cm.a aVar);
    }

    public e(b bVar) {
        this.f22278a = bVar;
    }

    public void b(s sVar) {
        nk.c.c().h().i(sVar, new a());
    }
}
