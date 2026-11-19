package ur;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f33940a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f33941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f33942d;

    public z(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f33940a = constraintLayout;
        this.b = imageView;
        this.f33941c = textView;
        this.f33942d = textView2;
    }

    @NonNull
    public static z a(@NonNull View view) {
        int i10 = or.f.O;
        ImageView imageView = (ImageView) s5.b.a(view, i10);
        if (imageView != null) {
            i10 = or.f.f28422f0;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                i10 = or.f.I0;
                TextView textView2 = (TextView) s5.b.a(view, i10);
                if (textView2 != null) {
                    return new z((ConstraintLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static z c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(or.g.A, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f33940a;
    }
}
