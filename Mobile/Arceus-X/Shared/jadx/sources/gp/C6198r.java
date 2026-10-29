package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: gp.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C6198r implements InterfaceC5830d<String> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23610a;

    public C6198r(C3707f c3707f) {
        this.f23610a = c3707f;
    }

    /* JADX INFO: renamed from: a */
    public static C6198r m27297a(C3707f c3707f) {
        return new C6198r(c3707f);
    }

    /* JADX INFO: renamed from: c */
    public static String m27298c(C3707f c3707f) {
        return (String) C5834h.m26194e(c3707f.getServerEndpoint());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m27298c(this.f23610a);
    }
}
