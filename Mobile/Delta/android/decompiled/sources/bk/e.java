package bk;

import androidx.p000lifecycle.e0;
import androidx.p000lifecycle.s;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f4334a;

    public class a implements e0<ml.a> {
        public a() {
        }

        @Override // androidx.p000lifecycle.e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ml.a aVar) {
            b bVar = e.this.f4334a;
            if (aVar == null) {
                aVar = dk.c.f14983k;
            }
            bVar.a0(aVar);
        }
    }

    public interface b {
        void a0(ml.a aVar);
    }

    public e(b bVar) {
        this.f4334a = bVar;
    }

    public void b(s sVar) {
        dk.c.c().h().i(sVar, new a());
    }
}
