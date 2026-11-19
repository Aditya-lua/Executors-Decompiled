package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import xq.t;
import xq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4566a;

    @NonNull
    public final MaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Space f4567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f4568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f4569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f4570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2DotsTabIndicator f4571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f4572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final MaterialButton f4573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f4574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f4575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f4576l;

    public d(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Pi2DotsTabIndicator pi2DotsTabIndicator, @NonNull View view, @NonNull MaterialButton materialButton2, @NonNull View view2, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f4566a = frameLayout;
        this.b = materialButton;
        this.f4567c = space;
        this.f4568d = frameLayout2;
        this.f4569e = linearLayout;
        this.f4570f = imageView;
        this.f4571g = pi2DotsTabIndicator;
        this.f4572h = view;
        this.f4573i = materialButton2;
        this.f4574j = view2;
        this.f4575k = textView;
        this.f4576l = viewPager2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = t.f37021a;
        MaterialButton materialButton = (MaterialButton) s5.b.a(view, i10);
        if (materialButton != null) {
            i10 = t.b;
            Space space = (Space) s5.b.a(view, i10);
            if (space != null) {
                i10 = t.f37022c;
                FrameLayout frameLayout = (FrameLayout) s5.b.a(view, i10);
                if (frameLayout != null) {
                    i10 = t.f37023d;
                    LinearLayout linearLayout = (LinearLayout) s5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = t.f37024e;
                        ImageView imageView = (ImageView) s5.b.a(view, i10);
                        if (imageView != null) {
                            i10 = t.f37028i;
                            Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) s5.b.a(view, i10);
                            if (pi2DotsTabIndicator != null && (viewA = s5.b.a(view, (i10 = t.f37030k))) != null) {
                                i10 = t.f37042w;
                                MaterialButton materialButton2 = (MaterialButton) s5.b.a(view, i10);
                                if (materialButton2 != null && (viewA2 = s5.b.a(view, (i10 = t.f37044y))) != null) {
                                    i10 = t.f37045z;
                                    TextView textView = (TextView) s5.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = t.A;
                                        ViewPager2 viewPager2 = (ViewPager2) s5.b.a(view, i10);
                                        if (viewPager2 != null) {
                                            return new d((FrameLayout) view, materialButton, space, frameLayout, linearLayout, imageView, pi2DotsTabIndicator, viewA, materialButton2, viewA2, textView, viewPager2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(u.f37048d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f4566a;
    }
}
