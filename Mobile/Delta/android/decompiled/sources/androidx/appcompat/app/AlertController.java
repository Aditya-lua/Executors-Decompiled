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
    public final Context f766a;
    public final l b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ListView f771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f774j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f775k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f777m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f779o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f780p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Message f781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Button f783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f784t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Message f785u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f786v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Button f787w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f788x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Message f789y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f790z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f778n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f791a;
        public final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f20040e2);
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f20045f2, -1);
            this.f791a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f20050g2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f791a, getPaddingRight(), z11 ? getPaddingBottom() : this.b);
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
            if (view == alertController.f779o && (message3 = alertController.f781q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f783s || (message2 = alertController.f785u) == null) {
                messageObtain = (view != alertController.f787w || (message = alertController.f789y) == null) ? null : Message.obtain(message);
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
        public final Context f793a;
        public final LayoutInflater b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f795d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f806o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f807p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f808q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f810s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f812u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f813v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f814w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f815x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f816y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f817z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f794c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f796e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f809r = true;

        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f818a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f818a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f818a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        public class C0012b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f819a;
            public final int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f820c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f821d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0012b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f820c = recycleListView;
                this.f821d = alertController;
                Cursor cursor2 = getCursor();
                this.f819a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f819a));
                this.f820c.setItemChecked(cursor.getPosition(), cursor.getInt(this.b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.b.inflate(this.f821d.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f823a;

            public c(AlertController alertController) {
                this.f823a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                b.this.f815x.onClick(this.f823a.b, i10);
                if (b.this.H) {
                    return;
                }
                this.f823a.b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f824a;
            public final /* synthetic */ AlertController b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f824a = recycleListView;
                this.b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f824a.isItemChecked(i10);
                }
                b.this.J.onClick(this.b.b, i10, this.f824a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f793a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f798g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f797f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f795d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f794c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f796e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f799h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f800i;
            if (charSequence3 == null && this.f801j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f802k, null, this.f801j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f803l;
            if (charSequence4 != null || this.f804m != null) {
                alertController2.k(-2, charSequence4, this.f805n, null, this.f804m);
            }
            CharSequence charSequence5 = this.f806o;
            if (charSequence5 != null || this.f807p != null) {
                alertController2.k(-3, charSequence5, this.f808q, null, this.f807p);
            }
            if (this.f813v != null || this.K != null || this.f814w != null) {
                b(alertController2);
            }
            View view2 = this.f817z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f816y;
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
                    dVar = new SimpleCursorAdapter(bVar.f793a, i10, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f814w;
                    if (dVar == null) {
                        dVar = new d(bVar.f793a, i10, R.id.text1, bVar.f813v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f793a, alertController.M, R.id.text1, this.f813v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0012b(bVar.f793a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f815x != null) {
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
            alertController2.f771g = recycleListView;
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f826a;

        public c(DialogInterface dialogInterface) {
            this.f826a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f826a.get(), message.what);
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
        this.f766a = context;
        this.b = lVar;
        this.f767c = window;
        this.R = new c(lVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.H, i.a.f19899o, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(j.I, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(j.K, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(j.M, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(j.N, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(j.P, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(j.L, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(j.O, true);
        this.f768d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.J, 0);
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
        context.getTheme().resolveAttribute(i.a.f19898n, typedValue, true);
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
            return this.f787w;
        }
        if (i10 == -2) {
            return this.f783s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f779o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f766a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f771g;
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
            this.f788x = charSequence;
            this.f789y = message;
            this.f790z = drawable;
        } else if (i10 == -2) {
            this.f784t = charSequence;
            this.f785u = message;
            this.f786v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f780p = charSequence;
            this.f781q = message;
            this.f782r = drawable;
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
        this.f770f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f767c.findViewById(f.A);
        View viewFindViewById2 = this.f767c.findViewById(f.f19978z);
        o0.D0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f769e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f772h = null;
        this.f773i = i10;
        this.f778n = false;
    }

    public void s(View view) {
        this.f772h = view;
        this.f773i = 0;
        this.f778n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f772h = view;
        this.f773i = 0;
        this.f778n = true;
        this.f774j = i10;
        this.f775k = i11;
        this.f776l = i12;
        this.f777m = i13;
    }

    public final void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f779o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f780p) && this.f782r == null) {
            this.f779o.setVisibility(8);
            i10 = 0;
        } else {
            this.f779o.setText(this.f780p);
            Drawable drawable = this.f782r;
            if (drawable != null) {
                int i11 = this.f768d;
                drawable.setBounds(0, 0, i11, i11);
                this.f779o.setCompoundDrawables(this.f782r, null, null, null);
            }
            this.f779o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f783s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f784t) && this.f786v == null) {
            this.f783s.setVisibility(8);
        } else {
            this.f783s.setText(this.f784t);
            Drawable drawable2 = this.f786v;
            if (drawable2 != null) {
                int i12 = this.f768d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f783s.setCompoundDrawables(this.f786v, null, null, null);
            }
            this.f783s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f787w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f788x) && this.f790z == null) {
            this.f787w.setVisibility(8);
        } else {
            this.f787w.setText(this.f788x);
            Drawable drawable3 = this.f790z;
            if (drawable3 != null) {
                int i13 = this.f768d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f787w.setCompoundDrawables(this.f790z, null, null, null);
            }
            this.f787w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f766a)) {
            if (i10 == 1) {
                b(this.f779o);
            } else if (i10 == 2) {
                b(this.f783s);
            } else if (i10 == 4) {
                b(this.f787w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f767c.findViewById(f.B);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f770f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f771g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f771g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void w(ViewGroup viewGroup) {
        View viewInflate = this.f772h;
        if (viewInflate == null) {
            viewInflate = this.f773i != 0 ? LayoutInflater.from(this.f766a).inflate(this.f773i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f767c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f767c.findViewById(f.f19967o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f778n) {
            frameLayout.setPadding(this.f774j, this.f775k, this.f776l, this.f777m);
        }
        if (this.f771g != null) {
            ((LinearLayout.LayoutParams) ((androidx.appcompat.widget.b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f767c.findViewById(f.T).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f767c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f769e) || !this.P) {
            this.f767c.findViewById(f.T).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f767c.findViewById(f.f19963k);
        this.E = textView;
        textView.setText(this.f769e);
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
        View viewFindViewById3 = this.f767c.findViewById(f.f19977y);
        int i10 = f.U;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = f.f19966n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = f.f19964l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f19968p);
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
            View viewFindViewById10 = (this.f770f == null && this.f771g == null) ? null : viewGroupI.findViewById(f.S);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(f.Q)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f771g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f771g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f771g;
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
