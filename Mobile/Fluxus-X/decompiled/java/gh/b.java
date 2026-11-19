package gh;

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
import bh.m0;
import bh.q0;
import bi.h;
import com.roblox.client.components.RbxTextView;
import f4.o;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class b extends o implements View.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a f17752v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public rh.b f17753w0;

    public interface a {
        void a(Activity activity);

        void b(Context context);

        void c(Activity activity);

        void d(boolean z10);
    }

    @Override // f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
        V1(true);
        r2(1, j2());
    }

    @Override // f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17753w0 = rh.b.c(layoutInflater, viewGroup, false);
        u2();
        return this.f17753w0.getRoot();
    }

    @Override // f4.o, f4.q
    public void M0() {
        Dialog dialogH2 = h2();
        if (dialogH2 != null && U()) {
            dialogH2.setDismissMessage(null);
        }
        super.M0();
        this.f17753w0 = null;
    }

    @Override // f4.q
    public void a1() {
        w2();
        super.a1();
    }

    @Override // f4.o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f17752v0;
        if (aVar != null) {
            aVar.c(p());
        } else {
            q.e("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f17752v0 == null) {
            q.e("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == m0.f4152m) {
            this.f17752v0.c(p());
        } else if (view.getId() == m0.f4156o) {
            this.f17752v0.a(p());
        } else if (view.getId() == m0.f4158p) {
            this.f17752v0.b(v());
        } else if (view.getId() == m0.f4160q) {
            this.f17752v0.d(false);
        }
        v2();
    }

    public final void u2() {
        if (h.a().c5()) {
            this.f17753w0.f30717d.setTypeface(Typeface.DEFAULT);
            this.f17753w0.f30717d.setText(q0.f4220a);
            this.f17753w0.f30720g.setVisibility(8);
            if (h.a().u5()) {
                RbxTextView rbxTextView = this.f17753w0.f30717d;
                rbxTextView.setPadding(rbxTextView.getPaddingLeft(), this.f17753w0.f30717d.getPaddingTop(), this.f17753w0.f30717d.getPaddingRight(), 16);
                this.f17753w0.f30721h.setVisibility(8);
                this.f17753w0.b.setVisibility(8);
            }
            this.f17753w0.f30719f.setTextSize(2, 16.0f);
            this.f17753w0.f30718e.setText(q0.b);
        }
        this.f17753w0.f30719f.setOnClickListener(this);
        this.f17753w0.f30718e.setOnClickListener(this);
        this.f17753w0.f30720g.setOnClickListener(this);
        this.f17753w0.f30716c.setOnClickListener(this);
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
        this.f17752v0 = aVar;
    }
}
