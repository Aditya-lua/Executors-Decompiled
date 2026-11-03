package lq;

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
import hq.t;
import hq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23933a;

    @NonNull
    public final MaterialButton b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Space f23934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f23935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f23936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f23937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2DotsTabIndicator f23938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f23939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final MaterialButton f23940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f23941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f23943l;

    public d(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Pi2DotsTabIndicator pi2DotsTabIndicator, @NonNull View view, @NonNull MaterialButton materialButton2, @NonNull View view2, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f23933a = frameLayout;
        this.b = materialButton;
        this.f23934c = space;
        this.f23935d = frameLayout2;
        this.f23936e = linearLayout;
        this.f23937f = imageView;
        this.f23938g = pi2DotsTabIndicator;
        this.f23939h = view;
        this.f23940i = materialButton2;
        this.f23941j = view2;
        this.f23942k = textView;
        this.f23943l = viewPager2;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i10 = t.f19662a;
        MaterialButton materialButton = (MaterialButton) r5.b.a(view, i10);
        if (materialButton != null) {
            i10 = t.b;
            Space space = (Space) r5.b.a(view, i10);
            if (space != null) {
                i10 = t.f19663c;
                FrameLayout frameLayout = (FrameLayout) r5.b.a(view, i10);
                if (frameLayout != null) {
                    i10 = t.f19664d;
                    LinearLayout linearLayout = (LinearLayout) r5.b.a(view, i10);
                    if (linearLayout != null) {
                        i10 = t.f19665e;
                        ImageView imageView = (ImageView) r5.b.a(view, i10);
                        if (imageView != null) {
                            i10 = t.f19669i;
                            Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) r5.b.a(view, i10);
                            if (pi2DotsTabIndicator != null && (viewA = r5.b.a(view, (i10 = t.f19671k))) != null) {
                                i10 = t.f19683w;
                                MaterialButton materialButton2 = (MaterialButton) r5.b.a(view, i10);
                                if (materialButton2 != null && (viewA2 = r5.b.a(view, (i10 = t.f19685y))) != null) {
                                    i10 = t.f19686z;
                                    TextView textView = (TextView) r5.b.a(view, i10);
                                    if (textView != null) {
                                        i10 = t.A;
                                        ViewPager2 viewPager2 = (ViewPager2) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(u.f19689d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f23933a;
    }
}
