package p083dq;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: dq.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4660c implements C4658a.b {

    /* JADX INFO: renamed from: a */
    public final C4659b f19129a;

    public C4660c(C4659b c4659b) {
        this.f19129a = c4659b;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C4658a.b> m22923b(C4659b c4659b) {
        return C5831e.m26182a(new C4660c(c4659b));
    }

    @Override // p083dq.C4658a.b
    /* JADX INFO: renamed from: a */
    public C4658a mo22918a(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return this.f19129a.m22922b(str, str2, str3, list, l10);
    }
}
