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
import q.b1;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f669a;
    public ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f678k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f684q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.F);
    }

    private LayoutInflater getInflater() {
        if (this.f683p == null) {
            this.f683p = LayoutInflater.from(getContext());
        }
        return this.f683p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f674g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f675h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f675h.getLayoutParams();
        rect.top += this.f675h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f676i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f669a = gVar;
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
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f18830j, (ViewGroup) this, false);
        this.f672e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f18831k, (ViewGroup) this, false);
        this.b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f18833m, (ViewGroup) this, false);
        this.f670c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f669a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f669a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f673f.setText(this.f669a.h());
        }
        if (this.f673f.getVisibility() != i10) {
            this.f673f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f677j);
        TextView textView = (TextView) findViewById(i.f.R);
        this.f671d = textView;
        int i10 = this.f678k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f679l, i10);
        }
        this.f673f = (TextView) findViewById(i.f.K);
        ImageView imageView = (ImageView) findViewById(i.f.N);
        this.f674g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f681n);
        }
        this.f675h = (ImageView) findViewById(i.f.f18816u);
        this.f676i = (LinearLayout) findViewById(i.f.f18808m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.b != null && this.f680m) {
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
        if (!z10 && this.f670c == null && this.f672e == null) {
            return;
        }
        if (this.f669a.m()) {
            if (this.f670c == null) {
                g();
            }
            compoundButton = this.f670c;
            view = this.f672e;
        } else {
            if (this.f672e == null) {
                e();
            }
            compoundButton = this.f672e;
            view = this.f670c;
        }
        if (z10) {
            compoundButton.setChecked(this.f669a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f672e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f670c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f669a.m()) {
            if (this.f670c == null) {
                g();
            }
            compoundButton = this.f670c;
        } else {
            if (this.f672e == null) {
                e();
            }
            compoundButton = this.f672e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f684q = z10;
        this.f680m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f675h;
        if (imageView != null) {
            imageView.setVisibility((this.f682o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f669a.z() || this.f684q;
        if (z10 || this.f680m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.f680m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f680m) {
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
            if (this.f671d.getVisibility() != 8) {
                this.f671d.setVisibility(8);
            }
        } else {
            this.f671d.setText(charSequence);
            if (this.f671d.getVisibility() != 0) {
                this.f671d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        b1 b1VarV = b1.v(getContext(), attributeSet, i.j.V1, i10, 0);
        this.f677j = b1VarV.g(i.j.X1);
        this.f678k = b1VarV.n(i.j.W1, -1);
        this.f680m = b1VarV.a(i.j.Y1, false);
        this.f679l = context;
        this.f681n = b1VarV.g(i.j.Z1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.C, 0);
        this.f682o = typedArrayObtainStyledAttributes.hasValue(0);
        b1VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
