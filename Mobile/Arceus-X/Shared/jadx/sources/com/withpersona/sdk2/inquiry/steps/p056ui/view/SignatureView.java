package com.withpersona.sdk2.inquiry.steps.p056ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.view.ViewCompat;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013R\u0018\u0010,\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/SignatureView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "e", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "j", "()V", "Landroid/graphics/Bitmap;", "m", "()Landroid/graphics/Bitmap;", "n", "", "x", "y", "q", "(FF)V", "p", "r", "s", "Landroid/graphics/Rect;", "k", "()Landroid/graphics/Rect;", "l", "Landroid/graphics/Bitmap;", "signatureBitmap", "Landroid/graphics/Canvas;", "signatureCanvas", "Landroid/graphics/RectF;", "t", "Landroid/graphics/RectF;", "signatureRectF", "Landroid/graphics/Path;", "u", "Landroid/graphics/Path;", "drawPath", "Landroid/graphics/Paint;", "v", "Landroid/graphics/Paint;", "bitmapPaint", "paint", "F", "penX", "penY", "o", "()Z", "isEmpty", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SignatureView extends MaterialCardView {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Bitmap signatureBitmap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Canvas signatureCanvas;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public RectF signatureRectF;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public Path drawPath;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Paint bitmapPaint;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float penX;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float penY;

    public SignatureView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        m20948n(context, attributeSet);
    }

    /* JADX INFO: renamed from: o */
    private final boolean m20943o() {
        return this.signatureRectF.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public final void m20944j() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        this.drawPath.reset();
        this.signatureRectF = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public final Rect m20945k() {
        RectF rectF = new RectF(this.signatureRectF.left - this.paint.getStrokeWidth(), this.signatureRectF.top - this.paint.getStrokeWidth(), this.signatureRectF.right + this.paint.getStrokeWidth(), this.signatureRectF.bottom + this.paint.getStrokeWidth());
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    /* JADX INFO: renamed from: l */
    public final void m20946l(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float fM30285a = (float) C7265j.m30285a(24.0d);
        float fM30285a2 = (float) C7265j.m30285a(20.0d);
        canvas.drawLine(fM30285a2, canvas.getHeight() - fM30285a, canvas.getWidth() - fM30285a2, canvas.getHeight() - fM30285a, paint);
        canvas.restore();
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Bitmap m20947m() {
        Bitmap bitmap = this.signatureBitmap;
        if (m20943o() || bitmap == null) {
            return null;
        }
        m20952s();
        Rect rectM20945k = m20945k();
        Rect rect = new Rect(0, 0, rectM20945k.width(), rectM20945k.height());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectM20945k.width(), rectM20945k.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, rectM20945k, rect, (Paint) null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: n */
    public final void m20948n(Context context, AttributeSet attrs) {
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(0);
        Bitmap bitmap = this.signatureBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.bitmapPaint);
        }
        m20946l(canvas);
        canvas.drawPath(this.drawPath, this.paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int w5, int h10, int oldw, int oldh) {
        super.onSizeChanged(w5, h10, oldw, oldh);
        if (w5 <= 0 || h10 <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(w5, h10, Bitmap.Config.ARGB_8888);
        this.signatureBitmap = bitmapCreateBitmap;
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
        this.signatureCanvas = new Canvas(bitmapCreateBitmap);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        super.onTouchEvent(e10);
        float x10 = e10.getX();
        float y10 = e10.getY();
        int action = e10.getAction();
        if (action == 0) {
            m20950q(x10, y10);
            invalidate();
        } else if (action == 1) {
            m20951r();
            invalidate();
        } else if (action == 2) {
            m20949p(x10, y10);
            invalidate();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m20949p(float x10, float y10) {
        this.drawPath.lineTo(x10, y10);
        this.penX = x10;
        this.penY = y10;
    }

    /* JADX INFO: renamed from: q */
    public final void m20950q(float x10, float y10) {
        this.drawPath.reset();
        this.drawPath.moveTo(x10, y10);
        this.penX = x10;
        this.penY = y10;
    }

    /* JADX INFO: renamed from: r */
    public final void m20951r() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        if (this.drawPath.isEmpty()) {
            this.drawPath.moveTo(this.penX - 0.5f, this.penY - 0.5f);
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPoint(this.penX, this.penY, this.paint);
        } else {
            this.drawPath.lineTo(this.penX, this.penY);
            canvas.drawPath(this.drawPath, this.paint);
        }
        m20952s();
        this.drawPath.reset();
    }

    /* JADX INFO: renamed from: s */
    public final void m20952s() {
        RectF rectF = new RectF();
        this.drawPath.computeBounds(rectF, true);
        if (!this.drawPath.isEmpty()) {
            float f10 = 2;
            rectF.inset((-this.paint.getStrokeWidth()) / f10, (-this.paint.getStrokeWidth()) / f10);
        }
        rectF.sort();
        this.signatureRectF.union(rectF);
        this.signatureRectF.sort();
    }
}
