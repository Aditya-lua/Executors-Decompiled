package p435sq;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: sq.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11445a implements InterfaceC5830d<C4007a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C0967l0> f40458a;

    public C11445a(InterfaceC5835i<C0967l0> interfaceC5835i) {
        this.f40458a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C11445a m42863a(InterfaceC5835i<C0967l0> interfaceC5835i) {
        return new C11445a(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C4007a m42864c(C0967l0 c0967l0) {
        return new C4007a(c0967l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4007a get() {
        return m42864c(this.f40458a.get());
    }
}
