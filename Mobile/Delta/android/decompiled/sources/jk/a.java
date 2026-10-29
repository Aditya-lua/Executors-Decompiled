package jk;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import gk.p;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, d2 = {"Ljk/a;", "Lc7/c;", "Landroid/content/Context;", "context", "", "colorAttr", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "c", "()I", "a", "Landroid/content/Context;", "I", "", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends c7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int colorAttr;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey;

    public a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAttr = i10;
        this.cacheKey = "FillTransparentBackgroundTransformation";
    }

    @Override // c7.c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // c7.c
    @Nullable
    public Object b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull nt.b<? super Bitmap> bVar) {
        int iC = c();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(iC);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    public final int c() {
        Object objB;
        int iC;
        try {
            n.Companion companion = n.INSTANCE;
            int i10 = this.context.getResources().getConfiguration().uiMode & 48;
            if (i10 == 16) {
                iC = Build.VERSION.SDK_INT >= 34 ? l2.b.c(this.context, R.color.system_background_light) : l2.b.c(this.context, R.color.background_light);
            } else if (i10 != 32) {
                p.d("Unable to get system theme. Falling back to system light background");
                iC = l2.b.c(this.context, R.color.background_light);
            } else {
                iC = Build.VERSION.SDK_INT >= 34 ? l2.b.c(this.context, R.color.system_background_dark) : l2.b.c(this.context, R.color.background_dark);
            }
            objB = n.b(Integer.valueOf(iC));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Throwable thE = n.e(objB);
        if (thE != null) {
            if (thE instanceof Resources.NotFoundException) {
                p.f("FillTransparentBackgroundTransformation", "Error fetching system theme color", thE);
            } else {
                p.f("FillTransparentBackgroundTransformation", "Unknown error occurred while fetching system theme color", thE);
            }
            p.e("FillTransparentBackgroundTransformation", "Falling back to white background");
            objB = -1;
        }
        return ((Number) objB).intValue();
    }

    public /* synthetic */ a(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R.attr.windowBackground : i10);
    }
}
