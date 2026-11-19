package rh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import bh.m0;
import bh.n0;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f30709a;

    @NonNull
    public final AppCompatImageButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AppCompatImageButton f30710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f30711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f30712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f30713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f30714g;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageButton appCompatImageButton, @NonNull AppCompatImageButton appCompatImageButton2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2) {
        this.f30709a = constraintLayout;
        this.b = appCompatImageButton;
        this.f30710c = appCompatImageButton2;
        this.f30711d = imageView;
        this.f30712e = textView;
        this.f30713f = constraintLayout2;
        this.f30714g = textView2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = m0.I;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) s5.b.a(view, i10);
        if (appCompatImageButton != null) {
            i10 = m0.J;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) s5.b.a(view, i10);
            if (appCompatImageButton2 != null) {
                i10 = m0.K;
                ImageView imageView = (ImageView) s5.b.a(view, i10);
                if (imageView != null) {
                    i10 = m0.L;
                    TextView textView = (TextView) s5.b.a(view, i10);
                    if (textView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = m0.N;
                        TextView textView2 = (TextView) s5.b.a(view, i10);
                        if (textView2 != null) {
                            return new a(constraintLayout, appCompatImageButton, appCompatImageButton2, imageView, textView, constraintLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(n0.f4184c, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f30709a;
    }
}
