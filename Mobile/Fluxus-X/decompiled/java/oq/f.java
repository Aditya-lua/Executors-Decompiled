package oq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import mq.x;
import mq.y;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28384a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f28385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f28386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f28387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f28388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f28389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f28390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f28391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f28392j;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline2, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f28384a = constraintLayout;
        this.b = textView;
        this.f28385c = guideline;
        this.f28386d = constraintLayout2;
        this.f28387e = pi2NavigationBar;
        this.f28388f = recyclerView;
        this.f28389g = personaMaterialButton;
        this.f28390h = guideline2;
        this.f28391i = textView2;
        this.f28392j = personaMaterialButton2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = x.f24150e;
        TextView textView = (TextView) s5.b.a(view, i10);
        if (textView != null) {
            i10 = x.f24165q;
            Guideline guideline = (Guideline) s5.b.a(view, i10);
            if (guideline != null) {
                i10 = x.f24167s;
                ConstraintLayout constraintLayout = (ConstraintLayout) s5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = x.F;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) s5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = x.P;
                        RecyclerView recyclerView = (RecyclerView) s5.b.a(view, i10);
                        if (recyclerView != null) {
                            i10 = x.Q;
                            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) s5.b.a(view, i10);
                            if (personaMaterialButton != null) {
                                i10 = x.X;
                                Guideline guideline2 = (Guideline) s5.b.a(view, i10);
                                if (guideline2 != null) {
                                    i10 = x.f24145b0;
                                    TextView textView2 = (TextView) s5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = x.f24153f0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) s5.b.a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new f((ConstraintLayout) view, textView, guideline, constraintLayout, pi2NavigationBar, recyclerView, personaMaterialButton, guideline2, textView2, personaMaterialButton2);
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
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(y.f24188f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f28384a;
    }
}
