package cj;

import android.app.Activity;
import android.view.WindowManager;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcj/l;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcj/p;", "result", "", "productId", "", "c", "(Landroid/app/Activity;Lcj/p;Ljava/lang/CharSequence;)V", "message", "b", "(Landroid/app/Activity;Ljava/lang/CharSequence;)V", "", "a", "(Ljava/lang/CharSequence;)Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f5030a = new l();

    public static final void b(@NotNull Activity activity, @NotNull CharSequence message) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(message, "message");
        androidx.appcompat.app.a aVarA = new androidx.appcompat.app.a.C0009a(activity).a();
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        TextView textView = new TextView(activity);
        String string = activity.getString(q0.W);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int iN0 = StringsKt.n0(message.toString(), string, 0, false, 6, null);
        fk.b.b(textView, message.toString(), new fk.c(activity, null, string, iN0, iN0 + string.length()));
        textView.setTextSize(20.0f);
        textView.setEllipsize(null);
        aVarA.x(textView, 150, 100, 150, 100);
        aVarA.setCanceledOnTouchOutside(true);
        try {
            aVarA.show();
        } catch (WindowManager.BadTokenException e10) {
            ek.q.k("PurchaseHelper", "Unable to show contact support dialog: " + e10.getMessage());
        }
    }

    public static final void c(@NotNull Activity activity, @NotNull p result, @Nullable CharSequence productId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zA = f5030a.a(productId);
        ek.q.b("PurchaseHelper", "isBonusItemEnabled = " + zA);
        CharSequence charSequenceC = result.c(activity);
        if (result.f()) {
            Intrinsics.checkNotNull(charSequenceC);
            b(activity, charSequenceC);
            return;
        }
        if (!(activity instanceof com.roblox.client.b)) {
            ek.q.k("PurchaseHelper", "Purchase finished dialog requires a RobloxBaseActivity.");
            return;
        }
        if (!zA) {
            ((com.roblox.client.b) activity).V(charSequenceC.toString());
            return;
        }
        String string = activity.getString(q0.f30579u1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(q0.f30576t1);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        ((com.roblox.client.b) activity).F1(string2, string);
    }

    public final boolean a(CharSequence productId) {
        if (!rh.h.a().s5() || productId == null) {
            return false;
        }
        String strO0 = rh.h.a().O0();
        Intrinsics.checkNotNullExpressionValue(strO0, "UpsellRobuxBonusItemProductIdList(...)");
        return StringsKt.a0(strO0, productId, false, 2, null);
    }
}
