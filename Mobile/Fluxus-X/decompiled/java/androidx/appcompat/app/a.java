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
    public final AlertController f653g;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0021a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f654a;
        public final int b;

        public C0021a(@NonNull Context context) {
            this(context, a.r(context, 0));
        }

        @NonNull
        public a a() {
            a aVar = new a(this.f654a.f619a, this.b);
            this.f654a.a(aVar.f653g);
            aVar.setCancelable(this.f654a.f635r);
            if (this.f654a.f635r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f654a.f636s);
            aVar.setOnDismissListener(this.f654a.f637t);
            DialogInterface.OnKeyListener onKeyListener = this.f654a.f638u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        @NonNull
        public Context b() {
            return this.f654a.f619a;
        }

        public C0021a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f640w = listAdapter;
            bVar.f641x = onClickListener;
            return this;
        }

        public C0021a d(boolean z10) {
            this.f654a.f635r = z10;
            return this;
        }

        public C0021a e(View view) {
            this.f654a.f624g = view;
            return this;
        }

        public C0021a f(Drawable drawable) {
            this.f654a.f621d = drawable;
            return this;
        }

        public C0021a g(int i10) {
            AlertController.b bVar = this.f654a;
            bVar.f625h = bVar.f619a.getText(i10);
            return this;
        }

        public C0021a h(CharSequence charSequence) {
            this.f654a.f625h = charSequence;
            return this;
        }

        public C0021a i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f629l = bVar.f619a.getText(i10);
            this.f654a.f631n = onClickListener;
            return this;
        }

        public C0021a j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f632o = bVar.f619a.getText(i10);
            this.f654a.f634q = onClickListener;
            return this;
        }

        public C0021a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f654a.f637t = onDismissListener;
            return this;
        }

        public C0021a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f654a.f638u = onKeyListener;
            return this;
        }

        public C0021a m(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f626i = bVar.f619a.getText(i10);
            this.f654a.f628k = onClickListener;
            return this;
        }

        public C0021a n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f626i = charSequence;
            bVar.f628k = onClickListener;
            return this;
        }

        public C0021a o(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f654a;
            bVar.f640w = listAdapter;
            bVar.f641x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public C0021a p(int i10) {
            AlertController.b bVar = this.f654a;
            bVar.f623f = bVar.f619a.getText(i10);
            return this;
        }

        public C0021a q(CharSequence charSequence) {
            this.f654a.f623f = charSequence;
            return this;
        }

        public a r() {
            a aVarA = a();
            aVarA.show();
            return aVarA;
        }

        public C0021a(@NonNull Context context, int i10) {
            this.f654a = new AlertController.b(new ContextThemeWrapper(context, a.r(context, i10)));
            this.b = i10;
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, r(context, i10));
        this.f653g = new AlertController(getContext(), this, getWindow());
    }

    public static int r(@NonNull Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f18743p, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f653g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f653g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f653g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public Button p(int i10) {
        return this.f653g.c(i10);
    }

    public ListView q() {
        return this.f653g.e();
    }

    @Override // j.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f653g.q(charSequence);
    }

    public void t(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f653g.k(i10, charSequence, onClickListener, null, null);
    }

    public void u(CharSequence charSequence) {
        this.f653g.o(charSequence);
    }

    public void v(View view) {
        this.f653g.s(view);
    }

    public void w(View view, int i10, int i11, int i12, int i13) {
        this.f653g.t(view, i10, i11, i12, i13);
    }
}
