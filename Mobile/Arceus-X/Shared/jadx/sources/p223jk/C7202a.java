package p223jk;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043c7.AbstractC1553c;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p261l2.C7975b;
import p315nt.InterfaceC9557b;
import p568y6.Size;

/* JADX INFO: renamed from: jk.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Ljk/a;", "Lc7/c;", "Landroid/content/Context;", "context", "", "colorAttr", "<init>", "(Landroid/content/Context;I)V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "c", "()I", "a", "Landroid/content/Context;", "I", "", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7202a extends AbstractC1553c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int colorAttr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7202a(@NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.colorAttr = i10;
        this.cacheKey = "FillTransparentBackgroundTransformation";
    }

    @Override // p043c7.AbstractC1553c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // p043c7.AbstractC1553c
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo8145b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull InterfaceC9557b<? super Bitmap> interfaceC9557b) {
        int iM30127c = m30127c();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(iM30127c);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public final int m30127c() {
        Object objM30460b;
        int iM33005c;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            int i10 = this.context.getResources().getConfiguration().uiMode & 48;
            if (i10 == 16) {
                iM33005c = Build.VERSION.SDK_INT >= 34 ? C7975b.m33005c(this.context, R.color.system_background_light) : C7975b.m33005c(this.context, R.color.background_light);
            } else if (i10 != 32) {
                C6124q.m27059d("Unable to get system theme. Falling back to system light background");
                iM33005c = C7975b.m33005c(this.context, R.color.background_light);
            } else {
                iM33005c = Build.VERSION.SDK_INT >= 34 ? C7975b.m33005c(this.context, R.color.system_background_dark) : C7975b.m33005c(this.context, R.color.background_dark);
            }
            objM30460b = C7347n.m30460b(Integer.valueOf(iM33005c));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Throwable thM30463e = C7347n.m30463e(objM30460b);
        if (thM30463e != null) {
            if (thM30463e instanceof Resources.NotFoundException) {
                C6124q.m27061f("FillTransparentBackgroundTransformation", "Error fetching system theme color", thM30463e);
            } else {
                C6124q.m27061f("FillTransparentBackgroundTransformation", "Unknown error occurred while fetching system theme color", thM30463e);
            }
            C6124q.m27060e("FillTransparentBackgroundTransformation", "Falling back to white background");
            objM30460b = -1;
        }
        return ((Number) objM30460b).intValue();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap int:0x0004: SGET  A[WRAPPED] android.R.attr.windowBackground int) : (r2v0 int))
     A[MD:(android.content.Context, int):void (m)] (LINE:5) call: jk.a.<init>(android.content.Context, int):void type: THIS */
    public /* synthetic */ C7202a(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R.attr.windowBackground : i10);
    }
}
