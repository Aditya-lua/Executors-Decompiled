package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.view.o0;
import androidx.core.widget.NestedScrollView;
import i.f;
import i.j;
import j.l;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f611a;
    public final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f621l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f622m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f635z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f623n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f636a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f20156e2);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f20161f2, -1);
            this.f636a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f20166g2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f636a, getPaddingRight(), z11 ? getPaddingBottom() : this.b);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f624o && (message3 = alertController.f626q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f628s || (message2 = alertController.f630u) == null) {
                messageObtain = (view != alertController.f632w || (message = alertController.f634y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f638a;
        public final LayoutInflater b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f640d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f643g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f644h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f645i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f646j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f647k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f649m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f653q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f655s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f656t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f657u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f658v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f659w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f660x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f661y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f662z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f639c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f641e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f654r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f663a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f663a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f663a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        public class C0008b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f664a;
            public final int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f665c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f666d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f665c = recycleListView;
                this.f666d = alertController;
                Cursor cursor2 = getCursor();
                this.f664a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f664a));
                this.f665c.setItemChecked(cursor.getPosition(), cursor.getInt(this.b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.b.inflate(this.f666d.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f668a;

            public c(AlertController alertController) {
                this.f668a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f660x.onClick(this.f668a.b, i10);
                if (b.this.H) {
                    return;
                }
                this.f668a.b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f669a;
            public final /* synthetic */ AlertController b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f669a = recycleListView;
                this.b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f669a.isItemChecked(i10);
                }
                b.this.J.onClick(this.b.b, i10, this.f669a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f638a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f643g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f642f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f640d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f639c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f641e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f644h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f645i;
            if (charSequence3 == null && this.f646j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f647k, null, this.f646j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f648l;
            if (charSequence4 != null || this.f649m != null) {
                alertController2.k(-2, charSequence4, this.f650n, null, this.f649m);
            }
            CharSequence charSequence5 = this.f651o;
            if (charSequence5 != null || this.f652p != null) {
                alertController2.k(-3, charSequence5, this.f653q, null, this.f652p);
            }
            if (this.f658v != null || this.K != null || this.f659w != null) {
                b(alertController2);
            }
            View view2 = this.f662z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f661y;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }

        public final void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f638a, i10, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f659w;
                    if (dVar == null) {
                        dVar = new d(bVar.f638a, i10, R.id.text1, bVar.f658v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f638a, alertController.M, R.id.text1, this.f658v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0008b(bVar.f638a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f660x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f616g = recycleListView;
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f671a;

        public c(DialogInterface dialogInterface) {
            this.f671a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f671a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f611a = context;
        this.b = lVar;
        this.f612c = window;
        this.R = new c(lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.H, i.a.f20015o, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.M, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.P, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.O, true);
        this.f613d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.J, 0);
        typedArrayObtainStyledAttributes.recycle();
        lVar.o(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f20014n, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f632w;
        }
        if (i10 == -2) {
            return this.f628s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f624o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f611a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f616g;
    }

    public void f() {
        this.b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public final ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f633x = charSequence;
            this.f634y = message;
            this.f635z = drawable;
        } else if (i10 == -2) {
            this.f629t = charSequence;
            this.f630u = message;
            this.f631v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f625p = charSequence;
            this.f626q = message;
            this.f627r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f615f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f612c.findViewById(f.A);
        View viewFindViewById2 = this.f612c.findViewById(f.f20094z);
        o0.D0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f614e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f617h = null;
        this.f618i = i10;
        this.f623n = false;
    }

    public void s(View view) {
        this.f617h = view;
        this.f618i = 0;
        this.f623n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f617h = view;
        this.f618i = 0;
        this.f623n = true;
        this.f619j = i10;
        this.f620k = i11;
        this.f621l = i12;
        this.f622m = i13;
    }

    public final void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f624o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f625p) && this.f627r == null) {
            this.f624o.setVisibility(8);
            i10 = 0;
        } else {
            this.f624o.setText(this.f625p);
            Drawable drawable = this.f627r;
            if (drawable != null) {
                int i11 = this.f613d;
                drawable.setBounds(0, 0, i11, i11);
                this.f624o.setCompoundDrawables(this.f627r, null, null, null);
            }
            this.f624o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f628s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f629t) && this.f631v == null) {
            this.f628s.setVisibility(8);
        } else {
            this.f628s.setText(this.f629t);
            Drawable drawable2 = this.f631v;
            if (drawable2 != null) {
                int i12 = this.f613d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f628s.setCompoundDrawables(this.f631v, null, null, null);
            }
            this.f628s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f632w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f633x) && this.f635z == null) {
            this.f632w.setVisibility(8);
        } else {
            this.f632w.setText(this.f633x);
            Drawable drawable3 = this.f635z;
            if (drawable3 != null) {
                int i13 = this.f613d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f632w.setCompoundDrawables(this.f635z, null, null, null);
            }
            this.f632w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f611a)) {
            if (i10 == 1) {
                b(this.f624o);
            } else if (i10 == 2) {
                b(this.f628s);
            } else if (i10 == 4) {
                b(this.f632w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f612c.findViewById(f.B);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f615f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f616g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f616g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void w(ViewGroup viewGroup) {
        View viewInflate = this.f617h;
        if (viewInflate == null) {
            viewInflate = this.f618i != 0 ? LayoutInflater.from(this.f611a).inflate(this.f618i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f612c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f612c.findViewById(f.f20083o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f623n) {
            frameLayout.setPadding(this.f619j, this.f620k, this.f621l, this.f622m);
        }
        if (this.f616g != null) {
            ((LinearLayout.LayoutParams) ((androidx.appcompat.widget.b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f612c.findViewById(f.T).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f612c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f614e) || !this.P) {
            this.f612c.findViewById(f.T).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f612c.findViewById(f.f20079k);
        this.E = textView;
        textView.setText(this.f614e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f612c.findViewById(f.f20093y);
        int i10 = f.U;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = f.f20082n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = f.f20080l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f20084p);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(f.P)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f615f == null && this.f616g == null) ? null : viewGroupI.findViewById(f.S);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(f.Q)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f616g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f616g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f616g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }
}
