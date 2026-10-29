package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p181i.C6589a;
import p181i.C6594f;
import p181i.C6595g;
import p181i.C6598j;
import p365q.C10357a1;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0420j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a */
    public C0417g f1116a;

    /* JADX INFO: renamed from: b */
    public ImageView f1117b;

    /* JADX INFO: renamed from: c */
    public RadioButton f1118c;

    /* JADX INFO: renamed from: d */
    public TextView f1119d;

    /* JADX INFO: renamed from: e */
    public CheckBox f1120e;

    /* JADX INFO: renamed from: f */
    public TextView f1121f;

    /* JADX INFO: renamed from: g */
    public ImageView f1122g;

    /* JADX INFO: renamed from: h */
    public ImageView f1123h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1124i;

    /* JADX INFO: renamed from: j */
    public Drawable f1125j;

    /* JADX INFO: renamed from: k */
    public int f1126k;

    /* JADX INFO: renamed from: l */
    public Context f1127l;

    /* JADX INFO: renamed from: m */
    public boolean f1128m;

    /* JADX INFO: renamed from: n */
    public Drawable f1129n;

    /* JADX INFO: renamed from: o */
    public boolean f1130o;

    /* JADX INFO: renamed from: p */
    public LayoutInflater f1131p;

    /* JADX INFO: renamed from: q */
    public boolean f1132q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25010F);
    }

    private LayoutInflater getInflater() {
        if (this.f1131p == null) {
            this.f1131p = LayoutInflater.from(getContext());
        }
        return this.f1131p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f1122g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1547a(View view) {
        m1548b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1123h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1123h.getLayoutParams();
        rect.top += this.f1123h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final void m1548b(View view, int i10) {
        LinearLayout linearLayout = this.f1124i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: c */
    public void mo1537c(C0417g c0417g, int i10) {
        this.f1116a = c0417g;
        setVisibility(c0417g.isVisible() ? 0 : 8);
        setTitle(c0417g.m1672i(this));
        setCheckable(c0417g.isCheckable());
        m1552h(c0417g.m1663A(), c0417g.m1670g());
        setIcon(c0417g.getIcon());
        setEnabled(c0417g.isEnabled());
        setSubMenuArrowVisible(c0417g.hasSubMenu());
        setContentDescription(c0417g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: d */
    public boolean mo1538d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m1549e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C6595g.f25169j, (ViewGroup) this, false);
        this.f1120e = checkBox;
        m1547a(checkBox);
    }

    /* JADX INFO: renamed from: f */
    public final void m1550f() {
        ImageView imageView = (ImageView) getInflater().inflate(C6595g.f25170k, (ViewGroup) this, false);
        this.f1117b = imageView;
        m1548b(imageView, 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m1551g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C6595g.f25172m, (ViewGroup) this, false);
        this.f1118c = radioButton;
        m1547a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    public C0417g getItemData() {
        return this.f1116a;
    }

    /* JADX INFO: renamed from: h */
    public void m1552h(boolean z10, char c10) {
        int i10 = (z10 && this.f1116a.m1663A()) ? 0 : 8;
        if (i10 == 0) {
            this.f1121f.setText(this.f1116a.m1671h());
        }
        if (this.f1121f.getVisibility() != i10) {
            this.f1121f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1125j);
        TextView textView = (TextView) findViewById(C6594f.f25130R);
        this.f1119d = textView;
        int i10 = this.f1126k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1127l, i10);
        }
        this.f1121f = (TextView) findViewById(C6594f.f25123K);
        ImageView imageView = (ImageView) findViewById(C6594f.f25126N);
        this.f1122g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1129n);
        }
        this.f1123h = (ImageView) findViewById(C6594f.f25154u);
        this.f1124i = (LinearLayout) findViewById(C6594f.f25146m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1117b != null && this.f1128m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1117b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1118c == null && this.f1120e == null) {
            return;
        }
        if (this.f1116a.m1676m()) {
            if (this.f1118c == null) {
                m1551g();
            }
            compoundButton = this.f1118c;
            view = this.f1120e;
        } else {
            if (this.f1120e == null) {
                m1549e();
            }
            compoundButton = this.f1120e;
            view = this.f1118c;
        }
        if (z10) {
            compoundButton.setChecked(this.f1116a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1120e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1118c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f1116a.m1676m()) {
            if (this.f1118c == null) {
                m1551g();
            }
            compoundButton = this.f1118c;
        } else {
            if (this.f1120e == null) {
                m1549e();
            }
            compoundButton = this.f1120e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1132q = z10;
        this.f1128m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f1123h;
        if (imageView != null) {
            imageView.setVisibility((this.f1130o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f1116a.m1689z() || this.f1132q;
        if (z10 || this.f1128m) {
            ImageView imageView = this.f1117b;
            if (imageView == null && drawable == null && !this.f1128m) {
                return;
            }
            if (imageView == null) {
                m1550f();
            }
            if (drawable == null && !this.f1128m) {
                this.f1117b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1117b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1117b.getVisibility() != 0) {
                this.f1117b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1119d.getVisibility() != 8) {
                this.f1119d.setVisibility(8);
            }
        } else {
            this.f1119d.setText(charSequence);
            if (this.f1119d.getVisibility() != 0) {
                this.f1119d.setVisibility(0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        C10357a1 c10357a1M39728v = C10357a1.m39728v(getContext(), attributeSet, C6598j.f25308V1, i10, 0);
        this.f1125j = c10357a1M39728v.m39735g(C6598j.f25316X1);
        this.f1126k = c10357a1M39728v.m39742n(C6598j.f25312W1, -1);
        this.f1128m = c10357a1M39728v.m39729a(C6598j.f25320Y1, false);
        this.f1127l = context;
        this.f1129n = c10357a1M39728v.m39735g(C6598j.f25324Z1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C6589a.f25007C, 0);
        this.f1130o = typedArrayObtainStyledAttributes.hasValue(0);
        c10357a1M39728v.m39749x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
