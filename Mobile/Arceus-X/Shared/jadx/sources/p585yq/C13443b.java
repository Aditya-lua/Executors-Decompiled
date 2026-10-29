package p585yq;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p226jq.C7283u;
import p601zd.C13772a;

/* JADX INFO: renamed from: yq.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13443b {
    /* JADX INFO: renamed from: a */
    public static final void m49046a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNull(context.getResources().getLayout(C7283u.f28091c));
        } catch (Resources.NotFoundException unused) {
            C13772a.m50189b(context);
        }
    }
}
