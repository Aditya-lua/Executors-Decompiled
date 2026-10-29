package cr;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7288z;
import p226jq.EnumC7248a0;
import p298n2.C8870h;
import p526wq.C12520c;

/* JADX INFO: renamed from: cr.b5 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Landroid/content/Context;", "context", "", "fontName", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4213b5 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Typeface m21739a(@NotNull Context context, @NotNull String fontName) {
        Typeface typefaceM35665h;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontName, "fontName");
        String str = fontName + ".ttf";
        C12520c.Companion companion = C12520c.INSTANCE;
        if (companion.m46869a().containsKey(str)) {
            typefaceM35665h = companion.m46869a().get(str);
        } else {
            String[] list = context.getAssets().list("fonts");
            try {
                if (list == null || !C7693m.m31838G(list, str)) {
                    Integer numM30331g = C7288z.m30331g(context, fontName, EnumC7248a0.Font);
                    if (numM30331g != null) {
                        typefaceM35665h = C8870h.m35665h(context, numM30331g.intValue());
                    } else {
                        typefaceM35665h = null;
                    }
                } else {
                    typefaceM35665h = Typeface.createFromAsset(context.getAssets(), "fonts/" + str);
                }
            } catch (Exception unused) {
            }
        }
        C12520c.INSTANCE.m46869a().put(str, typefaceM35665h);
        return typefaceM35665h;
    }
}
