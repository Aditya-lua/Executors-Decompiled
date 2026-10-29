package e7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\t*\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0019\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)D", "", "g", "(Landroid/content/Context;)J", "", "resId", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "d", "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "f", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/l;", "e", "(Landroid/content/Context;)Landroidx/lifecycle/l;", "b", "(Landroid/content/Context;)Landroid/content/Context;", "application", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final double a(@NotNull Context context) {
        try {
            Object objK = l2.b.k(context, ActivityManager.class);
            Intrinsics.checkNotNull(objK);
            return ((ActivityManager) objK).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    public static final Context b(@NotNull Context context) {
        return context.getApplicationContext();
    }

    @NotNull
    public static final Drawable c(@NotNull Context context, int i10) {
        Drawable drawableB = k.a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @NotNull
    public static final Drawable d(@NotNull Resources resources, int i10, @Nullable Resources.Theme theme) {
        Drawable drawableE = n2.h.e(resources, i10, theme);
        if (drawableE != null) {
            return drawableE;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @Nullable
    public static final androidx.p000lifecycle.l e(@Nullable Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof androidx.p000lifecycle.s)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((androidx.p000lifecycle.s) baseContext).a();
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    public static final Drawable f(@NotNull Context context, @NotNull Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final long g(@NotNull Context context) {
        int largeMemoryClass;
        try {
            Object objK = l2.b.k(context, ActivityManager.class);
            Intrinsics.checkNotNull(objK);
            ActivityManager activityManager = (ActivityManager) objK;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = Barcode.FORMAT_QR_CODE;
        }
        return ((long) largeMemoryClass) * 1048576;
    }
}
