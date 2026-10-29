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
import q.a1;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f843a;
    public ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f852k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f858q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.F);
    }

    private LayoutInflater getInflater() {
        if (this.f857p == null) {
            this.f857p = LayoutInflater.from(getContext());
        }
        return this.f857p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f848g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f849h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f849h.getLayoutParams();
        rect.top += this.f849h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f850i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f843a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f19987j, (ViewGroup) this, false);
        this.f846e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f19988k, (ViewGroup) this, false);
        this.b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f19990m, (ViewGroup) this, false);
        this.f844c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f843a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f843a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f847f.setText(this.f843a.h());
        }
        if (this.f847f.getVisibility() != i10) {
            this.f847f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f851j);
        TextView textView = (TextView) findViewById(i.f.R);
        this.f845d = textView;
        int i10 = this.f852k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f853l, i10);
        }
        this.f847f = (TextView) findViewById(i.f.K);
        ImageView imageView = (ImageView) findViewById(i.f.N);
        this.f848g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f855n);
        }
        this.f849h = (ImageView) findViewById(i.f.f19973u);
        this.f850i = (LinearLayout) findViewById(i.f.f19965m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.b != null && this.f854m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
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
        if (!z10 && this.f844c == null && this.f846e == null) {
            return;
        }
        if (this.f843a.m()) {
            if (this.f844c == null) {
                g();
            }
            compoundButton = this.f844c;
            view = this.f846e;
        } else {
            if (this.f846e == null) {
                e();
            }
            compoundButton = this.f846e;
            view = this.f844c;
        }
        if (z10) {
            compoundButton.setChecked(this.f843a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f846e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f844c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f843a.m()) {
            if (this.f844c == null) {
                g();
            }
            compoundButton = this.f844c;
        } else {
            if (this.f846e == null) {
                e();
            }
            compoundButton = this.f846e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f858q = z10;
        this.f854m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f849h;
        if (imageView != null) {
            imageView.setVisibility((this.f856o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f843a.z() || this.f858q;
        if (z10 || this.f854m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.f854m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f854m) {
                this.b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.b.getVisibility() != 0) {
                this.b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f845d.getVisibility() != 8) {
                this.f845d.setVisibility(8);
            }
        } else {
            this.f845d.setText(charSequence);
            if (this.f845d.getVisibility() != 0) {
                this.f845d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a1 a1VarV = a1.v(getContext(), attributeSet, i.j.V1, i10, 0);
        this.f851j = a1VarV.g(i.j.X1);
        this.f852k = a1VarV.n(i.j.W1, -1);
        this.f854m = a1VarV.a(i.j.Y1, false);
        this.f853l = context;
        this.f855n = a1VarV.g(i.j.Z1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.C, 0);
        this.f856o = typedArrayObtainStyledAttributes.hasValue(0);
        a1VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
