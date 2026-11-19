package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33932a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f33933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f33935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f33936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f33937g;

    public w(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.f33932a = constraintLayout;
        this.b = textView;
        this.f33933c = imageView;
        this.f33934d = textView2;
        this.f33935e = textView3;
        this.f33936f = materialCardView;
        this.f33937g = imageView2;
    }

    @NonNull
    public static w a(@NonNull View view) {
        int i10 = or.f.f28412a;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = or.f.A;
            ImageView imageView = (ImageView) s5.b.a(view, i10);
            if (imageView != null) {
                i10 = or.f.H;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = or.f.X;
                    TextView textView3 = (TextView) s5.b.a(view, i10);
                    if (textView3 != null) {
                        i10 = or.f.F0;
                        MaterialCardView materialCardView = (MaterialCardView) s5.b.a(view, i10);
                        if (materialCardView != null) {
                            i10 = or.f.G0;
                            ImageView imageView2 = (ImageView) s5.b.a(view, i10);
                            if (imageView2 != null) {
                                return new w((ConstraintLayout) view, textView, imageView, textView2, textView3, materialCardView, imageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static w c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static w d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.f28485x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33932a;
    }
}
