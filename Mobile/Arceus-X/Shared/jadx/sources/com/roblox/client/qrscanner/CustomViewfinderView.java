package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p261l2.C7975b;
import sg.C11332l0;

/* JADX INFO: loaded from: classes2.dex */
public class CustomViewfinderView extends View {

    /* JADX INFO: renamed from: a */
    public final float f12139a;

    /* JADX INFO: renamed from: b */
    public final float f12140b;

    /* JADX INFO: renamed from: c */
    public final int f12141c;

    /* JADX INFO: renamed from: d */
    public final int f12142d;

    /* JADX INFO: renamed from: e */
    public final int f12143e;

    /* JADX INFO: renamed from: f */
    public final int f12144f;

    /* JADX INFO: renamed from: g */
    public int f12145g;

    /* JADX INFO: renamed from: h */
    public int f12146h;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12139a = 16.0f;
        this.f12140b = 16.0f;
        this.f12141c = 400;
        this.f12142d = 80;
        this.f12143e = m15475a(16.0f, context);
        this.f12144f = m15475a(16.0f, context);
    }

    /* JADX INFO: renamed from: a */
    public final int m15475a(float f10, Context context) {
        return (int) (f10 * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    /* JADX INFO: renamed from: b */
    public final void m15476b(Canvas canvas, Context context) {
        Rect rectM15479e = m15479e(context);
        int i10 = rectM15479e.left;
        int i11 = rectM15479e.top;
        int iWidth = rectM15479e.width();
        Paint paint = new Paint();
        paint.setColor(2130706432);
        float f10 = i11;
        canvas.drawRect(0.0f, 0.0f, this.f12145g, f10, paint);
        float f11 = i11 + iWidth;
        canvas.drawRect(0.0f, f10, i10, f11, paint);
        canvas.drawRect(i10 + iWidth, f10, this.f12145g, f11, paint);
        canvas.drawRect(0.0f, f11, this.f12145g, this.f12146h, paint);
    }

    /* JADX INFO: renamed from: c */
    public final void m15477c(Canvas canvas, Context context, int i10, Rect rect) {
        Drawable drawableM33008f = C7975b.m33008f(context, i10);
        drawableM33008f.setBounds(rect);
        drawableM33008f.draw(canvas);
    }

    /* JADX INFO: renamed from: d */
    public final void m15478d(Canvas canvas, Context context) {
        Rect rectM15479e = m15479e(context);
        int i10 = rectM15479e.left;
        int i11 = rectM15479e.top;
        int iWidth = rectM15479e.width();
        Rect rect = new Rect();
        rect.set(i10, i11, this.f12143e + i10, this.f12144f + i11);
        m15477c(canvas, context, C11332l0.f39745e, rect);
        int i12 = i10 + iWidth;
        rect.set(i12 - this.f12143e, i11, i12, this.f12144f + i11);
        m15477c(canvas, context, C11332l0.f39747g, rect);
        int i13 = i11 + iWidth;
        rect.set(i10, i13 - this.f12144f, this.f12143e + i10, i13);
        m15477c(canvas, context, C11332l0.f39744d, rect);
        rect.set(i12 - this.f12143e, i13 - this.f12144f, i12, i13);
        m15477c(canvas, context, C11332l0.f39746f, rect);
    }

    /* JADX INFO: renamed from: e */
    public final Rect m15479e(Context context) {
        int iM15475a = m15475a(80.0f, context);
        int iM15475a2 = m15475a(400.0f, context);
        int i10 = this.f12145g;
        int i11 = i10 - (iM15475a * 2);
        if (i11 > iM15475a2) {
            iM15475a = (i10 - iM15475a2) / 2;
        } else {
            iM15475a2 = i11;
        }
        int i12 = (this.f12146h - iM15475a2) / 2;
        return new Rect(iM15475a, i12, iM15475a + iM15475a2, iM15475a2 + i12);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f12145g = getWidth();
        this.f12146h = getHeight();
        m15476b(canvas, context);
        m15478d(canvas, context);
    }
}
