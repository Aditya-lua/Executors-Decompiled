package wg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.roblox.client.components.RbxTextView;
import e4.k;
import ek.q;
import rg.m0;
import rg.q0;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class b extends k implements View.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a f34515v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public hh.a f34516w0;

    public interface a {
        void a(Activity activity);

        void b(Context context);

        void c(Activity activity);

        void d(boolean z10);
    }

    @Override // e4.k, androidx.fragment.app.c
    public void F0(Bundle bundle) {
        super.F0(bundle);
        V1(true);
        r2(1, j2());
    }

    @Override // androidx.fragment.app.c
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34516w0 = hh.a.c(layoutInflater, viewGroup, false);
        u2();
        return this.f34516w0.getRoot();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        Dialog dialogH2 = h2();
        if (dialogH2 != null && U()) {
            dialogH2.setDismissMessage(null);
        }
        super.M0();
        this.f34516w0 = null;
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        w2();
        super.a1();
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f34515v0;
        if (aVar != null) {
            aVar.c(p());
        } else {
            q.e("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f34515v0 == null) {
            q.e("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == m0.f30451m) {
            this.f34515v0.c(p());
        } else if (view.getId() == m0.f30455o) {
            this.f34515v0.a(p());
        } else if (view.getId() == m0.f30457p) {
            this.f34515v0.b(w());
        } else if (view.getId() == m0.f30459q) {
            this.f34515v0.d(false);
        }
        v2();
    }

    public final void u2() {
        if (h.a().c5()) {
            this.f34516w0.f19466d.setTypeface(Typeface.DEFAULT);
            this.f34516w0.f19466d.setText(q0.f30518a);
            this.f34516w0.f19469g.setVisibility(8);
            if (h.a().w5()) {
                RbxTextView rbxTextView = this.f34516w0.f19466d;
                rbxTextView.setPadding(rbxTextView.getPaddingLeft(), this.f34516w0.f19466d.getPaddingTop(), this.f34516w0.f19466d.getPaddingRight(), 16);
                this.f34516w0.f19470h.setVisibility(8);
                this.f34516w0.b.setVisibility(8);
            }
            this.f34516w0.f19468f.setTextSize(2, 16.0f);
            this.f34516w0.f19467e.setText(q0.b);
        }
        this.f34516w0.f19468f.setOnClickListener(this);
        this.f34516w0.f19467e.setOnClickListener(this);
        this.f34516w0.f19469g.setOnClickListener(this);
        this.f34516w0.f19465c.setOnClickListener(this);
    }

    public final void v2() {
        e2();
    }

    public final void w2() {
        Window window = h2().getWindow();
        Point point = new Point();
        if (window != null) {
            window.getWindowManager().getDefaultDisplay().getSize(point);
            window.setLayout(Math.min(Math.min(point.x, point.y), 950), -2);
            window.setGravity(17);
        }
    }

    public void x2(a aVar) {
        this.f34515v0 = aVar;
    }
}
