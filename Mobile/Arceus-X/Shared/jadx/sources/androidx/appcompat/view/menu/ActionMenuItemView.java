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
import p181i.C6598j;
import p346p.InterfaceC10082f;
import p365q.AbstractViewOnTouchListenerC10390n0;
import p365q.C10359b0;
import p365q.C10369e1;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C10359b0 implements InterfaceC0420j.a, View.OnClickListener, ActionMenuView.InterfaceC0431a {

    /* JADX INFO: renamed from: h */
    public C0417g f1101h;

    /* JADX INFO: renamed from: i */
    public CharSequence f1102i;

    /* JADX INFO: renamed from: j */
    public Drawable f1103j;

    /* JADX INFO: renamed from: k */
    public C0415e.b f1104k;

    /* JADX INFO: renamed from: l */
    public AbstractViewOnTouchListenerC10390n0 f1105l;

    /* JADX INFO: renamed from: m */
    public AbstractC0410b f1106m;

    /* JADX INFO: renamed from: n */
    public boolean f1107n;

    /* JADX INFO: renamed from: o */
    public boolean f1108o;

    /* JADX INFO: renamed from: p */
    public int f1109p;

    /* JADX INFO: renamed from: q */
    public int f1110q;

    /* JADX INFO: renamed from: r */
    public int f1111r;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0409a extends AbstractViewOnTouchListenerC10390n0 {
        public C0409a() {
            super(ActionMenuItemView.this);
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: b */
        public InterfaceC10082f mo1542b() {
            AbstractC0410b abstractC0410b = ActionMenuItemView.this.f1106m;
            if (abstractC0410b != null) {
                return abstractC0410b.mo1544a();
            }
            return null;
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: c */
        public boolean mo1543c() {
            InterfaceC10082f interfaceC10082fMo1542b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0415e.b bVar = actionMenuItemView.f1104k;
            return bVar != null && bVar.mo1546b(actionMenuItemView.f1101h) && (interfaceC10082fMo1542b = mo1542b()) != null && interfaceC10082fMo1542b.mo1574a();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0410b {
        /* JADX INFO: renamed from: a */
        public abstract InterfaceC10082f mo1544a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0431a
    /* JADX INFO: renamed from: a */
    public boolean mo1535a() {
        return m1539s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0431a
    /* JADX INFO: renamed from: b */
    public boolean mo1536b() {
        return m1539s() && this.f1101h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: c */
    public void mo1537c(C0417g c0417g, int i10) {
        this.f1101h = c0417g;
        setIcon(c0417g.getIcon());
        setTitle(c0417g.m1672i(this));
        setId(c0417g.getItemId());
        setVisibility(c0417g.isVisible() ? 0 : 8);
        setEnabled(c0417g.isEnabled());
        if (c0417g.hasSubMenu() && this.f1105l == null) {
            this.f1105l = new C0409a();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: d */
    public boolean mo1538d() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    public C0417g getItemData() {
        return this.f1101h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0415e.b bVar = this.f1104k;
        if (bVar != null) {
            bVar.mo1546b(this.f1101h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1107n = m1540t();
        m1541u();
    }

    @Override // p365q.C10359b0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zM1539s = m1539s();
        if (zM1539s && (i12 = this.f1110q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f1109p) : this.f1109p;
        if (mode != 1073741824 && this.f1109p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zM1539s || this.f1103j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1103j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC10390n0 abstractViewOnTouchListenerC10390n0;
        if (this.f1101h.hasSubMenu() && (abstractViewOnTouchListenerC10390n0 = this.f1105l) != null && abstractViewOnTouchListenerC10390n0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: s */
    public boolean m1539s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1108o != z10) {
            this.f1108o = z10;
            C0417g c0417g = this.f1101h;
            if (c0417g != null) {
                c0417g.m1667c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1103j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1111r;
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
        m1541u();
    }

    public void setItemInvoker(C0415e.b bVar) {
        this.f1104k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1110q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(AbstractC0410b abstractC0410b) {
        this.f1106m = abstractC0410b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1102i = charSequence;
        m1541u();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1540t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m1541u() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1102i);
        if (this.f1103j != null && (!this.f1101h.m1664B() || (!this.f1107n && !this.f1108o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1102i : null);
        CharSequence contentDescription = this.f1101h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f1101h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1101h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C10369e1.m39834a(this, z12 ? null : this.f1101h.getTitle());
        } else {
            C10369e1.m39834a(this, tooltipText);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1107n = m1540t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25431v, i10, 0);
        this.f1109p = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6598j.f25436w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1111r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1110q = -1;
        setSaveEnabled(false);
    }
}
