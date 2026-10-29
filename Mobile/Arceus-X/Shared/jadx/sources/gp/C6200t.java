package gp;

import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p231jv.C7397y;

/* JADX INFO: renamed from: gp.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C6200t implements InterfaceC5830d<UploadService> {

    /* JADX INFO: renamed from: a */
    public final C3707f f23613a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7397y> f23614b;

    public C6200t(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        this.f23613a = c3707f;
        this.f23614b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C6200t m27303a(C3707f c3707f, InterfaceC5835i<C7397y> interfaceC5835i) {
        return new C6200t(c3707f, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static UploadService m27304c(C3707f c3707f, C7397y c7397y) {
        return (UploadService) C5834h.m26194e(c3707f.m18768o(c7397y));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UploadService get() {
        return m27304c(this.f23613a, this.f23614b.get());
    }
}
