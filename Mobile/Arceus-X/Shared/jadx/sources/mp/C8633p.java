package mp;

import android.net.Uri;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C8633p implements InterfaceC5830d<AbstractC5854c<Uri>> {

    /* JADX INFO: renamed from: a */
    public final C8625i f31622a;

    public C8633p(C8625i c8625i) {
        this.f31622a = c8625i;
    }

    /* JADX INFO: renamed from: a */
    public static C8633p m34701a(C8625i c8625i) {
        return new C8633p(c8625i);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<Uri> m34702c(C8625i c8625i) {
        return (AbstractC5854c) C5834h.m26194e(c8625i.m34684c());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<Uri> get() {
        return m34702c(this.f31622a);
    }
}
