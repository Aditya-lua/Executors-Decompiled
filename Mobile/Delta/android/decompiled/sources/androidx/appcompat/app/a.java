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
import j.l;

/* JADX INFO: loaded from: classes.dex */
public class a extends l implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AlertController f672g;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f673a;
        public final int b;

        public C0009a(@NonNull Context context) {
            this(context, a.r(context, 0));
        }

        @NonNull
        public a a() {
            a aVar = new a(this.f673a.f638a, this.b);
            this.f673a.a(aVar.f672g);
            aVar.setCancelable(this.f673a.f654r);
            if (this.f673a.f654r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f673a.f655s);
            aVar.setOnDismissListener(this.f673a.f656t);
            DialogInterface.OnKeyListener onKeyListener = this.f673a.f657u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        @NonNull
        public Context b() {
            return this.f673a.f638a;
        }

        public C0009a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f659w = listAdapter;
            bVar.f660x = onClickListener;
            return this;
        }

        public C0009a d(boolean z10) {
            this.f673a.f654r = z10;
            return this;
        }

        public C0009a e(View view) {
            this.f673a.f643g = view;
            return this;
        }

        public C0009a f(Drawable drawable) {
            this.f673a.f640d = drawable;
            return this;
        }

        public C0009a g(int i10) {
            AlertController.b bVar = this.f673a;
            bVar.f644h = bVar.f638a.getText(i10);
            return this;
        }

        public C0009a h(CharSequence charSequence) {
            this.f673a.f644h = charSequence;
            return this;
        }

        public C0009a i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f648l = bVar.f638a.getText(i10);
            this.f673a.f650n = onClickListener;
            return this;
        }

        public C0009a j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f651o = bVar.f638a.getText(i10);
            this.f673a.f653q = onClickListener;
            return this;
        }

        public C0009a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f673a.f656t = onDismissListener;
            return this;
        }

        public C0009a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f673a.f657u = onKeyListener;
            return this;
        }

        public C0009a m(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f645i = bVar.f638a.getText(i10);
            this.f673a.f647k = onClickListener;
            return this;
        }

        public C0009a n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f645i = charSequence;
            bVar.f647k = onClickListener;
            return this;
        }

        public C0009a o(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f673a;
            bVar.f659w = listAdapter;
            bVar.f660x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public C0009a p(int i10) {
            AlertController.b bVar = this.f673a;
            bVar.f642f = bVar.f638a.getText(i10);
            return this;
        }

        public C0009a q(CharSequence charSequence) {
            this.f673a.f642f = charSequence;
            return this;
        }

        public a r() {
            a aVarA = a();
            aVarA.show();
            return aVarA;
        }

        public C0009a(@NonNull Context context, int i10) {
            this.f673a = new AlertController.b(new ContextThemeWrapper(context, a.r(context, i10)));
            this.b = i10;
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, r(context, i10));
        this.f672g = new AlertController(getContext(), this, getWindow());
    }

    public static int r(@NonNull Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f20016p, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f672g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f672g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f672g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public Button p(int i10) {
        return this.f672g.c(i10);
    }

    public ListView q() {
        return this.f672g.e();
    }

    @Override // j.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f672g.q(charSequence);
    }

    public void t(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f672g.k(i10, charSequence, onClickListener, null, null);
    }

    public void u(CharSequence charSequence) {
        this.f672g.o(charSequence);
    }

    public void v(View view) {
        this.f672g.s(view);
    }

    public void x(View view, int i10, int i11, int i12, int i13) {
        this.f672g.t(view, i10, i11, i12, i13);
    }
}
