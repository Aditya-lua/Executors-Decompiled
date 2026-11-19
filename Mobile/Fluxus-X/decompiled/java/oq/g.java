package oq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28393a;

    @NonNull
    public final ShapeableImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f28394c;

    public g(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.f28393a = constraintLayout;
        this.b = shapeableImageView;
        this.f28394c = textView;
    }

    @NonNull
    public static g a(@NonNull View view) {
        int i10 = x.f24174z;
        ShapeableImageView shapeableImageView = (ShapeableImageView) s5.b.a(view, i10);
        if (shapeableImageView != null) {
            i10 = x.E;
            TextView textView = (TextView) s5.b.a(view, i10);
            if (textView != null) {
                return new g((ConstraintLayout) view, shapeableImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(y.f24189g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28393a;
    }
}
