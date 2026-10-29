package no;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import io.C6895n2;
import io.C6899o2;
import p402r5.C10785b;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: no.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C9535k implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final CoordinatorLayout f34435a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f34436b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final PersonaMaterialButton f34437c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextInputLayout f34438d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TextView f34439e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f34440f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TextInputLayout f34441g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextView f34442h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ConstraintLayout f34443i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final Pi2NavigationBar f34444j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final TextView f34445k;

    public C9535k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull PersonaMaterialButton personaMaterialButton, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f34435a = coordinatorLayout;
        this.f34436b = linearLayout;
        this.f34437c = personaMaterialButton;
        this.f34438d = textInputLayout;
        this.f34439e = textView;
        this.f34440f = linearLayout2;
        this.f34441g = textInputLayout2;
        this.f34442h = textView2;
        this.f34443i = constraintLayout;
        this.f34444j = pi2NavigationBar;
        this.f34445k = textView3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C9535k m37641a(@NonNull View view) {
        int i10 = C6895n2.f27095u;
        LinearLayout linearLayout = (LinearLayout) C10785b.m41116a(view, i10);
        if (linearLayout != null) {
            i10 = C6895n2.f27097v;
            PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) C10785b.m41116a(view, i10);
            if (personaMaterialButton != null) {
                i10 = C6895n2.f27099w;
                TextInputLayout textInputLayout = (TextInputLayout) C10785b.m41116a(view, i10);
                if (textInputLayout != null) {
                    i10 = C6895n2.f27101x;
                    TextView textView = (TextView) C10785b.m41116a(view, i10);
                    if (textView != null) {
                        i10 = C6895n2.f27031J;
                        LinearLayout linearLayout2 = (LinearLayout) C10785b.m41116a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = C6895n2.f27043P;
                            TextInputLayout textInputLayout2 = (TextInputLayout) C10785b.m41116a(view, i10);
                            if (textInputLayout2 != null) {
                                i10 = C6895n2.f27045Q;
                                TextView textView2 = (TextView) C10785b.m41116a(view, i10);
                                if (textView2 != null) {
                                    i10 = C6895n2.f27053Y;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C10785b.m41116a(view, i10);
                                    if (constraintLayout != null) {
                                        i10 = C6895n2.f27062d0;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) C10785b.m41116a(view, i10);
                                        if (pi2NavigationBar != null) {
                                            i10 = C6895n2.f27036L0;
                                            TextView textView3 = (TextView) C10785b.m41116a(view, i10);
                                            if (textView3 != null) {
                                                return new C9535k((CoordinatorLayout) view, linearLayout, personaMaterialButton, textInputLayout, textView, linearLayout2, textInputLayout2, textView2, constraintLayout, pi2NavigationBar, textView3);
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
    /* JADX INFO: renamed from: c */
    public static C9535k m37642c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C6899o2.f27120l, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m37641a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f34435a;
    }
}
