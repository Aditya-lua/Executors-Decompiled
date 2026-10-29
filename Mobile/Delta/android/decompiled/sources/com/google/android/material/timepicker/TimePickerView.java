package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import hc.f;
import hc.h;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip A;
    public final ClockHandView B;
    public final ClockFaceView C;
    public final MaterialButtonToggleGroup D;
    public final View.OnClickListener E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Chip f8343z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.E(TimePickerView.this);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.F(TimePickerView.this);
            return false;
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f8346a;

        public c(GestureDetector gestureDetector) {
            this.f8346a = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f8346a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ e E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ d F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public final void G() {
        Chip chip = this.f8343z;
        int i10 = f.K;
        chip.setTag(i10, 12);
        this.A.setTag(i10, 10);
        this.f8343z.setOnClickListener(this.E);
        this.A.setOnClickListener(this.E);
        this.f8343z.setAccessibilityClassName("android.view.View");
        this.A.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void H() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f8343z.setOnTouchListener(cVar);
        this.A.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.A.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.E = new a();
        LayoutInflater.from(context).inflate(h.f18897l, this);
        this.C = (ClockFaceView) findViewById(f.f18869k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(f.f18872n);
        this.D = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f8351a.getClass();
            }
        });
        this.f8343z = (Chip) findViewById(f.f18875q);
        this.A = (Chip) findViewById(f.f18873o);
        this.B = (ClockHandView) findViewById(f.f18870l);
        H();
        G();
    }
}
