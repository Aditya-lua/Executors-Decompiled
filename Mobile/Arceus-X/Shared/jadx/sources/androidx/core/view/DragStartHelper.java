package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class DragStartHelper {
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() { // from class: androidx.core.view.DragStartHelper.1
        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v5) {
            return DragStartHelper.this.onLongClick(v5);
        }
    };
    private final View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: androidx.core.view.DragStartHelper.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v5, MotionEvent event) {
            return DragStartHelper.this.onTouch(v5, event);
        }
    };
    private final View mView;

    public interface OnDragStartListener {
        boolean onDragStart(View view, DragStartHelper dragStartHelper);
    }

    public DragStartHelper(View view, OnDragStartListener listener) {
        this.mView = view;
        this.mListener = listener;
    }

    public void attach() {
        this.mView.setOnLongClickListener(this.mLongClickListener);
        this.mView.setOnTouchListener(this.mTouchListener);
    }

    public void detach() {
        this.mView.setOnLongClickListener(null);
        this.mView.setOnTouchListener(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean onTouch(View v5, MotionEvent event) {
        int x10 = (int) event.getX();
        int y10 = (int) event.getY();
        switch (event.getAction()) {
            case 0:
                this.mLastTouchX = x10;
                this.mLastTouchY = y10;
                return false;
            case 1:
            case 3:
                this.mDragging = false;
                return false;
            case 2:
                if (MotionEventCompat.isFromSource(event, InputDeviceCompat.SOURCE_MOUSE) && (event.getButtonState() & 1) != 0 && !this.mDragging && (this.mLastTouchX != x10 || this.mLastTouchY != y10)) {
                    this.mLastTouchX = x10;
                    this.mLastTouchY = y10;
                    boolean zOnDragStart = this.mListener.onDragStart(v5, this);
                    this.mDragging = zOnDragStart;
                    return zOnDragStart;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean onLongClick(View v5) {
        return this.mListener.onDragStart(v5, this);
    }

    public void getTouchPosition(Point point) {
        point.set(this.mLastTouchX, this.mLastTouchY);
    }
}
