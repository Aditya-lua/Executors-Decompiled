package p196ih;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.roblox.client.components.RbxButton;
import com.roblox.client.components.RbxTextView;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import sg.C11335m0;
import sg.C11338n0;

/* JADX INFO: renamed from: ih.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6811a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f26752a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f26753b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TextView f26754c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RbxTextView f26755d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RbxButton f26756e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RbxButton f26757f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RbxButton f26758g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RbxTextView f26759h;

    public C6811a(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RbxTextView rbxTextView, @NonNull RbxButton rbxButton, @NonNull RbxButton rbxButton2, @NonNull RbxButton rbxButton3, @NonNull RbxTextView rbxTextView2) {
        this.f26752a = linearLayout;
        this.f26753b = textView;
        this.f26754c = textView2;
        this.f26755d = rbxTextView;
        this.f26756e = rbxButton;
        this.f26757f = rbxButton2;
        this.f26758g = rbxButton3;
        this.f26759h = rbxTextView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6811a m29171a(@NonNull View view) {
        int i10 = C11335m0.f39817l;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C11335m0.f39819m;
            TextView textView2 = (TextView) C10785b.m41116a(view, i10);
            if (textView2 != null) {
                i10 = C11335m0.f39821n;
                RbxTextView rbxTextView = (RbxTextView) C10785b.m41116a(view, i10);
                if (rbxTextView != null) {
                    i10 = C11335m0.f39823o;
                    RbxButton rbxButton = (RbxButton) C10785b.m41116a(view, i10);
                    if (rbxButton != null) {
                        i10 = C11335m0.f39825p;
                        RbxButton rbxButton2 = (RbxButton) C10785b.m41116a(view, i10);
                        if (rbxButton2 != null) {
                            i10 = C11335m0.f39827q;
                            RbxButton rbxButton3 = (RbxButton) C10785b.m41116a(view, i10);
                            if (rbxButton3 != null) {
                                i10 = C11335m0.f39796a0;
                                RbxTextView rbxTextView2 = (RbxTextView) C10785b.m41116a(view, i10);
                                if (rbxTextView2 != null) {
                                    return new C6811a((LinearLayout) view, textView, textView2, rbxTextView, rbxButton, rbxButton2, rbxButton3, rbxTextView2);
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
    /* JADX INFO: renamed from: c */
    public static C6811a m29172c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C11338n0.f39860g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m29171a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f26752a;
    }
}
