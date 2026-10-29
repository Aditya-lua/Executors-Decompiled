package dk;

import androidx.p616lifecycle.InterfaceC0952e0;
import androidx.p616lifecycle.InterfaceC0980s;
import fk.C5654c;
import p337ol.EnumC9799a;

/* JADX INFO: renamed from: dk.e */
/* JADX INFO: loaded from: classes2.dex */
public class C4636e {

    /* JADX INFO: renamed from: a */
    public b f19012a;

    /* JADX INFO: renamed from: dk.e$a */
    public class a implements InterfaceC0952e0<EnumC9799a> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // androidx.p616lifecycle.InterfaceC0952e0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4884a(EnumC9799a enumC9799a) {
            b bVar = C4636e.this.f19012a;
            if (enumC9799a == null) {
                enumC9799a = C5654c.f21700k;
            }
            bVar.mo14822u(enumC9799a);
        }
    }

    /* JADX INFO: renamed from: dk.e$b */
    public interface b {
        /* JADX INFO: renamed from: u */
        void mo14822u(EnumC9799a enumC9799a);
    }

    public C4636e(b bVar) {
        this.f19012a = bVar;
    }

    /* JADX INFO: renamed from: b */
    public void m22859b(InterfaceC0980s interfaceC0980s) {
        C5654c.m25669c().m25676h().m4857i(interfaceC0980s, new a());
    }
}
