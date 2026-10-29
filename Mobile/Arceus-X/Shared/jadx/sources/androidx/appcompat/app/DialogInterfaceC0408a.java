package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import p181i.C6589a;
import p203j.DialogC7002l;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0408a extends DialogC7002l implements DialogInterface {

    /* JADX INFO: renamed from: g */
    public final AlertController f1098g;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AlertController.C0405b f1099a;

        /* JADX INFO: renamed from: b */
        public final int f1100b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(@NonNull Context context) {
            this(context, DialogInterfaceC0408a.m1510r(context, 0));
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public DialogInterfaceC0408a m1517a() {
            DialogInterfaceC0408a dialogInterfaceC0408a = new DialogInterfaceC0408a(this.f1099a.f1059a, this.f1100b);
            this.f1099a.m1508a(dialogInterfaceC0408a.f1098g);
            dialogInterfaceC0408a.setCancelable(this.f1099a.f1076r);
            if (this.f1099a.f1076r) {
                dialogInterfaceC0408a.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0408a.setOnCancelListener(this.f1099a.f1077s);
            dialogInterfaceC0408a.setOnDismissListener(this.f1099a.f1078t);
            DialogInterface.OnKeyListener onKeyListener = this.f1099a.f1079u;
            if (onKeyListener != null) {
                dialogInterfaceC0408a.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0408a;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public Context m1518b() {
            return this.f1099a.f1059a;
        }

        /* JADX INFO: renamed from: c */
        public a m1519c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1081w = listAdapter;
            c0405b.f1082x = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m1520d(boolean z10) {
            this.f1099a.f1076r = z10;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m1521e(View view) {
            this.f1099a.f1065g = view;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m1522f(Drawable drawable) {
            this.f1099a.f1062d = drawable;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a m1523g(int i10) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1066h = c0405b.f1059a.getText(i10);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public a m1524h(CharSequence charSequence) {
            this.f1099a.f1066h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a m1525i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1070l = c0405b.f1059a.getText(i10);
            this.f1099a.f1072n = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m1526j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1073o = c0405b.f1059a.getText(i10);
            this.f1099a.f1075q = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m1527k(DialogInterface.OnDismissListener onDismissListener) {
            this.f1099a.f1078t = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m1528l(DialogInterface.OnKeyListener onKeyListener) {
            this.f1099a.f1079u = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m1529m(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1067i = c0405b.f1059a.getText(i10);
            this.f1099a.f1069k = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public a m1530n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1067i = charSequence;
            c0405b.f1069k = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m1531o(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1081w = listAdapter;
            c0405b.f1082x = onClickListener;
            c0405b.f1052I = i10;
            c0405b.f1051H = true;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m1532p(int i10) {
            AlertController.C0405b c0405b = this.f1099a;
            c0405b.f1064f = c0405b.f1059a.getText(i10);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public a m1533q(CharSequence charSequence) {
            this.f1099a.f1064f = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public DialogInterfaceC0408a m1534r() {
            DialogInterfaceC0408a dialogInterfaceC0408aM1517a = m1517a();
            dialogInterfaceC0408aM1517a.show();
            return dialogInterfaceC0408aM1517a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(@NonNull Context context, int i10) {
            this.f1099a = new AlertController.C0405b(new ContextThemeWrapper(context, DialogInterfaceC0408a.m1510r(context, i10)));
            this.f1100b = i10;
        }
    }

    public DialogInterfaceC0408a(@NonNull Context context, int i10) {
        super(context, m1510r(context, i10));
        this.f1098g = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: r */
    public static int m1510r(@NonNull Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6589a.f25037p, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p203j.DialogC7002l, p088e.DialogC4736w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1098g.m1487f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f1098g.m1488g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f1098g.m1489h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    /* JADX INFO: renamed from: p */
    public Button m1511p(int i10) {
        return this.f1098g.m1484c(i10);
    }

    /* JADX INFO: renamed from: q */
    public ListView m1512q() {
        return this.f1098g.m1486e();
    }

    @Override // p203j.DialogC7002l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1098g.m1498q(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public void m1513t(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f1098g.m1492k(i10, charSequence, onClickListener, null, null);
    }

    /* JADX INFO: renamed from: u */
    public void m1514u(CharSequence charSequence) {
        this.f1098g.m1496o(charSequence);
    }

    /* JADX INFO: renamed from: v */
    public void m1515v(View view) {
        this.f1098g.m1500s(view);
    }

    /* JADX INFO: renamed from: w */
    public void m1516w(View view, int i10, int i11, int i12, int i13) {
        this.f1098g.m1501t(view, i10, i11, i12, i13);
    }
}
