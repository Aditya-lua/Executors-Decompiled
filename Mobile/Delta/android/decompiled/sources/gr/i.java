package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f18425a;

    @NonNull
    public final MaterialCheckBox b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f18426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f18427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f18428e;

    public i(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18425a = constraintLayout;
        this.b = materialCheckBox;
        this.f18426c = textView;
        this.f18427d = textView2;
        this.f18428e = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i10 = ar.d.f3685o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) r5.b.a(view, i10);
        if (materialCheckBox != null) {
            i10 = ar.d.f3687p;
            TextView textView = (TextView) r5.b.a(view, i10);
            if (textView != null) {
                i10 = ar.d.f3689q;
                TextView textView2 = (TextView) r5.b.a(view, i10);
                if (textView2 != null) {
                    i10 = ar.d.f3697u;
                    TextView textView3 = (TextView) r5.b.a(view, i10);
                    if (textView3 != null) {
                        return new i((ConstraintLayout) view, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(ar.e.f3717j, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f18425a;
    }
}
