package bq;

import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import dt.e;
import dt.i;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4439a;

    public c(b bVar) {
        this.f4439a = bVar;
    }

    public static i<a.b> b(b bVar) {
        return e.a(new c(bVar));
    }

    @Override // bq.a.b
    public a a(String str, String str2, String str3, @Nullable List<PoseInfo> list, @Nullable Long l10) {
        return this.f4439a.b(str, str2, str3, list, l10);
    }
}
