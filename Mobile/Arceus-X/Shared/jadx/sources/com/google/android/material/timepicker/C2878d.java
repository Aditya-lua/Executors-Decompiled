package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0625o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p168hd.C6363g;
import p168hd.C6365i;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6747k;

/* JADX INFO: renamed from: com.google.android.material.timepicker.d */
/* JADX INFO: loaded from: classes2.dex */
public class C2878d extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public int f10728A;

    /* JADX INFO: renamed from: B */
    public C6363g f10729B;

    /* JADX INFO: renamed from: z */
    public final Runnable f10730z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2878d(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: I */
    public static boolean m13309I(View view) {
        return "skip".equals(view.getTag());
    }

    /* JADX INFO: renamed from: D */
    public final void m13310D(List<View> list, C0518c c0518c, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            c0518c.m2513j(it.next().getId(), C6742f.f26032c, i10, size);
            size += 360.0f / list.size();
        }
    }

    /* JADX INFO: renamed from: E */
    public final Drawable m13311E() {
        C6363g c6363g = new C6363g();
        this.f10729B = c6363g;
        c6363g.m27717Y(new C6365i(0.5f));
        this.f10729B.m27719a0(ColorStateList.valueOf(-1));
        return this.f10729B;
    }

    /* JADX INFO: renamed from: F */
    public int m13312F(int i10) {
        return i10 == 2 ? Math.round(this.f10728A * 0.66f) : this.f10728A;
    }

    /* JADX INFO: renamed from: G */
    public int m13313G() {
        return this.f10728A;
    }

    /* JADX INFO: renamed from: H */
    public void mo13275H(int i10) {
        this.f10728A = i10;
        mo13276J();
    }

    /* JADX INFO: renamed from: J */
    public void mo13276J() {
        C0518c c0518c = new C0518c();
        c0518c.m2509f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != C6742f.f26032c && !m13309I(childAt)) {
                int i11 = (Integer) childAt.getTag(C6742f.f26042m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            m13310D((List) entry.getValue(), c0518c, m13312F(((Integer) entry.getKey()).intValue()));
        }
        c0518c.m2506c(this);
    }

    /* JADX INFO: renamed from: K */
    public final void m13314K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f10730z);
            handler.post(this.f10730z);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(C0625o0.m3035k());
        }
        m13314K();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        mo13276J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m13314K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f10729B.m27719a0(ColorStateList.valueOf(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2878d(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(C6744h.f26067i, this);
        C0625o0.m3048q0(this, m13311E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26347X4, i10, 0);
        this.f10728A = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26356Y4, 0);
        this.f10730z = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f10727a.mo13276J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
