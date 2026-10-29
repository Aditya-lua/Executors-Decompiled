package gd;

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
import androidx.core.graphics.C0546c;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: gd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6088a {

    /* JADX INFO: renamed from: i */
    public static final int[] f23400i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f23401j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f23402k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f23403l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Paint f23404a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Paint f23405b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Paint f23406c;

    /* JADX INFO: renamed from: d */
    public int f23407d;

    /* JADX INFO: renamed from: e */
    public int f23408e;

    /* JADX INFO: renamed from: f */
    public int f23409f;

    /* JADX INFO: renamed from: g */
    public final Path f23410g;

    /* JADX INFO: renamed from: h */
    public final Paint f23411h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6088a() {
        this(ViewCompat.MEASURED_STATE_MASK);
    }

    /* JADX INFO: renamed from: a */
    public void m26954a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f23410g;
        if (z10) {
            int[] iArr = f23402k;
            iArr[0] = 0;
            iArr[1] = this.f23409f;
            iArr[2] = this.f23408e;
            iArr[3] = this.f23407d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f23402k;
            iArr2[0] = 0;
            iArr2[1] = this.f23407d;
            iArr2[2] = this.f23408e;
            iArr2[3] = this.f23409f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f23403l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f23405b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f23402k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f23411h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f23405b);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public void m26955b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f23400i;
        iArr[0] = this.f23409f;
        iArr[1] = this.f23408e;
        iArr[2] = this.f23407d;
        Paint paint = this.f23406c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f23401j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f23406c);
        canvas.restore();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Paint m26956c() {
        return this.f23404a;
    }

    /* JADX INFO: renamed from: d */
    public void m26957d(int i10) {
        this.f23407d = C0546c.m2678l(i10, 68);
        this.f23408e = C0546c.m2678l(i10, 20);
        this.f23409f = C0546c.m2678l(i10, 0);
        this.f23404a.setColor(this.f23407d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6088a(int i10) {
        this.f23410g = new Path();
        Paint paint = new Paint();
        this.f23411h = paint;
        this.f23404a = new Paint();
        m26957d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f23405b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f23406c = new Paint(paint2);
    }
}
