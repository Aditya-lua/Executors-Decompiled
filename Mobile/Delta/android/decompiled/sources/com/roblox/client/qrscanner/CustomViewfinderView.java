package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l2.b;
import sg.l0;

/* JADX INFO: loaded from: classes2.dex */
public class CustomViewfinderView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9319a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9325h;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9319a = 16.0f;
        this.b = 16.0f;
        this.f9320c = 400;
        this.f9321d = 80;
        this.f9322e = a(16.0f, context);
        this.f9323f = a(16.0f, context);
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
        canvas.drawRect(0.0f, 0.0f, this.f9324g, f10, paint);
        float f11 = i11 + iWidth;
        canvas.drawRect(0.0f, f10, i10, f11, paint);
        canvas.drawRect(i10 + iWidth, f10, this.f9324g, f11, paint);
        canvas.drawRect(0.0f, f11, this.f9324g, this.f9325h, paint);
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
        rect.set(i10, i11, this.f9322e + i10, this.f9323f + i11);
        c(canvas, context, l0.f30801e, rect);
        int i12 = i10 + iWidth;
        rect.set(i12 - this.f9322e, i11, i12, this.f9323f + i11);
        c(canvas, context, l0.f30803g, rect);
        int i13 = i11 + iWidth;
        rect.set(i10, i13 - this.f9323f, this.f9322e + i10, i13);
        c(canvas, context, l0.f30800d, rect);
        rect.set(i12 - this.f9322e, i13 - this.f9323f, i12, i13);
        c(canvas, context, l0.f30802f, rect);
    }

    public final Rect e(Context context) {
        int iA = a(80.0f, context);
        int iA2 = a(400.0f, context);
        int i10 = this.f9324g;
        int i11 = i10 - (iA * 2);
        if (i11 > iA2) {
            iA = (i10 - iA2) / 2;
        } else {
            iA2 = i11;
        }
        int i12 = (this.f9325h - iA2) / 2;
        return new Rect(iA, i12, iA + iA2, iA2 + i12);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f9324g = getWidth();
        this.f9325h = getHeight();
        b(canvas, context);
        d(canvas, context);
    }
}
