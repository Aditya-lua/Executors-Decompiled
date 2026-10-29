package jq;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "c", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "attrBool", "defaultValue", "a", "(Landroid/content/Context;ILandroid/util/TypedValue;ZZ)Z", "attrImage", "e", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)Ljava/lang/Integer;", "", "resourceName", "Ljq/a0;", "resourceType", "g", "(Landroid/content/Context;Ljava/lang/String;Ljq/a0;)Ljava/lang/Integer;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {
    public static final boolean a(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (context.getTheme().resolveAttribute(i10, typedValue, z10) && typedValue.type == 18) {
            return typedValue.data != 0;
        }
        return z11;
    }

    public static /* synthetic */ boolean b(Context context, int i10, TypedValue typedValue, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return a(context, i10, typedValue, z10, z11);
    }

    public static final int c(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    public static /* synthetic */ int d(Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return c(context, i10, typedValue, z10);
    }

    @Nullable
    public static final Integer e(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    public static /* synthetic */ Integer f(Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return e(context, i10, typedValue, z10);
    }

    @Nullable
    public static final Integer g(@NotNull Context context, @NotNull String resourceName, @NotNull a0 resourceType) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        String strB = j.b(resourceName);
        String resourcePackageName = context.getResources().getResourcePackageName(t.f21671s);
        int identifier = context.getResources().getIdentifier(strB, resourceType.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = resourceType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            identifier = resources.getIdentifier(strB, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }
}
