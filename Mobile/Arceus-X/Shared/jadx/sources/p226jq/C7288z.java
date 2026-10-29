package p226jq;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jq.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Landroid/content/Context;", "", "attrColor", "Landroid/util/TypedValue;", "typedValue", "", "resolveRefs", "c", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)I", "attrBool", "defaultValue", "a", "(Landroid/content/Context;ILandroid/util/TypedValue;ZZ)Z", "attrImage", "e", "(Landroid/content/Context;ILandroid/util/TypedValue;Z)Ljava/lang/Integer;", "", "resourceName", "Ljq/a0;", "resourceType", "g", "(Landroid/content/Context;Ljava/lang/String;Ljq/a0;)Ljava/lang/Integer;", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7288z {
    /* JADX INFO: renamed from: a */
    public static final boolean m30325a(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (context.getTheme().resolveAttribute(i10, typedValue, z10) && typedValue.type == 18) {
            return typedValue.data != 0;
        }
        return z11;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m30326b(Context context, int i10, TypedValue typedValue, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return m30325a(context, i10, typedValue, z10, z11);
    }

    /* JADX INFO: renamed from: c */
    public static final int m30327c(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        return typedValue.data;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m30328d(Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return m30327c(context, i10, typedValue, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Integer m30329e(@NotNull Context context, int i10, @NotNull TypedValue typedValue, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        context.getTheme().resolveAttribute(i10, typedValue, z10);
        if (typedValue.type == 0) {
            return null;
        }
        return Integer.valueOf(typedValue.resourceId);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Integer m30330f(Context context, int i10, TypedValue typedValue, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typedValue = new TypedValue();
        }
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return m30329e(context, i10, typedValue, z10);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Integer m30331g(@NotNull Context context, @NotNull String resourceName, @NotNull EnumC7248a0 resourceType) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        String strM30286b = C7265j.m30286b(resourceName);
        String resourcePackageName = context.getResources().getResourcePackageName(C7282t.f28081s);
        int identifier = context.getResources().getIdentifier(strM30286b, resourceType.name(), resourcePackageName);
        if (identifier <= 0) {
            Resources resources = context.getResources();
            String lowerCase = resourceType.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            identifier = resources.getIdentifier(strM30286b, lowerCase, resourcePackageName);
        }
        if (identifier > 0) {
            return Integer.valueOf(identifier);
        }
        return null;
    }
}
