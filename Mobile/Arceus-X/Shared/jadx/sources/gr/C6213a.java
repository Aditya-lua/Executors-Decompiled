package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ar.C1149d;
import ar.C1150e;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6213a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f23633a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f23634b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f23635c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f23636d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f23637e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f23638f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextInputEditText f23639g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextInputLayout f23640h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f23641i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f23642j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f23643k;

    public C6213a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f23633a = frameLayout;
        this.f23634b = frameLayout2;
        this.f23635c = linearLayout;
        this.f23636d = view;
        this.f23637e = imageView;
        this.f23638f = recyclerView;
        this.f23639g = textInputEditText;
        this.f23640h = textInputLayout;
        this.f23641i = view2;
        this.f23642j = textView;
        this.f23643k = linearLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6213a m27342a(@NonNull View view) {
        View viewM41116a;
        View viewM41116a2;
        int i10 = C1149d.f4836n;
        FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
        if (frameLayout != null) {
            i10 = C1149d.f4811a0;
            LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
            if (linearLayout != null && (viewM41116a = C10785b.m41116a(view, (i10 = C1149d.f4813b0))) != null) {
                i10 = C1149d.f4819e0;
                ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                if (imageView != null) {
                    i10 = C1149d.f4861z0;
                    RecyclerView recyclerView = (RecyclerView) C10785b.m41116a(view, i10);
                    if (recyclerView != null) {
                        i10 = C1149d.f4770A0;
                        TextInputEditText textInputEditText = (TextInputEditText) C10785b.m41116a(view, i10);
                        if (textInputEditText != null) {
                            i10 = C1149d.f4772B0;
                            TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
                            if (textInputLayout != null && (viewM41116a2 = C10785b.m41116a(view, (i10 = C1149d.f4778E0))) != null) {
                                i10 = C1149d.f4790K0;
                                TextView textView = (TextView) C10785b.m41116a(view, i10);
                                if (textView != null) {
                                    i10 = C1149d.f4794M0;
                                    LinearLayout linearLayout2 = (LinearLayout) C10785b.m41116a(view, i10);
                                    if (linearLayout2 != null) {
                                        return new C6213a((FrameLayout) view, frameLayout, linearLayout, viewM41116a, imageView, recyclerView, textInputEditText, textInputLayout, viewM41116a2, textView, linearLayout2);
                                    }
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
    public static C6213a m27343c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4863a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27342a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23633a;
    }
}
