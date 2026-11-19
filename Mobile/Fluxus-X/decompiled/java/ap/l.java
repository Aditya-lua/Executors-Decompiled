package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f3280a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f3282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f3283e;

    public l(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f3280a = linearLayout;
        this.b = imageView;
        this.f3281c = constraintLayout;
        this.f3282d = textView;
        this.f3283e = textView2;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i10 = n3.N;
        ImageView imageView = (ImageView) s5.b.a(view, i10);
        if (imageView != null) {
            i10 = n3.O;
            ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
            if (constraintLayout != null) {
                i10 = n3.F0;
                TextView textView = (TextView) s5.b.a(view, i10);
                if (textView != null) {
                    i10 = n3.L0;
                    TextView textView2 = (TextView) s5.b.a(view, i10);
                    if (textView2 != null) {
                        return new l((LinearLayout) view, imageView, constraintLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static l c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34941m, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f3280a;
    }
}
