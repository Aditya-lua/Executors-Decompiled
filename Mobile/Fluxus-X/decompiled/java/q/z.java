package q;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class z extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    public static final int[] f29693i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q.e f29694a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f29695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f29696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f29697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f29698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f29700h;

    public class a extends o0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f29701j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.f29701j = fVar;
        }

        @Override // q.o0
        public p.f b() {
            return this.f29701j;
        }

        @Override // q.o0
        public boolean c() {
            if (z.this.getInternalPopup().a()) {
                return true;
            }
            z.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!z.this.getInternalPopup().a()) {
                z.this.b();
            }
            ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class c {
        public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (x2.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.a f29704a;
        public ListAdapter b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f29705c;

        public d() {
        }

        @Override // q.z.h
        public boolean a() {
            androidx.appcompat.app.a aVar = this.f29704a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // q.z.h
        public void b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // q.z.h
        public int c() {
            return 0;
        }

        @Override // q.z.h
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f29704a;
            if (aVar != null) {
                aVar.dismiss();
                this.f29704a = null;
            }
        }

        @Override // q.z.h
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // q.z.h
        public CharSequence f() {
            return this.f29705c;
        }

        @Override // q.z.h
        public Drawable g() {
            return null;
        }

        @Override // q.z.h
        public void h(CharSequence charSequence) {
            this.f29705c = charSequence;
        }

        @Override // q.z.h
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // q.z.h
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // q.z.h
        public void k(int i10, int i11) {
            if (this.b == null) {
                return;
            }
            androidx.appcompat.app.a.C0021a c0021a = new androidx.appcompat.app.a.C0021a(z.this.getPopupContext());
            CharSequence charSequence = this.f29705c;
            if (charSequence != null) {
                c0021a.q(charSequence);
            }
            androidx.appcompat.app.a aVarA = c0021a.o(this.b, z.this.getSelectedItemPosition(), this).a();
            this.f29704a = aVarA;
            ListView listViewQ = aVarA.q();
            listViewQ.setTextDirection(i10);
            listViewQ.setTextAlignment(i11);
            this.f29704a.show();
        }

        @Override // q.z.h
        public int l() {
            return 0;
        }

        @Override // q.z.h
        public void m(ListAdapter listAdapter) {
            this.b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z.this.setSelection(i10);
            if (z.this.getOnItemClickListener() != null) {
                z.this.performItemClick(null, i10, this.b.getItemId(i10));
            }
            dismiss();
        }
    }

    public static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f29707a;
        public ListAdapter b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f29707a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof x0) {
                    x0 x0Var = (x0) spinnerAdapter;
                    if (x0Var.getDropDownViewTheme() == null) {
                        x0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f29707a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class f extends p0 implements h {
        public CharSequence I;
        public ListAdapter J;
        public final Rect K;
        public int L;

        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z f29708a;

            public a(z zVar) {
                this.f29708a = zVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                z.this.setSelection(i10);
                if (z.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    z.this.performItemClick(view, i10, fVar.J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(z.this)) {
                    f.this.dismiss();
                } else {
                    f.this.S();
                    f.super.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f29710a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f29710a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f29710a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.K = new Rect();
            C(z.this);
            I(true);
            O(0);
            K(new a(z.this));
        }

        public void S() {
            int i10;
            Drawable drawableG = g();
            if (drawableG != null) {
                drawableG.getPadding(z.this.f29700h);
                i10 = h1.b(z.this) ? z.this.f29700h.right : -z.this.f29700h.left;
            } else {
                Rect rect = z.this.f29700h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = z.this.getPaddingLeft();
            int paddingRight = z.this.getPaddingRight();
            int width = z.this.getWidth();
            z zVar = z.this;
            int i11 = zVar.f29699g;
            if (i11 == -2) {
                int iA = zVar.a((SpinnerAdapter) this.J, g());
                int i12 = z.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = z.this.f29700h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                E(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i11);
            }
            e(h1.b(z.this) ? i10 + (((width - paddingRight) - y()) - T()) : i10 + paddingLeft + T());
        }

        public int T() {
            return this.L;
        }

        public boolean U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.K);
        }

        @Override // q.z.h
        public CharSequence f() {
            return this.I;
        }

        @Override // q.z.h
        public void h(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // q.z.h
        public void j(int i10) {
            this.L = i10;
        }

        @Override // q.z.h
        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            S();
            H(2);
            super.show();
            ListView listViewO = o();
            listViewO.setChoiceMode(1);
            listViewO.setTextDirection(i10);
            listViewO.setTextAlignment(i11);
            P(z.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // q.p0, q.z.h
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.J = listAdapter;
        }
    }

    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29711a;

        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f29711a ? (byte) 1 : (byte) 0);
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f29711a = parcel.readByte() != 0;
        }
    }

    public interface h {
        boolean a();

        void b(Drawable drawable);

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);
    }

    public z(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.M);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f29700h);
        Rect rect = this.f29700h;
        return iMax2 + rect.left + rect.right;
    }

    public void b() {
        this.f29698f.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q.e eVar = this.f29694a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f29698f;
        return hVar != null ? hVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f29698f;
        return hVar != null ? hVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f29698f != null ? this.f29699g : super.getDropDownWidth();
    }

    public final h getInternalPopup() {
        return this.f29698f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f29698f;
        return hVar != null ? hVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f29698f;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        q.e eVar = this.f29694a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.e eVar = this.f29694a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f29698f;
        if (hVar == null || !hVar.a()) {
            return;
        }
        this.f29698f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f29698f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f29711a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f29698f;
        gVar.f29711a = hVar != null && hVar.a();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o0 o0Var = this.f29695c;
        if (o0Var == null || !o0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f29698f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.e eVar = this.f29694a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.e eVar = this.f29694a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f29698f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.j(i10);
            this.f29698f.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f29698f;
        if (hVar != null) {
            hVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f29698f != null) {
            this.f29699g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f29698f;
        if (hVar != null) {
            hVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(k.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f29698f;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.e eVar = this.f29694a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.e eVar = this.f29694a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public z(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f29697e) {
            this.f29696d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f29698f != null) {
            Context context = this.b;
            if (context == null) {
                context = getContext();
            }
            this.f29698f.m(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public z(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, q.z] */
    public z(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f29700h = new Rect();
        w0.a(this, getContext());
        b1 b1VarV = b1.v(context, attributeSet, i.j.f18988z2, i10, 0);
        this.f29694a = new q.e(this);
        if (theme != null) {
            this.b = new o.d(context, theme);
        } else {
            int iN = b1VarV.n(i.j.E2, 0);
            if (iN != 0) {
                this.b = new o.d(context, iN);
            } else {
                this.b = context;
            }
        }
        ?? r11 = -1;
        ?? r10 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29693i, i10, 0);
                    try {
                        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                        r11 = typedArrayObtainStyledAttributes;
                        if (zHasValue) {
                            i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
                            r11 = typedArrayObtainStyledAttributes;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArrayObtainStyledAttributes;
                        if (typedArrayObtainStyledAttributes != null) {
                        }
                        if (i11 != 0) {
                            d dVar = new d();
                            this.f29698f = dVar;
                            dVar.h(b1VarV.o(i.j.C2));
                        } else if (i11 == 1) {
                            f fVar = new f(this.b, attributeSet, i10);
                            b1 b1VarV2 = b1.v(this.b, attributeSet, i.j.f18988z2, i10, 0);
                            this.f29699g = b1VarV2.m(i.j.D2, -2);
                            fVar.b(b1VarV2.g(i.j.B2));
                            fVar.h(b1VarV.o(i.j.C2));
                            b1VarV2.x();
                            this.f29698f = fVar;
                            this.f29695c = new a(this, fVar);
                        }
                        charSequenceArrQ = b1VarV.q(i.j.A2);
                        if (charSequenceArrQ != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                            arrayAdapter.setDropDownViewResource(i.g.f18841u);
                            setAdapter(arrayAdapter);
                        }
                        b1VarV.x();
                        this.f29697e = true;
                        spinnerAdapter = this.f29696d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f29696d = null;
                        }
                        this.f29694a.e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r10 != 0) {
                        r10.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                d dVar2 = new d();
                this.f29698f = dVar2;
                dVar2.h(b1VarV.o(i.j.C2));
            } else if (i11 == 1) {
                f fVar2 = new f(this.b, attributeSet, i10);
                b1 b1VarV3 = b1.v(this.b, attributeSet, i.j.f18988z2, i10, 0);
                this.f29699g = b1VarV3.m(i.j.D2, -2);
                fVar2.b(b1VarV3.g(i.j.B2));
                fVar2.h(b1VarV.o(i.j.C2));
                b1VarV3.x();
                this.f29698f = fVar2;
                this.f29695c = new a(this, fVar2);
            }
            charSequenceArrQ = b1VarV.q(i.j.A2);
            if (charSequenceArrQ != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                arrayAdapter2.setDropDownViewResource(i.g.f18841u);
                setAdapter(arrayAdapter2);
            }
            b1VarV.x();
            this.f29697e = true;
            spinnerAdapter = this.f29696d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f29696d = null;
            }
            this.f29694a.e(attributeSet, i10);
        } catch (Throwable th3) {
            th = th3;
            r10 = r11;
        }
    }
}
