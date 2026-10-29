package zo;

import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<UiStepSavedStateHelper> f37908a;

    public i0(ft.i<UiStepSavedStateHelper> iVar) {
        this.f37908a = iVar;
    }

    public static i0 a(ft.i<UiStepSavedStateHelper> iVar) {
        return new i0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.o c(UiStepSavedStateHelper uiStepSavedStateHelper, String str, String str2, String str3) {
        return new com.withpersona.sdk2.inquiry.internal.o(uiStepSavedStateHelper, str, str2, str3);
    }

    public com.withpersona.sdk2.inquiry.internal.o b(String str, String str2, String str3) {
        return c(this.f37908a.get(), str, str2, str3);
    }
}
