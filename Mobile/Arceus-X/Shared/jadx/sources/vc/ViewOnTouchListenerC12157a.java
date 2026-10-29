package vc;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: vc.a */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnTouchListenerC12157a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final Dialog f42771a;

    /* JADX INFO: renamed from: b */
    public final int f42772b;

    /* JADX INFO: renamed from: c */
    public final int f42773c;

    /* JADX INFO: renamed from: d */
    public final int f42774d;

    public ViewOnTouchListenerC12157a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f42771a = dialog;
        this.f42772b = rect.left;
        this.f42773c = rect.top;
        this.f42774d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f42772b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f42773c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f42774d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f42771a.onTouchEvent(motionEventObtain);
    }
}
