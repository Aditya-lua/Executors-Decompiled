package ur;

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
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f33843a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f33844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f33845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f33846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f33847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f33848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f33849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f33850i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f33851j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f33852k;

    public a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f33843a = frameLayout;
        this.b = frameLayout2;
        this.f33844c = linearLayout;
        this.f33845d = view;
        this.f33846e = imageView;
        this.f33847f = recyclerView;
        this.f33848g = textInputEditText;
        this.f33849h = textInputLayout;
        this.f33850i = view2;
        this.f33851j = textView;
        this.f33852k = linearLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = or.f.f28437n;
        FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = or.f.f28413a0;
            LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
            if (linearLayout != null && (viewA = s5.b.a(view, (i10 = or.f.f28414b0))) != null) {
                i10 = or.f.f28420e0;
                ImageView imageView = (ImageView) s5.b.a(view, i10);
                if (imageView != null) {
                    i10 = or.f.f28462z0;
                    RecyclerView recyclerView = (RecyclerView) s5.b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = or.f.A0;
                        TextInputEditText textInputEditText = (TextInputEditText) s5.b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = or.f.B0;
                            TextInputLayout textInputLayout = (TextInputLayout) s5.b.a(view, i10);
                            if (textInputLayout != null && (viewA2 = s5.b.a(view, (i10 = or.f.E0))) != null) {
                                i10 = or.f.K0;
                                TextView textView = (TextView) s5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = or.f.M0;
                                    LinearLayout linearLayout2 = (LinearLayout) s5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(or.g.f28463a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f33843a;
    }
}
