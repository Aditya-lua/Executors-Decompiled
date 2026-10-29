package xg;

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
import gk.p;
import sg.m0;
import sg.q0;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class b extends k implements View.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public a f35190v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ih.a f35191w0;

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
        this.f35191w0 = ih.a.c(layoutInflater, viewGroup, false);
        u2();
        return this.f35191w0.getRoot();
    }

    @Override // e4.k, androidx.fragment.app.c
    public void M0() {
        Dialog dialogH2 = h2();
        if (dialogH2 != null && V()) {
            dialogH2.setDismissMessage(null);
        }
        super.M0();
        this.f35191w0 = null;
    }

    @Override // androidx.fragment.app.c
    public void a1() {
        w2();
        super.a1();
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f35190v0;
        if (aVar != null) {
            aVar.c(p());
        } else {
            p.e("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f35190v0 == null) {
            p.e("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == m0.f30848m) {
            this.f35190v0.c(p());
        } else if (view.getId() == m0.f30852o) {
            this.f35190v0.a(p());
        } else if (view.getId() == m0.f30854p) {
            this.f35190v0.b(x());
        } else if (view.getId() == m0.f30856q) {
            this.f35190v0.d(false);
        }
        v2();
    }

    public final void u2() {
        if (h.a().P4()) {
            this.f35191w0.f20491d.setTypeface(Typeface.DEFAULT);
            this.f35191w0.f20491d.setText(q0.f30913a);
            this.f35191w0.f20494g.setVisibility(8);
            if (h.a().l5()) {
                RbxTextView rbxTextView = this.f35191w0.f20491d;
                rbxTextView.setPadding(rbxTextView.getPaddingLeft(), this.f35191w0.f20491d.getPaddingTop(), this.f35191w0.f20491d.getPaddingRight(), 16);
                this.f35191w0.f20495h.setVisibility(8);
                this.f35191w0.b.setVisibility(8);
            }
            this.f35191w0.f20493f.setTextSize(2, 16.0f);
            this.f35191w0.f20492e.setText(q0.b);
        }
        this.f35191w0.f20493f.setOnClickListener(this);
        this.f35191w0.f20492e.setOnClickListener(this);
        this.f35191w0.f20494g.setOnClickListener(this);
        this.f35191w0.f20490c.setOnClickListener(this);
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
        this.f35190v0 = aVar;
    }
}
