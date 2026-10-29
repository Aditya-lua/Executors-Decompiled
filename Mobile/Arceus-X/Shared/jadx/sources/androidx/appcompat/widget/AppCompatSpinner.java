package androidx.appcompat.widget;

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
import androidx.appcompat.app.DialogInterfaceC0408a;
import p181i.C6589a;
import p181i.C6595g;
import p181i.C6598j;
import p232k.C7399a;
import p316o.C9611d;
import p346p.InterfaceC10082f;
import p365q.AbstractViewOnTouchListenerC10390n0;
import p365q.C10357a1;
import p365q.C10367e;
import p365q.C10375g1;
import p365q.C10392o0;
import p365q.C10406v0;
import p365q.InterfaceC10408w0;
import p533x2.C12632b;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    /* JADX INFO: renamed from: i */
    @SuppressLint({"ResourceType"})
    public static final int[] f1413i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a */
    public final C10367e f1414a;

    /* JADX INFO: renamed from: b */
    public final Context f1415b;

    /* JADX INFO: renamed from: c */
    public AbstractViewOnTouchListenerC10390n0 f1416c;

    /* JADX INFO: renamed from: d */
    public SpinnerAdapter f1417d;

    /* JADX INFO: renamed from: e */
    public final boolean f1418e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0450g f1419f;

    /* JADX INFO: renamed from: g */
    public int f1420g;

    /* JADX INFO: renamed from: h */
    public final Rect f1421h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0443a();

        /* JADX INFO: renamed from: a */
        public boolean f1422a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        public class C0443a implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1422a ? (byte) 1 : (byte) 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1422a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    public class C0444a extends AbstractViewOnTouchListenerC10390n0 {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ C0449f f1423j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0444a(View view, C0449f c0449f) {
            super(view);
            this.f1423j = c0449f;
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: b */
        public InterfaceC10082f mo1542b() {
            return this.f1423j;
        }

        @Override // p365q.AbstractViewOnTouchListenerC10390n0
        /* JADX INFO: renamed from: c */
        public boolean mo1543c() {
            if (AppCompatSpinner.this.getInternalPopup().mo1794a()) {
                return true;
            }
            AppCompatSpinner.this.m1790b();
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC0445b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0445b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1794a()) {
                AppCompatSpinner.this.m1790b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    public static final class C0446c {
        /* JADX INFO: renamed from: a */
        public static void m1793a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C12632b.m47060a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public class DialogInterfaceOnClickListenerC0447d implements InterfaceC0450g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0408a f1426a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f1427b;

        /* JADX INFO: renamed from: c */
        public CharSequence f1428c;

        public DialogInterfaceOnClickListenerC0447d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: a */
        public boolean mo1794a() {
            DialogInterfaceC0408a dialogInterfaceC0408a = this.f1426a;
            if (dialogInterfaceC0408a != null) {
                return dialogInterfaceC0408a.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: b */
        public void mo1795b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: c */
        public int mo1796c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        public void dismiss() {
            DialogInterfaceC0408a dialogInterfaceC0408a = this.f1426a;
            if (dialogInterfaceC0408a != null) {
                dialogInterfaceC0408a.dismiss();
                this.f1426a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: e */
        public void mo1797e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: f */
        public CharSequence mo1798f() {
            return this.f1428c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: g */
        public Drawable mo1799g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: h */
        public void mo1800h(CharSequence charSequence) {
            this.f1428c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: i */
        public void mo1801i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: j */
        public void mo1802j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: k */
        public void mo1803k(int i10, int i11) {
            if (this.f1427b == null) {
                return;
            }
            DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f1428c;
            if (charSequence != null) {
                aVar.m1533q(charSequence);
            }
            DialogInterfaceC0408a dialogInterfaceC0408aM1517a = aVar.m1531o(this.f1427b, AppCompatSpinner.this.getSelectedItemPosition(), this).m1517a();
            this.f1426a = dialogInterfaceC0408aM1517a;
            ListView listViewM1512q = dialogInterfaceC0408aM1517a.m1512q();
            listViewM1512q.setTextDirection(i10);
            listViewM1512q.setTextAlignment(i11);
            this.f1426a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: l */
        public int mo1804l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: m */
        public void mo1805m(ListAdapter listAdapter) {
            this.f1427b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f1427b.getItemId(i10));
            }
            dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    public static class C0448e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a */
        public SpinnerAdapter f1430a;

        /* JADX INFO: renamed from: b */
        public ListAdapter f1431b;

        public C0448e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1430a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1431b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    C0446c.m1793a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC10408w0) {
                    InterfaceC10408w0 interfaceC10408w0 = (InterfaceC10408w0) spinnerAdapter;
                    if (interfaceC10408w0.getDropDownViewTheme() == null) {
                        interfaceC10408w0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1431b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1430a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1430a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1430a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1430a;
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
            SpinnerAdapter spinnerAdapter = this.f1430a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1431b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1430a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1430a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    public class C0449f extends C10392o0 implements InterfaceC0450g {

        /* JADX INFO: renamed from: I */
        public CharSequence f1432I;

        /* JADX INFO: renamed from: J */
        public ListAdapter f1433J;

        /* JADX INFO: renamed from: K */
        public final Rect f1434K;

        /* JADX INFO: renamed from: L */
        public int f1435L;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$a */
        public class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AppCompatSpinner f1437a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(AppCompatSpinner appCompatSpinner) {
                this.f1437a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0449f c0449f = C0449f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, c0449f.f1433J.getItemId(i10));
                }
                C0449f.this.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                C0449f c0449f = C0449f.this;
                if (!c0449f.m1809U(AppCompatSpinner.this)) {
                    C0449f.this.dismiss();
                } else {
                    C0449f.this.m1807S();
                    C0449f.super.show();
                }
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$f$c */
        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1440a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1440a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1440a);
                }
            }
        }

        public C0449f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1434K = new Rect();
            m39940C(AppCompatSpinner.this);
            m39946I(true);
            m39952O(0);
            m39948K(new a(AppCompatSpinner.this));
        }

        /* JADX INFO: renamed from: S */
        public void m1807S() {
            int i10;
            Drawable drawableM39958g = m39958g();
            if (drawableM39958g != null) {
                drawableM39958g.getPadding(AppCompatSpinner.this.f1421h);
                i10 = C10375g1.m39840b(AppCompatSpinner.this) ? AppCompatSpinner.this.f1421h.right : -AppCompatSpinner.this.f1421h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1421h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f1420g;
            if (i11 == -2) {
                int iM1789a = appCompatSpinner.m1789a((SpinnerAdapter) this.f1433J, m39958g());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1421h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iM1789a > i13) {
                    iM1789a = i13;
                }
                m39942E(Math.max(iM1789a, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                m39942E((width - paddingLeft) - paddingRight);
            } else {
                m39942E(i11);
            }
            m39957e(C10375g1.m39840b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - m39970y()) - m1808T()) : i10 + paddingLeft + m1808T());
        }

        /* JADX INFO: renamed from: T */
        public int m1808T() {
            return this.f1435L;
        }

        /* JADX INFO: renamed from: U */
        public boolean m1809U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f1434K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: f */
        public CharSequence mo1798f() {
            return this.f1432I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: h */
        public void mo1800h(CharSequence charSequence) {
            this.f1432I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: j */
        public void mo1802j(int i10) {
            this.f1435L = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: k */
        public void mo1803k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zMo1574a = mo1574a();
            m1807S();
            m39945H(2);
            super.show();
            ListView listViewMo1579o = mo1579o();
            listViewMo1579o.setChoiceMode(1);
            listViewMo1579o.setTextDirection(i10);
            listViewMo1579o.setTextAlignment(i11);
            m39953P(AppCompatSpinner.this.getSelectedItemPosition());
            if (zMo1574a || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m39947J(new c(bVar));
        }

        @Override // p365q.C10392o0, androidx.appcompat.widget.AppCompatSpinner.InterfaceC0450g
        /* JADX INFO: renamed from: m */
        public void mo1805m(ListAdapter listAdapter) {
            super.mo1805m(listAdapter);
            this.f1433J = listAdapter;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    public interface InterfaceC0450g {
        /* JADX INFO: renamed from: a */
        boolean mo1794a();

        /* JADX INFO: renamed from: b */
        void mo1795b(Drawable drawable);

        /* JADX INFO: renamed from: c */
        int mo1796c();

        void dismiss();

        /* JADX INFO: renamed from: e */
        void mo1797e(int i10);

        /* JADX INFO: renamed from: f */
        CharSequence mo1798f();

        /* JADX INFO: renamed from: g */
        Drawable mo1799g();

        /* JADX INFO: renamed from: h */
        void mo1800h(CharSequence charSequence);

        /* JADX INFO: renamed from: i */
        void mo1801i(int i10);

        /* JADX INFO: renamed from: j */
        void mo1802j(int i10);

        /* JADX INFO: renamed from: k */
        void mo1803k(int i10, int i11);

        /* JADX INFO: renamed from: l */
        int mo1804l();

        /* JADX INFO: renamed from: m */
        void mo1805m(ListAdapter listAdapter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25017M);
    }

    /* JADX INFO: renamed from: a */
    public int m1789a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
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
        drawable.getPadding(this.f1421h);
        Rect rect = this.f1421h;
        return iMax2 + rect.left + rect.right;
    }

    /* JADX INFO: renamed from: b */
    public void m1790b() {
        this.f1419f.mo1803k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        return interfaceC0450g != null ? interfaceC0450g.mo1796c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        return interfaceC0450g != null ? interfaceC0450g.mo1804l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1419f != null ? this.f1420g : super.getDropDownWidth();
    }

    public final InterfaceC0450g getInternalPopup() {
        return this.f1419f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        return interfaceC0450g != null ? interfaceC0450g.mo1799g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1415b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        return interfaceC0450g != null ? interfaceC0450g.mo1798f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g == null || !interfaceC0450g.mo1794a()) {
            return;
        }
        this.f1419f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1419f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1789a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f1422a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0445b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        InterfaceC0450g interfaceC0450g = this.f1419f;
        savedState.f1422a = interfaceC0450g != null && interfaceC0450g.mo1794a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC10390n0 abstractViewOnTouchListenerC10390n0 = this.f1416c;
        if (abstractViewOnTouchListenerC10390n0 == null || !abstractViewOnTouchListenerC10390n0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g == null) {
            return super.performClick();
        }
        if (interfaceC0450g.mo1794a()) {
            return true;
        }
        m1790b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            interfaceC0450g.mo1802j(i10);
            this.f1419f.mo1797e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g != null) {
            interfaceC0450g.mo1801i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1419f != null) {
            this.f1420g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g != null) {
            interfaceC0450g.mo1795b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C7399a.m30679b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0450g interfaceC0450g = this.f1419f;
        if (interfaceC0450g != null) {
            interfaceC0450g.mo1800h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f1414a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setAdapter(Landroid/widget/Adapter;)V */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1418e) {
            this.f1417d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1419f != null) {
            Context context = this.f1415b;
            if (context == null) {
                context = getContext();
            }
            this.f1419f.mo1805m(new C0448e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0059 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x003d */
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
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    public AppCompatSpinner(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrM39745q;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i10);
        this.f1421h = new Rect();
        C10406v0.m40056a(this, getContext());
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, C6598j.f25454z2, i10, 0);
        this.f1414a = new C10367e(this);
        if (theme != null) {
            this.f1415b = new C9611d(context, theme);
        } else {
            int iM39742n = c10357a1M39728v.m39742n(C6598j.f25225E2, 0);
            if (iM39742n != 0) {
                this.f1415b = new C9611d(context, iM39742n);
            } else {
                this.f1415b = context;
            }
        }
        ?? r11 = -1;
        ?? r8 = 0;
        try {
            if (i11 == -1) {
                try {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1413i, i10, 0);
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
                            DialogInterfaceOnClickListenerC0447d dialogInterfaceOnClickListenerC0447d = new DialogInterfaceOnClickListenerC0447d();
                            this.f1419f = dialogInterfaceOnClickListenerC0447d;
                            dialogInterfaceOnClickListenerC0447d.mo1800h(c10357a1M39728v.m39743o(C6598j.f25215C2));
                        } else if (i11 == 1) {
                            C0449f c0449f = new C0449f(this.f1415b, attributeSet, i10);
                            C10357a1 c10357a1M39728v2 = C10357a1.m39728v(this.f1415b, attributeSet, C6598j.f25454z2, i10, 0);
                            this.f1420g = c10357a1M39728v2.m39741m(C6598j.f25220D2, -2);
                            c0449f.m39955b(c10357a1M39728v2.m39735g(C6598j.f25210B2));
                            c0449f.mo1800h(c10357a1M39728v.m39743o(C6598j.f25215C2));
                            c10357a1M39728v2.m39749x();
                            this.f1419f = c0449f;
                            this.f1416c = new C0444a(this, c0449f);
                        }
                        charSequenceArrM39745q = c10357a1M39728v.m39745q(C6598j.f25205A2);
                        if (charSequenceArrM39745q != null) {
                            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM39745q);
                            arrayAdapter.setDropDownViewResource(C6595g.f25180u);
                            setAdapter(arrayAdapter);
                        }
                        c10357a1M39728v.m39749x();
                        this.f1418e = true;
                        spinnerAdapter = this.f1417d;
                        if (spinnerAdapter != null) {
                            setAdapter(spinnerAdapter);
                            this.f1417d = null;
                        }
                        this.f1414a.m39827e(attributeSet, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArrayObtainStyledAttributes = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r8 != 0) {
                        r8.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 != 0) {
                DialogInterfaceOnClickListenerC0447d dialogInterfaceOnClickListenerC0447d2 = new DialogInterfaceOnClickListenerC0447d();
                this.f1419f = dialogInterfaceOnClickListenerC0447d2;
                dialogInterfaceOnClickListenerC0447d2.mo1800h(c10357a1M39728v.m39743o(C6598j.f25215C2));
            } else if (i11 == 1) {
                C0449f c0449f2 = new C0449f(this.f1415b, attributeSet, i10);
                C10357a1 c10357a1M39728v3 = C10357a1.m39728v(this.f1415b, attributeSet, C6598j.f25454z2, i10, 0);
                this.f1420g = c10357a1M39728v3.m39741m(C6598j.f25220D2, -2);
                c0449f2.m39955b(c10357a1M39728v3.m39735g(C6598j.f25210B2));
                c0449f2.mo1800h(c10357a1M39728v.m39743o(C6598j.f25215C2));
                c10357a1M39728v3.m39749x();
                this.f1419f = c0449f2;
                this.f1416c = new C0444a(this, c0449f2);
            }
            charSequenceArrM39745q = c10357a1M39728v.m39745q(C6598j.f25205A2);
            if (charSequenceArrM39745q != null) {
                ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrM39745q);
                arrayAdapter2.setDropDownViewResource(C6595g.f25180u);
                setAdapter(arrayAdapter2);
            }
            c10357a1M39728v.m39749x();
            this.f1418e = true;
            spinnerAdapter = this.f1417d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f1417d = null;
            }
            this.f1414a.m39827e(attributeSet, i10);
        } catch (Throwable th3) {
            th = th3;
            r8 = r11;
        }
    }
}
