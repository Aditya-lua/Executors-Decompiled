package aq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;
import p584yp.C13388r;
import p584yp.C13394s;

/* JADX INFO: renamed from: aq.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1142f implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4738a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f4739b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Guideline f4740c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f4741d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final Pi2NavigationBar f4742e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RecyclerView f4743f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final PersonaMaterialButton f4744g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Guideline f4745h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f4746i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final PersonaMaterialButton f4747j;

    public C1142f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull Guideline guideline2, @NonNull TextView textView2, @NonNull PersonaMaterialButton personaMaterialButton2) {
        this.f4738a = constraintLayout;
        this.f4739b = textView;
        this.f4740c = guideline;
        this.f4741d = constraintLayout2;
        this.f4742e = pi2NavigationBar;
        this.f4743f = recyclerView;
        this.f4744g = personaMaterialButton;
        this.f4745h = guideline2;
        this.f4746i = textView2;
        this.f4747j = personaMaterialButton2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C1142f m6476a(@NonNull View view) {
        int i10 = C13388r.f46914e;
        TextView textView = (TextView) C10785b.m41116a(view, i10);
        if (textView != null) {
            i10 = C13388r.f46929q;
            Guideline guideline = (Guideline) C10785b.m41116a(view, i10);
            if (guideline != null) {
                i10 = C13388r.f46931s;
                ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                if (constraintLayout != null) {
                    i10 = C13388r.f46885F;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                    if (pi2NavigationBar != null) {
                        i10 = C13388r.f46895P;
                        RecyclerView recyclerView = (RecyclerView) C10785b.m41116a(view, i10);
                        if (recyclerView != null) {
                            i10 = C13388r.f46896Q;
                            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                            if (personaMaterialButton != null) {
                                i10 = C13388r.f46903X;
                                Guideline guideline2 = (Guideline) C10785b.m41116a(view, i10);
                                if (guideline2 != null) {
                                    i10 = C13388r.f46909b0;
                                    TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                    if (textView2 != null) {
                                        i10 = C13388r.f46917f0;
                                        PersonaMaterialButton personaMaterialButton2 = (PersonaMaterialButton) C10785b.m41116a(view, i10);
                                        if (personaMaterialButton2 != null) {
                                            return new C1142f((ConstraintLayout) view, textView, guideline, constraintLayout, pi2NavigationBar, recyclerView, personaMaterialButton, guideline2, textView2, personaMaterialButton2);
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
    public static C1142f m6477c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C13394s.f46955f, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m6476a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f4738a;
    }
}
