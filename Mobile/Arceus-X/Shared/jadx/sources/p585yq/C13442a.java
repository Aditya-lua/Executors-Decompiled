package p585yq;

import android.view.View;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p564y2.C13017p;

/* JADX INFO: renamed from: yq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Landroid/view/View;", "", "role", "", "a", "(Landroid/view/View;I)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13442a {

    /* JADX INFO: renamed from: yq.a$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"yq/a$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Ly2/p;", "info", "", "g", "(Landroid/view/View;Ly2/p;)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends C0582a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f47090d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f47091e;

        public a(View view, int i10) {
            this.f47090d = view;
            this.f47091e = i10;
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View host, C13017p info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.mo2799g(host, info);
            info.m48358E0(this.f47090d.getContext().getString(this.f47091e));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m49045a(@NotNull View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C0625o0.m3040m0(view, new a(view, i10));
    }
}
