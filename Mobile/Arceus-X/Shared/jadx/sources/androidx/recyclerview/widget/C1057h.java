package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
public class C1057h extends RecyclerView.AbstractC1033p {

    /* JADX INFO: renamed from: d */
    public static final int[] f4240d = {R.attr.listDivider};

    /* JADX INFO: renamed from: a */
    public Drawable f4241a;

    /* JADX INFO: renamed from: b */
    public int f4242b;

    /* JADX INFO: renamed from: c */
    public final Rect f4243c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public C1057h(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f4240d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f4241a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        m5948n(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1033p
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: e */
    public void mo5537e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0) {
        Drawable drawable = this.f4241a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4242b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1033p
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g */
    public void mo5539g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1015b0 c1015b0) {
        if (recyclerView.getLayoutManager() == null || this.f4241a == null) {
            return;
        }
        if (this.f4242b == 1) {
            m5945k(canvas, recyclerView);
        } else {
            m5944j(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5944j(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().mo5583U(childAt, this.f4243c);
            int iRound = this.f4243c.right + Math.round(childAt.getTranslationX());
            this.f4241a.setBounds(iRound - this.f4241a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f4241a.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: k */
    public final void m5945k(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.m5332o0(childAt, this.f4243c);
            int iRound = this.f4243c.bottom + Math.round(childAt.getTranslationY());
            this.f4241a.setBounds(paddingLeft, iRound - this.f4241a.getIntrinsicHeight(), width, iRound);
            this.f4241a.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: l */
    public Drawable m5946l() {
        return this.f4241a;
    }

    /* JADX INFO: renamed from: m */
    public void m5947m(@NonNull Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f4241a = drawable;
    }

    /* JADX INFO: renamed from: n */
    public void m5948n(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f4242b = i10;
    }
}
