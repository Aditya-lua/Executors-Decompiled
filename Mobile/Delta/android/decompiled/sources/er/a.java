package er;

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
    public final FrameLayout f16272a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f16274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f16275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f16276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f16277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f16278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f16279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f16280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final LinearLayout f16281k;

    public a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f16272a = frameLayout;
        this.b = frameLayout2;
        this.f16273c = linearLayout;
        this.f16274d = view;
        this.f16275e = imageView;
        this.f16276f = recyclerView;
        this.f16277g = textInputEditText;
        this.f16278h = textInputLayout;
        this.f16279i = view2;
        this.f16280j = textView;
        this.f16281k = linearLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = yq.d.f37042n;
        FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
        if (frameLayout != null) {
            i10 = yq.d.f37018a0;
            LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
            if (linearLayout != null && (viewA = r5.b.a(view, (i10 = yq.d.f37019b0))) != null) {
                i10 = yq.d.f37025e0;
                ImageView imageView = (ImageView) r5.b.a(view, i10);
                if (imageView != null) {
                    i10 = yq.d.f37067z0;
                    RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                    if (recyclerView != null) {
                        i10 = yq.d.A0;
                        TextInputEditText textInputEditText = (TextInputEditText) r5.b.a(view, i10);
                        if (textInputEditText != null) {
                            i10 = yq.d.B0;
                            TextInputLayout textInputLayout = (TextInputLayout) r5.b.a(view, i10);
                            if (textInputLayout != null && (viewA2 = r5.b.a(view, (i10 = yq.d.E0))) != null) {
                                i10 = yq.d.K0;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = yq.d.M0;
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
        View viewInflate = layoutInflater.inflate(yq.e.f37068a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f16272a;
    }
}
