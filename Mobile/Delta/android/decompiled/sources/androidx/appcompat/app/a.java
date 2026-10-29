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
    public final AlertController f827g;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0013a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AlertController.b f828a;
        public final int b;

        public C0013a(@NonNull Context context) {
            this(context, a.r(context, 0));
        }

        @NonNull
        public a a() {
            a aVar = new a(this.f828a.f793a, this.b);
            this.f828a.a(aVar.f827g);
            aVar.setCancelable(this.f828a.f809r);
            if (this.f828a.f809r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f828a.f810s);
            aVar.setOnDismissListener(this.f828a.f811t);
            DialogInterface.OnKeyListener onKeyListener = this.f828a.f812u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        @NonNull
        public Context b() {
            return this.f828a.f793a;
        }

        public C0013a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f814w = listAdapter;
            bVar.f815x = onClickListener;
            return this;
        }

        public C0013a d(boolean z10) {
            this.f828a.f809r = z10;
            return this;
        }

        public C0013a e(View view) {
            this.f828a.f798g = view;
            return this;
        }

        public C0013a f(Drawable drawable) {
            this.f828a.f795d = drawable;
            return this;
        }

        public C0013a g(int i10) {
            AlertController.b bVar = this.f828a;
            bVar.f799h = bVar.f793a.getText(i10);
            return this;
        }

        public C0013a h(CharSequence charSequence) {
            this.f828a.f799h = charSequence;
            return this;
        }

        public C0013a i(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f803l = bVar.f793a.getText(i10);
            this.f828a.f805n = onClickListener;
            return this;
        }

        public C0013a j(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f806o = bVar.f793a.getText(i10);
            this.f828a.f808q = onClickListener;
            return this;
        }

        public C0013a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f828a.f811t = onDismissListener;
            return this;
        }

        public C0013a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f828a.f812u = onKeyListener;
            return this;
        }

        public C0013a m(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f800i = bVar.f793a.getText(i10);
            this.f828a.f802k = onClickListener;
            return this;
        }

        public C0013a n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f800i = charSequence;
            bVar.f802k = onClickListener;
            return this;
        }

        public C0013a o(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f828a;
            bVar.f814w = listAdapter;
            bVar.f815x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public C0013a p(int i10) {
            AlertController.b bVar = this.f828a;
            bVar.f797f = bVar.f793a.getText(i10);
            return this;
        }

        public C0013a q(CharSequence charSequence) {
            this.f828a.f797f = charSequence;
            return this;
        }

        public a r() {
            a aVarA = a();
            aVarA.show();
            return aVarA;
        }

        public C0013a(@NonNull Context context, int i10) {
            this.f828a = new AlertController.b(new ContextThemeWrapper(context, a.r(context, i10)));
            this.b = i10;
        }
    }

    public a(@NonNull Context context, int i10) {
        super(context, r(context, i10));
        this.f827g = new AlertController(getContext(), this, getWindow());
    }

    public static int r(@NonNull Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f19900p, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // j.l, e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f827g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f827g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f827g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public Button p(int i10) {
        return this.f827g.c(i10);
    }

    public ListView q() {
        return this.f827g.e();
    }

    @Override // j.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f827g.q(charSequence);
    }

    public void t(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f827g.k(i10, charSequence, onClickListener, null, null);
    }

    public void u(CharSequence charSequence) {
        this.f827g.o(charSequence);
    }

    public void v(View view) {
        this.f827g.s(view);
    }

    public void w(View view, int i10, int i11, int i12, int i13) {
        this.f827g.t(view, i10, i11, i12, i13);
    }
}
