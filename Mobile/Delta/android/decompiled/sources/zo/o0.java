package zo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements ft.d<UiStepSavedStateHelper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f37943a;
    public final ft.i<ku.p0> b;

    public o0(ft.i<Context> iVar, ft.i<ku.p0> iVar2) {
        this.f37943a = iVar;
        this.b = iVar2;
    }

    public static o0 a(ft.i<Context> iVar, ft.i<ku.p0> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static UiStepSavedStateHelper c(Context context, ku.p0 p0Var) {
        return new UiStepSavedStateHelper(context, p0Var);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiStepSavedStateHelper get() {
        return c(this.f37943a.get(), this.b.get());
    }
}
