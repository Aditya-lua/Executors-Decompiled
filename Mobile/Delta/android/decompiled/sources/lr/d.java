package lr;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import jq.a0;
import jq.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    @Nullable
    public static final Drawable a(@NotNull StepStyle stepStyle, @NotNull Context context) {
        Integer numG;
        Intrinsics.checkNotNullParameter(stepStyle, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String backgroundImageName = stepStyle.getBackgroundImageName();
        if (backgroundImageName == null || (numG = z.g(context, backgroundImageName, a0.Drawable)) == null) {
            return null;
        }
        return l2.b.f(context, numG.intValue());
    }
}
