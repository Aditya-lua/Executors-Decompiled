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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.o0;
import gd.g;
import gd.i;
import hc.f;
import hc.h;
import hc.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d extends ConstraintLayout {
    public int A;
    public g B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Runnable f8350z;

    public d(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static boolean I(View view) {
        return "skip".equals(view.getTag());
    }

    public final void D(List<View> list, androidx.constraintlayout.widget.c cVar, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.j(it.next().getId(), f.f18861c, i10, size);
            size += 360.0f / list.size();
        }
    }

    public final Drawable E() {
        g gVar = new g();
        this.B = gVar;
        gVar.Y(new i(0.5f));
        this.B.a0(ColorStateList.valueOf(-1));
        return this.B;
    }

    public int F(int i10) {
        return i10 == 2 ? Math.round(this.A * 0.66f) : this.A;
    }

    public int G() {
        return this.A;
    }

    public void H(int i10) {
        this.A = i10;
        J();
    }

    public void J() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != f.f18861c && !I(childAt)) {
                int i11 = (Integer) childAt.getTag(f.f18871m);
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
            D((List) entry.getValue(), cVar, F(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }

    public final void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f8350z);
            handler.post(this.f8350z);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(o0.k());
        }
        K();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.B.a0(ColorStateList.valueOf(i10));
    }

    public d(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f18894i, this);
        o0.q0(this, E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.X4, i10, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.Y4, 0);
        this.f8350z = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f8349a.J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }
}
