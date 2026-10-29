package el;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lel/c;", "", "Landroid/content/Context;", "context", "Landroid/util/DisplayMetrics;", "a", "(Landroid/content/Context;)Landroid/util/DisplayMetrics;", "Lel/c$a;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lel/c$a;", "Lel/c;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/DisplayMetrics;", "a", "(Landroid/content/Context;)Landroid/util/DisplayMetrics;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements c {
        @Override // el.c
        @NotNull
        public DisplayMetrics a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
            return displayMetrics;
        }
    }

    @NotNull
    DisplayMetrics a(@NotNull Context context);
}
