package lo;

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
import go.n2;
import go.o2;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f23819a;

    @NonNull
    public final ConstraintLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Barrier f23820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f23821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f23822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f23823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f23824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final RecyclerView f23825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f23826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f23827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f23828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f23829l;

    public g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23819a = coordinatorLayout;
        this.b = constraintLayout;
        this.f23820c = barrier;
        this.f23821d = constraintLayout2;
        this.f23822e = imageView;
        this.f23823f = view;
        this.f23824g = pi2NavigationBar;
        this.f23825h = recyclerView;
        this.f23826i = textView;
        this.f23827j = textView2;
        this.f23828k = textView3;
        this.f23829l = textView4;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        int i10 = n2.f18797t;
        ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
        if (constraintLayout != null) {
            i10 = n2.K;
            Barrier barrier = (Barrier) r5.b.a(view, i10);
            if (barrier != null) {
                i10 = n2.L;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout2 != null) {
                    i10 = n2.X;
                    ImageView imageView = (ImageView) r5.b.a(view, i10);
                    if (imageView != null && (viewA = r5.b.a(view, (i10 = n2.f18762b0))) != null) {
                        i10 = n2.f18766d0;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = n2.f18802v0;
                            RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                            if (recyclerView != null) {
                                i10 = n2.G0;
                                TextView textView = (TextView) r5.b.a(view, i10);
                                if (textView != null) {
                                    i10 = n2.H0;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = n2.I0;
                                        TextView textView3 = (TextView) r5.b.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = n2.J0;
                                            TextView textView4 = (TextView) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(o2.f18818g, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f23819a;
    }
}
