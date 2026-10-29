package p361po;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: po.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10305e implements C10303c.a {

    /* JADX INFO: renamed from: a */
    public final C10304d f37101a;

    public C10305e(C10304d c10304d) {
        this.f37101a = c10304d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C10303c.a> m39602b(C10304d c10304d) {
        return C5831e.m26182a(new C10305e(c10304d));
    }

    @Override // p361po.C10303c.a
    /* JADX INFO: renamed from: a */
    public C10303c mo39594a(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return this.f37101a.m39601b(str, str2, str4, str3, governmentIdRequestArguments, str5, cameraProperties);
    }
}
