package p083dq;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p059cq.InterfaceC4196a;
import p136ft.InterfaceC5835i;
import p256ku.AbstractC7888l0;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: dq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4659b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C0967l0> f19125a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC4196a> f19126b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC7906p0> f19127c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<AbstractC7888l0> f19128d;

    public C4659b(InterfaceC5835i<C0967l0> interfaceC5835i, InterfaceC5835i<InterfaceC4196a> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3, InterfaceC5835i<AbstractC7888l0> interfaceC5835i4) {
        this.f19125a = interfaceC5835i;
        this.f19126b = interfaceC5835i2;
        this.f19127c = interfaceC5835i3;
        this.f19128d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C4659b m22920a(InterfaceC5835i<C0967l0> interfaceC5835i, InterfaceC5835i<InterfaceC4196a> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3, InterfaceC5835i<AbstractC7888l0> interfaceC5835i4) {
        return new C4659b(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C4658a m22921c(C0967l0 c0967l0, InterfaceC4196a interfaceC4196a, InterfaceC7906p0 interfaceC7906p0, AbstractC7888l0 abstractC7888l0, String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return new C4658a(c0967l0, interfaceC4196a, interfaceC7906p0, abstractC7888l0, str, str2, str3, list, l10);
    }

    /* JADX INFO: renamed from: b */
    public C4658a m22922b(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return m22921c(this.f19125a.get(), this.f19126b.get(), this.f19127c.get(), this.f19128d.get(), str, str2, str3, list, l10);
    }
}
