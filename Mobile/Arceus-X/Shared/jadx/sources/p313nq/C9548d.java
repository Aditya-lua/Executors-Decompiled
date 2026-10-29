package p313nq;

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
import com.withpersona.sdk2.inquiry.shared.p055ui.dotsIndicator.Pi2DotsTabIndicator;
import p226jq.C7282t;
import p226jq.C7283u;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: nq.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C9548d implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f34511a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final MaterialButton f34512b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Space f34513c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f34514d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f34515e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f34516f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Pi2DotsTabIndicator f34517g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f34518h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final MaterialButton f34519i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f34520j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f34521k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ViewPager2 f34522l;

    public C9548d(@NonNull FrameLayout frameLayout, @NonNull MaterialButton materialButton, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Pi2DotsTabIndicator pi2DotsTabIndicator, @NonNull View view, @NonNull MaterialButton materialButton2, @NonNull View view2, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f34511a = frameLayout;
        this.f34512b = materialButton;
        this.f34513c = space;
        this.f34514d = frameLayout2;
        this.f34515e = linearLayout;
        this.f34516f = imageView;
        this.f34517g = pi2DotsTabIndicator;
        this.f34518h = view;
        this.f34519i = materialButton2;
        this.f34520j = view2;
        this.f34521k = textView;
        this.f34522l = viewPager2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9548d m37680a(@NonNull View view) {
        View viewM41116a;
        View viewM41116a2;
        int i10 = C7282t.f28063a;
        MaterialButton materialButton = (MaterialButton) C10785b.m41116a(view, i10);
        if (materialButton != null) {
            i10 = C7282t.f28064b;
            Space space = (Space) C10785b.m41116a(view, i10);
            if (space != null) {
                i10 = C7282t.f28065c;
                FrameLayout frameLayout = (FrameLayout) C10785b.m41116a(view, i10);
                if (frameLayout != null) {
                    i10 = C7282t.f28066d;
                    LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
                    if (linearLayout != null) {
                        i10 = C7282t.f28067e;
                        ImageView imageView = (ImageView) C10785b.m41116a(view, i10);
                        if (imageView != null) {
                            i10 = C7282t.f28071i;
                            Pi2DotsTabIndicator pi2DotsTabIndicator = (Pi2DotsTabIndicator) C10785b.m41116a(view, i10);
                            if (pi2DotsTabIndicator != null && (viewM41116a = C10785b.m41116a(view, (i10 = C7282t.f28073k))) != null) {
                                i10 = C7282t.f28085w;
                                MaterialButton materialButton2 = (MaterialButton) C10785b.m41116a(view, i10);
                                if (materialButton2 != null && (viewM41116a2 = C10785b.m41116a(view, (i10 = C7282t.f28087y))) != null) {
                                    i10 = C7282t.f28088z;
                                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                                    if (textView != null) {
                                        i10 = C7282t.f28062A;
                                        ViewPager2 viewPager2 = (ViewPager2) C10785b.m41116a(view, i10);
                                        if (viewPager2 != null) {
                                            return new C9548d((FrameLayout) view, materialButton, space, frameLayout, linearLayout, imageView, pi2DotsTabIndicator, viewM41116a, materialButton2, viewM41116a2, textView, viewPager2);
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
    /* JADX INFO: renamed from: c */
    public static C9548d m37681c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C7283u.f28092d, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37680a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f34511a;
    }
}
