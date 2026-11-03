package xo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements dt.d<UiStepSavedStateHelper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f36066a;
    public final dt.i<iu.p0> b;

    public o0(dt.i<Context> iVar, dt.i<iu.p0> iVar2) {
        this.f36066a = iVar;
        this.b = iVar2;
    }

    public static o0 a(dt.i<Context> iVar, dt.i<iu.p0> iVar2) {
        return new o0(iVar, iVar2);
    }

    public static UiStepSavedStateHelper c(Context context, iu.p0 p0Var) {
        return new UiStepSavedStateHelper(context, p0Var);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiStepSavedStateHelper get() {
        return c(this.f36066a.get(), this.b.get());
    }
}
