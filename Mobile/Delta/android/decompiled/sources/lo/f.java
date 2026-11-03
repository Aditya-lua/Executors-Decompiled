package lo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ClickableConstraintLayout;
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ClickableConstraintLayout f23814a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f23815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f23817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ClickableConstraintLayout f23818f;

    public f(@NonNull ClickableConstraintLayout clickableConstraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ClickableConstraintLayout clickableConstraintLayout2) {
        this.f23814a = clickableConstraintLayout;
        this.b = imageView;
        this.f23815c = imageView2;
        this.f23816d = constraintLayout;
        this.f23817e = textView;
        this.f23818f = clickableConstraintLayout2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = n2.f18791q;
        ImageView imageView = (ImageView) r5.b.a(view, i10);
        if (imageView != null) {
            i10 = n2.N;
            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
            if (imageView2 != null) {
                i10 = n2.O;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = n2.f18761a0;
                    TextView textView = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f18817f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClickableConstraintLayout getRoot() {
        return this.f23814a;
    }
}
