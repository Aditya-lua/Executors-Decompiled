package po;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import ft.i;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f28806a;

    public e(d dVar) {
        this.f28806a = dVar;
    }

    public static i<c.a> b(d dVar) {
        return ft.e.a(new e(dVar));
    }

    @Override // po.c.a
    public c a(String str, String str2, String str3, String str4, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str5, CameraProperties cameraProperties) {
        return this.f28806a.b(str, str2, str4, str3, governmentIdRequestArguments, str5, cameraProperties);
    }
}
