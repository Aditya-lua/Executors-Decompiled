package p059cq;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p083dq.C4658a;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: cq.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4199d implements C4197b.a {

    /* JADX INFO: renamed from: a */
    public final C4198c f17988a;

    public C4199d(C4198c c4198c) {
        this.f17988a = c4198c;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C4197b.a> m21727b(C4198c c4198c) {
        return C5831e.m26182a(new C4199d(c4198c));
    }

    @Override // p059cq.C4197b.a
    /* JADX INFO: renamed from: a */
    public C4197b mo21719a(String str, String str2, String str3, String str4, SelfieType selfieType, String str5, List<? extends Selfie> list, @Nullable String str6, CameraProperties cameraProperties, long j10, @Nullable String str7, C4658a c4658a) {
        return this.f17988a.m21726b(str, str2, selfieType, list, str4, str3, str5, str6, cameraProperties, j10, str7, c4658a);
    }
}
