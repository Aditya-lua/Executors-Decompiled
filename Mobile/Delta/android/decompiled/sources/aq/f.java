package aq;

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
import yp.r;
import yp.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3633a;

    @NonNull
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f3634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f3635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f3636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f3637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Guideline f3639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f3640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PersonaMaterialButton f3641j;

    public f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline2, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f3633a = constraintLayout;
        this.b = textView;
        this.f3634c = guideline;
        this.f3635d = constraintLayout2;
        this.f3636e = pi2NavigationBar;
        this.f3637f = recyclerView;
        this.f3638g = personaMaterialButton;
        this.f3639h = guideline2;
        this.f3640i = textView2;
        this.f3641j = personaMaterialButton2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i10 = r.f36214e;
        TextView textView = (TextView) r5.b.a(view, i10);
        if (textView != null) {
            i10 = r.f36229q;
            Guideline guideline = (Guideline) r5.b.a(view, i10);
            if (guideline != null) {
                i10 = r.f36231s;
                ConstraintLayout constraintLayout = (ConstraintLayout) r5.b.a(view, i10);
                if (constraintLayout != null) {
                    i10 = r.F;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) r5.b.a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = r.P;
                        RecyclerView recyclerView = (RecyclerView) r5.b.a(view, i10);
                        if (recyclerView != null) {
                            i10 = r.Q;
                            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) r5.b.a(view, i10);
                            if (personaMaterialButton != null) {
                                i10 = r.X;
                                Guideline guideline2 = (Guideline) r5.b.a(view, i10);
                                if (guideline2 != null) {
                                    i10 = r.f36209b0;
                                    TextView textView2 = (TextView) r5.b.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = r.f36217f0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) r5.b.a(view, i10);
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
        View viewInflate = layoutInflater.inflate(s.f36249f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // r5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f3633a;
    }
}
