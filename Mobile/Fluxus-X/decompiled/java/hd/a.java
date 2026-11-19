package hd;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.core.graphics.c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f18174i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f18175j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f18176k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f18177l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f18178a;

    @NonNull
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f18179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f18183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f18184h;

    public a() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f18183g;
        if (z10) {
            int[] iArr = f18176k;
            iArr[0] = 0;
            iArr[1] = this.f18182f;
            iArr[2] = this.f18181e;
            iArr[3] = this.f18180d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f18176k;
            iArr2[0] = 0;
            iArr2[1] = this.f18180d;
            iArr2[2] = this.f18181e;
            iArr2[3] = this.f18182f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f18177l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f18176k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f18184h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f18174i;
        iArr[0] = this.f18182f;
        iArr[1] = this.f18181e;
        iArr[2] = this.f18180d;
        Paint paint = this.f18179c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f18175j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f18179c);
        canvas.restore();
    }

    @NonNull
    public Paint c() {
        return this.f18178a;
    }

    public void d(int i10) {
        this.f18180d = c.l(i10, 68);
        this.f18181e = c.l(i10, 20);
        this.f18182f = c.l(i10, 0);
        this.f18178a.setColor(this.f18180d);
    }

    public a(int i10) {
        this.f18183g = new Path();
        Paint paint = new Paint();
        this.f18184h = paint;
        this.f18178a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f18179c = new Paint(paint2);
    }
}
