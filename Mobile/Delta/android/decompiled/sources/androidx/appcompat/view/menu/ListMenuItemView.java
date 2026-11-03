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
    public g f688a;
    public ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f701o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f703q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.F);
    }

    private LayoutInflater getInflater() {
        if (this.f702p == null) {
            this.f702p = LayoutInflater.from(getContext());
        }
        return this.f702p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f693g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f694h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f694h.getLayoutParams();
        rect.top += this.f694h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i10) {
        LinearLayout linearLayout = this.f695i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f688a = gVar;
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
        CheckBox checkBox = (CheckBox) getInflater().inflate(i.g.f20103j, (ViewGroup) this, false);
        this.f691e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(i.g.f20104k, (ViewGroup) this, false);
        this.b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(i.g.f20106m, (ViewGroup) this, false);
        this.f689c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f688a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f688a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f692f.setText(this.f688a.h());
        }
        if (this.f692f.getVisibility() != i10) {
            this.f692f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f696j);
        TextView textView = (TextView) findViewById(i.f.R);
        this.f690d = textView;
        int i10 = this.f697k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f698l, i10);
        }
        this.f692f = (TextView) findViewById(i.f.K);
        ImageView imageView = (ImageView) findViewById(i.f.N);
        this.f693g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f700n);
        }
        this.f694h = (ImageView) findViewById(i.f.f20089u);
        this.f695i = (LinearLayout) findViewById(i.f.f20081m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.b != null && this.f699m) {
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
        if (!z10 && this.f689c == null && this.f691e == null) {
            return;
        }
        if (this.f688a.m()) {
            if (this.f689c == null) {
                g();
            }
            compoundButton = this.f689c;
            view = this.f691e;
        } else {
            if (this.f691e == null) {
                e();
            }
            compoundButton = this.f691e;
            view = this.f689c;
        }
        if (z10) {
            compoundButton.setChecked(this.f688a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f691e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f689c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f688a.m()) {
            if (this.f689c == null) {
                g();
            }
            compoundButton = this.f689c;
        } else {
            if (this.f691e == null) {
                e();
            }
            compoundButton = this.f691e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f703q = z10;
        this.f699m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f694h;
        if (imageView != null) {
            imageView.setVisibility((this.f701o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f688a.z() || this.f703q;
        if (z10 || this.f699m) {
            ImageView imageView = this.b;
            if (imageView == null && drawable == null && !this.f699m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f699m) {
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
            if (this.f690d.getVisibility() != 8) {
                this.f690d.setVisibility(8);
            }
        } else {
            this.f690d.setText(charSequence);
            if (this.f690d.getVisibility() != 0) {
                this.f690d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a1 a1VarV = a1.v(getContext(), attributeSet, i.j.V1, i10, 0);
        this.f696j = a1VarV.g(i.j.X1);
        this.f697k = a1VarV.n(i.j.W1, -1);
        this.f699m = a1VarV.a(i.j.Y1, false);
        this.f698l = context;
        this.f700n = a1VarV.g(i.j.Z1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, i.a.C, 0);
        this.f701o = typedArrayObtainStyledAttributes.hasValue(0);
        a1VarV.x();
        typedArrayObtainStyledAttributes.recycle();
    }
}
