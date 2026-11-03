package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import q.b0;
import q.e1;
import q.n0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends b0 implements j.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e.b f677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n0 f678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f684r;

    public class a extends n0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // q.n0
        public p.f b() {
            b bVar = ActionMenuItemView.this.f679m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // q.n0
        public boolean c() {
            p.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f677k;
            return bVar != null && bVar.b(actionMenuItemView.f674h) && (fVarB = b()) != null && fVarB.a();
        }
    }

    public static abstract class b {
        public abstract p.f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f674h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f674h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f678l == null) {
            this.f678l = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f674h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f677k;
        if (bVar != null) {
            bVar.b(this.f674h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f680n = t();
        u();
    }

    @Override // q.b0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zS = s();
        if (zS && (i12 = this.f683q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f682p) : this.f682p;
        if (mode != 1073741824 && this.f682p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zS || this.f676j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f676j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        n0 n0Var;
        if (this.f674h.hasSubMenu() && (n0Var = this.f678l) != null && n0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f681o != z10) {
            this.f681o = z10;
            g gVar = this.f674h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f676j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f684r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f677k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f683q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f679m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f675i = charSequence;
        u();
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f675i);
        if (this.f676j != null && (!this.f674h.B() || (!this.f680n && !this.f681o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f675i : null);
        CharSequence contentDescription = this.f674h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f674h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f674h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            e1.a(this, z12 ? null : this.f674h.getTitle());
        } else {
            e1.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f680n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f20238v, i10, 0);
        this.f682p = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.j.f20243w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f684r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f683q = -1;
        setSaveEnabled(false);
    }
}
