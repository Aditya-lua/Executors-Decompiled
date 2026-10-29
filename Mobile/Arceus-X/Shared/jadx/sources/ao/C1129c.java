package ao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p609zn.C13909n2;
import p609zn.C13913o2;

/* JADX INFO: renamed from: ao.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1129c implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f4639a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f4640b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f4641c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f4642d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Guideline f4643e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Pi2NavigationBar f4644f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RecyclerView f4645g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Guideline f4646h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final PersonaMaterialButton f4647i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f4648j;

    public C1129c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextView textView3) {
        this.f4639a = coordinatorLayout;
        this.f4640b = textView;
        this.f4641c = guideline;
        this.f4642d = textView2;
        this.f4643e = guideline2;
        this.f4644f = pi2NavigationBar;
        this.f4645g = recyclerView;
        this.f4646h = guideline3;
        this.f4647i = personaMaterialButton;
        this.f4648j = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1129c m6437a(@NonNull View view) {
        int i10 = C13909n2.f48629c;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C13909n2.f48630d;
            Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
            if (guideline != null) {
                i10 = C13909n2.f48635i;
                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                if (textView2 != null) {
                    i10 = C13909n2.f48636j;
                    Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                    if (guideline2 != null) {
                        i10 = C13909n2.f48641o;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                        if (pi2NavigationBar != null) {
                            i10 = C13909n2.f48644r;
                            RecyclerView recyclerView = (RecyclerView) C10785b.m41116a(view, i10);
                            if (recyclerView != null) {
                                i10 = C13909n2.f48645s;
                                Guideline guideline3 = (Guideline) C10785b.m41116a(view, i10);
                                if (guideline3 != null) {
                                    i10 = C13909n2.f48646t;
                                    PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                                    if (personaMaterialButton != null) {
                                        i10 = C13909n2.f48647u;
                                        TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                        if (textView3 != null) {
                                            return new C1129c((CoordinatorLayout) view, textView, guideline, textView2, guideline2, pi2NavigationBar, recyclerView, guideline3, personaMaterialButton, textView3);
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
    public static C1129c m6438c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13913o2.f48652b, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6437a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f4639a;
    }
}
