package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.NonNull;
import p038c2.C1512e;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0520e extends View {

    /* JADX INFO: renamed from: a */
    public int f2215a;

    /* JADX INFO: renamed from: b */
    public View f2216b;

    /* JADX INFO: renamed from: c */
    public int f2217c;

    /* JADX INFO: renamed from: a */
    public void m2548a(ConstraintLayout constraintLayout) {
        if (this.f2216b == null) {
            return;
        }
        ConstraintLayout.C0513b c0513b = (ConstraintLayout.C0513b) getLayoutParams();
        ConstraintLayout.C0513b c0513b2 = (ConstraintLayout.C0513b) this.f2216b.getLayoutParams();
        c0513b2.f2025v0.m7782k1(0);
        C1512e.b bVarM7703A = c0513b.f2025v0.m7703A();
        C1512e.b bVar = C1512e.b.FIXED;
        if (bVarM7703A != bVar) {
            c0513b.f2025v0.m7785l1(c0513b2.f2025v0.m7747W());
        }
        if (c0513b.f2025v0.m7741T() != bVar) {
            c0513b.f2025v0.m7728M0(c0513b2.f2025v0.m7812x());
        }
        c0513b2.f2025v0.m7782k1(8);
    }

    /* JADX INFO: renamed from: b */
    public void m2549b(ConstraintLayout constraintLayout) {
        if (this.f2215a == -1 && !isInEditMode()) {
            setVisibility(this.f2217c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f2215a);
        this.f2216b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.C0513b) viewFindViewById.getLayoutParams()).f2001j0 = true;
            this.f2216b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2216b;
    }

    public int getEmptyVisibility() {
        return this.f2217c;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f2215a == i10) {
            return;
        }
        View view = this.f2216b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0513b) this.f2216b.getLayoutParams()).f2001j0 = false;
            this.f2216b = null;
        }
        this.f2215a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2217c = i10;
    }
}
