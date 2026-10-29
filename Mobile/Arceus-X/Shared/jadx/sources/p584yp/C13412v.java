package p584yp;

import com.withpersona.sdk2.inquiry.selfie.C3953e;
import com.withpersona.sdk2.inquiry.selfie.C3955g;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import p061ct.InterfaceC4364a;
import p132fn.C5698n0;
import p136ft.C5829c;
import p136ft.InterfaceC5835i;
import p391qq.C10700c;

/* JADX INFO: renamed from: yp.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C13412v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C5698n0> f47025a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C10700c> f47026b;

    public C13412v(InterfaceC5835i<C5698n0> interfaceC5835i, InterfaceC5835i<C10700c> interfaceC5835i2) {
        this.f47025a = interfaceC5835i;
        this.f47026b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13412v m49038a(InterfaceC5835i<C5698n0> interfaceC5835i, InterfaceC5835i<C10700c> interfaceC5835i2) {
        return new C13412v(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3953e m49039c(InterfaceC4364a<C5698n0> interfaceC4364a, PoseInfo poseInfo, boolean z10, C3955g c3955g, C10700c c10700c) {
        return new C3953e(interfaceC4364a, poseInfo, z10, c3955g, c10700c);
    }

    /* JADX INFO: renamed from: b */
    public C3953e m49040b(PoseInfo poseInfo, boolean z10, C3955g c3955g) {
        return m49039c(C5829c.m26178b(this.f47025a), poseInfo, z10, c3955g, this.f47026b.get());
    }
}
