package yp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import wp.r;
import wp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f37001a;

    @NonNull
    public final ShapeableImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f37002c;

    public g(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.f37001a = constraintLayout;
        this.b = shapeableImageView;
        this.f37002c = textView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = r.f34867z;
        ShapeableImageView shapeableImageView = (ShapeableImageView) r5.b.a(view, i10);
        if (shapeableImageView != null) {
            i10 = r.E;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                return new g((ConstraintLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(s.f34879g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f37001a;
    }
}
