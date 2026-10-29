package com.withpersona.sdk2.inquiry.steps.ui.view;

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
import com.google.android.material.card.MaterialCardView;
import jq.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u001f\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u001aJ\u000f\u0010&\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010\u001aJ\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u0013R\u0018\u0010,\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00109R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0016\u0010>\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010<R\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/view/SignatureView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "w", "h", "oldw", "oldh", "", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/MotionEvent;", "e", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "j", "()V", "Landroid/graphics/Bitmap;", "m", "()Landroid/graphics/Bitmap;", "n", "", "x", "y", "q", "(FF)V", "p", "r", "s", "Landroid/graphics/Rect;", "k", "()Landroid/graphics/Rect;", "l", "Landroid/graphics/Bitmap;", "signatureBitmap", "Landroid/graphics/Canvas;", "signatureCanvas", "Landroid/graphics/RectF;", "t", "Landroid/graphics/RectF;", "signatureRectF", "Landroid/graphics/Path;", "u", "Landroid/graphics/Path;", "drawPath", "Landroid/graphics/Paint;", "v", "Landroid/graphics/Paint;", "bitmapPaint", "paint", "F", "penX", "penY", "o", "()Z", "isEmpty", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SignatureView extends MaterialCardView {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Bitmap signatureBitmap;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Canvas signatureCanvas;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public RectF signatureRectF;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Path drawPath;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint bitmapPaint;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public float penX;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public float penY;

    public SignatureView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.signatureRectF = new RectF();
        this.drawPath = new Path();
        this.bitmapPaint = new Paint(4);
        this.paint = new Paint();
        n(context, attributeSet);
    }

    private final boolean o() {
        return this.signatureRectF.isEmpty();
    }

    public final void j() {
        Canvas canvas = this.signatureCanvas;
        if (canvas == null) {
            return;
        }
        this.drawPath.reset();
        this.signatureRectF = new RectF();
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        invalidate();
    }

    public final Rect k() {
        RectF rectF = new RectF(this.signatureRectF.left - this.paint.getStrokeWidth(), this.signatureRectF.top - this.paint.getStrokeWidth(), this.signatureRectF.right + this.paint.getStrokeWidth(), this.signatureRectF.bottom + this.paint.getStrokeWidth());
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public final void l(Canvas canvas) {
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(-3355444);
        paint.setStrokeWidth(4.0f);
        float fA = (float) j.a(24.0d);
        float fA2 = (float) j.a(20.0d);
        canvas.drawLine(fA2, canvas.getHeight() - fA, canvas.getWidth() - fA2, canvas.getHeight() - fA, paint);
        canvas.restore();
    }

    @Nullable
    public final Bitmap m() {
        Bitmap bitmap = this.signatureBitmap;
        if (o() || bitmap == null) {
            return null;
        }
        s();
        Rect rectK = k();
        Rect rect = new Rect(0, 0, rectK.width(), rectK.height());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rectK.width(), rectK.height(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, rectK, rect, (Paint) null);
        return bitmapCreateBitmap;
    }

    public final void n(Context context, AttributeSet attrs) {
        this.paint.setAntiAlias(true);
        this.paint.setDither(true);
        this.paint.setColor(-16777216);
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
        l(canvas);
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
            q(x10, y10);
            invalidate();
        } else if (action == 1) {
            r();
            invalidate();
        } else if (action == 2) {
            p(x10, y10);
            invalidate();
        }
        return true;
    }

    public final void p(float x10, float y10) {
        this.drawPath.lineTo(x10, y10);
        this.penX = x10;
        this.penY = y10;
    }

    public final void q(float x10, float y10) {
        this.drawPath.reset();
        this.drawPath.moveTo(x10, y10);
        this.penX = x10;
        this.penY = y10;
    }

    public final void r() {
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
        s();
        this.drawPath.reset();
    }

    public final void s() {
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
