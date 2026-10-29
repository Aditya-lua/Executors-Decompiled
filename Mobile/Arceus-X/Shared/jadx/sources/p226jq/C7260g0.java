package p226jq;

import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jq.g0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aM\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Landroid/view/View;", "snackbarContainer", "", "error", "Lkotlin/Function0;", "", "onDismissed", "anchorView", "", "maxLines", "duration", "a", "(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;II)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7260g0 {

    /* JADX INFO: renamed from: jq.g0$a */
    @Metadata(m31664d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"jq/g0$a", "Lcom/google/android/material/snackbar/Snackbar$a;", "Lcom/google/android/material/snackbar/Snackbar;", "transientBottomBar", "", NotificationCompat.CATEGORY_EVENT, "", "d", "(Lcom/google/android/material/snackbar/Snackbar;I)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends Snackbar.C2849a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f28025a;

        public a(Function0<Unit> function0) {
            this.f28025a = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;I)V */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC2846r
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo13036a(Snackbar transientBottomBar, int event) {
            this.f28025a.invoke();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m30277a(@NotNull View snackbarContainer, @Nullable String str, @NotNull Function0<Unit> onDismissed, @Nullable View view, int i10, int i11) {
        Intrinsics.checkNotNullParameter(snackbarContainer, "snackbarContainer");
        Intrinsics.checkNotNullParameter(onDismissed, "onDismissed");
        if (str == null) {
            return;
        }
        Snackbar snackbarM13048l0 = Snackbar.m13048l0(snackbarContainer, str, i11);
        Intrinsics.checkNotNullExpressionValue(snackbarM13048l0, "make(...)");
        snackbarM13048l0.m13053o0(i10);
        if (view != null) {
            snackbarM13048l0.m13012U(view);
        }
        snackbarM13048l0.m13025u(new a(onDismissed)).mo13017Z();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m30278b(View view, String str, Function0 function0, View view2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            view2 = null;
        }
        View view3 = view2;
        if ((i12 & 16) != 0) {
            i10 = 2;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = 0;
        }
        m30277a(view, str, function0, view3, i13, i11);
    }
}
