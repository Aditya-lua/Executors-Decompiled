package er;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f16361a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f16362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f16363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f16364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f16365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f16366g;

    public w(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.f16361a = constraintLayout;
        this.b = textView;
        this.f16362c = imageView;
        this.f16363d = textView2;
        this.f16364e = textView3;
        this.f16365f = materialCardView;
        this.f16366g = imageView2;
    }

    @NonNull
    public static w a(@NonNull View view) {
        int i10 = yq.d.f37017a;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = yq.d.A;
            ImageView imageView = (ImageView) r5.b.a(view, i10);
            if (imageView != null) {
                i10 = yq.d.H;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = yq.d.X;
                    TextView textView3 = (TextView) r5.b.a(view, i10);
                    if (textView3 != null) {
                        i10 = yq.d.F0;
                        MaterialCardView materialCardView = (MaterialCardView) r5.b.a(view, i10);
                        if (materialCardView != null) {
                            i10 = yq.d.G0;
                            ImageView imageView2 = (ImageView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(yq.e.f37090x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f16361a;
    }
}
