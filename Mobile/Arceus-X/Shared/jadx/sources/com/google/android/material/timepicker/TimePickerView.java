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
import p194ic.C6742f;
import p194ic.C6744h;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public final Chip f10715A;

    /* JADX INFO: renamed from: B */
    public final ClockHandView f10716B;

    /* JADX INFO: renamed from: C */
    public final ClockFaceView f10717C;

    /* JADX INFO: renamed from: D */
    public final MaterialButtonToggleGroup f10718D;

    /* JADX INFO: renamed from: E */
    public final View.OnClickListener f10719E;

    /* JADX INFO: renamed from: z */
    public final Chip f10720z;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class ViewOnClickListenerC2870a implements View.OnClickListener {
        public ViewOnClickListenerC2870a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.m13305E(TimePickerView.this);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C2871b extends GestureDetector.SimpleOnGestureListener {
        public C2871b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.m13306F(TimePickerView.this);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public class ViewOnTouchListenerC2872c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GestureDetector f10723a;

        public ViewOnTouchListenerC2872c(GestureDetector gestureDetector) {
            this.f10723a = gestureDetector;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: android.view.View */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f10723a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public interface InterfaceC2873d {
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface InterfaceC2874e {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ InterfaceC2874e m13305E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ InterfaceC2873d m13306F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    /* JADX INFO: renamed from: G */
    public final void m13307G() {
        Chip chip = this.f10720z;
        int i10 = C6742f.f26017K;
        chip.setTag(i10, 12);
        this.f10715A.setTag(i10, 10);
        this.f10720z.setOnClickListener(this.f10719E);
        this.f10715A.setOnClickListener(this.f10719E);
        this.f10720z.setAccessibilityClassName("android.view.View");
        this.f10715A.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: H */
    public final void m13308H() {
        ViewOnTouchListenerC2872c viewOnTouchListenerC2872c = new ViewOnTouchListenerC2872c(new GestureDetector(getContext(), new C2871b()));
        this.f10720z.setOnTouchListener(viewOnTouchListenerC2872c);
        this.f10715A.setOnTouchListener(viewOnTouchListenerC2872c);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f10715A.sendAccessibilityEvent(8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10719E = new ViewOnClickListenerC2870a();
        LayoutInflater.from(context).inflate(C6744h.f26070l, this);
        this.f10717C = (ClockFaceView) findViewById(C6742f.f26040k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C6742f.f26043n);
        this.f10718D = materialButtonToggleGroup;
        materialButtonToggleGroup.m12211b(new MaterialButtonToggleGroup.InterfaceC2766d() { // from class: com.google.android.material.timepicker.e
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.InterfaceC2766d
            /* JADX INFO: renamed from: a */
            public final void mo12236a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f10731a.getClass();
            }
        });
        this.f10720z = (Chip) findViewById(C6742f.f26046q);
        this.f10715A = (Chip) findViewById(C6742f.f26044o);
        this.f10716B = (ClockHandView) findViewById(C6742f.f26041l);
        m13308H();
        m13307G();
    }
}
