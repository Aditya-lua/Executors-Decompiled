package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l2.b;
import rg.l0;

/* JADX INFO: loaded from: classes2.dex */
public class CustomViewfinderView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9396a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9402h;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9396a = 16.0f;
        this.b = 16.0f;
        this.f9397c = 400;
        this.f9398d = 80;
        this.f9399e = a(16.0f, context);
        this.f9400f = a(16.0f, context);
    }

    public final int a(float f10, Context context) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final void b(Canvas canvas, Context context) {
        Rect rectE = e(context);
        int i10 = rectE.left;
        int i11 = rectE.top;
        int iWidth = rectE.width();
        Paint paint = new Paint();
        paint.setColor(2130706432);
        float f10 = i11;
        canvas.drawRect(0.0f, 0.0f, this.f9401g, f10, paint);
        float f11 = i11 + iWidth;
        canvas.drawRect(0.0f, f10, i10, f11, paint);
        canvas.drawRect(i10 + iWidth, f10, this.f9401g, f11, paint);
        canvas.drawRect(0.0f, f11, this.f9401g, this.f9402h, paint);
    }

    public final void c(Canvas canvas, Context context, int i10, Rect rect) {
        Drawable drawableF = b.f(context, i10);
        drawableF.setBounds(rect);
        drawableF.draw(canvas);
    }

    public final void d(Canvas canvas, Context context) {
        Rect rectE = e(context);
        int i10 = rectE.left;
        int i11 = rectE.top;
        int iWidth = rectE.width();
        Rect rect = new Rect();
        rect.set(i10, i11, this.f9399e + i10, this.f9400f + i11);
        c(canvas, context, l0.f30404e, rect);
        int i12 = i10 + iWidth;
        rect.set(i12 - this.f9399e, i11, i12, this.f9400f + i11);
        c(canvas, context, l0.f30406g, rect);
        int i13 = i11 + iWidth;
        rect.set(i10, i13 - this.f9400f, this.f9399e + i10, i13);
        c(canvas, context, l0.f30403d, rect);
        rect.set(i12 - this.f9399e, i13 - this.f9400f, i12, i13);
        c(canvas, context, l0.f30405f, rect);
    }

    public final Rect e(Context context) {
        int iA = a(80.0f, context);
        int iA2 = a(400.0f, context);
        int i10 = this.f9401g;
        int i11 = i10 - (iA * 2);
        if (i11 > iA2) {
            iA = (i10 - iA2) / 2;
        } else {
            iA2 = i11;
        }
        int i12 = (this.f9402h - iA2) / 2;
        return new Rect(iA, i12, iA + iA2, iA2 + i12);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f9401g = getWidth();
        this.f9402h = getHeight();
        b(canvas, context);
        d(canvas, context);
    }
}
