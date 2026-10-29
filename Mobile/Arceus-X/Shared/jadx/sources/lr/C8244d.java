package lr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7288z;
import p226jq.EnumC7248a0;
import p261l2.C7975b;

/* JADX INFO: renamed from: lr.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8244d {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Drawable m33622a(@NotNull StepStyle stepStyle, @NotNull Context context) {
        Integer numM30331g;
        Intrinsics.checkNotNullParameter(stepStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String backgroundImageName = stepStyle.getBackgroundImageName();
        if (backgroundImageName == null || (numM30331g = C7288z.m30331g(context, backgroundImageName, EnumC7248a0.Drawable)) == null) {
            return null;
        }
        return C7975b.m33008f(context, numM30331g.intValue());
    }
}
