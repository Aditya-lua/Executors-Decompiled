package p096e7;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0980s;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;
import p232k.C7399a;
import p261l2.C7975b;
import p298n2.C8870h;

/* JADX INFO: renamed from: e7.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\t*\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\rR\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0019\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Landroid/content/Context;", "", "a", "(Landroid/content/Context;)D", "", "g", "(Landroid/content/Context;)J", "", "resId", "Landroid/graphics/drawable/Drawable;", "c", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "Landroid/content/res/Resources;", "Landroid/content/res/Resources$Theme;", "theme", "d", "(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "resources", "f", "(Landroid/content/Context;Landroid/content/res/Resources;I)Landroid/graphics/drawable/Drawable;", "Landroidx/lifecycle/l;", "e", "(Landroid/content/Context;)Landroidx/lifecycle/l;", "b", "(Landroid/content/Context;)Landroid/content/Context;", "application", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4854e {
    /* JADX INFO: renamed from: a */
    public static final double m23425a(@NotNull Context context) {
        try {
            Object objM33013k = C7975b.m33013k(context, ActivityManager.class);
            Intrinsics.checkNotNull(objM33013k);
            return ((ActivityManager) objM33013k).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Context m23426b(@NotNull Context context) {
        return context.getApplicationContext();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Drawable m23427c(@NotNull Context context, int i10) {
        Drawable drawableM30679b = C7399a.m30679b(context, i10);
        if (drawableM30679b != null) {
            return drawableM30679b;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Drawable m23428d(@NotNull Resources resources, int i10, @Nullable Resources.Theme theme) {
        Drawable drawableM35662e = C8870h.m35662e(resources, i10, theme);
        if (drawableM35662e != null) {
            return drawableM35662e;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final AbstractC0966l m23429e(@Nullable Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof InterfaceC0980s)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((InterfaceC0980s) baseContext).mo4656a();
    }

    @SuppressLint({"ResourceType"})
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Drawable m23430f(@NotNull Context context, @NotNull Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return m23428d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    /* JADX INFO: renamed from: g */
    public static final long m23431g(@NotNull Context context) {
        int largeMemoryClass;
        try {
            Object objM33013k = C7975b.m33013k(context, ActivityManager.class);
            Intrinsics.checkNotNull(objM33013k);
            ActivityManager activityManager = (ActivityManager) objM33013k;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        return ((long) largeMemoryClass) * 1048576;
    }
}
