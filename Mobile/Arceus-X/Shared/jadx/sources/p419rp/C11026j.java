package p419rp;

import android.content.Context;
import androidx.activity.result.IntentSenderRequest;
import com.withpersona.sdk2.inquiry.permissions.C3852a;
import p136ft.InterfaceC5835i;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: rp.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C11026j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC5854c<IntentSenderRequest>> f38985a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<Context> f38986b;

    public C11026j(InterfaceC5835i<AbstractC5854c<IntentSenderRequest>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2) {
        this.f38985a = interfaceC5835i;
        this.f38986b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C11026j m41726a(InterfaceC5835i<AbstractC5854c<IntentSenderRequest>> interfaceC5835i, InterfaceC5835i<Context> interfaceC5835i2) {
        return new C11026j(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3852a m41727c(AbstractC5854c<IntentSenderRequest> abstractC5854c, Context context) {
        return new C3852a(abstractC5854c, context);
    }

    /* JADX INFO: renamed from: b */
    public C3852a m41728b() {
        return m41727c(this.f38985a.get(), this.f38986b.get());
    }
}
