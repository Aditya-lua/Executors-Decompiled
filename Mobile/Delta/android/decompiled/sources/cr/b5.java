package cr;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "fontName", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b5 {
    @Nullable
    public static final Typeface a(@NotNull Context context, @NotNull String fontName) {
        Typeface typefaceH;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        String str = fontName + ".ttf";
        wq.c.Companion companion = wq.c.INSTANCE;
        if (companion.a().containsKey(str)) {
            typefaceH = companion.a().get(str);
        } else {
            String[] list = context.getAssets().list("fonts");
            try {
                if (list == null || !kotlin.collections.m.G(list, str)) {
                    Integer numG = jq.z.g(context, fontName, jq.a0.Font);
                    if (numG != null) {
                        typefaceH = n2.h.h(context, numG.intValue());
                    } else {
                        typefaceH = null;
                    }
                } else {
                    typefaceH = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
                }
            } catch (Exception unused) {
            }
        }
        wq.c.INSTANCE.a().put(str, typefaceH);
        return typefaceH;
    }
}
