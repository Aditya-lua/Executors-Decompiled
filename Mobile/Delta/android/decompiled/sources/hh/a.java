package hh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxTextView;
import r5.b;
import rg.m0;
import rg.n0;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f19464a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f19465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RbxTextView f19466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RbxButton f19467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RbxButton f19468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RbxButton f19469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RbxTextView f19470h;

    public a(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RbxTextView rbxTextView, @NonNull RbxButton rbxButton, @NonNull RbxButton rbxButton2, @NonNull RbxButton rbxButton3, @NonNull RbxTextView rbxTextView2) {
        this.f19464a = linearLayout;
        this.b = textView;
        this.f19465c = textView2;
        this.f19466d = rbxTextView;
        this.f19467e = rbxButton;
        this.f19468f = rbxButton2;
        this.f19469g = rbxButton3;
        this.f19470h = rbxTextView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = m0.f30449l;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = m0.f30451m;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = m0.f30453n;
                RbxTextView rbxTextView = (RbxTextView) b.a(view, i10);
                if (rbxTextView != null) {
                    i10 = m0.f30455o;
                    RbxButton rbxButton = (RbxButton) b.a(view, i10);
                    if (rbxButton != null) {
                        i10 = m0.f30457p;
                        RbxButton rbxButton2 = (RbxButton) b.a(view, i10);
                        if (rbxButton2 != null) {
                            i10 = m0.f30459q;
                            RbxButton rbxButton3 = (RbxButton) b.a(view, i10);
                            if (rbxButton3 != null) {
                                i10 = m0.f30430b0;
                                RbxTextView rbxTextView2 = (RbxTextView) b.a(view, i10);
                                if (rbxTextView2 != null) {
                                    return new a((LinearLayout) view, textView, textView2, rbxTextView, rbxButton, rbxButton2, rbxButton3, rbxTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(n0.f30486g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f19464a;
    }
}
