package dq;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import ft.e;
import ft.i;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f14845a;

    public c(b bVar) {
        this.f14845a = bVar;
    }

    public static i<a.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override // dq.a.b
    public a a(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return this.f14845a.b(str, str2, str3, list, l10);
    }
}
