package cq;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import ft.e;
import ft.i;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14092a;

    public d(c cVar) {
        this.f14092a = cVar;
    }

    public static i<b.a> b(c cVar) {
        return e.a(new d(cVar));
    }

    @Override // cq.b.a
    public b a(String str, String str2, String str3, String str4, SelfieType selfieType, String str5, List<? extends Selfie> list, @Nullable String str6, CameraProperties cameraProperties, long j10, @Nullable String str7, dq.a aVar) {
        return this.f14092a.b(str, str2, selfieType, list, str4, str3, str5, str6, cameraProperties, j10, str7, aVar);
    }
}
