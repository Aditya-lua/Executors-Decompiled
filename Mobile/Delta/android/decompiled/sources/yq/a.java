package yq;

import android.view.View;
import androidx.core.view.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y2.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "", "role", "", "a", "(Landroid/view/View;I)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: yq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"yq/a$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0667a extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f36346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36347e;

        public C0667a(View view, int i10) {
            this.f36346d = view;
            this.f36347e = i10;
        }

        @Override // androidx.core.view.a
        public void g(View host, p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.g(host, info);
            info.E0(this.f36346d.getContext().getString(this.f36347e));
        }
    }

    public static final void a(@NotNull View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        o0.m0(view, new C0667a(view, i10));
    }
}
