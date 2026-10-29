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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f18374a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f18375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f18376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f18377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f18378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f18379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f18380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f18381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f18382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f18383k;

    public a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f18374a = frameLayout;
        this.b = frameLayout2;
        this.f18375c = linearLayout;
        this.f18376d = view;
        this.f18377e = imageView;
        this.f18378f = recyclerView;
        this.f18379g = textInputEditText;
        this.f18380h = textInputLayout;
        this.f18381i = view2;
        this.f18382j = textView;
        this.f18383k = linearLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = ar.d.f3683n;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = ar.d.f3659a0;
            LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
            if (linearLayout != null && (viewA = r5.b.a(view, (i10 = ar.d.f3660b0))) != null) {
                i10 = ar.d.f3666e0;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = ar.d.f3708z0;
                    RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = ar.d.A0;
                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = ar.d.B0;
                            TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout != null && (viewA2 = r5.b.a(view, (i10 = ar.d.E0))) != null) {
                                i10 = ar.d.K0;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = ar.d.M0;
                                    LinearLayout linearLayout2 = (LinearLayout) r5.b.a(view, i10);
                                    if (linearLayout2 != null) {
                                        return new a((FrameLayout) view, frameLayout, linearLayout, viewA, imageView, recyclerView, textInputEditText, textInputLayout, viewA2, textView, linearLayout2);
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
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(ar.e.f3709a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f18374a;
    }
}
