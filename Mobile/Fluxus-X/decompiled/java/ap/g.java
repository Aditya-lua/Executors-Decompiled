package ap;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import vo.n3;
import vo.o3;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f3222a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Barrier f3223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f3225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f3226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RecyclerView f3228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f3229i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f3230j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f3231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f3232l;

    public g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f3222a = coordinatorLayout;
        this.b = constraintLayout;
        this.f3223c = barrier;
        this.f3224d = constraintLayout2;
        this.f3225e = imageView;
        this.f3226f = view;
        this.f3227g = pi2NavigationBar;
        this.f3228h = recyclerView;
        this.f3229i = textView;
        this.f3230j = textView2;
        this.f3231k = textView3;
        this.f3232l = textView4;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        int i10 = n3.f34893t;
        ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = n3.K;
            Barrier barrier = (Barrier) s5.b.a(view, i10);
            if (barrier != null) {
                i10 = n3.L;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = n3.X;
                    ImageView imageView = (ImageView) s5.b.a(view, i10);
                    if (imageView != null && (viewA = s5.b.a(view, (i10 = n3.f34858b0))) != null) {
                        i10 = n3.f34862d0;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = n3.f34898v0;
                            RecyclerView recyclerView = (RecyclerView) s5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = n3.G0;
                                TextView textView = (TextView) s5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n3.H0;
                                    TextView textView2 = (TextView) s5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n3.I0;
                                        TextView textView3 = (TextView) s5.b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = n3.J0;
                                            TextView textView4 = (TextView) s5.b.a(view, i10);
                                            if (textView4 != null) {
                                                return new g((CoordinatorLayout) view, constraintLayout, barrier, constraintLayout2, imageView, viewA, pi2NavigationBar, recyclerView, textView, textView2, textView3, textView4);
                                            }
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
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(o3.f34935g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f3222a;
    }
}
