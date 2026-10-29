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
import androidx.appcompat.widget.C0484b;
import androidx.core.view.C0625o0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p181i.C6589a;
import p181i.C6594f;
import p181i.C6598j;
import p203j.DialogC7002l;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A */
    public NestedScrollView f996A;

    /* JADX INFO: renamed from: C */
    public Drawable f998C;

    /* JADX INFO: renamed from: D */
    public ImageView f999D;

    /* JADX INFO: renamed from: E */
    public TextView f1000E;

    /* JADX INFO: renamed from: F */
    public TextView f1001F;

    /* JADX INFO: renamed from: G */
    public View f1002G;

    /* JADX INFO: renamed from: H */
    public ListAdapter f1003H;

    /* JADX INFO: renamed from: J */
    public int f1005J;

    /* JADX INFO: renamed from: K */
    public int f1006K;

    /* JADX INFO: renamed from: L */
    public int f1007L;

    /* JADX INFO: renamed from: M */
    public int f1008M;

    /* JADX INFO: renamed from: N */
    public int f1009N;

    /* JADX INFO: renamed from: O */
    public int f1010O;

    /* JADX INFO: renamed from: P */
    public boolean f1011P;

    /* JADX INFO: renamed from: R */
    public Handler f1013R;

    /* JADX INFO: renamed from: a */
    public final Context f1015a;

    /* JADX INFO: renamed from: b */
    public final DialogC7002l f1016b;

    /* JADX INFO: renamed from: c */
    public final Window f1017c;

    /* JADX INFO: renamed from: d */
    public final int f1018d;

    /* JADX INFO: renamed from: e */
    public CharSequence f1019e;

    /* JADX INFO: renamed from: f */
    public CharSequence f1020f;

    /* JADX INFO: renamed from: g */
    public ListView f1021g;

    /* JADX INFO: renamed from: h */
    public View f1022h;

    /* JADX INFO: renamed from: i */
    public int f1023i;

    /* JADX INFO: renamed from: j */
    public int f1024j;

    /* JADX INFO: renamed from: k */
    public int f1025k;

    /* JADX INFO: renamed from: l */
    public int f1026l;

    /* JADX INFO: renamed from: m */
    public int f1027m;

    /* JADX INFO: renamed from: o */
    public Button f1029o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1030p;

    /* JADX INFO: renamed from: q */
    public Message f1031q;

    /* JADX INFO: renamed from: r */
    public Drawable f1032r;

    /* JADX INFO: renamed from: s */
    public Button f1033s;

    /* JADX INFO: renamed from: t */
    public CharSequence f1034t;

    /* JADX INFO: renamed from: u */
    public Message f1035u;

    /* JADX INFO: renamed from: v */
    public Drawable f1036v;

    /* JADX INFO: renamed from: w */
    public Button f1037w;

    /* JADX INFO: renamed from: x */
    public CharSequence f1038x;

    /* JADX INFO: renamed from: y */
    public Message f1039y;

    /* JADX INFO: renamed from: z */
    public Drawable f1040z;

    /* JADX INFO: renamed from: n */
    public boolean f1028n = false;

    /* JADX INFO: renamed from: B */
    public int f997B = 0;

    /* JADX INFO: renamed from: I */
    public int f1004I = -1;

    /* JADX INFO: renamed from: Q */
    public int f1012Q = 0;

    /* JADX INFO: renamed from: S */
    public final View.OnClickListener f1014S = new ViewOnClickListenerC0404a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        public final int f1041a;

        /* JADX INFO: renamed from: b */
        public final int f1042b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6598j.f25349e2);
            this.f1042b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6598j.f25354f2, -1);
            this.f1041a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6598j.f25359g2, -1);
        }

        /* JADX INFO: renamed from: a */
        public void m1507a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f1041a, getPaddingRight(), z11 ? getPaddingBottom() : this.f1042b);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0404a implements View.OnClickListener {
        public ViewOnClickListenerC0404a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1029o && (message3 = alertController.f1031q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f1033s || (message2 = alertController.f1035u) == null) {
                messageObtain = (view != alertController.f1037w || (message = alertController.f1039y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f1013R.obtainMessage(1, alertController2.f1016b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0405b {

        /* JADX INFO: renamed from: A */
        public int f1044A;

        /* JADX INFO: renamed from: B */
        public int f1045B;

        /* JADX INFO: renamed from: C */
        public int f1046C;

        /* JADX INFO: renamed from: D */
        public int f1047D;

        /* JADX INFO: renamed from: F */
        public boolean[] f1049F;

        /* JADX INFO: renamed from: G */
        public boolean f1050G;

        /* JADX INFO: renamed from: H */
        public boolean f1051H;

        /* JADX INFO: renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f1053J;

        /* JADX INFO: renamed from: K */
        public Cursor f1054K;

        /* JADX INFO: renamed from: L */
        public String f1055L;

        /* JADX INFO: renamed from: M */
        public String f1056M;

        /* JADX INFO: renamed from: N */
        public AdapterView.OnItemSelectedListener f1057N;

        /* JADX INFO: renamed from: a */
        public final Context f1059a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f1060b;

        /* JADX INFO: renamed from: d */
        public Drawable f1062d;

        /* JADX INFO: renamed from: f */
        public CharSequence f1064f;

        /* JADX INFO: renamed from: g */
        public View f1065g;

        /* JADX INFO: renamed from: h */
        public CharSequence f1066h;

        /* JADX INFO: renamed from: i */
        public CharSequence f1067i;

        /* JADX INFO: renamed from: j */
        public Drawable f1068j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnClickListener f1069k;

        /* JADX INFO: renamed from: l */
        public CharSequence f1070l;

        /* JADX INFO: renamed from: m */
        public Drawable f1071m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f1072n;

        /* JADX INFO: renamed from: o */
        public CharSequence f1073o;

        /* JADX INFO: renamed from: p */
        public Drawable f1074p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnClickListener f1075q;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnCancelListener f1077s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnDismissListener f1078t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnKeyListener f1079u;

        /* JADX INFO: renamed from: v */
        public CharSequence[] f1080v;

        /* JADX INFO: renamed from: w */
        public ListAdapter f1081w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnClickListener f1082x;

        /* JADX INFO: renamed from: y */
        public int f1083y;

        /* JADX INFO: renamed from: z */
        public View f1084z;

        /* JADX INFO: renamed from: c */
        public int f1061c = 0;

        /* JADX INFO: renamed from: e */
        public int f1063e = 0;

        /* JADX INFO: renamed from: E */
        public boolean f1048E = false;

        /* JADX INFO: renamed from: I */
        public int f1052I = -1;

        /* JADX INFO: renamed from: O */
        public boolean f1058O = true;

        /* JADX INFO: renamed from: r */
        public boolean f1076r = true;

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$a */
        public class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f1085a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f1085a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = C0405b.this.f1049F;
                if (zArr != null && zArr[i10]) {
                    this.f1085a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b */
        public class b extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            public final int f1087a;

            /* JADX INFO: renamed from: b */
            public final int f1088b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ RecycleListView f1089c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ AlertController f1090d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f1089c = recycleListView;
                this.f1090d = alertController;
                Cursor cursor2 = getCursor();
                this.f1087a = cursor2.getColumnIndexOrThrow(C0405b.this.f1055L);
                this.f1088b = cursor2.getColumnIndexOrThrow(C0405b.this.f1056M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f1087a));
                this.f1089c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1088b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0405b.this.f1060b.inflate(this.f1090d.f1008M, viewGroup, false);
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$c */
        public class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AlertController f1092a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public c(AlertController alertController) {
                this.f1092a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C0405b.this.f1082x.onClick(this.f1092a.f1016b, i10);
                if (C0405b.this.f1051H) {
                    return;
                }
                this.f1092a.f1016b.dismiss();
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$d */
        public class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RecycleListView f1094a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AlertController f1095b;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f1094a = recycleListView;
                this.f1095b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = C0405b.this.f1049F;
                if (zArr != null) {
                    zArr[i10] = this.f1094a.isItemChecked(i10);
                }
                C0405b.this.f1053J.onClick(this.f1095b.f1016b, i10, this.f1094a.isItemChecked(i10));
            }
        }

        public C0405b(Context context) {
            this.f1059a = context;
            this.f1060b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX INFO: renamed from: a */
        public void m1508a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f1065g;
            if (view != null) {
                alertController.m1493l(view);
            } else {
                CharSequence charSequence = this.f1064f;
                if (charSequence != null) {
                    alertController.m1498q(charSequence);
                }
                Drawable drawable = this.f1062d;
                if (drawable != null) {
                    alertController.m1495n(drawable);
                }
                int i10 = this.f1061c;
                if (i10 != 0) {
                    alertController.m1494m(i10);
                }
                int i11 = this.f1063e;
                if (i11 != 0) {
                    alertController.m1494m(alertController.m1485d(i11));
                }
            }
            CharSequence charSequence2 = this.f1066h;
            if (charSequence2 != null) {
                alertController.m1496o(charSequence2);
            }
            CharSequence charSequence3 = this.f1067i;
            if (charSequence3 == null && this.f1068j == null) {
                alertController2 = alertController;
            } else {
                alertController.m1492k(-1, charSequence3, this.f1069k, null, this.f1068j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f1070l;
            if (charSequence4 != null || this.f1071m != null) {
                alertController2.m1492k(-2, charSequence4, this.f1072n, null, this.f1071m);
            }
            CharSequence charSequence5 = this.f1073o;
            if (charSequence5 != null || this.f1074p != null) {
                alertController2.m1492k(-3, charSequence5, this.f1075q, null, this.f1074p);
            }
            if (this.f1080v != null || this.f1054K != null || this.f1081w != null) {
                m1509b(alertController2);
            }
            View view2 = this.f1084z;
            if (view2 != null) {
                if (this.f1048E) {
                    alertController2.m1501t(view2, this.f1044A, this.f1045B, this.f1046C, this.f1047D);
                    return;
                } else {
                    alertController2.m1500s(view2);
                    return;
                }
            }
            int i12 = this.f1083y;
            if (i12 != 0) {
                alertController2.m1499r(i12);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m1509b(AlertController alertController) {
            C0405b c0405b;
            AlertController alertController2;
            ListAdapter c0407d;
            RecycleListView recycleListView = (RecycleListView) this.f1060b.inflate(alertController.f1007L, (ViewGroup) null);
            if (!this.f1050G) {
                c0405b = this;
                alertController2 = alertController;
                int i10 = c0405b.f1051H ? alertController2.f1009N : alertController2.f1010O;
                if (c0405b.f1054K != null) {
                    c0407d = new SimpleCursorAdapter(c0405b.f1059a, i10, c0405b.f1054K, new String[]{c0405b.f1055L}, new int[]{R.id.text1});
                } else {
                    c0407d = c0405b.f1081w;
                    if (c0407d == null) {
                        c0407d = new C0407d(c0405b.f1059a, i10, R.id.text1, c0405b.f1080v);
                    }
                }
            } else if (this.f1054K == null) {
                c0405b = this;
                c0407d = c0405b.new a(this.f1059a, alertController.f1008M, R.id.text1, this.f1080v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                c0405b = this;
                alertController2 = alertController;
                c0407d = c0405b.new b(c0405b.f1059a, c0405b.f1054K, false, recycleListView, alertController2);
            }
            alertController2.f1003H = c0407d;
            alertController2.f1004I = c0405b.f1052I;
            if (c0405b.f1082x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (c0405b.f1053J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c0405b.f1057N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c0405b.f1051H) {
                recycleListView.setChoiceMode(1);
            } else if (c0405b.f1050G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f1021g = recycleListView;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0406c extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogInterface> f1097a;

        public HandlerC0406c(DialogInterface dialogInterface) {
            this.f1097a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f1097a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0407d extends ArrayAdapter<CharSequence> {
        public C0407d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
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

    public AlertController(Context context, DialogC7002l dialogC7002l, Window window) {
        this.f1015a = context;
        this.f1016b = dialogC7002l;
        this.f1017c = window;
        this.f1013R = new HandlerC0406c(dialogC7002l);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C6598j.f25237H, C6589a.f25036o, 0);
        this.f1005J = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25242I, 0);
        this.f1006K = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25252K, 0);
        this.f1007L = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25262M, 0);
        this.f1008M = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25267N, 0);
        this.f1009N = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25277P, 0);
        this.f1010O = typedArrayObtainStyledAttributes.getResourceId(C6598j.f25257L, 0);
        this.f1011P = typedArrayObtainStyledAttributes.getBoolean(C6598j.f25272O, true);
        this.f1018d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6598j.f25247J, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC7002l.m29605o(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1481a(View view) {
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
            if (m1481a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m1482z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6589a.f25035n, typedValue, true);
        return typedValue.data != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m1483b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public Button m1484c(int i10) {
        if (i10 == -3) {
            return this.f1037w;
        }
        if (i10 == -2) {
            return this.f1033s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f1029o;
    }

    /* JADX INFO: renamed from: d */
    public int m1485d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f1015a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX INFO: renamed from: e */
    public ListView m1486e() {
        return this.f1021g;
    }

    /* JADX INFO: renamed from: f */
    public void m1487f() {
        this.f1016b.setContentView(m1491j());
        m1506y();
    }

    /* JADX INFO: renamed from: g */
    public boolean m1488g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f996A;
        return nestedScrollView != null && nestedScrollView.m3277t(keyEvent);
    }

    /* JADX INFO: renamed from: h */
    public boolean m1489h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f996A;
        return nestedScrollView != null && nestedScrollView.m3277t(keyEvent);
    }

    /* JADX INFO: renamed from: i */
    public final ViewGroup m1490i(View view, View view2) {
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

    /* JADX INFO: renamed from: j */
    public final int m1491j() {
        int i10 = this.f1006K;
        return (i10 != 0 && this.f1012Q == 1) ? i10 : this.f1005J;
    }

    /* JADX INFO: renamed from: k */
    public void m1492k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f1013R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f1038x = charSequence;
            this.f1039y = message;
            this.f1040z = drawable;
        } else if (i10 == -2) {
            this.f1034t = charSequence;
            this.f1035u = message;
            this.f1036v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1030p = charSequence;
            this.f1031q = message;
            this.f1032r = drawable;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1493l(View view) {
        this.f1002G = view;
    }

    /* JADX INFO: renamed from: m */
    public void m1494m(int i10) {
        this.f998C = null;
        this.f997B = i10;
        ImageView imageView = this.f999D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f999D.setImageResource(this.f997B);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1495n(Drawable drawable) {
        this.f998C = drawable;
        this.f997B = 0;
        ImageView imageView = this.f999D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f999D.setImageDrawable(drawable);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1496o(CharSequence charSequence) {
        this.f1020f = charSequence;
        TextView textView = this.f1001F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1497p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f1017c.findViewById(C6594f.f25113A);
        View viewFindViewById2 = this.f1017c.findViewById(C6594f.f25159z);
        C0625o0.m2985D0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1498q(CharSequence charSequence) {
        this.f1019e = charSequence;
        TextView textView = this.f1000E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1499r(int i10) {
        this.f1022h = null;
        this.f1023i = i10;
        this.f1028n = false;
    }

    /* JADX INFO: renamed from: s */
    public void m1500s(View view) {
        this.f1022h = view;
        this.f1023i = 0;
        this.f1028n = false;
    }

    /* JADX INFO: renamed from: t */
    public void m1501t(View view, int i10, int i11, int i12, int i13) {
        this.f1022h = view;
        this.f1023i = 0;
        this.f1028n = true;
        this.f1024j = i10;
        this.f1025k = i11;
        this.f1026l = i12;
        this.f1027m = i13;
    }

    /* JADX INFO: renamed from: u */
    public final void m1502u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f1029o = button;
        button.setOnClickListener(this.f1014S);
        if (TextUtils.isEmpty(this.f1030p) && this.f1032r == null) {
            this.f1029o.setVisibility(8);
            i10 = 0;
        } else {
            this.f1029o.setText(this.f1030p);
            Drawable drawable = this.f1032r;
            if (drawable != null) {
                int i11 = this.f1018d;
                drawable.setBounds(0, 0, i11, i11);
                this.f1029o.setCompoundDrawables(this.f1032r, null, null, null);
            }
            this.f1029o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f1033s = button2;
        button2.setOnClickListener(this.f1014S);
        if (TextUtils.isEmpty(this.f1034t) && this.f1036v == null) {
            this.f1033s.setVisibility(8);
        } else {
            this.f1033s.setText(this.f1034t);
            Drawable drawable2 = this.f1036v;
            if (drawable2 != null) {
                int i12 = this.f1018d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f1033s.setCompoundDrawables(this.f1036v, null, null, null);
            }
            this.f1033s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f1037w = button3;
        button3.setOnClickListener(this.f1014S);
        if (TextUtils.isEmpty(this.f1038x) && this.f1040z == null) {
            this.f1037w.setVisibility(8);
        } else {
            this.f1037w.setText(this.f1038x);
            Drawable drawable3 = this.f1040z;
            if (drawable3 != null) {
                int i13 = this.f1018d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f1037w.setCompoundDrawables(this.f1040z, null, null, null);
            }
            this.f1037w.setVisibility(0);
            i10 |= 4;
        }
        if (m1482z(this.f1015a)) {
            if (i10 == 1) {
                m1483b(this.f1029o);
            } else if (i10 == 2) {
                m1483b(this.f1033s);
            } else if (i10 == 4) {
                m1483b(this.f1037w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* JADX INFO: renamed from: v */
    public final void m1503v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f1017c.findViewById(C6594f.f25114B);
        this.f996A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f996A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f1001F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f1020f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f996A.removeView(this.f1001F);
        if (this.f1021g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f996A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f996A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f1021g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: w */
    public final void m1504w(ViewGroup viewGroup) {
        View viewInflate = this.f1022h;
        if (viewInflate == null) {
            viewInflate = this.f1023i != 0 ? LayoutInflater.from(this.f1015a).inflate(this.f1023i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !m1481a(viewInflate)) {
            this.f1017c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f1017c.findViewById(C6594f.f25148o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f1028n) {
            frameLayout.setPadding(this.f1024j, this.f1025k, this.f1026l, this.f1027m);
        }
        if (this.f1021g != null) {
            ((LinearLayout.LayoutParams) ((C0484b.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m1505x(ViewGroup viewGroup) {
        if (this.f1002G != null) {
            viewGroup.addView(this.f1002G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1017c.findViewById(C6594f.f25132T).setVisibility(8);
            return;
        }
        this.f999D = (ImageView) this.f1017c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f1019e) || !this.f1011P) {
            this.f1017c.findViewById(C6594f.f25132T).setVisibility(8);
            this.f999D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f1017c.findViewById(C6594f.f25144k);
        this.f1000E = textView;
        textView.setText(this.f1019e);
        int i10 = this.f997B;
        if (i10 != 0) {
            this.f999D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f998C;
        if (drawable != null) {
            this.f999D.setImageDrawable(drawable);
        } else {
            this.f1000E.setPadding(this.f999D.getPaddingLeft(), this.f999D.getPaddingTop(), this.f999D.getPaddingRight(), this.f999D.getPaddingBottom());
            this.f999D.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m1506y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f1017c.findViewById(C6594f.f25158y);
        int i10 = C6594f.f25133U;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = C6594f.f25147n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = C6594f.f25145l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C6594f.f25149p);
        m1504w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupM1490i = m1490i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM1490i2 = m1490i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM1490i3 = m1490i(viewFindViewById9, viewFindViewById6);
        m1503v(viewGroupM1490i2);
        m1502u(viewGroupM1490i3);
        m1505x(viewGroupM1490i);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupM1490i == null || viewGroupM1490i.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupM1490i3 == null || viewGroupM1490i3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupM1490i2 != null && (viewFindViewById2 = viewGroupM1490i2.findViewById(C6594f.f25128P)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f996A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f1020f == null && this.f1021g == null) ? null : viewGroupM1490i.findViewById(C6594f.f25131S);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM1490i2 != null && (viewFindViewById = viewGroupM1490i2.findViewById(C6594f.f25129Q)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f1021g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m1507a(z11, z12);
        }
        if (!z10) {
            View view = this.f1021g;
            if (view == null) {
                view = this.f996A;
            }
            if (view != null) {
                m1497p(viewGroupM1490i2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f1021g;
        if (listView2 == null || (listAdapter = this.f1003H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f1004I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }
}
