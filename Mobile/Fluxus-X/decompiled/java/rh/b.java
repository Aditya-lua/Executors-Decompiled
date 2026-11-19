package rh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import bh.m0;
import bh.n0;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f30715a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f30716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final RbxTextView f30717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final RbxButton f30718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RbxButton f30719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final RbxButton f30720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RbxTextView f30721h;

    public b(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RbxTextView rbxTextView, @NonNull RbxButton rbxButton, @NonNull RbxButton rbxButton2, @NonNull RbxButton rbxButton3, @NonNull RbxTextView rbxTextView2) {
        this.f30715a = linearLayout;
        this.b = textView;
        this.f30716c = textView2;
        this.f30717d = rbxTextView;
        this.f30718e = rbxButton;
        this.f30719f = rbxButton2;
        this.f30720g = rbxButton3;
        this.f30721h = rbxTextView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i10 = m0.f4150l;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = m0.f4152m;
            TextView textView2 = (TextView) s5.b.a(view, i10);
            if (textView2 != null) {
                i10 = m0.f4154n;
                RbxTextView rbxTextView = (RbxTextView) s5.b.a(view, i10);
                if (rbxTextView != null) {
                    i10 = m0.f4156o;
                    RbxButton rbxButton = (RbxButton) s5.b.a(view, i10);
                    if (rbxButton != null) {
                        i10 = m0.f4158p;
                        RbxButton rbxButton2 = (RbxButton) s5.b.a(view, i10);
                        if (rbxButton2 != null) {
                            i10 = m0.f4160q;
                            RbxButton rbxButton3 = (RbxButton) s5.b.a(view, i10);
                            if (rbxButton3 != null) {
                                i10 = m0.f4135d0;
                                RbxTextView rbxTextView2 = (RbxTextView) s5.b.a(view, i10);
                                if (rbxTextView2 != null) {
                                    return new b((LinearLayout) view, textView, textView2, rbxTextView, rbxButton, rbxButton2, rbxButton3, rbxTextView2);
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
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(n0.f4188g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f30715a;
    }
}
