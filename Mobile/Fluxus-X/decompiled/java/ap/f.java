package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ClickableConstraintLayout;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ClickableConstraintLayout f3217a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f3218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f3220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ClickableConstraintLayout f3221f;

    public f(@NonNull ClickableConstraintLayout clickableConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ClickableConstraintLayout clickableConstraintLayout2) {
        this.f3217a = clickableConstraintLayout;
        this.b = imageView;
        this.f3218c = imageView2;
        this.f3219d = constraintLayout;
        this.f3220e = textView;
        this.f3221f = clickableConstraintLayout2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = n3.f34887q;
        ImageView imageView = (ImageView) s5.b.a(view, i10);
        if (imageView != null) {
            i10 = n3.N;
            ImageView imageView2 = (ImageView) s5.b.a(view, i10);
            if (imageView2 != null) {
                i10 = n3.O;
                ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n3.f34857a0;
                    TextView textView = (TextView) s5.b.a(view, i10);
                    if (textView != null) {
                        ClickableConstraintLayout clickableConstraintLayout = (ClickableConstraintLayout) view;
                        return new f(clickableConstraintLayout, imageView, imageView2, constraintLayout, textView, clickableConstraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34934f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClickableConstraintLayout getRoot() {
        return this.f3217a;
    }
}
