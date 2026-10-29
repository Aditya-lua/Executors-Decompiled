package p610zo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: zo.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13977o0 implements InterfaceC5830d<UiStepSavedStateHelper> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f48843a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC7906p0> f48844b;

    public C13977o0(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i2) {
        this.f48843a = interfaceC5835i;
        this.f48844b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13977o0 m50512a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i2) {
        return new C13977o0(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static UiStepSavedStateHelper m50513c(Context context, InterfaceC7906p0 interfaceC7906p0) {
        return new UiStepSavedStateHelper(context, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiStepSavedStateHelper get() {
        return m50513c(this.f48843a.get(), this.f48844b.get());
    }
}
