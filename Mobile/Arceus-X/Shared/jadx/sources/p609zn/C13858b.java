package p609zn;

import android.content.Context;
import android.net.Uri;
import com.withpersona.sdk2.inquiry.document.C3438a;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;
import p391qq.C10700c;

/* JADX INFO: renamed from: zn.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C13858b implements InterfaceC5830d<C3438a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<Uri>> f48554a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f48555b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10700c> f48556c;

    public C13858b(InterfaceC5835i<AbstractC5854c<Uri>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        this.f48554a = interfaceC5835i;
        this.f48555b = interfaceC5835i2;
        this.f48556c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C13858b m50428a(InterfaceC5835i<AbstractC5854c<Uri>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        return new C13858b(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3438a m50429c(AbstractC5854c<Uri> abstractC5854c, Context context, C10700c c10700c) {
        return new C3438a(abstractC5854c, context, c10700c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3438a get() {
        return m50429c(this.f48554a.get(), this.f48555b.get(), this.f48556c.get());
    }
}
